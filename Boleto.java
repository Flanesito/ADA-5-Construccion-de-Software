public class Boleto {

    private String nombrePelicula;
    private String asientoReservado;
    private double precio;

    public Boleto(String nombrePelicula, String asientoReservado, double precio) {
        this.nombrePelicula = nombrePelicula;
        this.asientoReservado = asientoReservado;
        this.precio = precio;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public String getAsientoReservado() {
        return asientoReservado;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean esBoletoValido() {
        if (precio > 0 && !asientoReservado.isEmpty()){
            return true;
        }
        return false;
    }
}