//229
public class func{
public void createPostgresConnection(){
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/glowroot",
                "glowroot", "glowroot");
        insertRecords(connection, "bytea", "text");
}
}
