
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

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() > 8) {
            System.out.println("el numero debe ser menor a 8 dig");
        } else if (telefono.length() == 8) {
            this.telefono = telefono;
        }
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAltura() {
        return this.altura + " mts.";
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTalla() {
        return this.talla + " kg.";
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getTipoSangineo() {
        return this.tipoSangineo;
    }

    public void setTipoSangineo(String tipoSangineo) {
        this.tipoSangineo = tipoSangineo;
    }

}
