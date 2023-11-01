
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @authors Bruna Letícia Monteiro Santos e Felipe Parra Alves
 */

public class GuiVendedor extends javax.swing.JFrame {

    /**
     * Creates new form GuiVendedor
     */
    public GuiVendedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSalarioBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTaxaComissao = new javax.swing.JTextField();
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

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        txtNome.setEnabled(false);

        txtSalarioBase.setEnabled(false);

        jLabel3.setText("Salário Base");

        jLabel4.setText("Taxa de Comissão");

        txtTaxaComissao.setEnabled(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.setToolTipText("");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome)
                                .addComponent(txtCpf)
                                .addComponent(txtSalarioBase, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                            .addComponent(txtTaxaComissao)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtTaxaComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        vendedor = null;
        String cpf = txtCpf.getText();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        
        try {
            ps = connection.prepareStatement("SELECT * FROM tblVendedor WHERE CPF = ?");
            ps.setString(1, cpf);
            rs = ps.executeQuery();

            if (rs.next()) {
                // Vendedor encontrado, preencher os campos de texto com os dados do vendedor
                txtNome.setText(rs.getString("Nome"));
                txtSalarioBase.setText(String.valueOf(rs.getDouble("SalarioBase")));
                txtTaxaComissao.setText(String.valueOf(rs.getDouble("TaxaComissao")));

                // Desabilitar campos de texto relacionados ao CPF, pois o CPF não deve ser alterado
                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtSalarioBase.setEnabled(true);
                txtTaxaComissao.setEnabled(true);
                txtNome.requestFocus();

                // Configurar os botões para permitir alteração ou exclusão
                btnIncluir.setEnabled(false);
                btnConsultar.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            } else {
                // Vendedor não encontrado, permitir a inclusão e habilitar campos de texto relacionados ao CPF
                txtNome.setText("");
                txtSalarioBase.setText("");
                txtTaxaComissao.setText("");

                txtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtSalarioBase.setEnabled(true);
                txtTaxaComissao.setEnabled(true);

                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Vendedor não encontrado. Você pode incluir um novo.");
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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String cpf = txtCpf.getText();
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("DELETE FROM tblVendedor WHERE CPF = ?");
            ps.setString(1, cpf);
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Vendedor excluído com sucesso!.");
                txtCpf.setText("");
                txtNome.setText("");
                txtSalarioBase.setText("");
                txtTaxaComissao.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Vendedor não encontrado.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }

        txtCpf.setText("");
        txtNome.setText("");
        txtSalarioBase.setText("");
        txtTaxaComissao.setText("");

        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtSalarioBase.setEnabled(false);
        txtTaxaComissao.setEnabled(false);        
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

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
       //Faz a instanciação de um objeto da classe Produto
        vendedor = new Vendedor(txtCpf.getText(),
                              txtNome.getText(),
                              Double.parseDouble(txtTaxaComissao.getText()));
        
        //Enviar instrução SQL de inclusão para o banco
        PreparedStatement ps  = null;
        try{
            ps = connection.prepareStatement("Insert into tblVendedor values (?,?,?,?)");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setDouble(3, vendedor.getSalarioBase());
            ps.setDouble(4, vendedor.getTaxaComissao());
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        //Ajusta a gui para uma nova operação de consulta
        txtCpf.setText("");
        txtNome.setText("");
        txtSalarioBase.setText("");
        txtTaxaComissao.setText("");
        
        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtSalarioBase.setEnabled(false);      
        txtTaxaComissao.setEnabled(false);
        txtCpf.requestFocus();

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String cpf = txtCpf.getText();
        String nome = txtNome.getText();
        double salarioBase = Double.parseDouble(txtSalarioBase.getText());
        double taxaComissao = Double.parseDouble(txtTaxaComissao.getText());

        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("UPDATE tblVendedor SET Nome = ?, SalarioBase = ?, TaxaComissao = ? WHERE CPF = ?");
            ps.setString(1, nome);
            ps.setDouble(2, salarioBase);
            ps.setDouble(3, taxaComissao);
            ps.setString(4, cpf);
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Vendedor alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Vendedor não encontrado.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (ps != null) ps.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            
        txtCpf.setText("");
        txtNome.setText("");
        txtSalarioBase.setText("");
        txtTaxaComissao.setText("");

        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtSalarioBase.setEnabled(false);
        txtTaxaComissao.setEnabled(false);
        txtCpf.requestFocus();

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         // Inicia a conexão com o banco de dados
        try{
             //Caregar o driver de conexão com o banco de dados
             Class.forName("oracle.jdbc.driver.OracleDriver");
        
             //Estabelece a conexão com o banco de dados Oracle  
                                                                          
             connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.6:1521:xe",
                                                       "BD2312012", //login
                                                       "BD2312012");//senha
             System.out.println("Conexão OK");
        }catch(Exception ex){
            System.out.println("Falha na conexão");
            System.out.println(ex.toString() + ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Encerra a conexão com o banco de dados
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
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuiVendedor().setVisible(true);
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
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtTaxaComissao;
    // End of variables declaration//GEN-END:variables
    private Vendedor vendedor;
    private Connection connection;
}