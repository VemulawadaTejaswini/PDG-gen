public class func{
public void main(String args[]){
        Connection c = DriverManager.getConnection("jdbc:mysql:
        Statement statement = c.createStatement();
        statement.executeUpdate("create database if not exists employees");
        statement.close();
}
}
