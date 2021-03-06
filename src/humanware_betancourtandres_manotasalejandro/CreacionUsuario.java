package humanware_betancourtandres_manotasalejandro;

import AppPackage.AnimationClass;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Alejo
 * @version Final
 */
public class CreacionUsuario extends javax.swing.JFrame {

    File file = new File("./Usuarios.txt");

    ;

    /**
     * En el constructor se centra el frame y se cambia el icono
     * Se llaman funciones para no permitir caracteres invalidos en los respectivos jTextField
     */
    public CreacionUsuario() {
        initComponents();
        
        this.setLocationRelativeTo(null); //Se centra el frame

        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/mundoGlobal.jpg")).getImage());//Se cambia el icono

        noPasteUsuarioField();

        noPasteContraseñaField();

    }

    /**
    * No permite que se copie y pegue en el campo de usuario para su creacion, así no se introducen caracteres invalidos
     */
    public void noPasteUsuarioField() {
        //Hace que el usuario no copie y pegue caracteres invalidos en el campo de usuario al momento de crearlo
        InputMap map2 = usuarioField.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }
    
    /**
     *No permite que se copie y pegue en el campo de la contraseña para la creacion del usuario
     * así no introducen caracteres invalidos
     */
    public void noPasteContraseñaField() {
        //Hace que el usuario no copie y pegue caracteres invalidos en el campo de contraseña al momento de crearlo
        InputMap map2 = contraseñaUsuarioField.getInputMap(JPasswordField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
    }
    
    /**
     * Retorna el campo de usuario para al momento de crearlo predeterminar lo que tendrá escrito
     * al momento de ingresar
     * @return usuarioField
     */
    public JTextField dameCreacionUsuarioField(){
        return usuarioField;
    }
    
    /**
     * Retorna el campo de la contraseña del usuario al momento de crearlo para predeterminar lo que tendrá
     * escrito al momento de ingresar
     * @return contraseñaUsuarioField
     */
    public JTextField dameCreacionContraseñaField(){
        return contraseñaUsuarioField;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        crearUsuarioBtn = new javax.swing.JButton();
        usuarioField = new javax.swing.JTextField();
        contraseñaUsuarioField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        retrocederLogin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tipoUsuarioBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(590, 389));
        setMinimumSize(new java.awt.Dimension(590, 389));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Creacion de usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 140, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña del usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 160, -1));

        crearUsuarioBtn.setBackground(new java.awt.Color(0, 0, 51));
        crearUsuarioBtn.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        crearUsuarioBtn.setForeground(new java.awt.Color(255, 255, 255));
        crearUsuarioBtn.setText("Crear usuario");
        crearUsuarioBtn.setBorder(null);
        crearUsuarioBtn.setContentAreaFilled(false);
        crearUsuarioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioBtnActionPerformed(evt);
            }
        });
        getContentPane().add(crearUsuarioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 154, 30));

        usuarioField.setBackground(new java.awt.Color(255, 255, 255));
        usuarioField.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        usuarioField.setForeground(new java.awt.Color(0, 0, 0));
        usuarioField.setText("Ingrese el nombre del usuario");
        usuarioField.setBorder(null);
        usuarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioFieldMouseClicked(evt);
            }
        });
        usuarioField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioFieldKeyTyped(evt);
            }
        });
        getContentPane().add(usuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 220, -1));

        contraseñaUsuarioField.setBackground(new java.awt.Color(255, 255, 255));
        contraseñaUsuarioField.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        contraseñaUsuarioField.setForeground(new java.awt.Color(0, 0, 0));
        contraseñaUsuarioField.setText("Ingrese la contraseña del usuario");
        contraseñaUsuarioField.setBorder(null);
        contraseñaUsuarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaUsuarioFieldMouseClicked(evt);
            }
        });
        contraseñaUsuarioField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contraseñaUsuarioFieldKeyTyped(evt);
            }
        });
        getContentPane().add(contraseñaUsuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 220, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 220, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 220, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Frame/icons8_User_96px_2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Frame/icons8_Multiply_32px.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 70, -1, -1));

        retrocederLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Frame/icons8_Back_64px.png"))); // NOI18N
        retrocederLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retrocederLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retrocederLoginMouseClicked(evt);
            }
        });
        getContentPane().add(retrocederLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 30, 30, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos_Frame/icons8_Menu_32px.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 390));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de usuario:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, 16));

        tipoUsuarioBox.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        tipoUsuarioBox.setForeground(new java.awt.Color(0, 0, 0));
        tipoUsuarioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evaluador", "Usuario" }));
        tipoUsuarioBox.setBorder(null);
        jPanel2.add(tipoUsuarioBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 400, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * No permite que se digiten caracteres diferentes a letras y numeros
     * @param evt 
     */
    
    private void contraseñaUsuarioFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaUsuarioFieldKeyTyped
//Al momento de digitar su contraseña para crearla solo puede digitar letras y numeros sin caracteres especiales
        String car = String.valueOf(evt.getKeyChar());

        if (!(car.matches("[a-zA-Z0-9]"))) {
            evt.consume();//Si el caracter no esta en el rango del condicional se borra
        }


    }//GEN-LAST:event_contraseñaUsuarioFieldKeyTyped

    /**
     * No permite que en el campo de usuarios se digiten números ni caracteres invalidos
     * @param evt 
     */
    private void usuarioFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioFieldKeyTyped
