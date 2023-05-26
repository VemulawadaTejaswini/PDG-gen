public class func{
public void createTable(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_PRE_STMT_TEST (ID SMALLINT, NAME VARCHAR(50), BIRTHDATE TIMESTAMP)");
        stmt.close();
}
}
