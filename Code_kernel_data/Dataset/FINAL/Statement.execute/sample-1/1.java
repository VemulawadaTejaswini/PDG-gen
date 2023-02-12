public class func{
public void executeWhatever(String sql){
                        Statement stmt = con.createStatement();
                        stmt.execute(sql);
                        stmt.close();
}
}
