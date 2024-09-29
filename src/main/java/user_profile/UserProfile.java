/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user_profile;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kiara
 */
public class UserProfile extends javax.swing.JFrame {
       User user = new User();

    /**
     * Creates new form UserProfile
     */
    public UserProfile() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        fNameLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        LNameLabel = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        provinceLabel = new javax.swing.JLabel();
        province = new javax.swing.JComboBox<>();
        photoLabel = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        termsCheckBox = new javax.swing.JCheckBox();
        cancelBtn = new javax.swing.JButton();
        createProfileBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));

        fNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        fNameLabel.setText("First Name");

        firstName.setBackground(new java.awt.Color(255, 255, 255));
        firstName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        LNameLabel.setText("Last Name");

        lastName.setBackground(new java.awt.Color(255, 255, 255));
        lastName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ageLabel.setForeground(new java.awt.Color(0, 0, 0));
        ageLabel.setText("Age");

        age.setBackground(new java.awt.Color(255, 255, 255));
        age.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        numberLabel.setForeground(new java.awt.Color(0, 0, 0));
        numberLabel.setText("Phone Number (eg.4163859310)");

        phoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        phoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        phoneNumber.setToolTipText("eg.472946185");
        phoneNumber.setActionCommand("<Not Set>");
        phoneNumber.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("Email");

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        provinceLabel.setForeground(new java.awt.Color(0, 0, 0));
        provinceLabel.setText("Province");

        province.setBackground(new java.awt.Color(255, 255, 255));
        province.setForeground(new java.awt.Color(204, 204, 204));
        province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "Ontario", "Quebec", "British Columbia", "Alberta" }));
        province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinceActionPerformed(evt);
            }
        });

        photoLabel.setForeground(new java.awt.Color(0, 0, 0));
        photoLabel.setText("Profile Photo");

        uploadBtn.setBackground(new java.awt.Color(255, 153, 102));
        uploadBtn.setForeground(new java.awt.Color(0, 0, 0));
        uploadBtn.setText("Upload Photo");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        termsCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        termsCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        termsCheckBox.setText("I agree to the terms and conditions");

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        createProfileBtn.setBackground(new java.awt.Color(255, 51, 51));
        createProfileBtn.setText("Create Profile");
        createProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfileBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Profile Sign Up");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(createProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(photoLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(termsCheckBox)
                            .addComponent(uploadBtn)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(firstName)
                                .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                                .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                                .addComponent(phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                                .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                                .addComponent(province, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(fNameLabel)
                                    .addGap(140, 140, 140))))
                        .addContainerGap(151, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNameLabel)
                            .addComponent(ageLabel)
                            .addComponent(numberLabel)
                            .addComponent(emailLabel)
                            .addComponent(provinceLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(fNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(provinceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uploadBtn)
                .addGap(31, 31, 31)
                .addComponent(termsCheckBox)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(206, 206, 206))
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

   
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinceActionPerformed

    // return true or false if input fields are empty
    private boolean validateUserInputs(JTextField field, String fieldName){
        
        if(field.getText().isEmpty()){
            //if field is empy display error
            
            JOptionPane.showMessageDialog(this, fieldName +  " is required","Empty Field",  JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(field.equals(email)){
            //email format using regex
            String emailFormat = "^[A-Za-z0-9+-._]+@[A-Za-z0-9+.-]+$";
            //if email field does not match the format display error
            if(!field.getText().matches(emailFormat)){
               JOptionPane.showMessageDialog(this, "Enter a Valid Email Address","Incorrect Email Format",  JOptionPane.ERROR_MESSAGE);
               return false;
            }
            
        }
         if(field.equals(phoneNumber)){
            //email format using regex
            String phoneFormat = "^[0-9]{10}$";
            //if email field does not match the format display error
            if(!field.getText().matches(phoneFormat)){
               JOptionPane.showMessageDialog(this, "Enter a valid Canadian Phone Number","Incorrect Phone Number Format",  JOptionPane.ERROR_MESSAGE);
               return false;
            }
         }
        return true;
    }
    
    //return true or false if age is an integer
    private boolean validateNumberInputs(JTextField field, String fieldName){
        //validate if field is an integer. if not show error message
        try{
         Integer.parseInt(field.getText());
         
        }catch(NumberFormatException e){
          JOptionPane.showMessageDialog(this,"Enter a Valid " + fieldName,"Missing/ Incorrect value format",  JOptionPane.ERROR_MESSAGE);
          return false;

        }
        return true;
    }
    
    private void createProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfileBtnActionPerformed
        
        //validate first name
        if(!validateUserInputs(firstName , "First Name"))return;
        user.setFirstName(firstName.getText());
       //validate last name 
       if(!validateUserInputs(lastName , "Last Name"))return;
        user.setLastName(lastName.getText());
        //validate age
        if(!validateNumberInputs(age , "Age"))return;
       int ageValue = Integer.parseInt(age.getText());
       user.setAge(ageValue);
       //validate phone number
       if(!validateUserInputs(phoneNumber , "Phone Number"))return;
        user.setPhoneNumber(phoneNumber.getText());  
       //validate Email
       if(!validateUserInputs(email , "Email"))return;
        user.setEmail(email.getText());
        //validate province
       if(province.getSelectedItem().toString().isEmpty()){
          JOptionPane.showMessageDialog(this, "Select a Province"); 
          return;
       }else{
            user.setProvince(province.getSelectedItem().toString());
       }
       
        if(!termsCheckBox.isSelected()){
            JOptionPane.showMessageDialog(this, "You must agree to terms and condtions"); 
           return;
        }else{
             user.setTerms("Accepted");   
           
        }
        //get the first name and last name
        String fullName = user.getFirstName()+" " + user.getLastName();
        //get the uploaded photo
        ImageIcon uploadedPhoto = user.getProfilePic();
       //combine the profile details
        String profileDetails = "Full name: "+ fullName + "\n" 
                + "Age: " + user.getAge()+"\n" +
                "Phone Number: " + user.getPhoneNumber() 
                + "\n" + "Email: "+user.getEmail() +"\n"
                + "Province: " + user.getProvince();
        //put the profile details into an object with the profile photo
        Object[] message = {
            "Profile Successfully Created \n",
            "Your profile details: \n", 
            uploadedPhoto , 
            profileDetails
        };
        
        JOptionPane.showMessageDialog(this, message);
    }//GEN-LAST:event_createProfileBtnActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
 
        JFileChooser profilePic  = new JFileChooser();
         if (profilePic.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
        try {
            BufferedImage img = ImageIO.read(profilePic.getSelectedFile());
            Image edited_image = img.getScaledInstance(60, 80,Image.SCALE_SMOOTH);
            if (edited_image != null) {
            photoLabel.setText(profilePic.getSelectedFile().getAbsolutePath());
            user.setProfilePic(new ImageIcon(edited_image));
             System.out.print(edited_image);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please upload image correctly.", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
             ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LNameLabel;
    private javax.swing.JTextField age;
    private javax.swing.JLabel ageLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createProfileBtn;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField firstName;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JComboBox<String> province;
    private javax.swing.JLabel provinceLabel;
    private javax.swing.JCheckBox termsCheckBox;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables
}
