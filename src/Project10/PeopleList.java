/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project10;

/**
 *
 * @author just6660
 */
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class PeopleList extends javax.swing.JFrame {

    /**
     * Creates new form PeopleList
     */
    ArrayList<Person> people = new ArrayList();
    DefaultListModel list = new DefaultListModel();

    public PeopleList() {
        initComponents();
        people.add(new Person("Bob", 25, "M"));
        people.add(new Person("Fran", 55, "F"));
        people.add(new Person("Mike", 15, "M"));
        people.add(new Person("Sue", 30, "F"));
        lstpeople.setModel(list);
        for (Person p : people) {
            list.addElement(p.getName());
        }
    }

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;
        int result = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;
            result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (result < 0) {
            midpoint++;
        }
        return midpoint;
    }

    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }

    public void clearForm() {
        txtname.setText("");
        txtage.setText("");
        buttonGroup1.clearSelection();
        lstpeople.clearSelection();
    }
    public void show(Person p){
        txtname.setText(p.getName());
        txtage.setText(""+p.getAge());
        if(p.getGender()== "M")
            optMale.setSelected(true);
        else
            optFemale.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstpeople = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        optMale = new javax.swing.JRadioButton();
        optFemale = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuClear = new javax.swing.JMenuItem();
        mnuAdd = new javax.swing.JMenuItem();
        mnuDelete = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuAll = new javax.swing.JMenuItem();
        mnuFemale = new javax.swing.JMenuItem();
        mnuMale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstpeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstpeopleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstpeople);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Age:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(optMale);
        optMale.setText("Male");
        optMale.setActionCommand("M");

        buttonGroup1.add(optFemale);
        optFemale.setText("Female");
        optFemale.setActionCommand("F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(optMale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(optFemale)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optFemale)
                    .addComponent(optMale))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        mnuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/exit.png"))); // NOI18N
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/exit.png"))); // NOI18N
        mnuClear.setText("Clear");
        mnuClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuClear);

        mnuAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/insert.png"))); // NOI18N
        mnuAdd.setText("Add");
        mnuAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAddActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAdd);

        mnuDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/delete.png"))); // NOI18N
        mnuDelete.setText("Delete");
        mnuDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDeleteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDelete);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Filter");

        mnuAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/all.png"))); // NOI18N
        mnuAll.setText("Show All");
        mnuAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAllActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAll);

        mnuFemale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/female.png"))); // NOI18N
        mnuFemale.setText("Female");
        mnuFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFemaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnuFemale);

        mnuMale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project10/male.png"))); // NOI18N
        mnuMale.setText("Male");
        mnuMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnuMale);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname)
                            .addComponent(txtage)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void lstpeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstpeopleMouseClicked
        String name = "" + lstpeople.getSelectedValue();
        int loc = search(people, new Person(name,0,""));
        show(people.get(loc));

        //put code here for clikcing on a name
    }//GEN-LAST:event_lstpeopleMouseClicked

    private void mnuDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDeleteActionPerformed

        int i = lstpeople.getSelectedIndex();
        String n = people.get(i).getName();
        Person temp = new Person(n, 0, null);
        int loc = search(people, temp);
        list.removeElementAt(lstpeople.getSelectedIndex());
        people.remove(loc);
        clearForm();


    }//GEN-LAST:event_mnuDeleteActionPerformed

    private void mnuAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAddActionPerformed
        list.clear();
        for (Person p : people) {
            list.addElement(p.getName());
        }
        String nm, gen;
        int age;
        try {
            nm = txtname.getText();
            age = Integer.parseInt(txtage.getText());
            gen = buttonGroup1.getSelection().getActionCommand();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Must fill out form correctly");
            return;

        }
        Person temp = new Person(nm,age,gen);
        int loc = search(people,temp);
        if(loc==-1){
            int newloc = findInsertPoint(people,temp);
            people.add(newloc,temp);
            list.add(newloc, temp.getName());
            
        }
        else{
           JOptionPane.showMessageDialog(this,"Person must have a unique name"); 
        }
    }//GEN-LAST:event_mnuAddActionPerformed

    private void mnuAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAllActionPerformed
        list.clear();
        for (Person p : people) {
            list.addElement(p.getName());
        }
       
    }//GEN-LAST:event_mnuAllActionPerformed

    private void mnuFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFemaleActionPerformed
        // TODO add your handling code here:
        list.clear();
        for(Person p : people){
            if(p.getGender()=="F"){
                list.addElement(p.getName());
            }
        }
       
    }//GEN-LAST:event_mnuFemaleActionPerformed

    private void mnuMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMaleActionPerformed
        // TODO add your handling code here:
        list.clear();
        for(Person p : people){
            if(p.getGender()=="M"){
                list.addElement(p.getName());
            }
        }
        
    }//GEN-LAST:event_mnuMaleActionPerformed

    private void mnuClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClearActionPerformed
        clearForm();
    }//GEN-LAST:event_mnuClearActionPerformed

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
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstpeople;
    private javax.swing.JMenuItem mnuAdd;
    private javax.swing.JMenuItem mnuAll;
    private javax.swing.JMenuItem mnuClear;
    private javax.swing.JMenuItem mnuDelete;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuFemale;
    private javax.swing.JMenuItem mnuMale;
    private javax.swing.JRadioButton optFemale;
    private javax.swing.JRadioButton optMale;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
