package FrameNewtonRaphson;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.nfunk.jep.JEP;

public class Aproximaciones_Sucesivas extends javax.swing.JFrame {

    JEP jep;
    public String Funcion;
    public double x;
    public double resultado;

    public Aproximaciones_Sucesivas() {

        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/calculos.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        funcion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        inicio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabulaciones = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ecuacion = new javax.swing.JTextField();
        jCalcular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALCULADORA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APROXIMACIONES SUCESIVAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dosis", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tabulación de la Función: F(x)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        funcion.setBackground(new java.awt.Color(0, 0, 0));
        funcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        funcion.setForeground(new java.awt.Color(255, 255, 255));
        funcion.setText("(x-3)^3-2*x-2");
        funcion.setBorder(null);
        jPanel1.add(funcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 255, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 20));

        jLabel4.setFont(new java.awt.Font("Dosis", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Introduce un número (x):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        inicio.setBackground(new java.awt.Color(0, 0, 0));
        inicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        inicio.setForeground(new java.awt.Color(255, 255, 255));
        inicio.setText("5");
        inicio.setBorder(null);
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator2.setForeground(new java.awt.Color(204, 255, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 180, 20));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "Xo", "F(Xo)", "G(Xo)", "Error"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 810, 300));

        tabulaciones.setBackground(new java.awt.Color(0, 0, 0));
        tabulaciones.setColumns(20);
        tabulaciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tabulaciones.setForeground(new java.awt.Color(255, 255, 255));
        tabulaciones.setRows(5);
        jScrollPane1.setViewportView(tabulaciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 310, 110));

        jLabel5.setFont(new java.awt.Font("Dosis", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pendiente:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 355, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dosis", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Introduce la función:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        ecuacion.setBackground(new java.awt.Color(0, 0, 0));
        ecuacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ecuacion.setForeground(new java.awt.Color(255, 255, 255));
        ecuacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(ecuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 375, 70, -1));

        jCalcular.setBackground(new java.awt.Color(0, 0, 0));
        jCalcular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jCalcular.setText("Calcular");
        jCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(jCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Prueba.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 130, 130));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calculos.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 130, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalcularActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        String fun = this.funcion.getText();
        int inicio = Integer.parseInt(this.inicio.getText());
        double xa, fxa, xb, fxb, xr, fxr;
        double error = 0;
        int cont = 0;
        double fxrA = 0;
        double fxrN = 0;
        double m = 0;
        double gxo = 0;

        cont += 1;
        int sustitucion = inicio;
        xa = sustitucion;
        fxa = f(xa);
        String tabu = "", iteraciones = "";

        if (fxa < 0) {
            do {
                xa = sustitucion;
                fxa = f(xa);
                tabu += ("F(" + sustitucion + ")" + " " + fun + " = " + fxa + "\n");
                sustitucion += 1;
            } while (fxa <= 0);

            this.tabulaciones.setText(tabu);

            int sus = sustitucion - 2;
            xa = sus;
            fxa = f(xa);
            xb = sustitucion - 1;
            fxb = f(xb);
            xr = (xa + xb) / 2;
            fxr = f(xr);
            m = ((fxa - fxb) * -1);
            gxo = (fxr - (m * xr)) / -m;
            fxrA = gxo;

            tabu = ("" + m);
            this.ecuacion.setText(tabu);

            modelo.addRow(new Object[]{cont, xr, fxr, gxo, error});
            do {
                cont += 1;
                if (fxr < 0) {
                    xa = xb = gxo;
                    fxa = f(xa);
                    fxb = f(xb);
                    xr = (xa + xb) / 2;
                    fxr = f(xr);
                    gxo = (fxr - (m * xr)) / -m;
                    fxrN = gxo;
                    error = fxrN - fxrA;
                    if (error < 0) {
                        error *= -1;
                    } else if (error > 0) {
                        error *= 1;
                    }
                    fxrA = fxrN;
                } else if (fxr > 0) {
                    xa = xb = gxo;
                    fxa = f(xa);
                    fxb = f(xb);
                    xr = (xa + xb) / 2;
                    fxr = f(xr);
                    gxo = (fxr - (m * xr)) / -m;
                    fxrN = gxo;
                    error = fxrN - fxrA;
                    if (error < 0) {
                        error *= -1;
                    } else if (error > 0) {
                        error *= 1;
                    }
                    fxrA = fxrN;
                }
                modelo.addRow(new Object[]{cont, xr, fxr, gxo, error});
            } while (error > 0.0001);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede iniciar con ese numero, ingrese uno menor");
        }
    }//GEN-LAST:event_jCalcularActionPerformed
    public double f(double valor) {
        this.x = valor;
        this.Funcion = this.funcion.getText();
        jep = new JEP();
        this.jep.addStandardFunctions();
        this.jep.addStandardConstants();
        this.jep.addVariable("x", this.x);
        this.jep.parseExpression(this.Funcion);
        this.resultado = this.jep.getValue();
        return resultado;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ecuacion;
    private javax.swing.JTextField funcion;
    private javax.swing.JTextField inicio;
    private javax.swing.JButton jCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea tabulaciones;
    // End of variables declaration//GEN-END:variables
}
