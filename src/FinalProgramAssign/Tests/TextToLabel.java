/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/8/17
 * Time: 10:34 AM
 */
package FinalProgramAssign.Tests;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TextToLabel extends JFrame{

    public TextToLabel() throws  FileNotFoundException{

        //Frame settings
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea label = new JTextArea();

        //Scanner
        Scanner scnr = new Scanner(new File("./Resources/Final/maze1.txt"));
        while (scnr.hasNext()){
            String s = scnr.nextLine();
            System.out.println(s);
        }
        label.setText(System.console() + "");

        add(label);

        scnr.close();

        setVisible(true);

    }
    public static void main(String args[]) throws FileNotFoundException{
        new TextToLabel();
    }
}