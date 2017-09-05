package JavaApplet1;

import java.applet.Applet;
import java.awt.*;

public class JavaApplet1 extends Applet{

    public void init () {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Bas", 50 , 60 );
        g.setColor(Color.red);
        g.drawString("Spil", 50 , 80 );
    }

}
