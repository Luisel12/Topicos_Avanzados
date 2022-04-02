import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelModificar extends JPanel implements ActionListener {
  private JButton btnGuardar, btnCancelar;
  private JTextField txtNombre, txtDireccion, txtTel, txtCorreo;
  int celda;
    Persona p;
    
  PanelModificar()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
    txtNombre = new JTextField(15);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblDireccion = new JLabel("Domicilio ", JLabel.RIGHT);
    txtDireccion = new JTextField(20);
    add(lblDireccion);
    add(txtDireccion);
    
    JLabel lblTel = new JLabel("Numero de Celular: ", JLabel.RIGHT);
    txtTel = new JTextField(15);
    add(lblTel);
    add(txtTel);

    JLabel lblCorreo = new JLabel("Correo electronico: ", JLabel.RIGHT);
    txtCorreo = new JTextField(20);
    add(lblCorreo);
    add(txtCorreo);
    
    btnGuardar = new JButton("Buscar");
    btnGuardar.addActionListener(this);
    btnCancelar = new JButton("Guardar");
    btnCancelar.addActionListener(this);
    
    txtDireccion.setEditable(false);
    txtTel.setEditable(false);
    txtCorreo.setEditable(false);
    btnCancelar.setEnabled(false);
    

    
    add(btnGuardar);
    add(btnCancelar);
  }
  
  public void actionPerformed(ActionEvent e)  {
      if(e.getSource() == btnGuardar){
         String nombre = txtNombre.getText();
         celda = PanelMenu.agenda.getCelda(nombre);
         if (celda != -1) {
            p = PanelMenu.agenda.getPersona(celda);
            txtDireccion.setText(p.getDireccion());
            txtTel.setText(p.getTelefono());
            txtCorreo.setText(p.getCorreo());
            txtNombre.setEditable(false);
            txtDireccion.setEditable(true);
            txtTel.setEditable(true);
            txtCorreo.setEditable(true);
            btnCancelar.setEnabled(true);
            txtDireccion.requestFocus();
         } else {
            JOptionPane.showMessageDialog(this,
                     "Ese nombre no esta registrado en la agenda",
                     "Nombre inexistente",
                     JOptionPane.ERROR_MESSAGE);
         }
     }
     if(e.getSource() == btnCancelar){
        if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Debes colocar el nombre",
          "ALERTA!!!", JOptionPane.INFORMATION_MESSAGE);
          txtNombre.requestFocus();
        }
        else
        if(txtTel.getText() == null || txtTel.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Debes capturar el telefono celular",
          "ALERTA!!!", JOptionPane.INFORMATION_MESSAGE);
          txtTel.requestFocus();
        }
       else
       {
         String nombre, domicilio, telefono, correo;
         nombre = txtNombre.getText();
         domicilio = txtDireccion.getText();
         telefono = txtTel.getText();
         correo = txtCorreo.getText();
         p = new Persona(nombre, domicilio, telefono, correo);
         PanelMenu.agenda.modificar(p, celda);
         JOptionPane.showMessageDialog(this,
                     "Se ha modificado a la persona con éxito",
                     "MODIFICACION EXITOSA",
                     JOptionPane.INFORMATION_MESSAGE);         
       }
    }
      
     
  }
}
