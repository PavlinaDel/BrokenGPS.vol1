package game;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.util.ArrayList;
import game.GameTile;
public class GameBoard extends JFrame {
      private ArrayList<Object> pieceCollection;


    public GameBoard() {
        this.pieceCollection = new ArrayList<>();
        JFrame frame = new JFrame();
        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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
