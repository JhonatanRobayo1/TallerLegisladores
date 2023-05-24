class Diputado extends Legislador {
    public Diputado(String nombre, int edad, String provinciaQueRepresenta) {
        super(nombre, edad, provinciaQueRepresenta);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Diputados";
    }
}