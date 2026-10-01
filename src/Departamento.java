public class Departamento extends Vivienda implements ConEstacionamiento {
    private int numeroPiso;
    private boolean estacionamientoAsignado;
    private boolean gastoComunAlDia;

    // Constructor vacio:
    public Departamento() {
    }

    // Constructor con datos:
    public Departamento(String codigo, double superficieMetrosCuadrados, int numeroHabitaciones, int numeroPiso, boolean estacionamientoAsignado, boolean gastoComunAlDia) {
        super(codigo, superficieMetrosCuadrados, numeroHabitaciones);
        this.numeroPiso = numeroPiso;
        this.estacionamientoAsignado = estacionamientoAsignado;
        this.gastoComunAlDia = gastoComunAlDia;
    }


    // Getters:
    public int getNumeroPiso() {
        return numeroPiso;
    }
    public boolean isEstacionamientoAsignado() {
        return estacionamientoAsignado;
    }
    public boolean isGastoComunAlDia() {
        return gastoComunAlDia;
    }

    // Setters:
    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
    public void setEstacionamientoAsignado(boolean estacionamientoAsignado) {
        this.estacionamientoAsignado = estacionamientoAsignado;
    }
    public void setGastoComunAlDia(boolean gastoComunAlDia) {
        this.gastoComunAlDia = gastoComunAlDia;
    }


    // To String:
    @Override
    public String toString() {
        return super.toString()+"Departamento{" +
                "numeroPiso=" + numeroPiso +
                ", estacionamientoAsignado=" + (estacionamientoAsignado?"si":"no") +
                ", gastoComunAlDia=" + (gastoComunAlDia?"si":"no") +
                '}';
    }

    // Metodo Abstracto:
    @Override
    public double costoArriendo() {
        double costo = 180_000;
        if (gastoComunAlDia){
        }
        else {
            costo += costo*0.15;
        }
        return costo;
    }

    // Consulta si tiene estacionamiento:
    @Override
    public boolean tieneEstacionamiento() {
        if (tieneEstacionamiento()){
             System.out.println(" Si Cuenta con Estacionamiento.");
             return false;
        }
        System.out.println("No cuenta con Estacionamiento.");
        return true;
    }


    // Designa un estaconamiento:
    @Override
    public String asignarEstacionamiento() {
        if (tieneEstacionamiento()) {
            return "Se le ha designado un estacionamiento.";
        }
        return "Usted ya posee un estacionamiento.";
    }


}
