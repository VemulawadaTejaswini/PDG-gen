public class func{
public void testConnectionUrl(){
        Connection c = DriverManager.getConnection(url, this.username, this.password);
        ResultSet rs = c.createStatement().executeQuery("select user()");
        rs.next();
        String userFromDb = rs.getString(1).split("@")[0];
        assertEquals(this.username, userFromDb);
        rs.close();
}
}
