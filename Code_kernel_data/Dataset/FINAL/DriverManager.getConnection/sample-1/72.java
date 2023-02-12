public class func{
public void testLocalIndexCreationWithDefaultFamilyOption(){
        Connection conn1 = DriverManager.getConnection(getUrl());
            Statement statement = conn1.createStatement();
            statement.execute("upsert into example values(2,'fn1','ln1')");
            ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM my_idx");
            assertTrue(rs.next());
            conn1.close();
}
}
