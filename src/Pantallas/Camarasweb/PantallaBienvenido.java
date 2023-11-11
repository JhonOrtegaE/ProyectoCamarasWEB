/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas.Camarasweb;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author JhonOrtegaEchenique
 */
public class PantallaBienvenido extends javax.swing.JFrame {
    
    int xMouse,yMouse;
    
    FondoPanel fondo = new FondoPanel();
    
    public PantallaBienvenido() {
        this.setContentPane (fondo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Transparente = new javax.swing.JPanel();
        Panelinicio = new javax.swing.JPanel();
        lblxIniciarSesion = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnXiniciarSesion = new javax.swing.JButton();
        AunNoteunes = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        btnContraOlv = new javax.swing.JButton();
        lblRecordarContra = new javax.swing.JLabel();
        txtContraseñaInicio = new javax.swing.JPasswordField();
        lblContraseña = new javax.swing.JLabel();
        lblCorreoOid = new javax.swing.JLabel();
        barraPantalla = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        TextoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        setResizable(false);

        Transparente.setBackground(new java.awt.Color(0, 0, 0, 75));

        Panelinicio.setBackground(new java.awt.Color(28, 28, 28));
        Panelinicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Panelinicio.setForeground(new java.awt.Color(255, 255, 255));

        lblxIniciarSesion.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        lblxIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblxIniciarSesion.setText("INICIAR SESION");

        txtCorreo.setBackground(new java.awt.Color(28, 28, 28));
        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        btnXiniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        btnXiniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnXiniciarSesion.setText("INICIAR SESION");
        btnXiniciarSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btnXiniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXiniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXiniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXiniciarSesionMouseExited(evt);
            }
        });

        AunNoteunes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        AunNoteunes.setForeground(new java.awt.Color(255, 255, 255));
        AunNoteunes.setText("¿Aun no te unes?");

        btnRegistrarse.setBackground(new java.awt.Color(28, 28, 28));
        btnRegistrarse.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 98, 221));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.setBorder(null);

        btnContraOlv.setBackground(new java.awt.Color(28, 28, 28));
        btnContraOlv.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        btnContraOlv.setForeground(new java.awt.Color(0, 98, 221));
        btnContraOlv.setText("¿Olvidaste tu contraseña?");
        btnContraOlv.setBorder(null);

        lblRecordarContra.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblRecordarContra.setForeground(new java.awt.Color(255, 255, 255));
        lblRecordarContra.setText("Recordar contreseña");

        txtContraseñaInicio.setBackground(new java.awt.Color(28, 28, 28));
        txtContraseñaInicio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtContraseñaInicio.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseñaInicio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtContraseñaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaInicioMousePressed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("CONTRASEÑA");

        lblCorreoOid.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblCorreoOid.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoOid.setText("CORREO O NOMBRE DE USUARIO");

        javax.swing.GroupLayout PanelinicioLayout = new javax.swing.GroupLayout(Panelinicio);
        Panelinicio.setLayout(PanelinicioLayout);
        PanelinicioLayout.setHorizontalGroup(
            PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelinicioLayout.createSequentialGroup()
                .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelinicioLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(AunNoteunes)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarse))
                    .addGroup(PanelinicioLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblxIniciarSesion))
                    .addGroup(PanelinicioLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblRecordarContra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnContraOlv)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinicioLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinicioLayout.createSequentialGroup()
                        .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContraseña)
                            .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtContraseñaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCorreoOid))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinicioLayout.createSequentialGroup()
                        .addComponent(btnXiniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        PanelinicioLayout.setVerticalGroup(
            PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelinicioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblxIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblCorreoOid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContraseña)
                .addGap(5, 5, 5)
                .addComponent(txtContraseñaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecordarContra)
                    .addComponent(btnContraOlv))
                .addGap(18, 18, 18)
                .addComponent(btnXiniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AunNoteunes)
                    .addComponent(btnRegistrarse))
                .addGap(39, 39, 39))
        );

        barraPantalla.setBackground(new java.awt.Color(0, 0, 0, 100));
        barraPantalla.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraPantallaMouseDragged(evt);
            }
        });
        barraPantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraPantallaMousePressed(evt);
            }
        });

        ExitBtn.setBackground(new java.awt.Color(0, 0, 0));
        ExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitBtnMouseEntered(evt);
            }
        });

        lblExit.setBackground(new java.awt.Color(0, 0, 0));
        lblExit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblExit.setPreferredSize(new java.awt.Dimension(40, 40));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitBtnLayout = new javax.swing.GroupLayout(ExitBtn);
        ExitBtn.setLayout(ExitBtnLayout);
        ExitBtnLayout.setHorizontalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ExitBtnLayout.setVerticalGroup(
            ExitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barraPantallaLayout = new javax.swing.GroupLayout(barraPantalla);
        barraPantalla.setLayout(barraPantallaLayout);
        barraPantallaLayout.setHorizontalGroup(
            barraPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPantallaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        barraPantallaLayout.setVerticalGroup(
            barraPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TextoPanel.setBackground(new java.awt.Color(0, 0, 0, 100));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("B I E N V E N I D O !");
        jLabel3.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><center>La seguridad de nuestros hogares y negocios es una<p>preocupación fundamental en la sociedad actual. El<p>incremento de la delincuencia y los robos nos obliga a<p>buscar soluciones soluciones efectivas para proteger lo que más<p>valoramos.Es por ello que en esta ocasión presentamos<p>un sistema de alarma antirrobos, una innovadora<p>herramienta que brinca tranquilidad y seguridad a<p>nuestros seres queridos y propiedades<html>");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TextoPanelLayout = new javax.swing.GroupLayout(TextoPanel);
        TextoPanel.setLayout(TextoPanelLayout);
        TextoPanelLayout.setHorizontalGroup(
            TextoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextoPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(TextoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        TextoPanelLayout.setVerticalGroup(
            TextoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextoPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TransparenteLayout = new javax.swing.GroupLayout(Transparente);
        Transparente.setLayout(TransparenteLayout);
        TransparenteLayout.setHorizontalGroup(
            TransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparenteLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(TextoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Panelinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        TransparenteLayout.setVerticalGroup(
            TransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparenteLayout.createSequentialGroup()
                .addComponent(barraPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TransparenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparenteLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(Panelinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransparenteLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(TextoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Transparente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Transparente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void barraPantallaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPantallaMousePressed
  
        xMouse = evt.getX();
        yMouse = evt.getY();
        
        
    }//GEN-LAST:event_barraPantallaMousePressed

    private void barraPantallaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPantallaMouseDragged
       
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();              
        this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_barraPantallaMouseDragged

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked


        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
         
        lblExit.setForeground(Color.red);

    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited

        lblExit.setForeground(Color.white);
    }//GEN-LAST:event_lblExitMouseExited

    private void ExitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitBtnMouseEntered

    private void btnXiniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXiniciarSesionMouseClicked

        javax.swing.JOptionPane.showMessageDialog(this,"Intento de login con los datos:\nUsuarios: " + txtCorreo.getText()+ "\nContraseña: " + String.valueOf(txtContraseñaInicio.getPassword()),"LOGIN" , javax.swing.JOptionPane.INFORMATION_MESSAGE);

      
    }//GEN-LAST:event_btnXiniciarSesionMouseClicked

    private void btnXiniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXiniciarSesionMouseEntered
         
         btnXiniciarSesion.setBackground(Color.blue);
    }//GEN-LAST:event_btnXiniciarSesionMouseEntered

    private void btnXiniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXiniciarSesionMouseExited

         btnXiniciarSesion.setBackground(Color.black);
    }//GEN-LAST:event_btnXiniciarSesionMouseExited

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if (txtCorreo.getText().equals("  Ingrese su correo o Nombre de Usuario"))
        {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.white);
        }  
        if (String.valueOf(txtContraseñaInicio.getPassword()).isEmpty())
        {
        txtContraseñaInicio.setText("Ingrese su contraseña");
        txtContraseñaInicio.setForeground(Color.gray);
        } 
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtContraseñaInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaInicioMousePressed
        if (String.valueOf(txtContraseñaInicio.getPassword()).equals("Ingrese su contraseña"))
        { 
        txtContraseñaInicio.setText("");   
        txtContraseñaInicio.setForeground(Color.white);
        }    
        if (txtCorreo.getText().isEmpty())
        { 
        txtCorreo.setText("  Ingrese su correo o Nombre de Usuario");
        txtCorreo.setForeground(Color.gray);  
        }    

    }//GEN-LAST:event_txtContraseñaInicioMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaBienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaBienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaBienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaBienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaBienvenido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AunNoteunes;
    private javax.swing.JPanel ExitBtn;
    private javax.swing.JPanel Panelinicio;
    private javax.swing.JPanel TextoPanel;
    private javax.swing.JPanel Transparente;
    private javax.swing.JPanel barraPantalla;
    private javax.swing.JButton btnContraOlv;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnXiniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreoOid;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblRecordarContra;
    private javax.swing.JLabel lblxIniciarSesion;
    private javax.swing.JPasswordField txtContraseñaInicio;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel
    {
            
     private Image imagen;
     @Override
     public void paint(Graphics g)
     { 
           imagen = new ImageIcon(getClass().getResource("/Imagenes/InicioFn.jpeg")).getImage();
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           setOpaque(false);
           super.paint(g);
     }
             
    }
            
}
