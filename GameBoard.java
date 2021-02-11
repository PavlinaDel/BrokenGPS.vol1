package game;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import game.GameTile;
import java.util.Random;
public class GameBoard extends JFrame {
    // Array for the composition of the game board
      private ArrayList<Object> pieceCollection;
      //random object to shuffle the tiles
      private static final Random RANDOM = new Random();
      // true if the game is over, otherwise - false
      private boolean gameOver;


    public GameBoard() {
        this.pieceCollection = new ArrayList<>();
        JFrame frame = new JFrame();
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        gameOver=true;

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }



            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int row = 0; row <8; row++) {
            for(int col=0; col <8; col++) {

                GameTile tile = new GameTile(row,col);
                tile.render(g);
            }
        }

    }


}
