import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    Image img1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Marcus\\workspace\\RPG-QUEST-\\src\\resources\\forest_town.png");
    g2.drawImage(img1, 0, 0, this);
    g2.finalize();
  }
}
