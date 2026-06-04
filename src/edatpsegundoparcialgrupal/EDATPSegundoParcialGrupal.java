package edatpsegundoparcialgrupal;


import java.util.Scanner;

 
public class EDATPSegundoParcialGrupal {

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        ArbolCarreras asistente = new ArbolCarreras();
        boolean salir = false;
        
        asistente.construirArbolDefault();
        System.out.println("Árbol construido exitosamente.");

        while (!salir) {
            System.out.println("\n--- ASISTENTE DE CARRERAS ---");

            System.out.println("1. Realizar Consulta de Carrera");
            System.out.println("2. Salir");
            
            int opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    asistente.iniciarConsulta();
                    break;
                case 2:
                    salir = true;
                    break;
            }
        }
    }

}
