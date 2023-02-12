public class func{
public void Tester(Connection conn){
    Statement stmt = conn.createStatement();
    stmt.execute("SET search_path TO javatest,public");
    stmt.close();
}
}
