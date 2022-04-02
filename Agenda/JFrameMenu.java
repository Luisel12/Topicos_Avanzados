import javax.swing.*;
import java.awt.*;

public class JFrameMenu extends JFrame
{
   PanelMenu pMenu = new PanelMenu();
   
    public JFrameMenu()
   { 
     initComponents();
   }
   
   private void initComponents()
   {
      this.setEnabled(true);
      setSize(350, 200);
      setTitle("Menu");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(pMenu);
      setVisible(true);
       
   }   
}