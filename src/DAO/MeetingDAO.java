package DAO;
import java.sql.*;
import java.time.LocalDate;

public class MeetingDAO {
    // insert meetings 회의 정보를 추가
    public static void insertMeeting(Connection con, String t,
                                      String d, String l){
        String sql = "INSERT INTO meetings(title,date,location) " +
                     "VALUES(?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            pst.setDate(2, Date.valueOf(d));
            pst.setString(3, l);
            pst.executeUpdate();
            System.out.println("회의록 정보 추가 성공!!");
        } catch (SQLException e) {
            System.out.println("회의록 등록중 예외 발생 : " +  e.getMessage());
        }
    }

    // 삭제

    // 수정


    // 조회

}
