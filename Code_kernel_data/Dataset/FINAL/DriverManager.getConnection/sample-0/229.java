public class func{
public void createPostgresConnection(){
        Connection connection = DriverManager.getConnection("jdbc:postgresql:
                "glowroot", "glowroot");
        insertRecords(connection, "bytea", "text");
}
}
