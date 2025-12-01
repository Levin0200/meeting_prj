package UI;
import DAO.MeetingDAO;
import DB.DBUtil;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.util.List;

public class MeetingListUI extends JFrame {
    public MeetingListUI() {
        setTitle("📋 회의 목록");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        try (Connection conn = DBUtil.getConnection()) {
            MeetingDAO.selectAllMeeting(conn);
            for (String row : list) {
                textArea.append(row + "\n");
            }
        } catch (Exception e) {
            textArea.setText("불러오기 오류: " + e.getMessage());
        }

        setVisible(true);
    }
}