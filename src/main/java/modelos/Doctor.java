package modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String especialidad;
    ArrayList<turnosDisponibles> turnosDisponibles = new ArrayList<>();

    @Override
    public void verDatosUsuario() {
        System.out.println("Hosp.: samic");
        System.out.println("Depto.: pediatria");
    }

    public static class turnosDisponibles {

        private int id;
        private Date fecha;
        private String hora;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        public turnosDisponibles() {}

        public turnosDisponibles(String fecha, String hora) {
            
            try {
                this.fecha = formato.parse(fecha);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
            
            this.hora = hora;
        }

        public Date getFecha(String fecha) {
            return this.fecha;
        }

        public String getFecha() {
            return formato.format(this.fecha);
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

        @Override
        public String toString() {
            return "Turnos Disponibles: \nFechas: " + this.fecha
                    + "\nHora: " + this.hora;
        }
    }

    public Doctor(String nombreCompleto, String mail) {
        super(nombreCompleto, mail);
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void crearTurnoDisponible(String fecha, String hora) {

        turnosDisponibles.add(new turnosDisponibles(fecha, hora));
    }

    public ArrayList<turnosDisponibles> getTurnosDisponibles() {

        return turnosDisponibles;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidad: " + this.especialidad
                + "\nDisponible: " + turnosDisponibles.toString();
    }
}
