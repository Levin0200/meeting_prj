package MAIN;

import DAO.MeetingDAO;
import DB.DBUtil;
import java.sql.*;

public class MainTest {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            System.out.println("DB 연결 성공!!");
        } catch (SQLException e) {
            System.out.println("DB 연결 실패!: " + e.getMessage());
        }
        System.out.println(" CRUD 작업 가능");
        MeetingDAO.insertMeeting(conn, "중간 결과 보고 회의2 ", "2025-10-24", "혁신관 300");
        MeetingDAO.insertMeeting(conn, "중간 결과 보고 회의3 ", "2025-12-24", "혁신관 306");



    }
}
