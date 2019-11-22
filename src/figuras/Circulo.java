
package figuras;

import java.awt.Graphics;
import javax.swing.JFrame;


public class Circulo extends FigurasGeometricas {
    private static int radio;
    private static JFrame frame;
    
    public Circulo(int pRadio){
    super();
    radio = pRadio;
    }
    public static int getRadio(){
        return radio;
    }
    public static void setRadio(int pRadio){
        radio = pRadio;
    }
    @Override
    public float area(){
        return(float)(Math.PI*Math.pow(radio, 2));
    }
    @Override
    public float perimetro(){
        return(float)(2*Math.PI*radio);
    }
    @Override
    public void drawFigure(Graphics g){
        g.drawOval((int)(155-(radio/2)),(int)(110-(radio/2)),radio, radio);
    }
    
}
