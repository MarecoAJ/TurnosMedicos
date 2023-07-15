public class Paciente {
    private String nombreCompleto;
    private String email;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;
    private double altura;
    private double talla;
    private String tipoSangineo;

    public Paciente() {
    }

    public Paciente(String nombreCompleto, String email) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
    }
    
}
