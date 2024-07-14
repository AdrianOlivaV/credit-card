public class Compra implements Comparable <Compra>{

    private double valor;
    private String descripcion;


    public Compra(double valor, String descripion) {
        this.valor = valor;
        this.descripcion = descripion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Compra: valor= " + valor + ", descripion='" + descripcion;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
