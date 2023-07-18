
public class User {

    private int id;
    private String nombreCompleto;
    private String mail;
    private String direccion;
    private String telefono;

    public User(String nombreCompleto, String mail) {
        this.nombreCompleto = nombreCompleto;
        this.mail = mail;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    @Override
    public String toString() {
        return "Nombre: " + this.nombreCompleto + ", Email:" + this.mail
            + "\nDireccion: " + this.direccion + ". Tel: " + this.telefono;
    }
}
