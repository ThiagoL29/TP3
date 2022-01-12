public class Uniao<T> extends Conjunto{
    private Conjunto tConjunto;
    private Conjunto conjunto;

    public <T> Uniao(Conjunto<T> tConjunto, Conjunto<T> conjunto) {

        this.tConjunto = tConjunto;
        this.conjunto = conjunto;

    }

    @Override
    public Boolean contemElemento(Object elemento) {
        return ((conjunto.contemElemento(elemento)) || (tConjunto.contemElemento(elemento)));
    }
}
