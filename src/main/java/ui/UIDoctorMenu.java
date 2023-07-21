package ui;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.Doctor;

public class UIDoctorMenu {
    
    public static ArrayList<Doctor> turnosDisponiblesDoctores = new ArrayList<>();
    
    public static void verMenuDoctor() {
        
        int respuesta = 0;
        
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Bienvenido " + UIMenu.docLogeado.getNombreCompleto() + ": ");
            System.out.println("1. Agregar turnos");
            System.out.println("2. Turnos agendados");
            System.out.println("0. Salir");
            
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            
            switch (respuesta) {
                case 1:
                    verMenuTurnosAgendados();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.verMenu();
                    break;
            }
            
        } while (respuesta != 0);
    }
    
    private static void verMenuTurnosAgendados() {
        
        int respuesta = 0;
        
        do {
            System.out.println();
            System.out.println("::Agregar turnos disponibles");
            System.out.println(":: Selecciona un mes: ");
            
            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MESES[i]);
            }
            
            System.out.println("0. Volver");
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());
            
            if (respuesta > 0 && respuesta < 4) {
                
                int mesSeleccionado = respuesta;
                System.out.println(mesSeleccionado + ". " + UIMenu.MESES[mesSeleccionado -1]);
                System.out.println("Inserta fecha disponible: dd/mm/aaaa");
                String fecha = sc.nextLine();
                System.out.println("La fecha es " + fecha + "?: " 
                        + "\n1. SI \n2. NO");
                int confirmacionFecha = Integer.valueOf(sc.nextLine());
                
                if (confirmacionFecha == 2) continue;
                
                int confimacionHora = 0;
                String hora = "";
                
                do {
                    System.out.println("Inserta hora disponible: 23:59 ");
                    hora = sc.nextLine();
                    System.out.println("La hora es " + hora + "?"
                            + "\n1. SI \n2. NO");
                    confimacionHora = Integer.valueOf(sc.nextLine());
                } while (confimacionHora == 2);
                
                UIMenu.docLogeado.crearTurnoDisponible(fecha, hora);
                chequeoTurnosDisponibles(UIMenu.docLogeado);
                
            } else if (respuesta == 0) {
                verMenuDoctor();
            }
            
        } while (respuesta != 0);   
    }
    
    private static void chequeoTurnosDisponibles(Doctor doc) {
        
        if (doc.getTurnosDisponibles().size() > 0 && !turnosDisponiblesDoctores.contains(doc)) {    
            turnosDisponiblesDoctores.add(doc);
        }
    }
}