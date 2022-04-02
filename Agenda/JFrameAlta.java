import javax.swing.*;
import java.awt.*;

public class JFrameAlta extends JFrame
{
   PanelAlta mostrar = new PanelAlta();
   
    public JFrameAlta()
   {  
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(300, 200);
      setTitle("Altas");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}