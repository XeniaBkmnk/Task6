package Task6;

//Stwórz okno i wyrysuj w nim przekątne okna wykorzystaj do tego bibliotekęjava.awt.
// Zwróć szczególną uwagę na metodępaintComponentoraz specyfikę metodydrawLine

import javax.swing.*;
import java.awt.*;

public
    class Main extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Przekątne okna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));
        Main panel = new Main();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}