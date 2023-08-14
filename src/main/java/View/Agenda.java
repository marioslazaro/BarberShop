/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.AgendaController;
import Model.DAO.Banco;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author xbaco
 */
public class Agenda extends javax.swing.JFrame {
    
    private final AgendaController controller; 

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        this.controller = new AgendaController(this);
        Banco.inicia();
        iniciar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtBoxId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblService = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        JComboBoxCliente = new javax.swing.JComboBox<>();
        JComboBoxServico = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        ScrollObs = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        btnAgendar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAgendamentos = new javax.swing.JTable();
        lblObs = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBackGround = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBoxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtBoxId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 270, -1));

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Cliente:");
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lblService.setForeground(new java.awt.Color(255, 255, 255));
        lblService.setText("Serviço:");
        getContentPane().add(lblService, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data:");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblValor.setForeground(new java.awt.Color(255, 255, 255));
        lblValor.setText("Valor R$:");
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora:");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        JComboBoxCliente.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(JComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 270, -1));

        JComboBoxServico.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(JComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 270, -1));
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 270, -1));
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 270, -1));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 270, -1));

        ScrollObs.setBackground(new java.awt.Color(255, 255, 255));

        txtObs.setBackground(new java.awt.Color(255, 255, 255));
        txtObs.setColumns(20);
        txtObs.setRows(5);
        ScrollObs.setViewportView(txtObs);

        getContentPane().add(ScrollObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 360, 180));

        btnAgendar.setBackground(new java.awt.Color(51, 255, 51));
        btnAgendar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendar.setText("Agendar");
        getContentPane().add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 360, -1));

        tableAgendamentos.setForeground(new java.awt.Color(0, 0, 0));
        tableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane1.setViewportView(tableAgendamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 780, 150));

        lblObs.setForeground(new java.awt.Color(255, 255, 255));
        lblObs.setText("Observação:");
        getContentPane().add(lblObs, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agenda");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        lblBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 960, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/fundo menu principal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBoxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBoxIdActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboBoxCliente;
    private javax.swing.JComboBox<String> JComboBoxServico;
    private javax.swing.JScrollPane ScrollObs;
    private javax.swing.JToggleButton btnAgendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblService;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tableAgendamentos;
    private javax.swing.JTextField txtBoxId;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
        
    }

    public JTable getTableAgendamentos() {
        return tableAgendamentos;
    }

    public void setTableAgendamentos(JTable tableAgendamentos) {
        this.tableAgendamentos = tableAgendamentos;
    }

      public JComboBox<String> getJComboBoxCliente() {
        return JComboBoxCliente;
    }

    public void setJComboBoxCliente(JComboBox<String> JComboBoxCliente) {
        this.JComboBoxCliente = JComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxServico() {
        return JComboBoxServico;
    }

    public void setjComboBoxServico(JComboBox<String> jComboBoxServico) {
        this.JComboBoxServico = jComboBoxServico;
    }
}
