//66
public class func{
public void fillParentTable(Connection conn){
        Statement statement = conn.createStatement();
        statement
                .execute("INSERT INTO " + PARENT_TABLE + " VALUES(3, 'test3')");
}
}
