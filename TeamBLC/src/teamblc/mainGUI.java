/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamblc;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Corey Gunter
 * @author Jamie Banas
 * @author Chris Maxey
 */
interface TeamBLCConstants {
    static final String ENDEX_FILE = "Endex.xml"; // Filename to store file records in XML.
}

public class mainGUI extends javax.swing.JFrame implements TeamBLCConstants {
    /**
     * Creates new form mainGUI
     */
    public mainGUI() {
        initComponents();
    }

    void checkBlankInput(String userSub, java.awt.Component comp) {
        if (userSub.equals("")) {
            JOptionPane.showMessageDialog(comp, "Input must not be blank.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        searchTab = new javax.swing.JPanel();
        searchSection = new javax.swing.JPanel();
        searchLabel1 = new javax.swing.JLabel();
        searchScrollPanel1 = new javax.swing.JScrollPane();
        searchTextPane1 = new javax.swing.JTextPane();
        searchDropDown1 = new javax.swing.JComboBox();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        resultSection = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTextPane = new javax.swing.JTextPane();
        adminTab = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        searchFileTextBox = new javax.swing.JTextField();
        openFileDialog = new javax.swing.JButton();
        savePathButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        deleteSelectedBttn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Engine"));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        searchLabel1.setText("Search:");

        searchScrollPanel1.setViewportView(searchTextPane1);

        searchDropDown1.setBackground(new java.awt.Color(0, 204, 255));
        searchDropDown1.setEditable(true);
        searchDropDown1.setMaximumRowCount(3);
        searchDropDown1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All of the Search Terms", "Any of the Search Terms", "Exact Match", " " }));

        searchButton.setBackground(new java.awt.Color(0, 204, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(0, 204, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchSectionLayout = new javax.swing.GroupLayout(searchSection);
        searchSection.setLayout(searchSectionLayout);
        searchSectionLayout.setHorizontalGroup(
            searchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchScrollPanel1)
                    .addGroup(searchSectionLayout.createSequentialGroup()
                        .addComponent(searchDropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)))
                .addContainerGap())
        );
        searchSectionLayout.setVerticalGroup(
            searchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchSectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchScrollPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchDropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton)
                    .addComponent(searchButton))
                .addGap(50, 50, 50))
        );

        resultSection.setBackground(new java.awt.Color(255, 255, 255));
        resultSection.setBorder(javax.swing.BorderFactory.createTitledBorder("Results"));

        jScrollPane1.setViewportView(resultsTextPane);

