//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;


    void incrementarSueldo(int porcentajeSueldo){
        this.sueldo+=sueldo*(1+porcentajeSueldo/100.0);
    }

}
