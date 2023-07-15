
public class Doctor {

    static int id = 0;
    String nombreCompleto;
    String especialidad;
    String email;

    Doctor() {}

    Doctor(String nombreCompleto, String especialidad) {
        id++;
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
    }

    public void verNombre() {
        System.out.println("Nombre: " + nombreCompleto);
    }
    
    public void verId() {
        System.out.println("Id doctor: " + id);
    } 
}
