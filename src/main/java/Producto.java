public class Producto {

    String codigo;
    String descricion;
    Double Prezo;

    public Producto() {
        this.codigo = null;
        this.descricion = null;
        Prezo = 0.0;
    }

    public Producto(String codigo, String descricion, Double prezo) {
        this.codigo = codigo;
        this.descricion = descricion;
        Prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public Double getPrezo() {
        return Prezo;
    }

    public void setPrezo(Double prezo) {
        Prezo = prezo;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descricion='" + descricion + '\'' +
                ", Prezo=" + Prezo +
                '}';
    }
}