        javax.swing.GroupLayout resultSectionLayout = new javax.swing.GroupLayout(resultSection);
        resultSection.setLayout(resultSectionLayout);
        resultSectionLayout.setHorizontalGroup(
            resultSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
            .addGroup(resultSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE))
        );
        resultSectionLayout.setVerticalGroup(
            resultSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
            .addGroup(resultSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(resultSectionLayout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout searchTabLayout = new javax.swing.GroupLayout(searchTab);
        searchTab.setLayout(searchTabLayout);
        searchTabLayout.setHorizontalGroup(
            searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resultSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        searchTabLayout.setVerticalGroup(
            searchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchTabLayout.createSequentialGroup()
                .addComponent(searchSection, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Search", searchTab);

        openFileDialog.setLabel("Add File...");
        openFileDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileDialogActionPerformed(evt);
            }
        });

        savePathButton.setText("Re - Index...");
        savePathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePathButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Index File Location:");
        jLabel2.setName(""); // NOI18N

        deleteSelectedBttn.setText("Delete Selected");
        deleteSelectedBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedBttnActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchFileTextBox))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(openFileDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savePathButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteSelectedBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFileTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openFileDialog)
                    .addComponent(savePathButton)
                    .addComponent(deleteSelectedBttn)
                    .addComponent(jLabel3))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Name", "Status", "Last Update Date", "Selected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCellSelectionEnabled(true);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(500);
            jTable1.getColumnModel().getColumn(1).setMinWidth(25);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        javax.swing.GroupLayout adminTabLayout = new javax.swing.GroupLayout(adminTab);
        adminTab.setLayout(adminTabLayout);
        adminTabLayout.setHorizontalGroup(
            adminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(adminTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
                .addContainerGap())
        );
        adminTabLayout.setVerticalGroup(
            adminTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminTabLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Admin", adminTab);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teamblc/TeamBLC_Logo_Basic.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        searchTextPane1.setText(null);
        resultsTextPane.setText(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        checkBlankInput(searchTextPane1.getText(), searchTab);
    }//GEN-LAST:event_searchButtonActionPerformed

    //Fixes Issue#2 - Allows entry of new file to jTable and popualtes requires info.
    private void openFileDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileDialogActionPerformed
        addFile();
    }

    private void addFile() {

        JFileChooser fileChooser = new JFileChooser(".");
        int status = fileChooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            //int lastRow = jTable1.getRowCount();
            String fileName = selectedFile.getParent() + System.getProperty("file.separator") + selectedFile.getName();
            
            //Fixes issue #8, checks for Duplicate file names in jTable1.
            boolean dupEntry = checkDuplicateEntry(fileName);
                if (dupEntry){
                    jLabel3.setText("This entry already exists!");
                }
                else{
                    
                    jLabel3.setText(""); //Fixes Issue #9 - Sets error message for dup entry blank if allwoing the add.
                    String isIndexed = "Indexed";
                
                    DefaultTableModel defaultModel = (DefaultTableModel) jTable1.getModel();
                    Document doc = null;
                    try {
                    doc = initXML();
                    } catch (ParserConfigurationException ex) {
                    Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //int ia = defaultModel.getRowCount();
                    int ia = defaultModel.getRowCount() +1 ; //+1 to fix for loop (could have fixed for loop).
                    //System.out.println("IA= " + ia);
                    for (int i = 0; i < ia; i++){
                        //System.out.println(i);
                        if (i == ia-1) {
                        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        String modifyDate = sdf.format(selectedFile.lastModified());
                        defaultModel.addRow(new Object[]{fileName, isIndexed, modifyDate, false});
                        createXML(doc, i, fileName, modifyDate, true);
                        } else {
                            String fname = defaultModel.getValueAt(i, 0).toString();
                            String modDate = defaultModel.getValueAt(i, 2).toString();
                            createXML(doc, i, fname, modDate, false);
                        }
                    }
                try {
                    createArrayList(fileName);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
        }

    }//GEN-LAST:event_openFileDialogActionPerformed

    private void savePathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePathButtonActionPerformed
        checkBlankInput(searchFileTextBox.getText(), adminTab);
    }//GEN-LAST:event_savePathButtonActionPerformed

    private void deleteSelectedBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedBttnActionPerformed
        // TODO add your handling code here: Jamie needs to delete from ENDEX
        //System.out.println("Selected table record for deletion!");
        int activeColumn = 3;
              
        for (int i = 0; i < jTable1.getRowCount(); i++){
            DefaultTableModel defaultModel = (DefaultTableModel) jTable1.getModel();
            if (jTable1.getValueAt(i, activeColumn).equals(true)) {
                //System.out.println("deleting row " + i);
                defaultModel.removeRow(i);
            }}
    }//GEN-LAST:event_deleteSelectedBttnActionPerformed

    //Fixes Issue #5. Checks for updated files and advises to reindex files.
    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        checkTheDates();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    /**
     * @param args the command line arguments
     */
    static boolean isFileCreated;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminTab;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteSelectedBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JButton openFileDialog;
    private javax.swing.JPanel resultSection;
    private javax.swing.JTextPane resultsTextPane;
    private javax.swing.JButton savePathButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox searchDropDown1;
    private javax.swing.JTextField searchFileTextBox;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JScrollPane searchScrollPanel1;
    private javax.swing.JPanel searchSection;
    private javax.swing.JPanel searchTab;
    private javax.swing.JTextPane searchTextPane1;
    // End of variables declaration//GEN-END:variables

    
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
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            /* Create and display the form */
            java.awt.EventQueue.invokeAndWait(()-> {
                new mainGUI().setVisible(true);
            });
        } catch (InterruptedException ex) {
            Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

       //Check for index file and create it if it doesn't exist.
        File indexFile = new File("."+System.getProperty("file.separator")+ENDEX_FILE);
        if (!indexFile.isFile()) {
            boolean isFileCreated = false;
            try {
                isFileCreated = indexFile.createNewFile();
                } catch (IOException ioe) {
            }
        }
        //If index file exists, load entries to jTable.
        else if (indexFile.isFile()){
        
            DocumentBuilderFactory builderFact = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            try {
                builder = builderFact.newDocumentBuilder();
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            Document dom = null;
            try {
                dom = builder.parse("."+System.getProperty("file.separator")+ENDEX_FILE);
            } catch (org.xml.sax.SAXException | IOException ex) {
                Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            Element docElement = dom.getDocumentElement();
            
            NodeList nodeList = docElement.getChildNodes();
            if (nodeList != null && nodeList.getLength() > 0) {
                for (int i = 0; i < nodeList.getLength(); i++) {
                    if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                        Element el = (Element) nodeList.item(i);
                        //System.out.println("\nCurrent Element :" + el.getNodeName());
                        if (el.getNodeName().contains("File")) {
                            String filePosition = el.getElementsByTagName("FilePosition").item(0).getTextContent();
                            String fileName = el.getElementsByTagName("FileName").item(0).getTextContent();
                            String modifyDate = el.getElementsByTagName("ModifyDate").item(0).getTextContent();
                            String isIndexed = "Indexed";
                            
                            DefaultTableModel defaultModel = (DefaultTableModel) jTable1.getModel();
                            defaultModel.addRow(new Object[]{fileName, isIndexed, modifyDate, false});
                            
                        }
                    }
                }
            }
        }
        
        //searchFileTextBox.setText(fileName);
        
    }
    
    private Document initXML() throws ParserConfigurationException {

        DocumentBuilderFactory icFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder icBuilder = null;

        //Build XML and add root element.
        icBuilder = icFactory.newDocumentBuilder();
        Document doc = icBuilder.newDocument();
            
        Element mainRootElement = doc.createElementNS("www.teamBLC.net", "FileList");
        doc.appendChild(mainRootElement);
            
        return doc;
    }
    
    private void createXML(Document doc, int row, String file, String date, boolean isFinal) {
        try {
            String rowToString = Integer.toString(row);
            // append child elements to root element
            
            Element mainElement = doc.getDocumentElement();
            mainElement.appendChild(getFileList(doc, rowToString, file, date));
            
            // output DOM XML to console
            Transformer transformer = null;
            transformer = TransformerFactory.newInstance().newTransformer();
            
            
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new StringWriter());
            
            //StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);
            
            if (isFinal) {
                writeXMLFile(result);
            }
        } catch (TransformerException ex) {
            Logger.getLogger(mainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void writeXMLFile(StreamResult result) {
            //Write to File
            FileOutputStream fop = null;
            File xmlFile;

            try {
                xmlFile = new File("."+System.getProperty("file.separator")+ENDEX_FILE);
                fop = new FileOutputStream(xmlFile, false);

                String xmlString = result.getWriter().toString();
                //System.out.println("Debug: "xmlString);
                byte[] contentInBytes = xmlString.getBytes();

                fop.write(contentInBytes);
                fop.flush();
                fop.close();
            } catch (IOException e) {
            }

            //System.out.println("\nXML DOM Created Successfully..");       
    }
    
    private Node getFileList(Document doc, String id, String name, String mdate) {
        Element company = doc.createElement("File");
        company.appendChild(getListElements(doc, company, "FilePosition", id));
        company.appendChild(getListElements(doc, company, "FileName", name));
        company.appendChild(getListElements(doc, company, "ModifyDate", mdate));
        return company;
    }

    // utility method to create text node
    private static Node getListElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
        
        
     // Creating the list of words in the indexed files as they are added.
    private void createArrayList(String fileName) throws FileNotFoundException {
        Scanner s = new Scanner(new File(fileName));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();
    }
        
        //Checking the ArrayList
        /*
        for (int i = 0; i < list.size(); i++) {
	    String value = list.get(i);
	    System.out.println("Element: " + value);
        }
        */

    private boolean checkDuplicateEntry(String file) {
        int column = 0;
        
        for (int i = 0; i < jTable1.getRowCount(); i++){
            String found = jTable1.getValueAt(i, column).toString();
            return found.equals(file);
        }
        return false;
    }

    private void checkTheDates() {
        int ib = jTable1.getRowCount();
        for (int i = 0; i < ib; i++){
            int fileColumn = 0;
            int statusColumn = 1;
            int mDateColumn = 2;
            
            String currentFile = jTable1.getValueAt(i, fileColumn).toString();
            File file = new File(currentFile);
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            String newModifyDate = sdf.format(file.lastModified());
            String currentModifyDate = jTable1.getValueAt(i, mDateColumn).toString();
            
            //System.out.println("New: " + newModifyDate);
            //System.out.println("Current: " + currentModifyDate);
            
            boolean isUpdateToDate = newModifyDate.equals(currentModifyDate);
                //System.out.println(isUpdateToDate);
            
            if (!isUpdateToDate){
                String isNotCurrent = "Out of Date";
                jTable1.setValueAt(isNotCurrent, i, statusColumn);
            }
            
            else{
                String isCurrent = "Indexed";
                jTable1.setValueAt(isCurrent, i, statusColumn);
            }
                    
        }
    }
}