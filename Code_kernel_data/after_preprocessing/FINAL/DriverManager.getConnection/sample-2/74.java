public class func{
public void main2(String[] args){
    Connection conn = DriverManager.getConnection(
        "jdbc:h2:tcp:
    Statement stmt = conn.createStatement();
    stmt.executeUpdate("INSERT INTO my_table(name) VALUES('zhh')");
    ResultSet rs = stmt.executeQuery("SELECT name FROM my_table");
    rs.next();
    System.out.println(rs.getString(1));
}
}
