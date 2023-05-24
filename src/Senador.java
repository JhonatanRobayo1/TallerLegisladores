class Senador extends Legislador {
    public Senador(String nombre, int edad, String provinciaQueRepresenta) {
        super(nombre, edad, provinciaQueRepresenta);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senado";
    }
}