/*
PreparedStatement; önceden derlenmiş tekrar tekrar kullanılabilen
parametreli sorgular oluşturmamızı ve çalıştırmamızı sağlar.

PreparedStatement Statement ı extend eder(statementın gelişmiş halidir.)
*/

import java.sql.*;

public class PreparedStatement01 {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "techpro", "password");
        Statement st = con.createStatement();
        System.out.println("Success");

        String sql1="UPDATE bolumler SET taban_puani=475 WHERE bolum ILIKE 'Matematik'";
        int updated=st.executeUpdate(sql1);
      System.out.println("updated = " + updated);


        String sql2="UPDATE bolumler SET taban_puani=? WHERE bolum ILIKE ?";
        PreparedStatement prst= con.prepareStatement(sql2);
        prst.setInt(1,499);
        prst.setString(2,"Matematik");

        prst.setString(2,"Edebiyat");
        prst.setInt(1,477);
        prst.executeUpdate();

        String sql3="insert into bolumler values(?,?,?,?)";
        PreparedStatement prst2=con.prepareStatement(sql3);
        prst2.setInt(1,5006);
        prst2.setString(2,"Yazilim Muhendisligi");
        prst2.setInt(3,475);
        prst2.setString(4,"Merkez");

        prst2.executeUpdate();


    }
}
