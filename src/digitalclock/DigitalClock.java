
package digitalclock;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame {

    JLabel jlabClock = new JLabel("'");
    ClockThread ct;
    public DigitalClock() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(3);
        jlabClock.setFont(new Font("Arial",Font.CENTER_BASELINE,60));
        this.add(this.jlabClock);
        this.setSize(1200, 120);
        this.setLocationRelativeTo((Component)null);
        ct =new ClockThread(this);
        this.setVisible(true);
    }

    public static void main(String[] var0) {
        new DigitalClock();
    }
}
