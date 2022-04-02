import javax.swing.*;
import java.awt.*;

public class JFrameConsulta extends JFrame
{
   
    public JFrameConsulta()
   {  
      initComponents();
   }
   
   private void initComponents()
   {
      setSize(300, 200);
      setTitle("Consulta General");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setVisible(true);
      addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
      jScrollPane1 = new javax.swing.JScrollPane();
      txtConsGral = new javax.swing.JTextArea();
      txtConsGral.setEditable(false);
      txtConsGral.setColumns(20);
      txtConsGral.setRows(5);
      jScrollPane1.setViewportView(txtConsGral);
      
      
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

       
   }  
   
        private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        String nombre, direccion, tel, correo;
        int cont = PanelMenu.agenda.getCont();
        for (int x=0; x<cont; x++){
            nombre = PanelMenu.agenda.getPersona(x).getNombre();
            direccion = PanelMenu.agenda.getPersona(x).getDireccion();
            tel = PanelMenu.agenda.getPersona(x).getTelefono();
            correo = PanelMenu.agenda.getPersona(x).getCorreo();
            txtConsGral.setText(txtConsGral.getText() +
                    "Persona " + String.valueOf(x+1) + "\n" +
                    "Nombre: " + nombre + "\n" + 
                    "Domicilio: " + direccion + "\n" +
                    "Telefono: " + tel + "\n" +
                    "Correo: " + correo + "\n\n");
        }
    }
    
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtConsGral; 
}