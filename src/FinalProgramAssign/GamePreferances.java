/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 11:56 AM
 */
package FinalProgramAssign;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePreferances extends JFrame{

    //The panels and labels
    private JPanel titlePanel;
    private JPanel buttonPanel;
    private JPanel buttons;
    private JLabel title;

    //the buttons
    private JButton play;
    private JButton instructions;
    private JButton exit;

    public GamePreferances(){

        //Variable initializers
        titlePanel = new JPanel();
        buttonPanel = new JPanel();
        buttons = new JPanel();

        play = new JButton("Play Game!");
        instructions = new JButton("How to Play");
        exit = new JButton("Close Game");


        title = new JLabel("PACMAN", SwingConstants.CENTER);        //SwingConstants moves label to the center
        title.setBorder(new CompoundBorder(         //Creates empty border to create space
                new EmptyBorder(70,0,0,0), BorderFactory.createEmptyBorder()));
        title.setFont(new Font("Arial", Font.BOLD, 70));
        title.setForeground(Color.BLACK);

        //Frame Settings
        setTitle("PACMAN");
        setSize(350,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(2,1));

        //Panel Settings
        titlePanel.setBackground(Color.WHITE);
        buttonPanel.setBackground(Color.WHITE);
        buttons.setBackground(Color.WHITE);
        buttons.setBorder(new CompoundBorder(
                new EmptyBorder(25,0,0,0), BorderFactory.createEmptyBorder()));
        buttons.setLayout(new GridLayout(3, 1, 0, 20));

        //Methods
        buttonSettings();

        //Add to Panel
        titlePanel.add(title);
        buttons.add(play);
        buttons.add(instructions);
        buttons.add(exit);
        buttonPanel.add(buttons);

        //Add to Frame
        add(titlePanel);
        add(buttonPanel);

        //Sets Frame Visible
        setVisible(true);


    }

    public void buttonSettings(){

        play.setPreferredSize(new Dimension(40,40));

        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();              //disposes GamePreferances() and opens Game()
                new PacmanFrame();

            }
        });

        //Creates a custom JOption Pane
        JPanel panel = new JPanel();
        JTextArea area = new JTextArea
                ("To play Pacman all you have to do is move him across the board.\n" +
                        "           To move Pacman across the board: \n" +
                        "\tUp Arrow to move up.\n" +
                        "\tRight arrow to move right.\n" +
                        "\tLeft arrow to move left.\n" +
                        "\tDown arrow to move down."
                );
        area.setBackground(null);
        area.setEditable(false);
        panel.add(area);

        //Shows How to Play
        instructions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, panel,
                        "How to Play", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        //Exits the Game
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

    }

}