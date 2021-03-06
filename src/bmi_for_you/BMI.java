/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_for_you;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author NUT
 */
public class BMI extends javax.swing.JInternalFrame {

    /**
     * Creates new form BMI
     */
    public BMI() {
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

        jPanel1 = new javax.swing.JPanel();
        cal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        calBMI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Par = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        h = new javax.swing.JFormattedTextField();
        w = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "คำนวณค่า BMI"));

        cal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Calculator-icon.png"))); // NOI18N
        cal.setToolTipText("คลิกเพื่อคำนวณ");
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });

        jLabel1.setText("ส่วนสูง");

        calBMI.setEditable(false);

        jLabel2.setText("ซม.");

        jLabel3.setText("น้ำหนัก");

        Par.setEditable(false);

        jLabel4.setText("กก.");

        answer.setEditable(false);
        answer.setColumns(20);
        answer.setRows(5);
        jScrollPane1.setViewportView(answer);

        jLabel5.setText("ค่า BMI ");

        jLabel6.setText("kcal");

        jLabel7.setText("อยู่ในเกณฑ์");

        h.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        h.setToolTipText("ใส่ส่วนสูงเป็นเซนติเมตร");
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });

        w.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        w.setToolTipText("ใส่น้ำหนัก");
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Button-Refresh-icon.png"))); // NOI18N
        jButton2.setText("reset");
        jButton2.setToolTipText("reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(calBMI))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Par, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cal)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(calBMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(Par, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
        if(h.getText().equals("")||w.getText().equals("")){
            JOptionPane.showMessageDialog(this,"กรุณากรอกข้อมูลให้ครบถ้วน","เกิดข้อผิดพลาด",JOptionPane.ERROR_MESSAGE);
            return;
        }
        DecimalFormat DC = new DecimalFormat("###.00");
        float i = Float.parseFloat(h.getText());
        float j = Float.parseFloat(w.getText());
        float k  = (j/((i/100)*(i/100)));
        calBMI.setText(DC.format(k));
        if(k<18.50){
            Par.setText("น้ำหนักน้อย / ผอม");
           answer.setText("น้ำหนักน้อยกว่ามาตรฐาน\n" +
                "\n" +
                "คุณมีน้ำหนักน้อยหรือผอม โดยทั่วไป ค่าดัชนีมวลกายปกติมีค่าน้อยกว่า 18.50\n" +
                "\n" +
                "1. ควรกินอาหารให้หลากหลายครบ 5 หมู่ในสัดส่วนที่เหมาะสมและปริมาณมากขึ้น\n "
                + "โดยเพิ่มอาหารประเภทที่ให้พลังงานมากขึ้น เช่น ไขมัน แป้ง ข้าว เนื้อสัตว์ นม\n" +
                "\n" +
                "2. ควรเคลื่อนไหวและออกกำลังกายอย่างสม่ำเสมอทุกวันหรือเกือบทุกวัน "
                + "\nให้เหนื่อยพอควรโดยหายใจกระชั้นขึ้น เช่น เดินเร็ว ถีบจักรยาน รำมวยจีน "
                + "\nลีลาศจังหวะช้า รวมทั้งงานบ้าน งานสวน เป็นต้น สะสมให้ได้อย่างน้อยวันละ 30 นาที"
                + "\nอาจไม่จำเป็นต้องออกกำลังกายให้เหนื่อยมากหรือหอบ ที่ง่ายที่สุดคือ การเดิน\n\n");
        }
        if(k>=18.50&&k<=22.90){
            Par.setText("ปกติ (สุขภาพดี)");
            answer.setText("น้ำหนักปกติ\n" +
                "\n" +
                "คุณมี น้ำหนักปกติ โดยทั่วไปค่าดัชนีมวลกายปกติมีค่าระหว่าง 18.50 - 22.90\n" +
                "\n" +
                "ข้อแนะนำ\n" +
                "\n" +
                "1. ควรกินอาหารให้หลากหลายครบ 5 หมู่ในสัดส่วนที่เหมาะสม "
                + "\nกินเท่าที่ร่างกายต้องการวันไหนกินมากเกินไป วันต่อมาก็กินลดลง "
                + "\nกินอาหารพวกข้าวและแป้งรวมทั้งเมล็ดธัญพืชอื่น ๆ ให้มากขึ้น"
                + "\nไม่น้อยกว่าวันละ 6 ทัพพี กินผัก รวมทั้งเมล็ดถั่ว ผลไม้ ไม่ต่ำกว่าวันละ 5 ส่วน หรือครึ่งกิโลกรัม "
                + "\nเพื่อไม่ให้มีพลังงานส่วนเกินจะทำให้ควบคุมน้ำหนักได้ดีและสมดุล\n" +
                "\n" +
                "2. ควรเคลื่อนไหวและออกกำลังกายอย่างสม่ำเสมอทุกวัน หรือเกือบทุกวัน "
                + "\nอย่างน้อยให้เหนื่อยพอควร โดยหายใจกระชั้นขึ้น สะสมให้ได้อย่างน้อยวันละ 30 นาที "
                + "\nโดยอาจจะแบ่งเป็น 2 - 3 ครั้งก็ได้ จะเป็นกิจกรรมออกกำลังกายที่เป็นเรื่องเป็นราว"
                + "\nหรือการออกแรงในกิจวัตรประจำวันเช่นเดินเร็ว ถีบจักรยาน ลีลาศ หรืองานบ้าน งานสวน "
                + "\nให้เลือกทำตามใจชอบ ถ้าคุณต้องการมีสมรรถภาพที่ดีก็ต้องออกกำลังกายแบบแอโรบิก "
                + "\nเช่น เดินเร็ว ๆ วิ่งเหยาะ ถีบจักรยานเร็วๆ กระโดดเชือก ว่ายน้ำ เล่นกีฬา เป็นต้น "
                + "\nให้รู้สึกเหนื่อยมาก หรือหอบ อย่างน้อยวันละ 20 - 30 นาที อย่างน้อยสัปดาห์ละ 3 วัน\n\n");
        }
        if(k>=23&&k<=24.90){
            Par.setText("ท้วม / โรคอ้วนระดับ 1");
            answer.setText("ท้วม / อ้วนระดับ 1\n" +
                "\n" +
                "คุณมี น้ำหนักเกิน หรือรูปร่างท้วม โดยทั่วไปค่าดัชนีมวลกายปกติมีค่าระหว่าง 23 - 24.90\n" +
                "\n" +
                "ข้อแนะนำ\n" +
                "\n" +
                "1. ควรควบคุมอาหาร โดยลดปริมาณอาหารหรือปรับเปลี่ยนอาหารจากที่ให้พลังงานมาก"
                + "\nเป็นอาหารที่ให้พลังงานน้อย ทั้งนี้พลังงานที่ได้รับไม่ควรต่ำกว่า 1200 กิโลแคลอรีต่อวัน "
                + "\nโดยลดอาหารไขมัน เนื้อสัตว์ อาหารผัด/ทอด ขนมหวาน เครื่องดื่มที่ใส่น้ำตาล แอลกอฮอล์ "
                + "\nแต่ต้องกินอาหารให้หลากหลายในสัดส่วนที่เหมาะสม กินข้าวและแป้ง รวมทั้งเมล็ดธัญพืชอื่น ๆ "
                + "\nไม่น้อยกว่าวันละ 6 ทัพพี กินผัก รวมทั้งเมล็ดถั่ว ผลไม้ ไม่ต่ำกว่าวันละ 5 ส่วน หรือครึ่งกิโลกรัม "
                + "\nเพื่อลดพลังงานเข้า ร่างกายจะได้ใช้พลังงานส่วนเกินที่สะสมอยู่ในรูปไขมันแทน\n" +
                "\n" +
                "2. ควรเคลื่อนไหวและออกกำลังกายแบบแอโรบิกอย่างสม่ำเสมอทุกวัน "
                + "\nหรือเกือบทุกวันอย่างน้อยให้เหนื่อยพอควร โดยหายใจกระชั้นขึ้น สะสมอย่างน้อยวันละ 30 นาที "
                + "\nอาจแบ่งเป็นวันละ 2 - 3 ครั้งก็ได้ เช่น เดินเร็ว ถีบจักรยาน เป็นต้น "
                + "\nหากยังไม่เคยออกกำลังกายเริ่มแรกควร ออกกำลังเบา ๆ ที่ง่ายที่สุดคือ การเดิน ใช้เวลาน้อย ๆ ก่อน "
                + "\nจากนั้นค่อย ๆ เพิ่มเวลาขึ้นในแต่ละสัปดาห์ โดยยังไม่เพิ่มความหนัก "
                + "\nเมื่อร่างกายปรับตัวได้จึงค่อยเพิ่มความหนัก หรือความเหนื่อยตามที่ต้องการ "
                + "\nและเพิ่มการเคลื่อนไหวร่างกายให้มากขึ้นในชีวิตประจำวัน "
                + "\nเพื่อให้มีการใช้พลังงานเพิ่มขึ้น อย่างน้อยวันละ 200 - 300 กิโลแคลอรี\n" +
                "\n" +
                "3. ควรฝึกความแข็งแรงของกล้ามเนื้อ ด้วยการฝึกกายบริหารหรือยกน้ำหนัก "
                + "\nจะช่วยเสริมให้ร่างกายมีการใช้พลังงานเพิ่มมากขึ้น ทำให้ไขมันลดลง\n" +
                "อ้วน / อ้วนระดับ 2");
        }
        if(k>=25&&k<=29.90){
            Par.setText("อ้วน / โรคอ้วนระดับ 2");
            answer.setText("อ้วน / อ้วนระดับ 2\n" +
                "\n" +
                "คุณ อ้วนแล้ว (อ้วนระดับ 2) โดยทั่วไปค่าดัชนีมวลกายปกติมีค่าระหว่าง 25 - 29.90\n" +
                "\n" +
                "ข้อแนะนำ\n" +
                "\n" +
                "1. ควรควบคุมอาหารโดยลดปริมาณอาหารหรือปรับเปลี่ยนอาหารจากที่ให้พลังงานมาก\n" +
                "เป็นอาหารที่ให้พลังงานน้อย ทั้งนี้พลังงานที่ได้รับไม่ควรต่ำกว่า 1200 กิโลแคลอรีต่อวัน \n" +
                "โดยลดอาหารไขมัน/เนื้อสัตว์ อาหารผัด/ทอด ขนมหวาน เครื่องดื่มที่ใส่น้ำตาล แอลกอฮอล์ \n" +
                "แต่ต้องกินอาหารให้หลากหลายในสัดส่วนที่เหมาะสม กินข้าวและแป้งรวมทั้งเมล็ดธัญพืชอื่น ๆ \n" +
                "ไม่น้อยกว่าวันละ 6 ทัพพี กินผักรวมทั้งเมล็ดถั่ว ผลไม้ไม่ต่ำกว่าวันละ 5 ส่วน \n" +
                "หรือครึ่งกิโลกรัมเพื่อลดพลังงานเข้า ร่างกายจะได้ใช้พลังงานส่วนเกินที่สะสมอยู่ในรูปไขมันแทน\n" +
                "\n" +
                "2. ควรเคลื่อนไหวและออกกำลังกายแบบแอโรบิกอย่างสม่ำเสมอทุกวันหรือเกือบทุกวัน\n" +
                "อย่างน้อยให้เหนื่อยพอควรโดยหายใจกระชั้นขึ้น ประมาณ 40-60 นาทีต่อวัน \n" +
                "หรือแบ่งเป็นวันละ 2 ครั้ง ๆ ละ 20 - 30 นาที เช่น เดินเร็ว ถีบจักรยาน เป็นต้น \n" +
                "หากยังไม่เคยออกกำลังกายเริ่มแรก ควรออกกำลังเบา ๆ ที่ง่ายที่สุดคือ \n" +
                "การเดิน ใช้เวลาน้อยๆ ก่อน จากนั้น ค่อย ๆ เพิ่มเวลาขึ้นในแต่ละสัปดาห์ \n" +
                "โดยยังไม่เพิ่มความหนัก เมื่อร่างกายปรับตัวได้จึงค่อยเพิ่มความหนัก \n" +
                "หรือความเหนื่อยตามที่ต้องการและเพิ่มการเคลื่อนไหวร่างกายให้มากขึ้นในชีวิตประจำวัน \n" +
                "เพื่อให้มีการใช้พลังงานเพิ่มขึ้น อย่างน้อยวันละ 200 - 300 กิโลแคลอรี\n" +
                "\n" +
                "3. ควรฝึกความแข็งแรงของกล้ามเนื้อ ด้วยการฝึกกายบริหารหรือยกน้ำหนัก \n" +
                "จะช่วยเสริมให้ร่างกายมีการใช้พลังงานเพิ่มมากขึ้น ทำให้ไขมันลดลง\n" +
                "\n" +
                "4. ถ้าคุณสามารถลดพลังงานเข้าจากอาหารลงได้วันละ 400 กิโลแคลอรี \n" +
                "และเพิ่มการใช้ พลังงานจากการออกกำลังกายวันละ 200 กิโลแคลอรี \n" +
                "รวมแล้วคุณมีพลังงาพร่องลงไปวันละ 600 กิโลแคลอรี ออกกำลังกายประมาณ 6 วัน \n" +
                "คิดเป็นพลังงานพร่อง 3600 กิโลแคลอรี คุณจะลดไขมันลงได้ประมาณครึ่งกิโลกรัมต่อสัปดาห์ \n" +
                "พลังงานเข้าหรือออก 3500 กิโลแคลอรี จะเพิ่มหรือลดไขมันได้ 1 ปอนด์ หรือ 0.45 กิโลกรัม\n" +
                "\n" +
                "5. ควรปรึกษาแพทย์หรือผู้เชี่ยวชาญในการลดและควบคุมน้ำหนัก");
        }
        if(k>30){
            Par.setText("อ้วนมาก / โรคอ้วนระดับ 3");
            answer.setText("อ้วนมาก / อ้วนระดับ 3\n" +
                "\n" +
                "คุณ อ้วนมากแล้ว (อ้วนระดับ 3) โดยทั่วไปค่าดัชนีมวลกายปกติมีค่ามากกว่า 30\n" +
                "\n" +
                "ข้อแนะนำ\n" +
                "\n" +
                "1. ควรควบคุมอาหารโดยลดปริมาณอาหารหรือปรับเปลี่ยนอาหารจากที่ให้พลังงานมาก\n" +
                "เป็นอาหารที่ให้พลังงานน้อย ทั้งนี้พลังงานที่ได้รับไม่ควรต่ำกว่า 1200 กิโลแคลอรีต่อวัน \n" +
                "โดยลดอาหารไขมัน/เนื้อสัตว์ อาหารผัด/ทอด ขนมหวาน เครื่องดื่มที่ใส่น้ำตาล แอลกอฮอล์ \n" +
                "แต่ต้องกินอาหารให้หลากหลายในสัดส่วนที่เหมาะสม กินข้าวและแป้งรวมทั้งเมล็ดธัญพืชอื่น ๆ\n" +
                "ไม่น้อยกว่าวันละ 6 ทัพพี กินผักรวมทั้งเมล็ดถั่ว ผลไม้ไม่ต่ำกว่าวันละ 5 ส่วน หรือครึ่งกิโลกรัม\n" +
                "เพื่อลดพลังงานเข้า ร่างกายจะได้ใช้พลังงานส่วนเกินที่สะสมอยู่ในรูปไขมันแทน\n" +
                "\n" +
                "2. ควรเคลื่อนไหวและออกกำลังกายแบบแอโรบิกอย่างสม่ำเสมอทุกวันหรือเกือบทุกวัน\n" +
                "อย่างน้อยให้เหนื่อยพอควรโดยหายใจกระชั้นขึ้น ประมาณ 40-60 นาทีต่อวัน \n" +
                "หรือแบ่งเป็นวันละ 2 ครั้ง ๆ ละ 20 - 30 นาที เช่น เดินเร็ว ถีบจักรยาน เป็นต้น \n" +
                "หากยังไม่เคยออกกำลังกายเริ่มแรก ควรออกกำลังเบา ๆ ที่ง่ายที่สุดคือ การเดิน ใช้เวลาน้อยๆ ก่อน \n" +
                "จากนั้น ค่อย ๆ เพิ่มเวลาขึ้นในแต่ละสัปดาห์ โดยยังไม่เพิ่มความหนัก เมื่อร่างกายปรับตัวได้จึงค่อยเพิ่มความหนัก \n" +
                "หรือความเหนื่อยตามที่ต้องการและเพิ่มการเคลื่อนไหวร่างกายให้มากขึ้นในชีวิตประจำวัน \n" +
                "เพื่อให้มีการใช้พลังงานเพิ่มขึ้น อย่างน้อยวันละ 200 - 300 กิโลแคลอรี\n" +
                "\n" +
                "3. ควรฝึกความแข็งแรงของกล้ามเนื้อ ด้วยการฝึกกายบริหารหรือยกน้ำหนัก \n" +
                "จะช่วยเสริมให้ร่างกายมีการใช้พลังงานเพิ่มมากขึ้น ทำให้ไขมันลดลง\n" +
                "\n" +
                "4. ถ้าคุณสามารถลดพลังงานเข้าจากอาหารลงได้วันละ 400 กิโลแคลอรี \n" +
                "และเพิ่มการใช้ พลังงานจากการออกกำลังกายวันละ 200 กิโลแคลอรี \n" +
                "รวมแล้วคุณมีพลังงาพร่องลงไปวันละ 600 กิโลแคลอรี ออกกำลังกายประมาณ 6 วัน \n" +
                "คิดเป็นพลังงานพร่อง 3600 กิโลแคลอรี คุณจะลดไขมันลงได้ประมาณครึ่งกิโลกรัมต่อสัปดาห์ \n" +
                "พลังงานเข้าหรือออก 3500 กิโลแคลอรี จะเพิ่มหรือลดไขมันได้ 1 ปอนด์ หรือ 0.45 กิโลกรัม\n" +
                "\n" +
                "5. ควรปรึกษาแพทย์หรือผู้เชี่ยวชาญในการลดและควบคุมน้ำหนัก");
        };
    }//GEN-LAST:event_calActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        calActionPerformed(evt);
    }//GEN-LAST:event_hActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        calActionPerformed(evt);
    }//GEN-LAST:event_wActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       h.setText(null);
       w.setText(null);
       calBMI.setText(null);
       Par.setText(null);
       answer.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Par;
    private javax.swing.JTextArea answer;
    private javax.swing.JButton cal;
    private javax.swing.JTextField calBMI;
    private javax.swing.JFormattedTextField h;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField w;
    // End of variables declaration//GEN-END:variables
}
