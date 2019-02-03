

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;


public class User_Intf extends javax.swing.JFrame {
     private Connection connection = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    double [] i= new double[5];
    
    public String name1;
    
    public User_Intf() {
        initComponents();
        init();
        connection = JavaDbCon.javadb();
        
    }
    public User_Intf(String name1){
        this.name1=name1;
    }
    public void init() {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setResizable(false);
        

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCB = new javax.swing.JTextField();
        jTextFieldVB = new javax.swing.JTextField();
        jTextFieldSND = new javax.swing.JTextField();
        jTextFieldCR = new javax.swing.JTextField();
        jTextFieldVR = new javax.swing.JTextField();
        jTextFieldCPZ = new javax.swing.JTextField();
        jTextFieldBPZ = new javax.swing.JTextField();
        jTextFieldFCK = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CchB = new javax.swing.JTextField();
        CvgB = new javax.swing.JTextField();
        Csndw = new javax.swing.JTextField();
        CchR = new javax.swing.JTextField();
        CvgR = new javax.swing.JTextField();
        CchP = new javax.swing.JTextField();
        CbfP = new javax.swing.JTextField();
        CfrCH = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jBtnTotalCost = new javax.swing.JButton();
        jTextFieldTOTALCST = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTfCostofDrink = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxSelectDrink = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(1070, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCB.setText("0");
        jTextFieldCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCBActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 40, -1));

