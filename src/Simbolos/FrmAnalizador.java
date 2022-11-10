/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Simbolos;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laura Hdez Perez
 */
public class FrmAnalizador extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
   
    public FrmAnalizador() {
        initComponents();
        this.getContentPane().setBackground(Color.blue);
        this.setTitle("Tabla de simbolos");
        modelo.addColumn("Token");
        modelo.addColumn("Componente lexico");
        modelo.addColumn("Lexema 1");
        modelo.addColumn("Lexema 2");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAnalizar = new javax.swing.JButton();
        btnTraducir = new javax.swing.JButton();
        btnGuardarTabla = new javax.swing.JButton();
        btnGuardarTraduccion = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLexico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAnalizador = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTraduccion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Analizador Lexico");

        btnAnalizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        btnTraducir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTraducir.setText("Traducir");
        btnTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraducirActionPerformed(evt);
            }
        });

        btnGuardarTabla.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGuardarTabla.setText("Guardar Tabla");
        btnGuardarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTablaActionPerformed(evt);
            }
        });

        btnGuardarTraduccion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnGuardarTraduccion.setText("Guardar Traduccion");
        btnGuardarTraduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTraduccionActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtLexico.setColumns(20);
        txtLexico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLexico.setRows(5);
        jScrollPane1.setViewportView(txtLexico);

        tblAnalizador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblAnalizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAnalizador);

        txtTraduccion.setColumns(20);
        txtTraduccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTraduccion.setRows(5);
        jScrollPane3.setViewportView(txtTraduccion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTraducir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarTabla)
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardarTraduccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAnalizar)
                    .addComponent(btnTraducir)
                    .addComponent(btnGuardarTabla)
                    .addComponent(btnGuardarTraduccion)
                    .addComponent(btnBorrar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        JFileChooser bs = new JFileChooser();
          int seleccion = bs.showOpenDialog(this);
          
          if(seleccion == JFileChooser.APPROVE_OPTION){
              File fichero = bs.getSelectedFile();
              this.txtLexico.setText(fichero.getAbsolutePath());
              
              try(FileReader fr = new FileReader(fichero)){
                  String cadena = "";
                  int valor = fr.read();
                  while (valor != -1){
                      cadena= cadena + (char) valor;
                      valor = fr.read();
                  }this.txtLexico.setText(cadena);
              }catch(IOException el){
                  el.printStackTrace();
              }
          }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        File archivo = new File("archivo.txt"); 
        PrintWriter escribir;    
        try{
            escribir = new PrintWriter(archivo);
            escribir.print(txtLexico.getText());
            escribir.close();
        }catch (FileNotFoundException ex){
            
        }
        
        modelo.getDataVector().removeAllElements();
        tblAnalizador.updateUI();
        
        try{
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            metodos a = new metodos(lector);
            Yytoken token = null;
            do{
                token = a.nextToken();
                modelo.addRow(new Object[]{token.token, token.tipo, token.lexema1, token.lexema2});
            }while (token != null);
        } catch (Exception ex){
            
        }
        tblAnalizador.setModel(modelo);
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraducirActionPerformed
        String fila = "";
        int posicion = 2;
        String guardar = "";
        for (int i = 0;  i<tblAnalizador.getRowCount(); i++){
            fila=(String)tblAnalizador.getValueAt(i, posicion);
            if(fila== "DEL" || fila == "LLI" ){
                guardar += fila+"\n";
            }else{
                guardar += fila+" ";
                txtTraduccion.setText(guardar);
            }
        }
    }//GEN-LAST:event_btnTraducirActionPerformed

    private void btnGuardarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTablaActionPerformed
        try {
            String Tabla = "C:/Users/Laura Hdez Perez/Desktop/Analizador/AnalizadorL.txt";
           
            BufferedWriter gt = new BufferedWriter(new FileWriter(Tabla));

            for (int i = 0; i < tblAnalizador.getRowCount(); i++) //realiza un barrido por filas.
            {
                for (int j = 0; j < tblAnalizador.getColumnCount(); j++) //realiza un barrido por columnas.
                {
                    gt.write((String) (tblAnalizador.getValueAt(i, j)));
                    if (j < tblAnalizador.getColumnCount() - 1) { //agrega separador "," si no es el ultimo elemento de la fila.
                        gt.write("  ");
                    }
                }
                gt.newLine(); //inserta nueva linea.
            }

            gt.close(); //cierra archivo!
            System.out.println("El archivo fue guardado correctamente!");
        } catch (IOException e) {
            System.out.println("ERROR: Ocurrio un problema al salvar el archivo!" + e.getMessage());
            
        }
    }//GEN-LAST:event_btnGuardarTablaActionPerformed

    private void btnGuardarTraduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTraduccionActionPerformed
        try {
            JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
            archivo.showSaveDialog(this);
            if (archivo.getSelectedFile() != null) {
                try ( FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                    guardado.write(txtTraduccion.getText());
                   
                }
            }
        } catch (IOException ex) {
            
        }
    }//GEN-LAST:event_btnGuardarTraduccionActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtLexico.setText("");
        modelo.getDataVector().removeAllElements();
        tblAnalizador.updateUI();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardarTabla;
    private javax.swing.JButton btnGuardarTraduccion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTraducir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAnalizador;
    private javax.swing.JTextArea txtLexico;
    private javax.swing.JTextArea txtTraduccion;
    // End of variables declaration//GEN-END:variables
}