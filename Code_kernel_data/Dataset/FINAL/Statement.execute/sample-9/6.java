public class func{
public void createTable(){
        Statement stmt = con.createStatement();
        stmt.execute("CREATE TABLE table1(col1 varchar(10), col2 varchar(10), col3 varchar(10))");
}
}
