package crudsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudAlumnos extends javax.swing.JFrame {

    public CrudAlumnos() {
        initComponents();
        cargartabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdHombre = new javax.swing.JRadioButton();
        rdMujer = new javax.swing.JRadioButton();
        txtMatricula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JSpinner();
        txtcorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALUMNOS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("ALUMNOS");

        tablaAlumnos.setBackground(java.awt.SystemColor.control);
        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Matricula", "Nombre", "Sexo", "Email", "Activo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlumnos);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Alumno"));

        jLabel2.setText("CodMatricula:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Correo:");

        rdHombre.setText("Hombre");

        rdMujer.setText("Mujer");

        txtMatricula.setName("txtMatricula"); // NOI18N

        txtcorreo.setName(""); // NOI18N

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Dar De Baja");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMatricula)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rdHombre)
                        .addGap(18, 18, 18)
                        .addComponent(rdMujer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdHombre)
                    .addComponent(rdMujer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        rdHombre.getAccessibleContext().setAccessibleDescription("butonHombre");
        rdMujer.getAccessibleContext().setAccessibleDescription("butonMujer");
        txtMatricula.getAccessibleContext().setAccessibleName("txtMatricula");
        txtNombre.getAccessibleContext().setAccessibleName("txtNombre");
        txtEdad.getAccessibleContext().setAccessibleName("txtEdad");
        txtcorreo.getAccessibleContext().setAccessibleName("txtCorreo");
        btnGuardar.getAccessibleContext().setAccessibleDescription("btnGuardar");
        jButton2.getAccessibleContext().setAccessibleDescription("btnModificar");
        jButton3.getAccessibleContext().setAccessibleDescription("btnDardeBaja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //bOTONgUARDAR
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        int edad = (Integer) txtEdad.getValue();
        String email = txtcorreo.getText();
        String sexo;
        if (rdHombre.isSelected() == true) {
            sexo = "H";

        } else if (rdMujer.isSelected() == true) {
            sexo = "M";
        } else {
            sexo = "M";

        }
        try {
            try (Connection conn = ConnectionBD.getConnection();
                    PreparedStatement ps = conn.prepareStatement("Insert into Alumnos(matricula,nombre,edad,sexo,email,activo)values(?,?,?,?,?,?)");) {
                ps.setString(1, matricula);
                ps.setString(2, nombre);
                ps.setInt(3, edad);
                ps.setString(4, sexo);
                ps.setString(5, email);
                ps.setBoolean(6, true);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Insertado");
            }
            limpiar();
            cargartabla();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlumnosMouseClicked
        try {
            int nofila = tablaAlumnos.getSelectedRow();
            int id = Integer.parseInt(tablaAlumnos.getValueAt(nofila, 0).toString());
            try (Connection conn = ConnectionBD.getConnection();
                    PreparedStatement ps = conn.prepareStatement("select matricula,nombre,edad,sexo,"
                            + "email from Alumnos where id_alumno=?");) {

                ps.setInt(1, id);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        txtId.setText(String.valueOf(id));
                        txtMatricula.setText(rs.getString("Matricula"));
                        txtNombre.setText(rs.getString("Nombre"));
                        if (rs.getString("Sexo").equals("M")) {
                            rdHombre.setSelected(true);
                        } else if (rs.getString("Sexo").equals("F")) {
                            rdMujer.setSelected(true);
                        }
                        txtcorreo.setText(rs.getString("Email"));
                        txtEdad.setValue(rs.getInt("Edad"));

                    }

                }

            }

        } catch (NumberFormatException | SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());

        }


    }//GEN-LAST:event_tablaAlumnosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int idAlumno = Integer.parseInt(txtId.getText());
        String matricula = txtMatricula.getText();
        String nombre = txtNombre.getText();
        int edad = (Integer) txtEdad.getValue();
        String email = txtcorreo.getText();
        String sexo = null;
        if (rdHombre.isSelected() == true) {
            sexo = "H";
        } else if (rdMujer.isSelected() == true) {
            sexo = "M";
        } else {
            sexo="M";
        }
        try (Connection cn = ConnectionBD.getConnection();
                    PreparedStatement ps = cn.prepareStatement("Update Alumnos set matricula=?,"
                            + "nombre=?,edad=?,sexo=?,email=? where id_alumno=?");) {

                ps.setString(1, matricula);
                ps.setString(2, nombre);
                ps.setInt(3, edad);
                ps.setString(4, sexo);
                ps.setString(5, email);
                ps.setInt(6, idAlumno);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
                cargartabla();

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, e.toString());

            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int idAlumno=Integer.parseInt(txtId.getText());
        try{
            Connection con=ConnectionBD.getConnection();
            PreparedStatement ps=con.prepareStatement("update Alumnos set activo=0 where id_alumno=?");
            
            ps.setInt(1,idAlumno);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Alumno dado de Baja");
            limpiar();
            cargartabla();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.toString());
        
        
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtMatricula.setText("");
        txtEdad.setValue(0);
        txtcorreo.setText("");
    }

    //cargar datos en el JFrame
    public void cargartabla() {
        DefaultTableModel modelotabla = (DefaultTableModel) tablaAlumnos.getModel();
        modelotabla.setRowCount(0);
        ResultSetMetaData rsmd;
        int columnas;
        int[] anchos = {10, 50, 100, 30, 100, 30};
        for (int i = 0; i < tablaAlumnos.getColumnCount(); i++) {
            tablaAlumnos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        try {

            try (Connection conn = ConnectionBD.getConnection();
                    PreparedStatement ps = conn.prepareStatement("Select id_alumno,matricula,nombre,sexo,email,activo from Alumnos");
                    ResultSet rs = ps.executeQuery();) {
                rsmd = rs.getMetaData();
                columnas = rsmd.getColumnCount();
                while (rs.next()) {
                    Object[] fila = new Object[columnas];
                    for (int i = 0; i < columnas; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    modelotabla.addRow(fila);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.toString());

        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdHombre;
    private javax.swing.JRadioButton rdMujer;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JSpinner txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtcorreo;
    // End of variables declaration//GEN-END:variables
}
