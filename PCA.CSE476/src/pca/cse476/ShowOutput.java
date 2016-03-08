/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pca.cse476;

import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;
import la.matrix.Matrix;

/**
 *
 * @author mkgaurab
 */
public class ShowOutput extends javax.swing.JFrame {

    private final Matrix X;

    /**
     * Creates new form NewJFrame
     *
     * @param X
     */
    public ShowOutput(Matrix X) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.X = X;
        generateTable();

    }

    void generateTable() {
        String[][] dummyData = new String[X.getRowDimension()][X.getColumnDimension()];
        String[] coloumnNames = new String[X.getColumnDimension()];
        for (int i = 0; i < X.getColumnDimension(); i++) {
            coloumnNames[i] = "";
        }
        for (int i = 0; i < X.getRowDimension(); i++) {
            for (int j = 0; j < X.getColumnDimension(); j++) {
                dummyData[i][j] = Double.toString(X.getEntry(i, j));
            }
        }

        ShowOutPutPanel.removeAll();
        ShowOutPutScrollPane.removeAll();
        ShowOutPutJTable.setModel(new DefaultTableModel(dummyData, coloumnNames));
        ShowOutPutPanel.setLayout(new BorderLayout());
        ShowOutPutPanel.add(ShowOutPutJTable, BorderLayout.CENTER);
        ShowOutPutPanel.repaint();
        ShowOutPutPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowOutPutPanel = new javax.swing.JPanel();
        ShowOutPutScrollPane = new javax.swing.JScrollPane();
        ShowOutPutJTable = new javax.swing.JTable();
        ShowOutputJlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reduced Data Frame");

        ShowOutPutPanel.setLayout(new java.awt.BorderLayout());

        ShowOutPutJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ShowOutPutScrollPane.setViewportView(ShowOutPutJTable);

        ShowOutPutPanel.add(ShowOutPutScrollPane, java.awt.BorderLayout.CENTER);

        ShowOutputJlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ShowOutputJlabel.setText("               Reduced Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ShowOutputJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ShowOutPutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ShowOutputJlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowOutPutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ShowOutPutJTable;
    private javax.swing.JPanel ShowOutPutPanel;
    private javax.swing.JScrollPane ShowOutPutScrollPane;
    private javax.swing.JLabel ShowOutputJlabel;
    // End of variables declaration//GEN-END:variables
}
