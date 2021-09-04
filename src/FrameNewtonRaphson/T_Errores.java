package FrameNewtonRaphson;

import javax.swing.ImageIcon;

public class T_Errores extends javax.swing.JFrame {

    public T_Errores() {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/calculos.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelO = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelO1 = new javax.swing.JLabel();
        jLabelO2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ErrorR = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelO6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelO5 = new javax.swing.JLabel();
        ErrorA = new javax.swing.JLabel();
        ErrorP = new javax.swing.JLabel();
        txtR = new javax.swing.JTextField();
        txtO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIPOS DE ERRORES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabelO.setFont(new java.awt.Font("Dosis", 0, 16)); // NOI18N
        jLabelO.setForeground(new java.awt.Color(255, 255, 255));
        jLabelO.setText("Error Relativo:");
        jPanel1.add(jLabelO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 255, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 180, 20));

        jLabel7.setFont(new java.awt.Font("Dosis", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Valor Real:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator2.setForeground(new java.awt.Color(204, 255, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 180, 20));

        jLabelO1.setFont(new java.awt.Font("Dosis", 0, 14)); // NOI18N
        jLabelO1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelO1.setText("Valor Obtenido:");
        jPanel1.add(jLabelO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabelO2.setFont(new java.awt.Font("Dosis", 0, 16)); // NOI18N
        jLabelO2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelO2.setText("Por favor introduce los siguientes datos.");
        jPanel1.add(jLabelO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CALCULADORA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        ErrorR.setFont(new java.awt.Font("Dosis", 0, 16)); // NOI18N
        ErrorR.setForeground(new java.awt.Color(255, 255, 255));
        ErrorR.setText("/////");
        jPanel1.add(ErrorR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Prueba.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 130, 130));

        jLabelO6.setFont(new java.awt.Font("Dosis", 0, 16)); // NOI18N
        jLabelO6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelO6.setText("Error Porcentual:");
        jPanel1.add(jLabelO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        jButton1.setBackground(new java.awt.Color(17, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 180, 30));

        jLabelO5.setFont(new java.awt.Font("Dosis", 0, 16)); // NOI18N
        jLabelO5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelO5.setText("Error Absoluto:");
        jPanel1.add(jLabelO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        ErrorA.setFont(new java.awt.Font("Dosis", 0, 16)); // NOI18N
        ErrorA.setForeground(new java.awt.Color(255, 255, 255));
        ErrorA.setText("/////");
        jPanel1.add(ErrorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        ErrorP.setFont(new java.awt.Font("Dosis", 0, 16)); // NOI18N
        ErrorP.setForeground(new java.awt.Color(255, 255, 255));
        ErrorP.setText("//////");
        jPanel1.add(ErrorP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        txtR.setBackground(new java.awt.Color(0, 0, 0));
        txtR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtR.setForeground(new java.awt.Color(255, 255, 255));
        txtR.setText("6.2347");
        txtR.setBorder(null);
        jPanel1.add(txtR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 180, 30));

        txtO.setBackground(new java.awt.Color(0, 0, 0));
        txtO.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtO.setForeground(new java.awt.Color(255, 255, 255));
        txtO.setText("6.0095");
        txtO.setBorder(null);
        jPanel1.add(txtO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        double Numero1 = Double.parseDouble(txtO.getText());
        double Numero2 = Double.parseDouble(txtR.getText());

        double Resultante = Numero2 - Numero1;
        if (Resultante < 0) {
            Resultante = (Numero2 - Numero1) * -1;
            double Resultante2 = Resultante / Numero2;
            double Resultante3 = Resultante2 * 100;
            ErrorA.setText("" + Resultante);
            ErrorR.setText("" + Resultante2);
            ErrorP.setText("" + Resultante3 + " %");
        } else {
            Resultante = Numero2 - Numero1;
            double Resultante2 = Resultante / Numero2;
            double Resultante3 = Resultante2 * 100;
            ErrorA.setText("" + Resultante);
            ErrorR.setText("" + Resultante2);
            ErrorP.setText("" + Resultante3 + " %");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorA;
    private javax.swing.JLabel ErrorP;
    private javax.swing.JLabel ErrorR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelO;
    private javax.swing.JLabel jLabelO1;
    private javax.swing.JLabel jLabelO2;
    private javax.swing.JLabel jLabelO5;
    private javax.swing.JLabel jLabelO6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtO;
    private javax.swing.JTextField txtR;
    // End of variables declaration//GEN-END:variables

}
