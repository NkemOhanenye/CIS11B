/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/6/17
 * Time: 11:35 AM
 */
package FinalProgramAssign;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PacmanMap extends JPanel
        implements Runnable, KeyListener{

    private int row = 12;
    private int col = 30;
    private Maze[][] maze = new Maze[row][col];
    private Player player;
    private boolean isRunning = false;
    private Thread thread;

    public PacmanMap() {

        setLayout(new GridLayout(row, col));
        player = new Player(WIDTH/2, HEIGHT/2);

        //Adds the maze to the board and creates the walls
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = new Maze();
                maze[i][j].setBackground(Color.black);
                if (i == 0 && j == j) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 11 && j == j) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == i && j == 0) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == i && j == 29) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == i && j == 9) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == i && j == 19) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 1 && j == 9) {
                    maze[i][j].setBackground(Color.BLACK);
                }
                if (i == 10 && j == 9) {
                    maze[i][j].setBackground(Color.BLACK);
                }
                if (i == 1 && j == 19) {
                    maze[i][j].setBackground(Color.BLACK);
                }
                if (i == 10 && j == 19) {
                    maze[i][j].setBackground(Color.BLACK);
                }
                if (i == 6 && j == 10) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 6 && j == 11) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 6 && j == 12) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 6 && j == 13) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 6 && j == 14) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 6 && j == 15) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 6 && j == 16) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 6 && j == 17) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 6 && j == 18) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 3 && j == 11) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 3 && j == 17) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 4 && j == 11) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 4 && j == 12) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 4 && j == 13) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 4 && j == 14) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 4 && j == 15) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 4 && j == 16) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                if (i == 4 && j == 17) {
                    maze[i][j].setBackground(Color.CYAN);
                }
                add(maze[i][j]);
            }
        }

        //Methods
        wall();
        dot();


    }

    //To Check if the game is running
    public synchronized void start(){
        if(isRunning) return;
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    //to check if the game has stopped
    public synchronized void stop(){
        if(isRunning) return;
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //to move the pacman (broken)
    public void movement(){
        player.move();
    }
    @Override
    public void run(){
        requestFocus();
        long lastTime = System.nanoTime();
        double targetTick = 60.0;
        double delta = 0;
        double ns = 1000000000/targetTick;
        while (isRunning){
            long now = System.nanoTime();
            delta += (now - lastTime)/ns;
            lastTime = now;
            while(delta >= 1){
                movement();
                delta--;
            }
        }
        stop();
    }

    //Checks Collision walls (not implemented)
    public void wall() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j].getBackground() == Color.CYAN) {

                }
            }
        }
    }

    //Paints the player on the board
    public void paint(Graphics g){
        super.paint(g);
        player.render(g);

    }

    //Adds the dots to the panel
    public void dot() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j].getBackground() == Color.BLACK) {
                    ImageIcon dot = new ImageIcon("./Resources/Final/dot.png");
                    maze[i][j].label.setIcon(dot);
                }
            }
        }
    }

    //Grid of Frame
    public class Maze extends JPanel {

        public JLabel label = new JLabel();
        private char symbol = '.';

        public Maze() {
            setBorder(new LineBorder(Color.BLACK));
            add(label);
        }

        public char getSymbol() {
            return symbol;
        }

        public void setSymbol(char symbol) {
            this.symbol = symbol;
        }

    }

    //The keys to move the pacman
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("IM WORKING");
            player.right = true;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
            player.left = true;
        if(e.getKeyCode() == KeyEvent.VK_UP)
            player.up = true;
        if(e.getKeyCode() == KeyEvent.VK_DOWN)
            player.down = true;
    }

    //The keys to not have pacman stop moving
    @Override
    public void keyPressed(KeyEvent e) {
        /*if(e.getKeyCode() == KeyEvent.VK_RIGHT) {System.out.println("I have been pressed!");player.right = false;}
        if(e.getKeyCode() == KeyEvent.VK_LEFT) player.left = false;
        if(e.getKeyCode() == KeyEvent.VK_UP) player.up = false;
        if(e.getKeyCode() == KeyEvent.VK_DOWN) player.down = false;*/
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}