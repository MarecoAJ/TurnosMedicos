package ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import modelos.Doctor;

public class UIPacienteMenu {

    public static void verMenuPaciente() {

        int respuesta = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("Bienvenido " + UIMenu.pacLogeado.getNombreCompleto() + ": ");
            System.out.println("1. Resvar turnos");
            System.out.println("2. Mis turnos");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta) {
                case 1:
                    verMenuTurnosReservados();
                    break;
                case 2:
                    verMisTurnos();
                    break;
                case 0:
                    UIMenu.verMenu();
                    break;
            }
        } while (respuesta != 0);
    }

    private static void verMenuTurnosReservados() {

        int respuesta = 0;
        do {
            System.out.println();
            System.out.println("::Reservar turnos");
            System.out.println(":: Selecciona una fecha: ");
            Map<Integer, Map<Integer, Doctor>> doctores = new TreeMap<>();
            int indice = 0;
            for (int i = 0; i < UIDoctorMenu.turnosDisponiblesDoctores.size(); i++) {

                ArrayList<Doctor.turnosDisponibles> turnosDisponibles
                        = UIDoctorMenu.turnosDisponiblesDoctores.get(i).getTurnosDisponibles();

                Map<Integer, Doctor> turnosDoctor = new TreeMap<>();
                for (int j = 0; j < turnosDisponibles.size(); j++) {
                    indice++;
                    System.out.println(indice + ". " + turnosDisponibles.get(j).getFecha());
                    turnosDoctor.put(j, UIDoctorMenu.turnosDisponiblesDoctores.get(i));
                    doctores.put(indice, turnosDoctor);
                }
            }

            Scanner sc = new Scanner(System.in);
            int respuestaFechaSeleccionada = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorDisponibleSeleccionado = doctores.get(respuestaFechaSeleccionada);
            Integer indexFechas = 0;
            Doctor doctorSeleccionado = new Doctor("", "");
            for (Map.Entry<Integer, Doctor> doc : doctorDisponibleSeleccionado.entrySet()) {

                indexFechas = doc.getKey();
                doctorSeleccionado = doc.getValue();
            }

            System.out.println(doctorSeleccionado.getNombreCompleto() + ". fecha: "
                    + doctorSeleccionado.getTurnosDisponibles().get(indexFechas).getFecha()
                    + ". Hora: " + doctorSeleccionado.getTurnosDisponibles().get(indexFechas).getHora());
            System.out.println("Confirmar tu turno: \n1. SI \n2. NO");
            respuesta = Integer.valueOf(sc.nextLine());
            if (respuesta == 1) {

                UIMenu.pacLogeado.agregarTurnosDoctores(doctorSeleccionado,
                        doctorSeleccionado.getTurnosDisponibles().get(indexFechas).getFecha(null),
                         doctorSeleccionado.getTurnosDisponibles().get(indexFechas).getHora());
                verMenuPaciente();
            }

        } while (respuesta != 0);

    }
    
    private static void verMisTurnos(){
    
        int respuesta = 0;
        do{
        
            System.out.println(":: Mis turnos ");
            if(UIMenu.pacLogeado.getTurnosDoctores().size() == 0){
            
                System.out.println("No tiene turnos aun.");
                break;
            }
            for(int i =0; i< UIMenu.pacLogeado.getTurnosDoctores().size(); i++){
                int j = i + 1;
                System.out.println(j + ". "
                + " Fecha: " + UIMenu.pacLogeado.getTurnosDoctores().get(i).getFecha()
                + " Hora: " + UIMenu.pacLogeado.getTurnosDoctores().get(i).getHora()
                + "\n Doctor: " + UIMenu.pacLogeado.getTurnosDoctores().get(i).getDoctor());
            }
        }while(respuesta !=0);
    
    }
}
