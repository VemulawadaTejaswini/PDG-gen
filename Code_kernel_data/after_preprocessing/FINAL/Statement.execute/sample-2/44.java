public class func{
public void fillTestTable5(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO " + TEST_TABLE5 + " VALUES(3, '4')");
}
}
