public class func{
public void createOracleConnection(){
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@
                "glowroot", "glowroot");
        insertRecords(connection);
}
}
