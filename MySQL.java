package classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowRegister extends javax.swing.JFrame {
    
    JTextField txtNombre, txtApellido, txtDNI;
    JPanel panel1, panel2, panel3, panel4;
    
    public WindowRegister() {
        initComponents();
    }
    
    private void initComponents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setTitle("Registrar Usuario");
        setLayout(null);
        setLocationRelativeTo(null);
        
        panel1 = new JPanel();
        panel1.setBackground(Color.YELLOW);
        panel1.setLayout(null);
        //panel1.setBounds(5, 5, 190, 190);
        
        panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setLayout(null);
        //panel2.setBounds(205, 5, 190, 190);

        panel3 = new JPanel();
        panel3.setBackground(Color.RED);
        panel3.setLayout(null);
        
// <editor-fold defaultstate="collapsed" desc="Text Field Nombre">
        txtNombre = new JTextField("Ingrese Nombre");
        txtNombre.setForeground(Color.GRAY);
        txtNombre.addFocusListener(new FocusListener() {               
            public void focusGained(FocusEvent e) {
                txtNombre.setText(null);
                txtNombre.setForeground(Color.BLACK);
            }
            public void focusLost(FocusEvent e) {
            }
        });
// </editor-fold>        

// <editor-fold defaultstate="collapsed" desc="Text Field Apellido">
        txtApellido = new JTextField("Ingrese Apellido");
        txtApellido.setForeground(Color.GRAY);
        txtApellido.addFocusListener(new FocusListener() {               
            public void focusGained(FocusEvent e) {
                txtApellido.setText(null);
                txtApellido.setForeground(Color.BLACK);
            }
            public void focusLost(FocusEvent e) {
            }
        });
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Text Field DNI">
        txtDNI = new JTextField("Ingrese Apellido");
        txtDNI.setForeground(Color.GRAY);
        txtDNI.addFocusListener(new FocusListener() {               
            public void focusGained(FocusEvent e) {
                txtDNI.setText(null);
                txtDNI.setForeground(Color.BLACK);
            }
            public void focusLost(FocusEvent e) {
            }
        });
// </editor-fold>
        
        
        panel1.add(txtNombre);
        panel1.setLayout(new FlowLayout());
        
        panel2.add(txtApellido);
        panel2.setLayout(new FlowLayout());
        
        panel3.add(txtDNI);
        panel3.setLayout(new FlowLayout());

        add(panel1);
        add(panel2);
        add(panel3);
        GridLayout layout1 = new GridLayout();
        layout1.setColumns(2);
        layout1.setRows(2);
        setLayout(layout1);
    }
    
                /*MySQL db = new MySQL();
                db.MySQLConnection("root", "", "MySQL_Test");
                db.insertData("Registros", txtID.getText(),
                    txtNombre.getText(),
                    txtApellido.getText(),
                    txtEdad.getText(),
                    jComboBoxSexo.getSelectedItem().toString());
                db.closeConnection();
                this.dispose();*/
}
