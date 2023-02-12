public class func{
public void exStatement(String query){
    Statement stmt = con.createStatement();
    stmt.execute(query);
}
}
