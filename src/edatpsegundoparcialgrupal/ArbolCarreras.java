package edatpsegundoparcialgrupal;

import java.util.Scanner;

 
public class ArbolCarreras {
    
    private NodoDecision raiz;

    public ArbolCarreras() {
        this.raiz = null;
    }


    public void construirArbolDefault() {
        // Nivel 0 (raíz)
        raiz = new NodoDecision("¿Te gusta la tecnología?");
        
        // Nivel 1
        raiz.si = new NodoDecision("¿Te gusta programar?");
        raiz.no = new NodoDecision("¿Te gustan las ciencias naturales?");
        
        // Nivel 2
        raiz.si.si = new NodoDecision("¿Te interesa la Inteligencia Artificial?");
        raiz.si.no = new NodoDecision("¿Prefieres el diseño visual?");
        raiz.no.si = new NodoDecision("¿Te gusta trabajar en laboratorios?");
        raiz.no.no = new NodoDecision("¿Prefieres el trabajo al aire libre?");
        
        // Nivel 3 (hojas carreras)
        raiz.si.si.si = new NodoDecision("Ingeniería en IA"); 
        raiz.si.si.no = new NodoDecision("Ingeniería de Software");
        raiz.si.no.si = new NodoDecision("Diseño UX/UI"); 
        raiz.si.no.no = new NodoDecision("Ingeniería Industrial"); 
        
        raiz.no.si.si = new NodoDecision("Licenciatura en Química"); 
        raiz.no.si.no = new NodoDecision("Geología"); 
        raiz.no.no.si = new NodoDecision("Ingeniería Agrónoma"); 
        raiz.no.no.no = new NodoDecision("Licenciatura en Márketing"); 
    }

   
    public void iniciarConsulta() {
        Scanner sc = new Scanner(System.in);
        NodoDecision actual = raiz;

        if (actual == null) {
            System.out.println("El árbol está vacío. Debe construirlo primero.");
            return;
        }

        while (!actual.esCarrera()) {
            System.out.println(actual.texto + " (si/no)");
            String rta = sc.nextLine().trim().toLowerCase();
            actual = rta.equals("si") ? actual.si : actual.no;
        }

        System.out.println("\n>>> Basado en tus respuestas, te sugerimos: " 
                + actual.texto);
    }
}
