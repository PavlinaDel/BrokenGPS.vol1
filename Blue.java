package game;

import java.awt.*;

public class Blue {
    private int row;
    private int col;
    private int Size;

    public  Blue(int row, int col) {
        this.row =row;
        this.col =col;
        this.Size=100;



    }
    public void render (Graphics g){
        int tileX = this.col * this.Size;
        int tileY = this.row * this.Size;

        Color myBlue = new Color(173,216,230);
        g.setColor(myBlue);
        g.fillRect(tileX,tileY,this.Size,this.Size);
        g.setColor(Color.BLACK);
        g.drawRect(tileX,tileY,this.Size,this.Size);

    }
}
