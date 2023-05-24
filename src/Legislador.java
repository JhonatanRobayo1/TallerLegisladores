public abstract class Legislador extends Persona {
    private String provinciaQueRepresenta;

    public Legislador(String nombre, int edad, String provinciaQueRepresenta) {
        super(nombre, edad);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public abstract String getCamaraEnQueTrabaja();
}
