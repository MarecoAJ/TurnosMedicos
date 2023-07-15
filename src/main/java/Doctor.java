
public class Doctor {

    private static int id = 0;
    private String nombreCompleto;
    private String especialidad;
    private String email;

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
