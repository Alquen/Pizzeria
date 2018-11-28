/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzeriaGUI;
import PizzeriaBL.PizzaBL;
import PizzeriaDAL.ConexionDAL;
import PizzeriaDAL.PizzaDAL;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.misc.BASE64Decoder;

public class PizzaGUI extends javax.swing.JFrame {
    PizzaDAL ObjDAL = new PizzaDAL();
     PizzaBL ObjBL = new PizzaBL();
    private JPanel contentPane;
    File fichero = null;

   
    ConexionDAL conex = new ConexionDAL();
     
   public void ActualizarTBlpizza(){
   TBLpizza.setModel(ObjDAL.Mostrar());}

    
    public PizzaGUI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        TXTfoto.setVisible(false);
   
        setResizable(false);
        setLocationRelativeTo(null);
        ActualizarTBlpizza();
        TXAdescripcion.setLineWrap(true);
     
    }

    
     
     public static BufferedImage decodeToImage(String imageString) {

        BufferedImage image = null;
        byte[] imageByte;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            imageByte = decoder.decodeBuffer(imageString);
            ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
            image = ImageIO.read(bis);
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
     
     public void Limpiar(){
        TXTid.setText(null);
        TXTnombre.setText(null);
        TXTcodigo.setText(null);
        TXTfoto.setText(null);
        TXTprecio.setText(null);
        TXAdescripcion.setText(null);
        LBLfoto.setIcon(null);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LBLfoto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLpizza = new javax.swing.JTable();
        TXTid = new javax.swing.JTextField();
        TXTnombre = new javax.swing.JTextField();
        TXTprecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXAdescripcion = new javax.swing.JTextArea();
        TXTfoto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TXTcodigo = new javax.swing.JTextField();
        BTNagregar = new rojerusan.RSMaterialButton();
        BTNeliminar = new rojerusan.RSMaterialButton();
        BTNmodificar = new rojerusan.RSMaterialButton();
        BTNlimpiar = new rojerusan.RSMaterialButton();
        BTNsalir = new rojerusan.RSMaterialButton();
        BTNfoto = new rojerusan.RSMaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 170, 20));

        jPanel3.setBackground(new java.awt.Color(244, 170, 20));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE LA PIZZA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 24), new java.awt.Color(54, 45, 48))); // NOI18N

        jLabel1.setText("nombre:");

        jLabel2.setText("foto:");

        jLabel3.setText("precio:");

        jLabel4.setText("Seleccionar Ingredientes:");

        jLabel5.setText("descripcion:");

        LBLfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Id:");

        TBLpizza.setModel(new javax.swing.table.DefaultTableModel(
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
        TBLpizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLpizzaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLpizza);

        TXTid.setEnabled(false);

        TXAdescripcion.setColumns(20);
        TXAdescripcion.setRows(5);
        jScrollPane2.setViewportView(TXAdescripcion);

        TXTfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTfotoActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo");

        TXTcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTcodigoActionPerformed(evt);
            }
        });

        BTNagregar.setText("AGREGAR");
        BTNagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNagregarActionPerformed(evt);
            }
        });

        BTNeliminar.setText("ELIMINAR");
        BTNeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNeliminarActionPerformed(evt);
            }
        });

        BTNmodificar.setText("MODIFICAR");
        BTNmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNmodificarActionPerformed(evt);
            }
        });

        BTNlimpiar.setText("LIMPIAR");
        BTNlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNlimpiarActionPerformed(evt);
            }
        });

        BTNsalir.setText("SALIR");
        BTNsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsalirActionPerformed(evt);
            }
        });

        BTNfoto.setText("CARGAR IMAGEN");
        BTNfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNfotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(TXTfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(47, 47, 47))
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TXTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(TXTid, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2))))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(BTNfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LBLfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BTNagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(BTNmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(BTNeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(BTNlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(BTNsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TXTid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TXTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TXTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TXTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TXTfoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBLfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBLpizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLpizzaMouseClicked
        Limpiar();
        BufferedImage img = null;
        int row = TBLpizza.getSelectedRow();
        JTable tarjet = (JTable)evt.getSource();
        TXTid.setText(tarjet.getValueAt(row, 0).toString());
        TXTnombre.setText(tarjet.getValueAt(row, 1).toString());
        String r = tarjet.getValueAt(row, 2).toString();
        TXTfoto.setText(r);
        ImageIcon icon = new ImageIcon(r);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(LBLfoto.getWidth(), LBLfoto.getHeight(), Image.SCALE_SMOOTH));
        LBLfoto.setText(null);
        LBLfoto.setIcon(icono);
        TXTprecio.setText(tarjet.getValueAt(row, 3).toString());
        TXAdescripcion.setText(tarjet.getValueAt(row, 4).toString());
        TXTcodigo.setText(tarjet.getValueAt(row, 5).toString());
    }//GEN-LAST:event_TBLpizzaMouseClicked

    private void TXTcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTcodigoActionPerformed

    private void TXTfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTfotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTfotoActionPerformed

    private void BTNagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNagregarActionPerformed
        ObjBL.setNombre(TXTnombre.getText());
        ObjBL.setFoto(TXTfoto.getText());
        ObjBL.setPrecio(TXTprecio.getText());
        ObjBL.setDescripcion(TXAdescripcion.getText());
        ObjBL.setCodigo(TXTcodigo.getText());
        ObjDAL.Agregar(ObjBL);
        ActualizarTBlpizza();
        Limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_BTNagregarActionPerformed

    private void BTNeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNeliminarActionPerformed
  ObjBL.setID(TXTid.getText());
        ObjDAL.Eliminar(ObjBL);
        ActualizarTBlpizza();
        Limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_BTNeliminarActionPerformed

    private void BTNmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNmodificarActionPerformed
        ObjBL.setID(TXTid.getText());
        ObjBL.setNombre(TXTnombre.getText());
        ObjBL.setFoto(TXTfoto.getText());
        ObjBL.setPrecio(TXTprecio.getText());
        ObjBL.setDescripcion(TXAdescripcion.getText());
        ObjBL.setCodigo(TXTcodigo.getText());
        ObjDAL.Modificar(ObjBL);
        ActualizarTBlpizza();
        Limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_BTNmodificarActionPerformed

    private void BTNlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNlimpiarActionPerformed
    Limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_BTNlimpiarActionPerformed

    private void BTNsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsalirActionPerformed
 dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_BTNsalirActionPerformed

    private void BTNfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNfotoActionPerformed
JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.jpg", "jpg");
        file.setFileFilter(filtro);
        
        int seleccion = file.showOpenDialog(contentPane);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
            fichero = file.getSelectedFile();
            TXTfoto.setText(fichero.getAbsolutePath());
            ImageIcon icon = new ImageIcon(fichero.toString());
            System.out.print(fichero.getName());
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(LBLfoto.getWidth(), LBLfoto.getHeight(), Image.SCALE_DEFAULT));
            LBLfoto.setText(null);
            LBLfoto.setIcon(icono);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BTNfotoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButton BTNagregar;
    private rojerusan.RSMaterialButton BTNeliminar;
    private rojerusan.RSMaterialButton BTNfoto;
    private rojerusan.RSMaterialButton BTNlimpiar;
    private rojerusan.RSMaterialButton BTNmodificar;
    private rojerusan.RSMaterialButton BTNsalir;
    private javax.swing.JLabel LBLfoto;
    private javax.swing.JTable TBLpizza;
    private javax.swing.JTextArea TXAdescripcion;
    private javax.swing.JTextField TXTcodigo;
    private javax.swing.JTextField TXTfoto;
    private javax.swing.JTextField TXTid;
    private javax.swing.JTextField TXTnombre;
    private javax.swing.JTextField TXTprecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
