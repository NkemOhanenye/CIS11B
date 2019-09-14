/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 11:35 AM
 */
package FinalProgramAssign;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class PacmanFrame extends JFrame {

    //Player variables
    public boolean right, left, up, down;
    //Panel and label variables
    private JPanel scoreExit;
    private JPanel instrucrtions;
    private JLabel scoreL;
    //Variables for Board
    private PacmanMap map = new PacmanMap();
    private ImageIcon ghost1Left, ghost1Right, ghost1Up, ghost1Down;
    private ImageIcon ghost2Left, ghost2Right, ghost2Up, ghost2Down;
    private ImageIcon ghost3Left, ghost3Right, ghost3Up, ghost3Down;
    private ImageIcon ghost4Left, ghost4Right, ghost4Up, ghost4Down;
    private ImageIcon pacmanLeft, pacmanRight, pacmanUp, pacmanDown, pacmanClosed;


    //button variables
    private JButton rule;
    private JButton exit;

    private int score = 0;
    private Font font;

    public PacmanFrame() {

        //Initiates the Variables
        scoreExit = new JPanel();
        instrucrtions = new JPanel();

        //Buttons
        rule = new JButton("How To Play");
        exit = new JButton("Exit");

        font = new Font("", Font.BOLD, 25);
        scoreL = new JLabel(String.valueOf(score));
        scoreL.setFont(new Font("", Font.BOLD, 35));
        scoreL.setForeground(Color.CYAN.darker());
        scoreL.setBorder(new CompoundBorder(         //Creates empty border to create space
                new EmptyBorder(0, 500, 0, 0), BorderFactory.createEmptyBorder()));

        //Frame Settings
        setSize(1000, 500);
        setName("Pacman");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLayout(new BorderLayout());

        //Panel Settings
        scoreExit.setBackground(Color.BLACK);
        instrucrtions.setBackground(Color.BLACK);
        map.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        map.setBackground(Color.black);

        //Methods
        loadImages();
        buttonSettings();

        //Add to panel
        scoreExit.add(exit);
        scoreExit.add(scoreL);
        instrucrtions.add(rule);

        //Add to frame
        add(scoreExit, BorderLayout.NORTH);
        add(map);
        add(instrucrtions, BorderLayout.SOUTH);

        //set visible
        setVisible(true);

        map.start();
    }
    public static void main(String args[]){
        new PacmanFrame();
    }

    //Settings for the buttons
    public void buttonSettings() {

        rule.setFont(font);

        //recreates the rules from the game preferances
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
        rule.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, panel,
                        "How to Play", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        //Creates the Exit Button
        Frame exitFrame = new JFrame();
        JDialog exitDialog = new JDialog(exitFrame, "Exit", true);

        JButton yesExit = new JButton("Yes");
        yesExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        JButton noReturn = new JButton("No");
        noReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                exitDialog.dispose();
            }
        });
        Object[] jOPButtons = {yesExit, noReturn};
        exit.setFont(font);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane exitPane = new JOptionPane(
                        "Are you sure you would like to exit?",
                        JOptionPane.QUESTION_MESSAGE,
                        JOptionPane.OK_CANCEL_OPTION,
                        null, jOPButtons, jOPButtons[1]);

                exitDialog.getContentPane().add(exitPane);
                exitDialog.setSize(405, 120);
                exitDialog.setLocationRelativeTo(exitFrame);
                exitDialog.setVisible(true);

            }
        });

    }

    //Loads the Images of the game
    public void loadImages() {

        //Ghosts
        ghost1Left = new ImageIcon("./Resources/Final/ghost1.png");
        ghost1Right = new ImageIcon("./Resources/Final/ghost1.1.png");
        ghost1Up = new ImageIcon("./Resources/Final/ghost1.2.png");
        ghost1Down = new ImageIcon("./Resources/Final/ghost1.3.png");
        ghost2Left = new ImageIcon("./Resources/Final/ghost2.png");
        ghost2Right = new ImageIcon("./Resources/Final/ghost2.1.png");
        ghost2Up = new ImageIcon("./Resources/Final/ghost2.2.png");
        ghost2Down = new ImageIcon("./Resources/Final/ghost2.3.png");
        ghost3Left = new ImageIcon("./Resources/Final/ghost3.png");
        ghost3Right = new ImageIcon("./Resources/Final/ghost3.1.png");
        ghost3Up = new ImageIcon("./Resources/Final/ghost3.2.png");
        ghost3Down = new ImageIcon("./Resources/Final/ghost3.3.png");
        ghost4Left = new ImageIcon("./Resources/Final/ghost4.png");
        ghost4Right = new ImageIcon("./Resources/Final/ghost4.1.png");
        ghost4Up = new ImageIcon("./Resources/Final/ghost4.2.png");
        ghost4Down = new ImageIcon("./Resources/Final/ghost4.3.png");

        //Pacman
        pacmanLeft = new ImageIcon("./Resources/Final/pacman1.png");
        pacmanRight = new ImageIcon("./Resources/Final/pacman3.png");
        pacmanUp = new ImageIcon("./Resources/Final/pacman2.png");
        pacmanDown = new ImageIcon("./Resources/Final/pacman4.png");
        pacmanClosed = new ImageIcon("./Resources/Final/pacman0.png");

    }

}