package modelos;

import java.util.ArrayList;
import java.util.Date;

public class Paciente extends User {

    private String fechaNacimiento;
    private double altura;
    private double talla;
    private String tipoSangineo;
    private ArrayList<TurnosDoctor> turnosDoctores = new ArrayList<>();
    private ArrayList<TurnosEnfermero> turnosEnfermero = new ArrayList<>();

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
    public String toString() {
        return super.toString() + "\nEdad: " + "\nAltura: " + getAltura()
                + "\nTalla: " + getTalla() + "\nTipo sangre: " + this.tipoSangineo;
    }

    @Override
    public void verDatosUsuario() {
        System.out.println("paciente");
        System.out.println("historial del paciente");
    }

    public ArrayList<TurnosDoctor> getTurnosDoctores() {
        return this.turnosDoctores;
    }

    public void agregarTurnosDoctores(Doctor doctor, Date fecha, String hora) {
        TurnosDoctor turnosDoctor = new TurnosDoctor(this, doctor);
        turnosDoctor.agendar(fecha, hora);
        turnosDoctores.add(turnosDoctor);
    }

    public ArrayList<TurnosEnfermero> getTurnosEnfermero() {
        return this.turnosEnfermero;
    }

    public void agregarTurnosEnfermero(ArrayList<TurnosEnfermero> turnosEnfermero) {
        this.turnosEnfermero = turnosEnfermero;
    }
}