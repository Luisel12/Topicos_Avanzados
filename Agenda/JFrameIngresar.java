import javax.swing.*;
import java.awt.*;

public class JFrameIngresar extends JFrame
{
   PanelIngresar mostrar = new PanelIngresar();
   
    public JFrameIngresar()
   { 
     initComponents();
   }
   
   private void initComponents()
   {
      this.setEnabled(true);
      setSize(350, 200);
      setTitle("Usuario y Contraseña");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}