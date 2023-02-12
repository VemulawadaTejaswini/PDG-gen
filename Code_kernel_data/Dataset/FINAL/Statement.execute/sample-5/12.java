public class func{
public void postConnect(){
        Statement stmt = conn.createStatement();
        stmt.execute(query);
}
}
