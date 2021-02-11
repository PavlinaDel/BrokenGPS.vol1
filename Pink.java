package game;

import java.awt.*;
import java.awt.Color;

public class Pink {
    private int row;
    private int col;
    private int Size;

    public  Pink(int row, int col) {
        this.row =row;
        this.col =col;
        this.Size=100;



    }
    public void render (Graphics g){
        int tileX = this.col * this.Size;
        int tileY = this.row * this.Size;
        Color myPink = new Color(255,192,203);
        g.setColor(myPink);
        g.fillRect(tileX,tileY,this.Size,this.Size);
        g.setColor(Color.BLACK);
        g.drawRect(tileX,tileY,this.Size,this.Size);

    }
}


