public class Diferenca<T> extends Conjunto{
    private Conjunto tConjunto;
    private Conjunto conjunto;



    public <T> Diferenca(Conjunto<T> tConjunto, Conjunto<T> conjunto) {

        this.tConjunto = tConjunto;
        this.conjunto = conjunto;

    }

    @Override
    public Boolean contemElemento(Object elemento) {
        return ((tConjunto.contemElemento(elemento)) && !(conjunto.contemElemento(elemento)));
    }

}
