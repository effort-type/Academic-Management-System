/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.lectureclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 정민수,윤채민
 */
public class RemoveLecture extends javax.swing.JFrame {

    /**
     * Creates new form ReomveLecture
     */
    public RemoveLecture() {
        initComponents();
    }

    String URL = null;

    public RemoveLecture(String URL) {
        initComponents();
        this.URL = URL + "\\lectureclass_temp.txt";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lecture_name = new javax.swing.JTextField();
        lecture_num = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("삭제할 강의를 선택하세요");

        jLabel2.setText("강좌명");

        jLabel3.setText("강좌번호");

        jButton1.setText("취소");

        jButton2.setText("확인");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lecture_num)
                                    .addComponent(lecture_name, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lecture_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lecture_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {

            String str; // 메모장 안에 있는 데이터를 읽어와 저장
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader("C:\\Users\\ppak\\Desktop\\project\\JAVA\\java_project\\src\\main\\java\\cse\\oop2\\java_project\\info\\lectureclass_temp.txt"));

            //파일 객체 생성
            Path path = Paths.get("C:\\Users\\ppak\\Desktop\\project\\JAVA\\java_project\\src\\main\\java\\cse\\oop2\\java_project\\info\\lectureclass_temp.txt");
            // 캐릭터셋 지정
            Charset cs = StandardCharsets.UTF_8;
            // 파일 내용을 담을 리스트
            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);
            // 모든 파일 내용 읽어와서 저장
            ArrayList<String> list_temp = new ArrayList<String>(); // 임시 저장
            ArrayList<String> num_list = new ArrayList<>(); // 강의 번호 리스트
            ArrayList<String> name_list = new ArrayList<>(); // 강의명 리스트
            ArrayList<String> major_list = new ArrayList<>(); // 개설학과 리스트
            ArrayList<String> professor_list = new ArrayList<>(); // 교수 이름 리스트
            ArrayList<String> score_list = new ArrayList<>(); // 학점 리스트
            ArrayList<String> info_list = new ArrayList<>(); // 강의 정보 리스트
            is.close();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");

                num_list.add(temp[0]);
                name_list.add(temp[1]);
                major_list.add(temp[2]);
                professor_list.add(temp[3]);
                score_list.add(temp[4]);
                info_list.add(temp[5]);

            }

            int ch = -1; // 0이면 정상, -1이면 비정상
            for (int i = 0; i < num_list.size(); i++) {
                if ((lecture_name.getText().equals(name_list.get(i))) && (lecture_num.getText().equals(num_list.get(i)))) {
                    ch = 0;
                    break;
                }
            }

            int end = -1; // 0 : 정상 삭제, -1 : 없는 정보
            // 입력한 정보가 존재할 경우
            if (ch == 0) {
                File file = new File("C:\\Users\\ppak\\Desktop\\project\\JAVA\\java_project\\src\\main\\java\\cse\\oop2\\java_project\\info\\lectureclass_temp.txt");
                FileWriter writer;
                writer = new FileWriter(file, false);
                for (int i = 0; i < num_list.size(); i++) {
                    if ((lecture_name.getText().equals(name_list.get(i))) && (lecture_num.getText().equals(num_list.get(i)))) {
                        continue;
                    } else {
                        String s = "/";
                        String n = "\n";
                        writer.write(num_list.get(i));
                        writer.write(s);
                        writer.write(name_list.get(i));
                        writer.write(s);
                        writer.write(major_list.get(i));
                        writer.write(s);
                        writer.write(professor_list.get(i));
                        writer.write(s);
                        writer.write(score_list.get(i));
                        writer.write(s);
                        writer.write(info_list.get(i));
                        writer.write(n);

                        writer.flush();// 출력은 버퍼에 쌓여있기에 쌓인 버퍼를 목적지로 보내줌
                    }
                }
                end = 0;
                JOptionPane.showMessageDialog(null, "정보 삭제 완료");
                writer.close();
                dispose();
            }

            if (end == -1) {
                JOptionPane.showMessageDialog(null, "없는 정보입니다. 다시 입력해주세요.");
            }

        } catch (IOException E10) {
            E10.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveLecture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lecture_name;
    private javax.swing.JTextField lecture_num;
    // End of variables declaration//GEN-END:variables
}
