public class Paciente {
    String nombreCompleto;
    String email;
    String direccion;
    String telefono;
    String fechaNacimiento;
    double altura;
    double talla;
    String tipoSangineo;

    public Paciente() {
    }

    public Paciente(String nombreCompleto, String email) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }
    
}
