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

    public Paciente(String nombreCompleto, String email, String direccion, String telefono, String fechaNacimiento, double altura, double talla, String tipoSangineo) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.talla = talla;
        this.tipoSangineo = tipoSangineo;
    }
    
}
