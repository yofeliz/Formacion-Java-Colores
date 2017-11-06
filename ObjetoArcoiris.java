import javax.swing.*;
import java.awt.*;

/**
 * Objeto arcoiris para visualizarlo.
 * @author yofeliz
 */
public class ObjetoArcoiris extends JPanel {
    //Definición de colores no existentes en la paleta de Java.
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO  = new Color(75, 0, 130);
    
    //Array de colores del arcoiris.
    private Color[] colores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    
    //Constructor.
    public ObjetoArcoiris() {
        setBackground(Color.WHITE);
    }
    
    //Función para pintar el arcoiris.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //Radio del arco.
        int radio = 20;
        
        //Centro vertical y horizontal de la ventana.
        int centroX = getWidth() / 2;
        int centroY = getHeight() - 10;
        
        for(int contador=colores.length; contador>0; contador--) {
            //Establece el color del arco.
            g.setColor(colores[contador-1]);
            
            //Valores para el arco.
            int valorX = centroX - contador * radio;
            int valorY = centroY - contador * radio;
            int ancho  = contador * radio * 2;
            int alto   = contador * radio * 2;
            
            //Rellena el arco de 0 a 180 grados.
            g.fillArc(valorX, valorY, ancho, alto, 0, 180);
        }
    }
}
