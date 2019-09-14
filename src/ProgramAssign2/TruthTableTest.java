/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/2/17
 * Time: 12:20 AM
 */
package ProgramAssign2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TruthTableTest extends JFrame{

    //Calls from other classes
    private TruthTable table;
    private OutputTable table2;

    //Frame Variables
    private JTextArea area;
    private JTextArea area2;
    private JTextField labels;
    private JPanel mainPanel;
    private JPanel panel;
    private JPanel panel2;

    //Button Variables
    private JButton binary;
    private JButton NOT;
    private JButton AND;
    private JButton OR;
    private JButton XOR;
    private JButton NAND;
    private JButton NOR;
    private JButton exit;

    //To Change Frame Title
    private String not = "NOT";
    private String and = "AND";
    private String or = "OR";
    private String xor = "XOR";
    private String nand = "NAND";
    private String nor = "NOR";

    public TruthTableTest(){

        //Initiating Variables
        table = new TruthTable();
        area = new JTextArea();
        area2 = new JTextArea();
        labels = new JTextField("Logical Operators:\t\tInput:\t\t\t         Output:");
        mainPanel = new JPanel();
        panel = new JPanel();
        panel2 = new JPanel();
        Font font = new Font("courier",Font.PLAIN,20);

        //Button Initiation
        NOT = new JButton("NOT");
        AND = new JButton("AND");
        OR = new JButton("OR");
        XOR = new JButton("XOR");
        NAND = new JButton("NAND");
        NOR = new JButton("NOR");
        binary = new JButton("To Binary");
        exit = new JButton("Exit");

        //Frame Settings
        setTitle("Displaying the TruthTable: ");
        setSize(700,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        //Panel Settings
        mainPanel.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(3,3));

        //Text Area1 Settings
        area.setText(table.toString());
        area.setBackground(Color.BLACK);
        area.setForeground(Color.GREEN);
        area.setFont(font);
        area.setEditable(false);

        //Text Area2 Settings
        area2.setBackground(Color.BLACK);
        area2.setForeground(Color.GREEN);
        area2.setFont(font);
        area2.setEditable(false);

        //Label Settings
        labels.setFont(new Font("courier",Font.PLAIN,15));
        labels.setForeground(Color.GREEN);
        labels.setBackground(Color.BLACK);
        labels.setEditable(false);

        //Methods
        buttonProperties();

        //Adds to Panel
        panel.add(NOT);
        panel.add(AND);
        panel.add(OR);
        panel.add(XOR);
        panel.add(NAND);
        panel.add(NOR);
        mainPanel.add(panel);
        mainPanel.add(binary, BorderLayout.SOUTH);

        //Add to Frame
        add(labels, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);
        add(area2,BorderLayout.EAST);
        add(mainPanel, BorderLayout.WEST);
        add(exit, BorderLayout.SOUTH);

        //paints the table on the frame
        repaint();

        //Set Visible
        setVisible(true);
    }
    //Button Settings
    private void buttonProperties(){

        NOT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                table2 = new OutputTable();
                setTitle("Displaying the TruthTable: " + not);
                area.setText(table.toString());
                area2.setText(table2.toStringNOT());
            }
        });
        AND.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                table2 = new OutputTable();
                setTitle("Displaying the TruthTable: " + and);
                area.setText(table.toString());
                area2.setText(table2.toStringAND());
            }
        });
        OR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                table2 = new OutputTable();
                setTitle("Displaying the TruthTable: " + or);
                area.setText(table.toString());
                area2.setText(table2.toStringOR());
            }
        });
        XOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                table2 = new OutputTable();
                setTitle("Displaying the TruthTable: " + xor);
                area.setText(table.toString());
                area2.setText(table2.toStringXOR());
            }
        });
        NAND.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                table2 = new OutputTable();
                setTitle("Displaying the TruthTable: " + nand);
                area.setText(table.toString());
                area2.setText(table2.toStringNAND());
            }
        });
        NOR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                table2 = new OutputTable();
                setTitle("Displaying the TruthTable: " + nor);
                area.setText(table.toString());
                area2.setText(table2.toStringNOR());
            }
        });
        binary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == binary){
                    area.setText(area.getText().replaceAll("false", "\t0"));
                    area.setText(area.getText().replaceAll("true", "\t1"));
                    area2.setText(area2.getText().replaceAll("false", "\t0"));
                    area2.setText(area2.getText().replaceAll("true", "\t1"));
                }
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    public static void main (String args[]){
        new TruthTableTest();
    }
}