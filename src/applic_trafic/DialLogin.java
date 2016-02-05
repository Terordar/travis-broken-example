/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applic_trafic;

import ProtocoleTRAMAP.Client;
import ProtocoleTRAMAP.ReponseTRAMAP;
import ProtocoleTRAMAP.RequeteTRAMAP;
import ProtocoleTRAMAP.User;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.GetPropertyValues;

/**
 *
 * @author Pierre
 */
public class DialLogin extends javax.swing.JDialog {
    private java.awt.Frame fam;
    private Client cli;
    private User user;
    /**
     * Creates new form DialLogin
     */
    public DialLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        fam = parent;
        this.cli = new Client();
        initComponents();
    }
    
    public Client getCli(){
        return cli;
    }
    
    public User getUser(){
        return user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPassword = new javax.swing.JTextField();
        connect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        connect.setText("Connexion");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });

        jLabel1.setText("Login:");

        jLabel2.setText("Mot de passe:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(connect))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(tfPassword))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(connect)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        try
        {
            cli.open(GetPropertyValues.getPropValues("ip"), Integer.parseInt(GetPropertyValues.getPropValues("portServeurTrafic")));
        }
        catch (UnknownHostException e)
        { System.err.println("Erreur ! Host non trouvé [" + e + "]"); }
        catch (IOException e)
        { System.err.println("Erreur ! Pas de connexion ? [" + e + "]"); }        
        
        user = new User(tfLogin.getText(), tfPassword.getText()); 
        RequeteTRAMAP req = new RequeteTRAMAP(RequeteTRAMAP.LOGIN, user);
        
        try {
            cli.sendRequest(req);
        } catch (IOException ex) {
            Logger.getLogger(DialLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Flux créés");
        
        connect.setEnabled(false);
        //----->
        //<----
        try {
            ReponseTRAMAP rep = null;
            rep = cli.getResponse();
            
            if(rep.getCode().equals(ReponseTRAMAP.LOGIN_OK)){
                dispose();
            }
            else{
                System.out.println("Connexion impossible!");
                System.exit(1);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(DialLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DialLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_connectActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables
}
