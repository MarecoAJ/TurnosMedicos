package modelos;

public class Enfermero extends User{
    
    private String especialidad;
    
    public Enfermero(String nombreCompleto, String mail) {
        super(nombreCompleto, mail);
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
       
}
