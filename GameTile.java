package game;
import game.Pink;
import game.Yellow;
import java.awt.*;


public class GameTile {
    private int row;
    private int col;
    private int tileSize;
     GameTile(int row, int col ) {

        this.row = row;
        this.col=col;
        this.tileSize = 100;
    }

        public void render(Graphics g) {
            Pink p1 = new Pink(0,0);
            p1.render(g);

            Pink p2 = new Pink(0,1);
            p2.render(g);
            Pink p3 = new Pink(0,2);
            p3.render(g);
            Pink p4 = new Pink(0,3);
            p4.render(g);
            Pink p5 = new Pink(0,4);
            p5.render(g);
            Pink p7 = new Pink(0,5);
            p7.render(g);
            Pink p8 = new Pink(0,7);
            p8.render(g);
            Pink p9 = new Pink(1,0);
            p9.render(g);
            Pink p10 = new Pink(1,2);
            p10.render(g);
            Pink p11 = new Pink(1,3);
            p11.render(g);
            Pink p12 = new Pink(1,5);
            p12.render(g);
            Pink p13 = new Pink(1,6);
            p13.render(g);
            Pink p14 = new Pink(1,7);
            p14.render(g);
            Pink p15 = new Pink(2,0);
            p15.render(g);
            Pink p16 = new Pink(2,1);
            p16.render(g);
            Pink p17 = new Pink(2,2);
            p17.render(g);
            Pink p18 = new Pink(2,3);
            p18.render(g);
            Pink p19 = new Pink(2,4);
            p19.render(g);
            Pink p20 = new Pink(2,6);
            p20.render(g);
            Pink p21 = new Pink(3,0);
            p21.render(g);
            Pink p22 = new Pink(3,2);
            p22.render(g);
            Pink p23 = new Pink(3,4);
            p23.render(g);
            Pink p24 = new Pink(3,5);
            p24.render(g);
            Pink p25 = new Pink(3,6);
            p25.render(g);
            Pink p26 = new Pink(3,7);
            p26.render(g);
            Pink p27 = new Pink(4,0);
            p27.render(g);
            Pink p28 = new Pink(4,1);
            p28.render(g);
            Pink p29 = new Pink(4,2);
            p29.render(g);
            Pink p30 = new Pink(4,3);
            p30.render(g);
            Pink p31 = new Pink(4,4);
            p31.render(g);
            Pink p32 = new Pink(4,5);
            p32.render(g);
            Pink p33 = new Pink(4,7);
            p33.render(g);
            Pink p34 = new Pink(5,1);
            p34.render(g);
            Pink p35 = new Pink(5,3);
            p35.render(g);
            Pink p36 = new Pink(5,4);
            p36.render(g);
            Pink p37 = new Pink(5,5);
            p37.render(g);
            Pink p38 = new Pink(5,6);
            p38.render(g);
            Pink p39 = new Pink(6,0);
            p39.render(g);
            Pink p40 = new Pink(6,1);
            p40.render(g);
            Pink p41 = new Pink(6,2);
            p41.render(g);
            Pink p42 = new Pink(6,3);
            p42.render(g);
            Pink p43 = new Pink(6,5);
            p43.render(g);
            Pink p44 = new Pink(6,6);
            p44.render(g);
            Pink p45 = new Pink(6,7);
            p45.render(g);
            Pink p46 = new Pink(7,1);
            p46.render(g);
            Pink p47 = new Pink(7,2);
            p47.render(g);
            Pink p48 = new Pink(7,3);
            p48.render(g);
            Pink p49 = new Pink(7,4);
            p49.render(g);
            Pink p50 = new Pink(7,5);
            p50.render(g);
            Pink p51 = new Pink(7,7);
            p51.render(g);

            Yellow y1 = new Yellow(7,0);
            y1.render(g);

            Green g1 = new Green(0,6);
            g1.render(g);
            Green g2 = new Green(1,1);
            g2.render(g);
            Green g3 = new Green(2,5);
            g3.render(g);
            Green g4 = new Green(3,1);
            g4.render(g);
            Green g5 = new Green(3,3);
            g5.render(g);
            Green g6 = new Green(4,6);
            g6.render(g);
            Green g7 = new Green(5,2);
            g7.render(g);
            Green g8 = new Green(7,6);
            g8.render(g);

            Blue b1 = new Blue(1,4);
            b1.render(g);
            Blue b2 = new Blue(2,7);
            b2.render(g);
            Blue b3 = new Blue(5,0);
            b3.render(g);
            Blue b4 = new Blue(5,7);
            b4.render(g);
            Blue b5 = new Blue(6,4);
            b5.render(g);







        }



        //g.drawRect(row, col, 100, 100);
      //  g.fillRect(row, col, 100-1, 100-1);

    }












