import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruna Leticia Felipe Parra
 */
public class GuiAtleta extends javax.swing.JFrame {

    public GuiAtleta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cpf");

        jLabel2.setText("Nome");

        jLabel3.setText("Idade");

        jLabel4.setText("Altura");

        jLabel5.setText("Peso");

        txtNome.setEnabled(false);

        txtIdade.setEnabled(false);

        txtAltura.setEnabled(false);

        txtPeso.setToolTipText("");
        txtPeso.setEnabled(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnConsultar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cpf = txtCpf.getText();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement("SELECT * FROM tblAtleta WHERE CPF = ?");
            ps.setString(1, cpf);
            rs = ps.executeQuery();

            if (rs.next()) {
                txtNome.setText(rs.getString("Nome"));
                txtIdade.setText(String.valueOf(rs.getInt("Idade")));
                txtAltura.setText(String.valueOf(rs.getDouble("Altura")));
                txtPeso.setText(String.valueOf(rs.getDouble("Peso")));

                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtIdade.setEnabled(true);
                txtAltura.setEnabled(true);
                txtPeso.setEnabled(true);
                txtNome.requestFocus();

                btnIncluir.setEnabled(false);
                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            } else {
                txtNome.setText("");
                txtIdade.setText("");
                txtAltura.setText("");
                txtPeso.setText("");

                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtIdade.setEnabled(true);
                txtAltura.setEnabled(true);
                txtPeso.setEnabled(true);

                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Atleta não encontrado. Você pode incluir um novo.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
    {
        String cpf = txtCpf.getText();
        String nome = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        double peso = Double.parseDouble(txtPeso.getText());
        
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("INSERT INTO tblAtleta (CPF, Nome, Idade, Altura, Peso) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, cpf);
            ps.setString(2, nome);
            ps.setInt(3, idade);
            ps.setDouble(4, altura);
            ps.setDouble(5, peso);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atleta incluído com sucesso.");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }


        txtCpf.setText("");
        txtNome.setText("");
        txtIdade.setText("");
        txtAltura.setText("");
        txtPeso.setText("");

        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtIdade.setEnabled(false);
        txtAltura.setEnabled(false);
        txtPeso.setEnabled(false);

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCpf.requestFocus();
    }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String cpf = txtCpf.getText();
        String nome = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        double altura = Double.parseDouble(txtAltura.getText());
        double peso = Double.parseDouble(txtPeso.getText());
        
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("UPDATE tblAtleta SET Nome = ?, Idade = ?, Altura = ?, Peso = ? WHERE CPF = ?");
            ps.setString(1, nome);
            ps.setInt(2, idade);
            ps.setDouble(3, altura);
            ps.setDouble(4, peso);
            ps.setString(5, cpf);
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Atleta alterado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Atleta não encontrado para alteração.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }

        txtCpf.setText("");
        txtNome.setText("");
        txtIdade.setText("");
        txtAltura.setText("");
        txtPeso.setText("");

        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtIdade.setEnabled(false);
        txtAltura.setEnabled(false);
        txtPeso.setEnabled(false);
        txtCpf.requestFocus();

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    {
        String cpf = txtCpf.getText();

        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("DELETE FROM tblAtleta WHERE CPF = ?");
            ps.setString(1, cpf);
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Atleta excluído com sucesso.");

                txtCpf.setText("");
                txtNome.setText("");
                txtIdade.setText("");
                txtAltura.setText("");
                txtPeso.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Atleta não encontrado para exclusão.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }


        txtCpf.setText("");
        txtNome.setText("");
        txtIdade.setText("");
        txtAltura.setText("");
        txtPeso.setText("");

        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtIdade.setEnabled(false);
        txtAltura.setEnabled(false);
        txtCpf.requestFocus();

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try{

             Class.forName("oracle.jdbc.driver.OracleDriver");
        
                                                                          
             connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.6:1521:xe",
                                                       "BD2312031", 
                                                       "BD2312031");
             System.out.println("Conexão OK");
        }catch(Exception ex){
            System.out.println("Falha na conexão");
            System.out.println(ex.toString() + ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            connection.close();
        }catch(Exception ex){
            System.out.println(ex.toString() + ex.getMessage());            
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(GuiAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAtleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAtleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
    private Atleta atleta;
    private Connection connection;
}
