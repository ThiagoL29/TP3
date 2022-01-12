public class ConjuntoVazio<T> extends Conjunto{

    public ConjuntoVazio(){ }

    @Override
    public Boolean contemElemento(Object elemento) {
        return false;
    }
}
