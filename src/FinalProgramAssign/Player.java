/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/10/17
 * Time: 9:57 AM
 */
package FinalProgramAssign;

import javax.swing.*;
import java.awt.*;

public class Player extends Rectangle{

    public boolean right, left, up, down;
    private int speed = 4;
    private Image player;

    public Player(int x, int y) {

        //Sets the Pacman to the screen
        player = new ImageIcon("./Resources/Final/Pacman1.png").getImage();
        setBounds(x, y, 10, 10);

    }

    //The move variables
    public void move(){
        if (right) { System.out.println("Right!");x+= speed;}
        if (left) x-= speed;
        if (up) y-= speed;
        if (down) y+= speed;
    }

    //Renders the pacman, used in paint method
    public void render(Graphics g){
        g.drawImage(player, x, y, null);
    }

}