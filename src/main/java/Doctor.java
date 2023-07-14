
public class Doctor {

    static int id = 0;
    String nombreCompleto;
    String especialidad;

    Doctor() {
        id++;
    }

    Doctor(String name) {
        id++;
    }

    public void verNombre() {
        System.out.println("Nombre: " + nombreCompleto);
    }
    
    public void verId() {
        System.out.println("Id doctor: " + id);
    } 
}
