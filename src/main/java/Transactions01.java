import java.sql.*;

public class Transactions01 {
    public static void main(String[] args) throws SQLException {
        //transaction: db de en kucuk islem birimi(parcalanamaz,atomik)
        //birden fazla islemi bir araya getirereek tek bir transaction olusturabilir
        //Bu islemlerden en az 1 i basarisiz oldugunda yada herhangi bir kosulda transactionı rollback ile geri alabiliriz
        //islemlerin tamamı basarılı oldugunda ise commit ile onaylayarak transactionu sonlandırıp degiskenleri kalici hale getirebiliriz

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc", "techpro", "password");
        Statement st = con.createStatement();
        System.out.println("Success");
/*
        String sql1 = "INSERT INTO hesaplar VALUES (?,?,?) ";
        PreparedStatement prst1 = con.prepareStatement(sql1);
        prst1.setInt(1, 1234);
        prst1.setString(2,"Fred");
        prst1.setDouble(3,9000);
        prst1.executeUpdate();

        prst1.setInt(1, 5678);
        prst1.setString(2,"Barnie");
        prst1.setDouble(3,6000);
        prst1.executeUpdate();

        //TASK: hesap no:1234 ten hesap no:5678 e 1000$ para transferi olsun.

       try{


            String sql2="UPDATE hesaplar SET bakiye=bakiye+? WHERE hesap_no=?";
            PreparedStatement prst=con.prepareStatement(sql2);
            //1-adım: hesap no:1234 hesabın bakiye güncelleme
            prst.setInt(1,-1000);
            prst.setInt(2,1234);
            prst.executeUpdate();

            //sistemde hata oluştu kabul edelim
            if (true){
                throw new RuntimeException();//hatayı ele aldık
            }

            //2-adım:hesap no:5678 hesabın bakiye güncelleme
            prst.setInt(1,1000);
            prst.setInt(2,5678);
            prst.executeUpdate();//bu sorgu çalışmaz

        }catch(Exception e){
            System.out.println("Sistemde hata oluştu.");

            e.printStackTrace();
        } */

    }
}