        jTextFieldVB.setText("0");
        jTextFieldVB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldVBMouseEntered(evt);
            }
        });
        jTextFieldVB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVBActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldVB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 40, -1));

        jTextFieldSND.setText("0");
        jTextFieldSND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSNDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSND, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 40, -1));

        jTextFieldCR.setText("0");
        jTextFieldCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCRActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 40, -1));

        jTextFieldVR.setText("0");
        jTextFieldVR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVRActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldVR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 40, -1));

        jTextFieldCPZ.setText("0");
        jTextFieldCPZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPZActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCPZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 40, -1));

        jTextFieldBPZ.setText("0");
        jTextFieldBPZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBPZActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBPZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 40, -1));

        jTextFieldFCK.setText("0");
        jTextFieldFCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFCKActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 40, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Chicken Burger");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sandwich");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Vegetable Burger");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Chicken Role");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Vegetable Role");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Chicken Pizza");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Beef Pizza");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Fried Chicken");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel11.setText("jLabel11");
        jLabel11.setMaximumSize(new java.awt.Dimension(1964, 1200));
        jLabel11.setMinimumSize(new java.awt.Dimension(1964, 1200));
        jLabel11.setPreferredSize(new java.awt.Dimension(1964, 1200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel28.setText("jLabel28");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel29.setText("jLabel29");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel30.setText("jLabel30");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel31.setText("jLabel31");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel34.setText("jLabel34");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel33.setText("jLabel33");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel32.setText("jLabel32");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jLabel12.setText("140 tk/piece");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jLabel13.setText("100 tk/piece");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel14.setText("120 tk/piece");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel15.setText("90 tk/piece");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        jLabel16.setText("60 tk/piece");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel17.setText("200 tk/piece");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel18.setText("200 tk/piece");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        jLabel20.setText("100 tk/piece");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, -1, -1));
        getContentPane().add(CchB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 60, -1));
        getContentPane().add(CvgB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 60, -1));
        getContentPane().add(Csndw, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 60, -1));
        getContentPane().add(CchR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 59, -1));
        getContentPane().add(CvgR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 61, -1));
        getContentPane().add(CchP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 61, -1));
        getContentPane().add(CbfP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 59, -1));
        getContentPane().add(CfrCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 59, -1));

        jLabel19.setText("tk");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel21.setText("tk");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel22.setText("tk");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel23.setText("tk");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        jLabel24.setText("tk");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        jLabel25.setText("tk");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        jLabel26.setText("tk");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        jLabel27.setText("tk");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, -1));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setPreferredSize(new java.awt.Dimension(2966, 2968));

        jBtnTotalCost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnTotalCost.setText("Total Cost");
        jBtnTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotalCostActionPerformed(evt);
            }
        });

        jButton1.setText("Order Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Cost of Drink");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Select Drink");

        jComboBoxSelectDrink.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Coke", "7up", "Fanta", "Coffee" }));
        jComboBoxSelectDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectDrinkActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel35.setText("Order the Food You Want ");

        jLabel36.setText("jLabel36");

        jLabel37.setText("Customer Name :");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(818, 818, 818)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnTotalCost)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTfCostofDrink, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTOTALCST)
                                    .addComponent(jComboBoxSelectDrink, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addGap(155, 155, 155)
                        .addComponent(jLabel35)))
                .addGap(83, 83, 83))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))))
                .addGap(193, 193, 193)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxSelectDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfCostofDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnTotalCost)
                    .addComponent(jTextFieldTOTALCST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCRActionPerformed
        double aCR = Double.parseDouble(jTextFieldCR.getText());
        double CostCR = 90.00;
        
        i[0]=((aCR * CostCR));
        String TCR = String.format("%.2f", i[0]);
        CchR.setText(TCR);
    }//GEN-LAST:event_jTextFieldCRActionPerformed

    private void jTextFieldCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCBActionPerformed
        double aCB = Double.parseDouble(jTextFieldCB.getText());
        double CostCB = 140.00;

        i[0]=((aCB * CostCB));
        String TCB = String.format("%.2f", i[0]);
        CchB.setText(TCB);
    }//GEN-LAST:event_jTextFieldCBActionPerformed

    private void jTextFieldVBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVBActionPerformed
        double aVB = Double.parseDouble(jTextFieldVB.getText());
        double CostVB = 100.00;

        i[0]=((aVB * CostVB));
        String TVB = String.format("%.2f", i[0]);
        CvgB.setText(TVB);
    }//GEN-LAST:event_jTextFieldVBActionPerformed

    private void jTextFieldVBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldVBMouseEntered
        
    }//GEN-LAST:event_jTextFieldVBMouseEntered

    private void jTextFieldSNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSNDActionPerformed
        double aS = Double.parseDouble(jTextFieldSND.getText());
        double CostS = 120.00;

        i[0]=((aS * CostS));
        String TS = String.format("%.2f", i[0]);
        Csndw.setText(TS);
    }//GEN-LAST:event_jTextFieldSNDActionPerformed

    private void jTextFieldVRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVRActionPerformed
        double aVR = Double.parseDouble(jTextFieldVR.getText());
        double CostVR = 60.00;

        i[0]=((aVR * CostVR));
        String TVR = String.format("%.2f", i[0]);
        CvgR.setText(TVR);
    }//GEN-LAST:event_jTextFieldVRActionPerformed

    private void jTextFieldCPZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPZActionPerformed
        double aCP = Double.parseDouble(jTextFieldCPZ.getText());
        double CostCP = 200.00;

        i[0]=((aCP * CostCP));
        String TCP = String.format("%.2f", i[0]);
        CchP.setText(TCP);
    }//GEN-LAST:event_jTextFieldCPZActionPerformed

    private void jTextFieldBPZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBPZActionPerformed
        double aBP = Double.parseDouble(jTextFieldBPZ.getText());
        double CostBP = 200.00;

        i[0]=((aBP * CostBP));
        String TBP = String.format("%.2f", i[0]);
        CbfP.setText(TBP);
    }//GEN-LAST:event_jTextFieldBPZActionPerformed

    private void jTextFieldFCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFCKActionPerformed
        double aFC = Double.parseDouble(jTextFieldFCK.getText());
        double CostFC = 100.00;

        i[0]=((aFC * CostFC));
        String TFC = String.format("%.2f", i[0]);
        CfrCH.setText(TFC);
    }//GEN-LAST:event_jTextFieldFCKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        Customer_Bill order = new Customer_Bill();
        Customer_Bill.jLabel1.setText(this.jTextFieldCB.getText());
        Customer_Bill.jLabel2.setText(this.jTextFieldVB.getText());
        Customer_Bill.jLabel3.setText(this.jTextFieldCR.getText());
        Customer_Bill.jLabel4.setText(this.jTextFieldVR.getText());
        Customer_Bill.jLabel5.setText(this.jTextFieldSND.getText());
        Customer_Bill.jLabel6.setText(this.jTextFieldCPZ.getText());
        Customer_Bill.jLabel7.setText(this.jTextFieldBPZ.getText());
        Customer_Bill.jLabel8.setText(this.jTextFieldFCK.getText());
        Customer_Bill.jLabel9.setText(this.jTfCostofDrink.getText());
        Customer_Bill.jLabel19.setText((String) this.jComboBoxSelectDrink.getSelectedItem());

        Customer_Bill.jLabel10.setText(this.CchB.getText());
        Customer_Bill.jLabel11.setText(this.CvgB.getText());
        Customer_Bill.jLabel12.setText(this.CchR.getText());
        Customer_Bill.jLabel13.setText(this.CvgR.getText());
        Customer_Bill.jLabel14.setText(this.Csndw.getText());
        Customer_Bill.jLabel15.setText(this.CchP.getText());
        Customer_Bill.jLabel16.setText(this.CbfP.getText());
        Customer_Bill.jLabel17.setText(this.CfrCH.getText());

        Customer_Bill.jLabel18.setText(this.jTextFieldTOTALCST.getText());
        
        Customer_Bill.jLabel30.setText(this.jLabel36.getText());

        order.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotalCostActionPerformed

        double gv1=0;
        double gv2=0;
        double gv4=0;
        double gv3=0;
        double gv5=0;
        double gv6=0;
        double gv7=0;
        double gv8=0;
        double gv9=0;

        try {
            gv1 = Double.parseDouble(CchR.getText());
        } catch (Exception e) {
        }
        try {
            gv2 = Double.parseDouble(CchB.getText());
        } catch (Exception e) {
        }
        try {
            gv3 = Double.parseDouble(CvgR.getText());
        } catch (Exception e) {
        }
        try {
            gv4 = Double.parseDouble(CvgB.getText());
        } catch (Exception e) {
        }
        try {
            gv5 = Double.parseDouble(Csndw.getText());
        } catch (Exception e) {
        }
        try {
            gv6 = Double.parseDouble(CchP.getText());
        } catch (Exception e) {
        }
        try {
            gv7 = Double.parseDouble(CbfP.getText());
        } catch (Exception e) {
        }
        try {
            gv8 = Double.parseDouble(CfrCH.getText());
        } catch (Exception e) {
        }
        try {
            gv9 = Double.parseDouble(jTfCostofDrink.getText());
        } catch (Exception e) {
        }

        i[0]=((gv1+gv2+gv3+gv4+gv5+gv6+gv7+gv8+gv9));
        String TC = String.format("%.2f", i[0]);
        jTextFieldTOTALCST.setText(TC);

        add(jTextFieldCB.getText(),jTextFieldVB.getText(),jTextFieldCR.getText(),jTextFieldVR.getText(),jTextFieldSND.getText(),jTextFieldCPZ.getText(),jTextFieldBPZ.getText(),jTextFieldFCK.getText(), (String) jComboBoxSelectDrink.getSelectedItem());
    }//GEN-LAST:event_jBtnTotalCostActionPerformed

    private void jComboBoxSelectDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectDrinkActionPerformed
        double Coke= 33;
        double Sevenup= 30;
        double Fanta= 32;
        double Coffee= 40;
        
        if(jComboBoxSelectDrink.getSelectedItem().equals("Coke")){
            String coke= String.format("%.2f", Coke);
            jTfCostofDrink.setText(coke);
        }
        if(jComboBoxSelectDrink.getSelectedItem().equals("7up")){
            String sevenup= String.format("%.2f", Sevenup);
            jTfCostofDrink.setText(sevenup);
        }
        if(jComboBoxSelectDrink.getSelectedItem().equals("Fanta")){
            String fanta= String.format("%.2f", Fanta);
            jTfCostofDrink.setText(fanta);
        }
        if(jComboBoxSelectDrink.getSelectedItem().equals("Coffee")){
            String coffee= String.format("%.2f", Coffee);
            jTfCostofDrink.setText(coffee);
        }
    }//GEN-LAST:event_jComboBoxSelectDrinkActionPerformed
    public void close() {
            WindowEvent windowevent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowevent);
        }
    public void add(String v1, String v2, String v3, String v4,String v5,String v6,String v7,String v8,String v9) {

        try {

            pst = connection.prepareStatement("INSERT INTO corderinfo(chB,vgB,sndw,chR,vgR,chP,bfP,frCH,drinks) VALUES ( " + v1 + ", " + v2 + ", " + v3 + "," + v4 + "," + v5 + "," + v6 + "," + v7 + "," + v8 + ",'" + v9 + "')");

            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("error");
        }

    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Intf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CbfP;
    private javax.swing.JTextField CchB;
    private javax.swing.JTextField CchP;
    private javax.swing.JTextField CchR;
    private javax.swing.JTextField CfrCH;
    private javax.swing.JTextField Csndw;
    private javax.swing.JTextField CvgB;
    private javax.swing.JTextField CvgR;
    private javax.swing.JButton jBtnTotalCost;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxSelectDrink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    public static javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextFieldBPZ;
    public javax.swing.JTextField jTextFieldCB;
    private javax.swing.JTextField jTextFieldCPZ;
    private javax.swing.JTextField jTextFieldCR;
    private javax.swing.JTextField jTextFieldFCK;
    private javax.swing.JTextField jTextFieldSND;
    private javax.swing.JTextField jTextFieldTOTALCST;
    private javax.swing.JTextField jTextFieldVB;
    private javax.swing.JTextField jTextFieldVR;
    private javax.swing.JTextField jTfCostofDrink;
    // End of variables declaration//GEN-END:variables

    static class jLabel36 {

        public jLabel36() {
        }
    }
}
