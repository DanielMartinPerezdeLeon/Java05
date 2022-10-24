
package Controlador;

/**
 *
 * @author alumno
 */
public class Modo { //Controla si se ha iniciado sesion o no
    
    
    private static Modo modo = new Modo();
    private int n;
    
    public Modo(){
        this.n=0; //No se ha iniciado sesion
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static Modo getModo() {
        return modo;
    }
    
    
    
}
