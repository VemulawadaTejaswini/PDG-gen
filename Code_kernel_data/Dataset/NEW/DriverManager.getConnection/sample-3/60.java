//60
public class func{
public void testSelectStarOnGroupBy(){
            Connection conn = DriverManager.getConnection(getUrl(), props);
                PreparedStatement statement = conn.prepareStatement(query);
                statement.executeQuery();
}
}
