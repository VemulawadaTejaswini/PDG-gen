//9
public class func{
public void insertAuthor(int id,String username,String password,String email){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
      PreparedStatement ps = conn.prepareStatement("INSERT INTO author (id, username, password, email) VALUES (?,?,?,?)");
      ps.setInt(1, id);
      ps.setString(4, email);
      ps.executeUpdate();
}
}
