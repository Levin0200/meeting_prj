package UI;


import DAO.MeetingDAO;
import DB.DBUtil;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class MeetingInsertUI extends JFrame {

    public MeetingInsertUI() {
        setTitle("➕ 회의 추가");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JTextField titleField = new JTextField();
        JTextField dateField = new JTextField("2025-11-01");
        JTextField locationField = new JTextField();

        JButton submitBtn = new JButton("등록");

        panel.add(new JLabel("제목:"));
        panel.add(titleField);
        panel.add(new JLabel("날짜:"));
        panel.add(dateField);
        panel.add(new JLabel("장소:"));
        panel.add(locationField);
        panel.add(new JLabel());
        panel.add(submitBtn);

        add(panel);
        setVisible(true);

        submitBtn.addActionListener(e -> {
            try (Connection conn = DBUtil.getConnection()) {
                MeetingDAO.insertMeeting(conn,
                        titleField.getText(),
                        dateField.getText(),
                        locationField.getText());
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "오류: " + ex.getMessage());
            }
        });
    }
}