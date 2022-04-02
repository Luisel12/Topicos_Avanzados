import javax.swing.*;
import java.awt.*;

public class JFrameEliminar extends JFrame
{
   PanelEliminar mostrar = new PanelEliminar();
   
    public JFrameEliminar()
   {  
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(300, 200);
      setTitle("Eliminar");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}