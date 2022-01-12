public class ConjuntoElemento<T> extends Conjunto{
    private final T valor;
    private final Conjunto<T> conjunto;

    public ConjuntoElemento(T valor, Conjunto<T> conjunto){
        this.valor = valor;
        this.conjunto = conjunto;
    }

    @Override
    public Boolean contemElemento(Object elemento) {
        return elemento == valor || conjunto.contemElemento((T) elemento);
    }



}
