package Cliente;

import javax.swing.*;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class IntClienteMensajeTCP extends javax.swing.JFrame {

    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private List<String> comboBoxItems = new ArrayList<>();
    private File selectedFile = null;

    public IntClienteMensajeTCP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        conectarServidor = new javax.swing.JButton();
        desconectarServidor = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMc = new javax.swing.JTextArea();
        enviar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Msj = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        clientesConectados = new javax.swing.JComboBox<>(new DefaultComboBoxModel<>());
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        EnviarTodos = new javax.swing.JCheckBox();
        EnviarUno = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conectarServidor.setBackground(new java.awt.Color(204, 255, 204));
        conectarServidor.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        conectarServidor.setIcon(new javax.swing.ImageIcon("C:\\Users\\RC\\Downloads\\Icono.png")); // NOI18N
        conectarServidor.setText("CONECTAR CON SERVIDOR");
        conectarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarServidorActionPerformed(evt);
            }
        });

        desconectarServidor.setBackground(new java.awt.Color(204, 255, 204));
        desconectarServidor.setIcon(new javax.swing.ImageIcon("C:\\Users\\RC\\Downloads\\6367861.png")); // NOI18N
        desconectarServidor.setText("DESCONECTAR SERVIDOR");
        desconectarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconectarServidorActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(51, 51, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("CLIENTE");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escriba el mensaje que desea enviar");

        jTextAreaMc.setColumns(20);
        jTextAreaMc.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMc);

        enviar.setBackground(new java.awt.Color(204, 255, 204));
        enviar.setIcon(new javax.swing.ImageIcon("C:\\Users\\RC\\Downloads\\736161.png")); // NOI18N
        enviar.setText("Enviar");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\RC\\Downloads\\Imagenes netbeans\\Mensaje.gif")); // NOI18N

        jLabel1.setText("Seleccione cliente al que desea enviar mensaje");

        clientesConectados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesConectadosActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Escriba su nombre");

        EnviarTodos.setText("Enviar a Todos");
        EnviarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarTodosActionPerformed(evt);
            }
        });

        EnviarUno.setText("Enviar a uno");
        EnviarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarUnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desconectarServidor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Msj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(EnviarTodos)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EnviarUno))
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientesConectados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conectarServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(conectarServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(EnviarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Msj, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clientesConectados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnviarUno))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(desconectarServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarServidorActionPerformed
       try {
        String clientName = Name.getText();
        socket = new Socket("localhost", 12345);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println(clientName); // Enviar el nombre del cliente al servidor

        jTextAreaMc.append("Conectado al servidor como " + clientName + "\n");

        new Thread(() -> {
            try {
                String serverMessage;
                while ((serverMessage = in.readLine()) != null) {
                    if (serverMessage.startsWith("UPDATE_CLIENT_LIST:")) {
                        String clientList = serverMessage.substring("UPDATE_CLIENT_LIST:".length());
                        String[] clients = clientList.split(",");
                        comboBoxItems.clear();
                        for (String client : clients) {
                            comboBoxItems.add(client);
                        }
                        updateClientComboBox();
                    } else {
                        jTextAreaMc.append(serverMessage + "\n");
                    }
                }
            } catch (IOException e) {
                jTextAreaMc.append("Error en la comunicación con el servidor.\n");
            }
        }).start();

    } catch (IOException e) {
        jTextAreaMc.append("No se pudo conectar al servidor.\n");
    }
}

        private void updateClientComboBox() {
            clientesConectados.removeAllItems();
        for (String item : comboBoxItems) {
            clientesConectados.addItem(item);
    }
    }//GEN-LAST:event_conectarServidorActionPerformed
      
    private void desconectarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconectarServidorActionPerformed
        try {
            if (socket != null && !socket.isClosed()) {
                socket.close();
                jTextAreaMc.append("Desconectado del servidor\n");
            }
        } catch (IOException e) {
            jTextAreaMc.append("Error al desconectar del servidor: " + e.getMessage() + "\n");
        }
    }//GEN-LAST:event_desconectarServidorActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
         String message = Msj.getText();
        if (EnviarTodos.isSelected()) {
            out.println("ALL:" + message);
        } else if (EnviarUno.isSelected()) {
            String selectedClient = (String) clientesConectados.getSelectedItem();
            if (selectedClient != null && !selectedClient.equals("Seleccionar")) {
                out.println("TO:" + selectedClient + ":" + message);
            } else {
                jTextAreaMc.append("Seleccione un cliente válido\n");
            }
        }
    }//GEN-LAST:event_enviarActionPerformed

    private void clientesConectadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesConectadosActionPerformed
       
    }//GEN-LAST:event_clientesConectadosActionPerformed

    private void EnviarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarTodosActionPerformed
        if (EnviarTodos.isSelected()) {
            EnviarUno.setSelected(false);
        }
    }//GEN-LAST:event_EnviarTodosActionPerformed

    private void EnviarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarUnoActionPerformed
        if (EnviarUno.isSelected()) {
            EnviarTodos.setSelected(false);
        }
    }//GEN-LAST:event_EnviarUnoActionPerformed

 
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
            java.util.logging.Logger.getLogger(IntClienteMensajeTCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntClienteMensajeTCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntClienteMensajeTCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntClienteMensajeTCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntClienteMensajeTCP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox EnviarTodos;
    private javax.swing.JCheckBox EnviarUno;
    private javax.swing.JTextField Msj;
    private javax.swing.JTextField Name;
    private javax.swing.JComboBox<String> clientesConectados;
    private javax.swing.JButton conectarServidor;
    private javax.swing.JButton desconectarServidor;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMc;
    // End of variables declaration//GEN-END:variables
    //JButton conectarServidor = Boton para conectar con IntServidor
    //JButton desconectarServidor = Boton para desconectar con IntServidor
    //JButton enviar = Boton para enviar el mensaje escrito en JTextField Msj
    //JTextArea jTextAreaMc = Area de texto donde se ven mensajes de que se envio el archivo y recepcion de archivos. y demas mensajes de informacion
    //JComboBox<String> clientesConectados = Deben aparecen los clientes que estan conectados al servidor.
    //JTextField Name = Aqui el cliente escribe su nombre con el que se va a conectar al servidor.
    //JCheckBox EnviarTodos = Check para seleccionar si el mensaje lo quiere enviar a todos  los clientes conectados. 
    //JCheckBox EnviarUno = Check para seleccionar si el mensaje lo quiere enviar a un solo usuario.
    
}
