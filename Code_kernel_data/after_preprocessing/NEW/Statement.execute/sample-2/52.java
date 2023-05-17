//52
public class func{
public void forceQuery(Connection c,String query){
            Statement stmt = c.createStatement();
            stmt.execute(query);
}
}
