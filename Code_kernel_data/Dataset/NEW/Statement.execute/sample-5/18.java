//18
public class func{
public void setUp(){
        conn = SqlTools.openConnection("jdbc:h2:mem:test");
        Statement stmt = conn.createStatement();
        stmt.execute(sql);        
}
}
