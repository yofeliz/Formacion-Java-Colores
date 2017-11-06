import javax.swing.*;

/**
 * Programa de refresco de Java que simula un arcoiris.
 * @author yofeliz
 */
public class Arcoiris extends JFrame {
    public static void main(String[] params) {
        ObjetoArcoiris panel = new ObjetoArcoiris();
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400, 250);
        aplicacion.setVisible(true);
    }
}
