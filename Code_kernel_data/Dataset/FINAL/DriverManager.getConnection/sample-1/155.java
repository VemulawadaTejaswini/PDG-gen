public class func{
public void executeRead(String db,String query){
            Connection conn = DriverManager.getConnection("jdbc:mysql:
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(query);
}
}