//No puede crear un usuario con números, solo con letras 
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && car != 'á' //Minúsculas           
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á' //Mayúsculas           
                && car != 'É'
                && car != 'Í'
                && car != 'Ó'
                && car != 'Ú'
                && car != 'ñ'
                && car != 'Ñ'
                && (car != (char) KeyEvent.VK_SPACE)//Permite la barra espaciadora
                && (car != (char) KeyEvent.VK_BACK_SPACE)) {//Permite la barra espaciadora
            evt.consume();//Si el caracter no esta entre los listados, se borra
            JOptionPane.showMessageDialog(null, "Este caracter no esta permitido", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_usuarioFieldKeyTyped

    /**
     * Cuando se le da al boton de usuario se va al archivo de usuario y si no esta creado
     * crea un nuevo usuario
     * @param evt 
     */
    private void crearUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioBtnActionPerformed
//Crea el usuario si los respectivos campos están llenos
        boolean vacio = false;
        String usuario = "", contraseña = "", tipoUsuario;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {//Para escribir sobre el archivo
            BufferedReader br = new BufferedReader(new FileReader(file));//Para leer el archivo

            String linea = br.readLine();//Obtiene lo que haya en el archivo
            while (linea != null) {
                String u = linea.split(",")[0];//Para comparar que el usuario no exista
                if (u.equals(usuarioField.getText().trim())) {//Revisa que el usuario no este creado
                    JOptionPane.showMessageDialog(null, "Este usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                    br.close();//Cierra el BufferedReader
                    bw.close();//Cierra el BufferedWriter
                    return;//Retorna verdadero
                }
                linea = br.readLine();
            }
            if (usuarioField.getText().isEmpty()) {//Revisa que el campo del nombre no este vacio
                JOptionPane.showMessageDialog(null, "El campo de usuario esta vacio", "Error", JOptionPane.WARNING_MESSAGE);
                vacio = true;
            } else {
                usuario = usuarioField.getText();
            }

            if (contraseñaUsuarioField.getText().isEmpty()) {//Revisa que el campo de la contraseña no este vacio
                JOptionPane.showMessageDialog(null, "El campo de contraseña esta vacio", "Error", JOptionPane.WARNING_MESSAGE);
                vacio = true;
            } else {
                contraseña = contraseñaUsuarioField.getText();
            }

            tipoUsuario = (String) tipoUsuarioBox.getSelectedItem(); //Obtiene el tipo de usuario que sera la persona que se registra

            if (vacio) {//Si se llenaron los campos se crea el usuario
                JOptionPane.showMessageDialog(null, "LLene los correspondientes datos"
                        + " para crear el usuario", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El usuario fue creado"
                        + " exitosamente", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);

                this.setVisible(false);
            }

            bw.write(usuario + "," + contraseña + "," + tipoUsuario + "\n");//Escribe en el archivo los usuarios creados
            bw.close();//Cierra el BufferedWriter
        } catch (Exception ignored) {
            
        }


    }//GEN-LAST:event_crearUsuarioBtnActionPerformed

    /**
    *Desplaza los diferentes iconos para cerrar y retroceder  
    * @param evt 
     */
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        //Desde el frame de la creación de usuario
        AnimationClass cerrarr = new AnimationClass();
        AnimationClass retrocederr = new AnimationClass();
        //Se desplaza hacia la derecha
        retrocederr.jLabelXRight(-40, 10, 10, 5, retrocederLogin);//Desplaza el icono de retroceder a la derecha
        cerrarr.jLabelXRight(-40, 10, 10, 5, close);//Desplaza el icono de cerrar a la derecha

        //Se desplaza hacia la izquierda
        AnimationClass cerrarf = new AnimationClass();
        AnimationClass retrocederf = new AnimationClass();
        
        retrocederf.jLabelXLeft(10, -40, 10, 5, retrocederLogin);//Desplaza el icono de retroceder a la izquierda
        cerrarf.jLabelXLeft(10, -40, 10, 5, close);//Desplaza el icono de cerrar a la izquierda
        

    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * Si se le da doble click al boton de cerrar, se cierra el programa
     * @param evt 
     */
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked

        if(evt.getClickCount() == 2){
            System.exit(0);
        }
        
    }//GEN-LAST:event_closeMouseClicked

    /**
     * Si se le da doble click al boton de retroceder se devuelve al login
     * @param evt 
     */
    private void retrocederLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrocederLoginMouseClicked

        if(evt.getClickCount() == 2){
            this.dispose();
        }
        
    }//GEN-LAST:event_retrocederLoginMouseClicked

    /**
     * Si se le da click al campo de usuario se pone vacio si tiene algo escrito
     * @param evt 
     */
    private void usuarioFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioFieldMouseClicked

        if(evt.getClickCount() == 1){
            usuarioField.setText("");
        }
        
    }//GEN-LAST:event_usuarioFieldMouseClicked

    /**
     * Si se le da click al campo de la contraseña se pone vacio si tiene algo escrito
     * @param evt 
     */
    private void contraseñaUsuarioFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaUsuarioFieldMouseClicked

        if(evt.getClickCount() == 1){
            contraseñaUsuarioField.setText("");
        }
        
    }//GEN-LAST:event_contraseñaUsuarioFieldMouseClicked
    
    /**
     * Recibe los parametros desde el login para ingresar a la respectivas funcionalidades
     * dependiendo de que tipo de usuario sea. Busca los usuarios en el archivo de solicitantes
     * @param Usuario
     * @param Contraseña
     * @param Tipousuario
     * @return true, si lo encuentra
     */
    public boolean dameUsuario(String Usuario, String Contraseña, String Tipousuario) {
        //Me da el usuario respectivo digitado desde el login, si esta creado se logea si no, no lo hace
        try (BufferedReader leer = new BufferedReader(new FileReader(file))) {//Lee el archivo
            String linea = leer.readLine();
            while (leer != null) {//Si el archivo tiene una linea extrae los datos y los compara con los enviados desde el login
                String[] datos = linea.split(",");

                String usuario = datos[0];
                String contraseña = datos[1];
                String tipousuario = datos[2];

                if (Usuario.equals(usuario) && Contraseña.equals(contraseña) && Tipousuario.equals(tipousuario)) {
                    return true;//Si encuentra en el archivo lo enviado desde el login accede como usuario o evaluador
                }

                linea = leer.readLine();

            }

        } catch (Exception e) {

        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField contraseñaUsuarioField;
    private javax.swing.JButton crearUsuarioBtn;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel retrocederLogin;
    private javax.swing.JComboBox<String> tipoUsuarioBox;
    private javax.swing.JTextField usuarioField;
    // End of variables declaration//GEN-END:variables
}
