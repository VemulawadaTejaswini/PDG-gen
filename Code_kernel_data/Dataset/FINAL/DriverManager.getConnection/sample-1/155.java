public class func{
public void executeRead(String db,String query){
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db,"root", "");
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(query);
}
}
