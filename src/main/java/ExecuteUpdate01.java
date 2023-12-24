import java.sql.*;

public class ExecuteUpdate01 {
    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "techpro", "password");
        Statement st = con.createStatement();
        System.out.println("Success");

        String sql1 = "Update developers set salary=(select avg(salary)from developers) where salary<(select avg(salary) from developers)";
        int updated=st.executeUpdate(sql1);
        System.out.println("Guncellenen kayit sayisi:"+updated);
        ResultSet rs2=st.executeQuery("select*from developers");
        while (rs2.next()){
            System.out.println(rs2.getString("name")+"------"+rs2.getDouble("salary"));
        }
st.close();
        con.close();

    }


}
