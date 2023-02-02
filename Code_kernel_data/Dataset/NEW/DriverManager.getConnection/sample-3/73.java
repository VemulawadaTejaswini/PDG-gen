//73
public class func{
public void testParameterUnbound(){
            Connection conn = DriverManager.getConnection(getUrl(), props);
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, "00D300000000XHP");
                statement.executeQuery();
}
}
