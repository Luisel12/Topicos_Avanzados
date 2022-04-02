import javax.swing.*;
import java.awt.*;

public class JFrameModificar extends JFrame
{
   PanelModificar mostrar = new PanelModificar();
   
    public JFrameModificar()
   {  

      initComponents();
   }
   
   private void initComponents()
   {
      setSize(300, 200);
      setTitle("Modificar");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}