
public class Paciente extends User {
    
    private String fechaNacimiento;
    private double altura;
    private double talla;
    private String tipoSangineo;
    
    public Paciente(String nombreCopleto, String mail) {
        super(nombreCopleto, mail);
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
   
    @Override
    public String toString(){
        return super.toString() + "\nEdad: " + "\nAltura: " + getAltura()
            + "\nTalla: " + getTalla() + "\nTipo sangre: " + this.tipoSangineo;
    } 
}
