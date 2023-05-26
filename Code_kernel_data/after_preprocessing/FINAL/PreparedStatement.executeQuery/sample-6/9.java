public class func{
public void getAccountExists(String login){
    Connection con = DatabaseConnection.getConnection();
      PreparedStatement ps = con.prepareStatement("SELECT name FROM accounts WHERE name = ?");
      ps.setString(1, login);
      ResultSet rs = ps.executeQuery();
      if (rs.first()) {
        accountExists = true;
      }
}
}
