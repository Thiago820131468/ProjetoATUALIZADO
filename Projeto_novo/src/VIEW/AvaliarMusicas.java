/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.ConexaoDAO;
import DAO.MusicaDAO;
import DTO.MusicaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Igor
 */
public class AvaliarMusicas extends javax.swing.JFrame {

    /**
     * Creates new form AvaliarMusicas
     */
    public AvaliarMusicas() {
        initComponents();
    }
    
    public AvaliarMusicas(int userId) {
        initComponents();
        userIdAM.setText(Integer.toString(userId));        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMusicasAvaliar = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAvaliacaoMusica = new javax.swing.JTextField();
        btnAvaliarMusica = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        userIdAM = new javax.swing.JLabel();
        btnListarMusica = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("@CopyRight 2020");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(225, 225, 225))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        tabelaMusicasAvaliar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Música"
            }
        ));
        jScrollPane1.setViewportView(tabelaMusicasAvaliar);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("De 1 a 5, o quanto você gosta dessa música?");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Selecione uma música!");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Avaliar Músicas");

        txtAvaliacaoMusica.setToolTipText("Nota da música");
        txtAvaliacaoMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvaliacaoMusicaActionPerformed(evt);
            }
        });

        btnAvaliarMusica.setBackground(new java.awt.Color(0, 153, 51));
        btnAvaliarMusica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAvaliarMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnAvaliarMusica.setText("Avaliar!");
        btnAvaliarMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaliarMusicaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        userIdAM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        userIdAM.setText("USUÁRIO");

        btnListarMusica.setBackground(new java.awt.Color(0, 153, 51));
        btnListarMusica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnListarMusica.setForeground(new java.awt.Color(255, 255, 255));
        btnListarMusica.setText("LISTAR MÚSICAS");
        btnListarMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarMusicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(210, 210, 210))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(userIdAM))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtAvaliacaoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(223, 223, 223))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListarMusica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAvaliarMusica, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userIdAM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtAvaliacaoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAvaliarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAvaliacaoMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvaliacaoMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvaliacaoMusicaActionPerformed

    private void btnListarMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarMusicaActionPerformed
        listarNomeMusica();
    }//GEN-LAST:event_btnListarMusicaActionPerformed

    private void btnAvaliarMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvaliarMusicaActionPerformed
       avaliarMusica();
    }//GEN-LAST:event_btnAvaliarMusicaActionPerformed

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
            java.util.logging.Logger.getLogger(AvaliarMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvaliarMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvaliarMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvaliarMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvaliarMusicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvaliarMusica;
    private javax.swing.JButton btnListarMusica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaMusicasAvaliar;
    private javax.swing.JTextField txtAvaliacaoMusica;
    private javax.swing.JLabel userIdAM;
    // End of variables declaration//GEN-END:variables
   
    private void listarNomeMusica(){
        try {
            MusicaDAO objmusicadao = new MusicaDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaMusicasAvaliar.getModel();
            model.setNumRows(0);
            
            ArrayList<MusicaDTO> lista = objmusicadao.puxarMusica();
            
            for(int num = 0; num < lista.size(); num ++){
                model.addRow(new Object[]{
            /*ENQUANTO HOUVER DADOS NO ARRAYLIST MOSTRAR NA TABELA.*/
                    lista.get(num).getMusicId(),
                    lista.get(num).getNome_musica()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as musicas na jTable: " + erro);
        }
        
        
        
        
        
    }
    
    
    private void avaliarMusica(){
        int id = Integer.parseInt(userIdAM.getText());;
        int avaliacao;
        int setar;
        /*A VARIÁVEL setar ARMAZENA O NÚMERO DA LINHA CLICADA ATRAVÉS DO MÉTODO getSelectRow()*/
        setar = tabelaMusicasAvaliar.getSelectedRow();
        int genderId;
        /*CAPTURA O NOME DA MÚSICA DIGITADA NO CAMPO DE TEXTO.*/
        avaliacao = Integer.parseInt(txtAvaliacaoMusica.getText());
        
        genderId = Integer.parseInt(tabelaMusicasAvaliar.getModel().getValueAt(setar, 0).toString());
        
        
        /*A QUERY IRÁ ARMAZENAR O NOME DA MÚSICA E O IDENTIFICADOR DO GÊNERO QUE PERTENCE A MÚSICA.*/        String sql = "insert into avaliacao (avaliacao, usuario, musica) values (?, ?, ?)";      
        Connection con = new ConexaoDAO().conectaBD();
        PreparedStatement pstm;
         MusicaDTO objmusicadto = new MusicaDTO();
        
            try {
                pstm = con.prepareStatement(sql);
                /*SUBSTITUI O NOME DA MÚSICA NA QUERY ATRAVÉS DO MÉTODO getNome_musica.*/
                pstm.setInt(1, avaliacao);
                pstm.setInt(2, id);
                pstm.setInt(3,  genderId);
                
             
                
              pstm.execute();
              pstm.close();


            } catch (SQLException erro) {                JOptionPane.showMessageDialog(null, "Erro na avaliação" + erro);
           }
        
    } 
}