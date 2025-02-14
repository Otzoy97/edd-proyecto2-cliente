/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cliente.pres;
import com.cliente.pres.rutas.Carga;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author otzoy
 */
public class ClienteEDD extends javax.swing.JFrame {
   
    
    
    
    /**
     * Creates new form ClienteEDD
     */
    public ClienteEDD() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        cargarRutas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        modificarRuta = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        visualizarArbol = new javax.swing.JMenuItem();
        visualizarMatriz = new javax.swing.JMenuItem();
        visualizarGrafo = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        tablaHash = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coline Airport");
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jDesktopPane1, gridBagConstraints);

        menuBar.setFocusable(false);
        menuBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenu3.setText("Rutas");
        jMenu3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        cargarRutas.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        cargarRutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/route-dirx24.png"))); // NOI18N
        cargarRutas.setText("Cargar");
        cargarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarRutasActionPerformed(evt);
            }
        });
        jMenu3.add(cargarRutas);
        jMenu3.add(jSeparator1);

        modificarRuta.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        modificarRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/location-modx24.png"))); // NOI18N
        modificarRuta.setText("Modificar");
        modificarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarRutaActionPerformed(evt);
            }
        });
        jMenu3.add(modificarRuta);
        jMenu3.add(jSeparator2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/location-seex24.png"))); // NOI18N
        jMenu1.setText("Visualizar ");
        jMenu1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        visualizarArbol.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        visualizarArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/route.png"))); // NOI18N
        visualizarArbol.setText("Árbol de destinos");
        visualizarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarArbolActionPerformed(evt);
            }
        });
        jMenu1.add(visualizarArbol);

        visualizarMatriz.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        visualizarMatriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/location-pin.png"))); // NOI18N
        visualizarMatriz.setText("Matriz de rutas");
        visualizarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarMatrizActionPerformed(evt);
            }
        });
        jMenu1.add(visualizarMatriz);

        visualizarGrafo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        visualizarGrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/routex24.png"))); // NOI18N
        visualizarGrafo.setText("Grafo de rutas");
        visualizarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarGrafoActionPerformed(evt);
            }
        });
        jMenu1.add(visualizarGrafo);

        jMenuItem3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/location-pinx24.png"))); // NOI18N
        jMenuItem3.setText("Ruta en...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenu3.add(jMenu1);

        menuBar.add(jMenu3);

        jMenu2.setText("Reservaciones");
        jMenu2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/location.png"))); // NOI18N
        jMenuItem1.setText("Cargar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator3);

        tablaHash.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        tablaHash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/map.png"))); // NOI18N
        tablaHash.setText("Tabla de reservaciones");
        tablaHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaHashActionPerformed(evt);
            }
        });
        jMenu2.add(tablaHash);
        jMenu2.add(jSeparator4);

        jMenuItem4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/location-delx24.png"))); // NOI18N
        jMenuItem4.setText("Reservaciones...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Instancia una nuevo {@code com.cliente.pres.rutas.Carga} para cargar rutas o destinos
     * @param evt 
     */
    private void cargarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarRutasActionPerformed
        // TODO add your handling code here:
        JInternalFrame i = new Carga(this);
        this.jDesktopPane1.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_cargarRutasActionPerformed
    
    /**
     * Instancia un nuevo {@code com.cliente.pres.rutas.Modificar} para modificar o eliminar rutas
     * @param evt 
     */
    private void modificarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarRutaActionPerformed
        // TODO add your handling code here:
        JInternalFrame i = new com.cliente.pres.rutas.Modificar(this);
        this.jDesktopPane1.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_modificarRutaActionPerformed
    
    /**
     * Instancia un nuevo {@code com.cliente.pres.Visor} que muestre el árbol B de destinos
     * @param evt 
     */
    private void visualizarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarArbolActionPerformed
        // TODO add your handling code here:
        //Recupera el base64
        String base64 = generarArbol();
        Visor i = new Visor(base64,"Arbol de destinos");
        this.jDesktopPane1.add(i);
        i.setVisible(true);
        i.pintar();
    }//GEN-LAST:event_visualizarArbolActionPerformed

    /**
     * Instancia un nuevo {@code com.cliente.pres.Visor} que muestre la matriz de rutas
     * @param evt 
     */
    private void visualizarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarMatrizActionPerformed
        // TODO add your handling code here:
        String base64 = generarMatriz();
        Visor i = new Visor(base64,"Matriz de rutas");
        this.jDesktopPane1.add(i);
        i.setVisible(true);
        i.pintar();
    }//GEN-LAST:event_visualizarMatrizActionPerformed

    /**
     * Instancia un nuevo {@code com.cliente.pres.Visor} que muestre el grafo de rutas
     * @param evt 
     */
    private void visualizarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarGrafoActionPerformed
        // TODO add your handling code here:
        String base64 = generarGrafoRutas();
        Visor i = new Visor(base64,"Grafo de rutas");
        this.jDesktopPane1.add(i);
        i.setVisible(true);
        i.pintar();
    }//GEN-LAST:event_visualizarGrafoActionPerformed
    
    /**
     * Instancia un nuevo {@code com.cliente.pres.reservaciones.Carga} para cargar reservaciones
     * @param evt 
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JInternalFrame i = new com.cliente.pres.reservaciones.Carga(this);
        this.jDesktopPane1.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * Instancia un nuevo {@code com.cliente.pres.Visor} que muestre la tabla hash de reservaciones
     * @param evt 
     */
    private void tablaHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaHashActionPerformed
        // TODO add your handling code here:
        String base64 = generarTablaHash();
        Visor i = new Visor(base64,"Tabla de Reservaciones");
        this.jDesktopPane1.add(i);
        i.setVisible(true);
        i.pintar();
    }//GEN-LAST:event_tablaHashActionPerformed

    /**
     * Instancia un nuevo {@code com.cliente.pres.rutas.EnRuta} para solicitar visualizar una ruta en particular
     * @param evt 
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        com.cliente.pres.rutas.EnRuta i = new com.cliente.pres.rutas.EnRuta(this.jDesktopPane1);
        i.llenarLista();
        this.jDesktopPane1.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * Instancia un nuevo {@code com.cliente.pres.reservaciones.Android} que permite agregar reservaciones
     * @param evt 
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        com.cliente.pres.reservaciones.Android i = new com.cliente.pres.reservaciones.Android();
        this.jDesktopPane1.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //</editor-fold>
        } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex){
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            ClienteEDD form = new ClienteEDD();
            form.setVisible(true);
            form.setLocationRelativeTo(null);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cargarRutas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem modificarRuta;
    private javax.swing.JMenuItem tablaHash;
    private javax.swing.JMenuItem visualizarArbol;
    private javax.swing.JMenuItem visualizarGrafo;
    private javax.swing.JMenuItem visualizarMatriz;
    // End of variables declaration//GEN-END:variables

    /**
     * 
     * @return base64 que representa el grafo de rutas
     */
    private static String generarGrafoRutas() {
        com.cliente.ws.ruta.RutaWS_Service service = new com.cliente.ws.ruta.RutaWS_Service();
        com.cliente.ws.ruta.RutaWS port = service.getRutaWSPort();
        return port.generarGrafoRutas();
    }

    /**
     * 
     * @return base64 que representa la imagen del árbol
     */
    private static String generarArbol() {
        com.cliente.ws.destino.DestinoWS_Service service = new com.cliente.ws.destino.DestinoWS_Service();
        com.cliente.ws.destino.DestinoWS port = service.getDestinoWSPort();
        return port.generarArbol();
    }

    /**
     * 
     * @return base64 que representa la imagen de la matriz
     */
    private static String generarMatriz() {
        com.cliente.ws.ruta.RutaWS_Service service = new com.cliente.ws.ruta.RutaWS_Service();
        com.cliente.ws.ruta.RutaWS port = service.getRutaWSPort();
        return port.generarMatriz();
    }

    /**
     * 
     * @return base64 que representa la imagen de la tabla hash
     */
    private static String generarTablaHash() {
        com.cliente.ws.reservacion.ReservacionWS_Service service = new com.cliente.ws.reservacion.ReservacionWS_Service();
        com.cliente.ws.reservacion.ReservacionWS port = service.getReservacionWSPort();
        return port.generarTablaHash();
    }
}
