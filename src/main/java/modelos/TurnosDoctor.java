package modelos;

import java.util.Date;

public class TurnosDoctor implements IAgendarTurnos{
    private int id;
    private Paciente paciente;
    private Doctor doctor;
    private Date fecha;
    private String hora;

    public TurnosDoctor(Paciente paciente, Doctor doctor) {
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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

    @Override
    public void agendar(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
}
