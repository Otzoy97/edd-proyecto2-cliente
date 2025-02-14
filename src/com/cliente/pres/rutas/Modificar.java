/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente.pres.rutas;

import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author otzoy
 */
public class Modificar extends javax.swing.JInternalFrame {

    private final Frame padre;

    /**
     * Creates new form Modificar
     *
     * @param padre
     */
    public Modificar(Frame padre) {
        initComponents();
        this.padre = padre;
        this.llenarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCostoModificar = new javax.swing.JTextField();
        txtTiempoModificar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPilotoModificar = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        cmbOrigenMod = new javax.swing.JComboBox<>();
        cmbDestinoMod = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        cmbOrigenDel = new javax.swing.JComboBox<>();
        cmbDestinoDel = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar ruta");
        setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/res/location-modx24.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(650, 320));
        setPreferredSize(new java.awt.Dimension(650, 320));
        getContentPane().setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Microsoft Sans Serif", 0, 12))); // NOI18N
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jLabel1.setText("Código de Origen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jLabel2.setText("Código de Destino");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jLabel3.setText("Nuevo costo (Q.)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jLabel4.setText("Nuevo tiempo (min)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel4, gridBagConstraints);

        txtCostoModificar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        txtCostoModificar.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(txtCostoModificar, gridBagConstraints);

        txtTiempoModificar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        txtTiempoModificar.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(txtTiempoModificar, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jLabel5.setText("Nuevo piloto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jLabel5, gridBagConstraints);

        txtPilotoModificar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        txtPilotoModificar.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(txtPilotoModificar, gridBagConstraints);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(btnModificar, gridBagConstraints);

        cmbOrigenMod.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(cmbOrigenMod, gridBagConstraints);

        cmbDestinoMod.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(cmbDestinoMod, gridBagConstraints);

        getContentPane().add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eliminación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Microsoft Sans Serif", 0, 12))); // NOI18N
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 5, 0};
        jPanel2Layout.rowHeights = new int[] {0, 5, 0, 5, 0};
        jPanel2.setLayout(jPanel2Layout);

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Código de Origen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Código de Destino");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jLabel7, gridBagConstraints);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel2.add(btnEliminar, gridBagConstraints);

        cmbOrigenDel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(cmbOrigenDel, gridBagConstraints);

        cmbDestinoDel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(cmbDestinoDel, gridBagConstraints);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        Integer origen = ((com.cliente.pres.Elemento) this.cmbOrigenMod.getSelectedItem()).getId(),
                destino = ((com.cliente.pres.Elemento) this.cmbDestinoMod.getSelectedItem()).getId();
        Float costo = ValidarDecimal(this.txtCostoModificar.getText()),
                tiempo = ValidarDecimal(this.txtTiempoModificar.getText());
        //Lo mismo pero con los decimales
        if (costo == null) {
            JOptionPane.showMessageDialog(this, "El costo especificado no es un número positivo", "Número inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (costo < 0) {
            JOptionPane.showMessageDialog(this, "El costo especificado debe ser un número positivo", "Número inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (tiempo == null) {
            JOptionPane.showMessageDialog(this, "El tiempo especificado no es un número positivo", "Número inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (tiempo < 0) {
            JOptionPane.showMessageDialog(this, "El tiempo especificado debe ser un número positivo", "Número inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.txtPilotoModificar.getText() == null){
            JOptionPane.showMessageDialog(this, "Por favor ingrese el nombre del piloto", "Número inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(this.txtPilotoModificar.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Por favor ingrese el nombre del piloto", "Número inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Una vez finalizadas las validaciones se procederá a modificar la ruta
        String result = agregarRuta(origen,destino,costo,tiempo,this.txtPilotoModificar.getText());
        //Llamada a web service dentro de try catch
        JOptionPane.showMessageDialog(this, result, "Resultado de la operación", JOptionPane.INFORMATION_MESSAGE);
        this.txtCostoModificar.setText(new String());
        this.txtPilotoModificar.setText(new String());
        this.txtTiempoModificar.setText(new String());
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Integer origen = ((com.cliente.pres.Elemento) this.cmbOrigenDel.getSelectedItem()).getId(),
                destino = ((com.cliente.pres.Elemento) this.cmbDestinoDel.getSelectedItem()).getId();
        //Una vez finalizadas las validaciones se procederá a eliminar la ruta
        //Llamada a web service dentro de try catch
        String result = eliminarRuta(origen,destino);
        JOptionPane.showMessageDialog(this, result, "Resultado de la operación", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * Convierte una cadena que represetna un número en un número
     *
     * @param cadena
     * @return un número decimal, {@code null} si no se pudo convertir
     */
    private Float ValidarDecimal(String cadena) {
        try {
            return Float.parseFloat(cadena);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Llena las listas con la información de los encabezados
     * @param viajes 
     */
    private void llenarLista() {
        //Recupera la información de los encabezados
       java.util.List<String> viajes = recuperarEncabezados();
        String[] aux;
        javax.swing.DefaultComboBoxModel a = new javax.swing.DefaultComboBoxModel();
        javax.swing.DefaultComboBoxModel b = new javax.swing.DefaultComboBoxModel();
        javax.swing.DefaultComboBoxModel c = new javax.swing.DefaultComboBoxModel();
        javax.swing.DefaultComboBoxModel d = new javax.swing.DefaultComboBoxModel();
        
        for (String e : viajes) {
            aux = e.split(",");
            a.addElement( new com.cliente.pres.Elemento( Integer.parseInt(aux[0]) , aux[1]));
            b.addElement( new com.cliente.pres.Elemento( Integer.parseInt(aux[0]) , aux[1]));
            c.addElement( new com.cliente.pres.Elemento( Integer.parseInt(aux[0]) , aux[1]));
            d.addElement( new com.cliente.pres.Elemento( Integer.parseInt(aux[0]) , aux[1]));
        }
        this.cmbDestinoDel.setModel(a);
        this.cmbDestinoMod.setModel(b);
        this.cmbOrigenDel.setModel(c);
        this.cmbOrigenMod.setModel(d);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbDestinoDel;
    private javax.swing.JComboBox<String> cmbDestinoMod;
    private javax.swing.JComboBox<String> cmbOrigenDel;
    private javax.swing.JComboBox<String> cmbOrigenMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCostoModificar;
    private javax.swing.JTextField txtPilotoModificar;
    private javax.swing.JTextField txtTiempoModificar;
    // End of variables declaration//GEN-END:variables

    
    private static java.util.List<java.lang.String> recuperarEncabezados() {
        com.cliente.ws.ruta.RutaWS_Service service = new com.cliente.ws.ruta.RutaWS_Service();
        com.cliente.ws.ruta.RutaWS port = service.getRutaWSPort();
        return port.recuperarEncabezados();
    }

    private static String agregarRuta(int origen, int destino, float costoRuta, float tiempoRuta, java.lang.String piloto) {
        com.cliente.ws.ruta.RutaWS_Service service = new com.cliente.ws.ruta.RutaWS_Service();
        com.cliente.ws.ruta.RutaWS port = service.getRutaWSPort();
        return port.agregarRuta(origen, destino, costoRuta, tiempoRuta, piloto);
    }

    private static String eliminarRuta(int origen, int destino) {
        com.cliente.ws.ruta.RutaWS_Service service = new com.cliente.ws.ruta.RutaWS_Service();
        com.cliente.ws.ruta.RutaWS port = service.getRutaWSPort();
        return port.eliminarRuta(origen, destino);
    }
}
