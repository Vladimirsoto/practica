/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author equipo hp
 */
public class ViewEditorTexto extends javax.swing.JPanel {

    /**
     * Creates new form ViewEditorTexto
     */
    public ViewEditorTexto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jsp_lista_numeros = new javax.swing.JScrollPane();
        jli_lista_numeros = new javax.swing.JList<>();
        jButton1_ABRIR = new javax.swing.JButton();
        jButton2_GUARDAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_area_trabajo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jli_lista_numeros.setBackground(new java.awt.Color(51, 51, 51));
        jli_lista_numeros.setForeground(new java.awt.Color(255, 255, 255));
        jsp_lista_numeros.setViewportView(jli_lista_numeros);

        jButton1_ABRIR.setText("ABRIR");

        jButton2_GUARDAR.setText("GUARDAR");

        jta_area_trabajo.setColumns(20);
        jta_area_trabajo.setRows(5);
        jScrollPane1.setViewportView(jta_area_trabajo);

        jLabel1.setText("EDITOR DE TEXTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1_ABRIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2_GUARDAR, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_ABRIR, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2_GUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1_ABRIR;
    public javax.swing.JButton jButton2_GUARDAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JList<String> jli_lista_numeros;
    public javax.swing.JScrollPane jsp_lista_numeros;
    public javax.swing.JTextArea jta_area_trabajo;
    // End of variables declaration//GEN-END:variables
}
