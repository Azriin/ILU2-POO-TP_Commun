/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {
    private static final int[] tailleTable = new int[] {2, 4, 4, 4, 4, 8};
    private static final int[] listNbPersonnes = new int[] {2, 3, 4, 5, 6, 7, 8};
    private static final String[] listHeures = new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" };
    private int nbPersonne;
    private String heure;
    private String date;
    private String table;
    
    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePanel = new javax.swing.JPanel();
        datePickerDate = new com.github.lgooddatepicker.components.DatePicker();
        datePickerDate.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        jLabel1 = new javax.swing.JLabel();
        labelHeure = new javax.swing.JLabel();
        comboBoxHeure = new javax.swing.JComboBox<>();
        nbPersonsPanel = new javax.swing.JPanel();
        labelNbPersonne = new javax.swing.JLabel();
        comboBoxNbPersonne = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        labelTable = new javax.swing.JLabel();
        labelPlan = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTables = new javax.swing.JList<>();
        boutonAnnuler = new java.awt.Button();
        boutonValider = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("1. Choisissez la date");

        labelHeure.setText("2. Choisissez l'heure");
        labelHeure.setEnabled(false);

        comboBoxHeure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        comboBoxHeure.setEnabled(false);
        comboBoxHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHeureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(datePickerDate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelHeure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxHeure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHeure, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePickerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePickerDate.getAccessibleContext().setAccessibleName("");
        datePickerDate.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelNbPersonne.setText("3. Indiquez le nombre de personnes");
        labelNbPersonne.setEnabled(false);

        comboBoxNbPersonne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));
        comboBoxNbPersonne.setEnabled(false);
        comboBoxNbPersonne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNbPersonneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNbPersonne)
                    .addComponent(comboBoxNbPersonne, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNbPersonne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxNbPersonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelTable.setText("4. Choisissez votre table");
        labelTable.setEnabled(false);

        labelPlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        labelPlan.setEnabled(false);

        listTables.setEnabled(false);
        jScrollPane2.setViewportView(listTables);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelTable))
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelPlan)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(labelPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        boutonAnnuler.setLabel("Annuler");
        boutonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAnnulerActionPerformed(evt);
            }
        });

        boutonValider.setEnabled(false);
        boutonValider.setLabel("Valider");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boutonValider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutonAnnuler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutonValider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxHeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHeureActionPerformed
        heure = listHeures[comboBoxHeure.getSelectedIndex()];
        comboBoxNbPersonne.setEnabled(true);
        labelNbPersonne.setEnabled(true);
    }//GEN-LAST:event_comboBoxHeureActionPerformed

    private void comboBoxNbPersonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNbPersonneActionPerformed
        nbPersonne = listNbPersonnes[comboBoxNbPersonne.getSelectedIndex()];
        labelPlan.setEnabled(true);
        labelTable.setEnabled(true);
        listTables.setEnabled(true);
        listTables.
        for (int i = tailleTable.length-1; i > -1; i--) {
            if (tailleTable[i] == nbPersonne){
                listTables.insert("Table " + (i+1) + "\n", 0);
            }
        }
    }//GEN-LAST:event_comboBoxNbPersonneActionPerformed

    private void boutonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonAnnulerActionPerformed
        labelPlan.setEnabled(false);
        labelTable.setEnabled(false);
        comboBoxNbPersonne.setEnabled(false);
        labelNbPersonne.setEnabled(false);
        comboBoxHeure.setEnabled(false);
        labelHeure.setEnabled(false);
    }//GEN-LAST:event_boutonAnnulerActionPerformed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        date = datePickerDate.getDateStringOrEmptyString();
        comboBoxHeure.setEnabled(true);
        labelHeure.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button boutonAnnuler;
    private java.awt.Button boutonValider;
    private javax.swing.JComboBox<String> comboBoxHeure;
    private javax.swing.JComboBox<String> comboBoxNbPersonne;
    private com.github.lgooddatepicker.components.DatePicker datePickerDate;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelHeure;
    private javax.swing.JLabel labelNbPersonne;
    private javax.swing.JLabel labelPlan;
    private javax.swing.JLabel labelTable;
    private javax.swing.JList<String> listTables;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    // End of variables declaration//GEN-END:variables

}
