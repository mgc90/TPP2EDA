package edatpsegundoparcialgrupal;


public class NodoDecision {
    String texto;
    NodoDecision si; //hijo izquierdo respuesta SI
    NodoDecision no; //hijo derecho respuesta No

    public NodoDecision(String texto) {
        this.texto = texto;
        this.si = null;
        this.no = null;
    }
    
    // si no tiene opciones siguientes es una carrera
    public boolean esCarrera() {
        return si == null && no == null;
    }
}

