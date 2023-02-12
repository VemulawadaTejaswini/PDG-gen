public class func{
public void countAll(){
    PreparedStatement stmt = connection.prepareStatement("SELECT COUNT(*) FROM " + TABLE_NAME);
    ResultSet rs = stmt.executeQuery();
    rs.next();
    int number = rs.getInt(1);
    rs.close();
}
}
