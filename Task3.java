package Task6;

//Zadanie ma na celu zapoznanie z podstawowymi zarządcami rozkładu komponentów graficz-nych.
// Napisz program który będzie testował podstawowe proste rozkłady.
// W oknie powinnoznajdować się 5 przycisków (JButton) zawierających kolejno napisy:
// •„Przycisk1”
// •„Przycisk 2”
// •„P3”
// •„P 4”
// •„Duży przycisk o numerze 5”
// Należy zaimplementować 3 podstawowe rozkładu komponentów wraz z ich przykładowymiopcjami:
// •UkładBorderLayout
// •UkładFlowLayoutz wyrównaniem do lewej
// •UkładFlowLayoutz wyrównaniem do prawej
// •UkładFlowLayout
// •UkładGridLayout– jako jeden wiersz
// •UkładGridLayout– jako jedna kolumna
// •UkładGridLayout– jako tabela 2 kolumny, 3 wiersze
// Na początku programu powinniśmy wybrać którego rozkładu chcemy użyć,
//a następniewedług wybranego rozkładu powinny zostać wyświetlone komponenty.


import javax.swing.*;
import java.awt.*;

public
    class Task3 extends JFrame{

    public  Task3() {
        super(); //wywołuje konstruktor klasy bazowej z tytułem okna



       JButton button1 =new JButton("Przyklad1");
        JButton button2 =new JButton("Przyklad 2");
        JButton button3 =new JButton("P3");
        JButton button4 =new JButton("P 4");
        JButton button5 =new JButton("         5");

// Rozkład FlowLayout
            JPanel flowPanel = new JPanel();
            flowPanel.setLayout(new FlowLayout());
            flowPanel.add(button1);
            flowPanel.add(button2);
            add(flowPanel, BorderLayout.NORTH);
            //dodaje panel FlowLayout do górnego obszaru okna

 // Rozkład GridLayout
        JPanel Panel = new JPanel();
        Panel.add(button5);
        add(Panel, BorderLayout.SOUTH);

        JFrame jFrame =new JFrame();
        JPanel jPanel =new JPanel();
        jPanel.setLayout(new FlowLayout());

        jPanel.add(button1);
        jPanel.add(button2);

 // Rozkład BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(button3, BorderLayout.WEST);
        //dodaje przycisk 3 do lewego obszaru panelu BorderLayout
        borderPanel.add(button4, BorderLayout.EAST);
        add(borderPanel, BorderLayout.CENTER);

 // Rozkład GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(1, 1));
        //tworzy panel z ustawieniem GridLayout
        gridPanel.add(button5);
        add(gridPanel, BorderLayout.SOUTH);

        jFrame.add(jPanel);
        jFrame.setSize(500, 300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main (String[] args) {
        new Task3();
    }

}

