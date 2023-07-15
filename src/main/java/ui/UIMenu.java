package ui;


import java.util.Scanner;

public class UIMenu {

    public static final String[] MESES = {"enero", "febrero", "marzo",
    "abril", "mayo", "junio", "julio", "agosto", "septiembre",
    "octubre", "noviembre", "diciembre"
    };
    
    public static void verMenu() {
        System.out.println("bienvenido a tu turnos");
        System.out.println("Selecciona la opción deseada");

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
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + "." + MESES[i]);
                    }
                    break;
                case 2:
                    response = 0;
                    verPacienteMenu();

                    break;
                case 0:
                    System.out.println("gracias");
                    break;
                default:
                    System.out.println("selecione una opcion");
            }
        } while (response != 0);
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
