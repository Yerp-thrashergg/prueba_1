import javax.swing.border.EmptyBorder;
import java.util.EmptyStackException;

public abstract class Vivienda {
    protected String codigo;
    protected double superficieMetrosCuadrados;
    protected int numeroHabitaciones;

    // Constructor vacio:
    public Vivienda() {
    }

    // Constructor con datos:
    public Vivienda(String codigo, double superficieMetrosCuadrados, int numeroHabitaciones) {
        this.codigo = codigo;
        this.superficieMetrosCuadrados = superficieMetrosCuadrados;
        this.numeroHabitaciones = numeroHabitaciones;
    }

    // Getters:
    public String getCodigo() {
        return codigo;
    }
    public double getSuperficieMetrosCuadrados() {
        return superficieMetrosCuadrados;
    }
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    // Setters:
    public void setCodigo(String codigo) {
        if (this.codigo.isEmpty() || this.codigo.isBlank()|| this.codigo == null){
            throw new IllegalArgumentException("¡ERROR! El código de propiedad no puede Estar vacio.");
        }else {
            this.codigo = codigo;
        }
    }
    public void setSuperficieMetrosCuadrados(double superficieMetrosCuadrados) {
        if(this.superficieMetrosCuadrados >=20 && this.superficieMetrosCuadrados <=500 ){
            this.superficieMetrosCuadrados = superficieMetrosCuadrados;
        }
        else {
            throw new IllegalArgumentException("¡ERROR! La superficie debe estar entre 20 Y 500 metros cuadrados");
        }

    }
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        if(this.numeroHabitaciones > 0){
            this.numeroHabitaciones = numeroHabitaciones;
        }
        throw new IllegalArgumentException("¡ERROR! La cantidad de habitaciones debe ser mayor que 0");
    }

    // To String:
    @Override
    public String toString() {
        return "Vivienda{" +
                "codigo='" + codigo + '\'' +
                ", superficieMetrosCuadrados=" + superficieMetrosCuadrados +
                ", numeroHabitaciones=" + numeroHabitaciones +
                '}';
    }

    // Metodo Abstracto:
     public  abstract double costoArriendo();


}
