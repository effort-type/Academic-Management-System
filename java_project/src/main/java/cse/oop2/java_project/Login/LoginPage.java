/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.login;

import cse.oop2.java_project.bachelor.BachelorManagerStart;
import cse.oop2.java_project.lectureclass.LectureClassPage;
import cse.oop2.java_project.student.StudentPage;
import cse.oop2.java_project.professor.ProfessorPage;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
 * @author 정민수 switch-case를 통해 ID 첫번째 글자를 통해 알맞은 파일을 오픈하여 로그인 가능하게 하기
 *
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    String URL_first = null;
    String URL_student = null;
    String URL_professor = null;
    String URL_bachelor = null;
    String URL_class = null;

    public LoginPage() {
        initComponents();
        setTitle("로그인");
    }

    public LoginPage(String url) {
        initComponents();
        setTitle("로그인");
        URL_first = url;
        URL_student = URL_first + "\\student.txt";
        URL_professor = URL_first + "\\professor.txt";
        URL_bachelor = URL_first + "\\bachelor_manager.txt";
        URL_class = URL_first + "\\class_manager.txt";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BUTT_LOGIN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ID_INPUT = new javax.swing.JTextField();
        PW_INPUT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BUTT_LOGIN.setText("로그인");
        BUTT_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_LOGINActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("동의대학교");

        ID_INPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_INPUTActionPerformed(evt);
            }
        });

        PW_INPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PW_INPUTActionPerformed(evt);
            }
        });

        jLabel2.setText("로고");

        jLabel3.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel3.setText("PW");

        jLabel4.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel4.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(BUTT_LOGIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PW_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PW_INPUT, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(BUTT_LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String student_name = null;
    String professor_name = null;

    private boolean LoginCompare(String url, int check) {

        try {
            //메모장 절대 경로
            String URL = url;

            String str; // 메모장 안에 있는 데이터를 읽어와 저장
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL));

            //파일 객체 생성
            Path path = Paths.get(URL);
            // 캐릭터셋 지정
            Charset cs = StandardCharsets.UTF_8;
            // 파일 내용을 담을 리스트
            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);
            // 모든 파일 내용 읽어와서 저장
            ArrayList<String> list_temp = new ArrayList<String>(); // 임시 저장
            ArrayList<String> id_list = new ArrayList<String>(); // id_list
            ArrayList<String> pw_list_temp = new ArrayList<String>(); // 주민등록번호 앞 뒤 모두 저장
            ArrayList<String> pw_list = new ArrayList<String>(); // 초기 비밀번호로 사용하는 주민등록번호 뒷자리를 -로 구분하여 저장
            ArrayList<String> name_list = new ArrayList<String>(); // name_list
            ArrayList<String> pname_list = new ArrayList<String>(); // professor_list
            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                id_list.add(temp[0]); // 학번, 교수번호, 직원번호
                pw_list_temp.add(temp[1]); // 주민등록번호
                if (check == 83) {
                    name_list.add(temp[3]); // 이름
                }
                if (check == 80) {
                    pname_list.add(temp[3]);
                }
            }

            for (String i : pw_list_temp) {
                String[] temp = i.split("-");
                pw_list.add(temp[1]); // 초기 비밀번호 주민등록번호 뒷자리 저장
            }

            int ch = 0; // 로그인이 되었는지 안되었는지 확인하는 변수
            int index = 0; // student_name을 가져오기 위함
            for (int i = 0; i < id_list.size(); i++) {
                if (ID_INPUT.getText().equals(id_list.get(i)) && PW_INPUT.getText().equals(pw_list.get(i))) {
                    JOptionPane.showMessageDialog(null, "로그인이 되었습니다!!");
                    index = i;
                    ch = -1; // 로그인 되었을 때 함수
                    is.close();
                    if (check == 83) {
                        student_name = name_list.get(index);
                    }
                    if (check == 80) {
                        professor_name = pname_list.get(index);
                    }
                    return true;
                }
            }

            if (ch == 0) {
                JOptionPane.showMessageDialog(null, "로그인에 실패하셨습니다!!");
                ID_INPUT.setText(null);
                PW_INPUT.setText(null);
            }
            is.close();
        } catch (IOException E10) {
            E10.printStackTrace();
        }
        return false;
    }

    private void BUTT_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_LOGINActionPerformed

        boolean check = false; // 로그인 실패 유무를 확인하기 위함
        char first = ID_INPUT.getText().charAt(0); // 첫 번째 글자에 따라 학생,교수,학사담당자,수업담당자 페이지에 매칭 시켜주기 위함
        switch (first) {
            case 83: // ID 첫 글자 S == 학생                          
                check = LoginCompare(URL_student, 'S');
                if (check) {
                    StudentPage spage = new StudentPage(URL_first, student_name, ID_INPUT.getText());
                    spage.setVisible(true);                    
                    break;
                } else {
                    break;
                }
            case 80: // ID 첫 글자 P == 교수               
                check = LoginCompare(URL_professor, 'P');
                if (check) {
                    ProfessorPage ppage = new ProfessorPage(URL_first, professor_name);
                    ppage.setVisible(true);                    
                    break;
                } else {
                    break;
                }
            case 72: // ID 첫 글자 H == 학사 담당자
                check = LoginCompare(URL_bachelor, 'H');
                if (check) {
                    BachelorManagerStart start = new BachelorManagerStart(URL_first);
                    start.setVisible(true);                    
                    break;
                } else {
                    break;
                }
            case 71: // ID 첫 글자 G == 수업 담당자
                check = LoginCompare(URL_class, 'G');
                if (check) {
                    LectureClassPage lcp = new LectureClassPage(URL_first);
                    lcp.setVisible(true);                    
                    break;
                } else {
                    break;
                }

        }
    }//GEN-LAST:event_BUTT_LOGINActionPerformed

    private void ID_INPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_INPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_INPUTActionPerformed

    private void PW_INPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PW_INPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PW_INPUTActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTT_LOGIN;
    private javax.swing.JTextField ID_INPUT;
    private javax.swing.JTextField PW_INPUT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
