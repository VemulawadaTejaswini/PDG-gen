public class func{
public void testTypeMismatchInCase(){
            Connection conn = DriverManager.getConnection(getUrl(), props);
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, "00D300000000XHP");
                statement.executeQuery();
}
}
