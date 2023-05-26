public class func{
public void main(String[] args){
    Connection con = DriverManager.getConnection("jdbc:hive2:
    Statement stmt = con.createStatement();
    ResultSet res = stmt.executeQuery(sql);
}
}
