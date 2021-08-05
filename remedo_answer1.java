import java.sql.*;

class Main {
  public static void main(String args[]) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://mysql.remedoapp.com/remedo-database", "remedo", "mypass");
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(
          "select u.user_id, u.address , t.total_invoice_amount, t.invoice_amount_paid, t.remedo_commission from users u join transactions t ON u.user_id = t.user_id where u.user_id = 'u1'");
      while (rs.next())
        System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getDouble(3)  + "  " + rs.getDouble(4) + " " + rs.getDouble(5));
      con.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}