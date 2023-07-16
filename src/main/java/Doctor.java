
import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    private static int id = 0;
    private String nombreCompleto;
    private String especialidad;
    private String email;

    ArrayList<turnosDisponibles> turnosDisponibles = new ArrayList<>();

    public static class turnosDisponibles {

        private int id;
        private Date fecha;
        private String hora;

        public turnosDisponibles() {
        }

        public turnosDisponibles(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public Date getFecha() {
            return this.fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return this.hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }

    Doctor() {
    }

    Doctor(String nombreCompleto, String especialidad) {
        id++;
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void crearTurnoDisponible(Date fecha, String hora) {

        turnosDisponibles.add(new turnosDisponibles(fecha, hora));
    }

    public ArrayList<turnosDisponibles> getTurnosDisponibles() {

        return turnosDisponibles;
    }
}
