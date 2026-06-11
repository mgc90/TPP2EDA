package edatpsegundoparcialgrupal;


import java.util.Scanner;

 
public class EDATPSegundoParcialGrupal {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        ArbolCarreras asistente = new ArbolCarreras();
        boolean salir = false;
        
        while (!salir) {
            System.out.println("\n====== ASISTENTE DE ELECCIÓN DE CARRERAS ======");
            System.out.println("1. Construir Árbol nuevo (Modo Admin)");
            System.out.println("2. Construir Árbol por Defecto");
            System.out.println("3. Realizar Consulta de Carrera");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

             int opcion = sn.nextInt();
            
            switch (opcion) {
                case 1:
                    asistente.construirArbolInteractivo(); 
                    System.out.println("\n¡Árbol interactivo construido exitosamente!");
                    break;
                case 2:
                    asistente.construirArbolDefault();
                    System.out.println("\n¡Árbol por defecto cargado exitosamente!");
                    break;
                case 3:
                    asistente.iniciarConsulta();
                    break;
                case 4:
                    System.out.println("Saliendo del asistente...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

}
