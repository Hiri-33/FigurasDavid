
package figuras;

import java.awt.Graphics;


public abstract class FigurasGeometricas {
    static float area;
    static float perimetro;
    
    public static float getArea(){
        return area;
    }
    public void setArea(float area){
        this.area = area;
    }
    public static float getPerimetro(){
        return perimetro;
    }
    public void setPerimtro(float perimetro){
        this.perimetro = perimetro;
    }
    public abstract void drawFigure(Graphics g);
    public abstract float area();
    public abstract float perimetro();
    
}
