public class Casa extends Vivienda{
    private boolean tienePatio;

    // Constructor vacio:
    public Casa() {
    }

    // Constructor con datos:
    public Casa(String codigo, double superficieMetrosCuadrados, int numeroHabitaciones, boolean tienePatio) {
        super(codigo, superficieMetrosCuadrados, numeroHabitaciones);
        this.tienePatio = tienePatio;
    }

    // Getters:
    public boolean isTienePatio() {
        return tienePatio;
    }

    // Setters:
    public void setTienePatio(boolean tienePatio) {
        this.tienePatio = tienePatio;
    }

    // To String:
    @Override
    public String toString() {
        return super.toString()+ "Casa{" +
                "tienePatio=" + tienePatio +
                '}';
    }

    // Metodo Abstracto:
    @Override
    public double costoArriendo() {
        double costo = 250_000;
        if(tienePatio){
            costo += costo*0.10;
        }
        return costo;
    }

}
