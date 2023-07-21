package ui;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.Doctor;
import modelos.Paciente;

public class UIMenu {

    public static final String[] MESES = {"enero", "febrero", "marzo",
        "abril", "mayo", "junio", "julio", "agosto", "septiembre",
        "octubre", "noviembre", "diciembre"
    };
    public static Doctor docLogeado;
    public static Paciente pacLogeado;

    public static void verMenu() {
        System.out.println("Bienvenido");
        System.out.println("Selecciona la opción deseada: ");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    autentificarUsuario(1);
                    response = 0;
                    break;
                case 2:
                    autentificarUsuario(2);
                    response = 0;
                    break;
                case 0:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Selecione una opcion: ");
            }
        } while (response != 0);
    }

    private static void autentificarUsuario(int tipoUsuario) {

        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.add(new Doctor("alejo", "alejo@mail.com"));
        doctores.add(new Doctor("karen", "karen@mail.com"));
        doctores.add(new Doctor("julio", "julio@mail.com"));

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("alejo", "alejo2@mail.com"));
        pacientes.add(new Paciente("karen", "karen2@mail.com"));
        pacientes.add(new Paciente("julio", "julio2@mail.com"));

        boolean emailCorrecto = false;

        do {

            System.out.println("inserte su email: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (tipoUsuario == 1) {

                for (Doctor doc : doctores) {

                    if (doc.getMail().equals(email)) {
                        emailCorrecto = true;
                        docLogeado = doc;
                        UIDoctorMenu.verMenuDoctor();
                    }
                }
            }
            if (tipoUsuario == 2) {

                for (Paciente pac : pacientes) {

                    if (pac.getMail().equals(email)) {
                        emailCorrecto = true;
                        pacLogeado = pac;
                        UIPacienteMenu.verMenuPaciente();
                    }
                }
            }
        } while (!emailCorrecto);
    }

    static void verPacienteMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("paciente");
            System.out.println("1. agendar turnos");
            System.out.println("2. mis turnos");
            System.out.println("0. volver");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::agendar un turno");
                    break;
                case 2:
                    System.out.println("::mis turnos");
                    break;
                case 0:
                    verMenu();
                    break;
            }
        } while (response != 0);
    }
}
