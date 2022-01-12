public class Complemento<T> extends Conjunto{
    private Conjunto conjunto;

    public <T> Complemento(Conjunto<T> conjunto) {
        this.conjunto = conjunto;
    }

    @Override
    public Boolean contemElemento(Object elemento) {
        return !(conjunto.contemElemento(elemento));
    }
}
