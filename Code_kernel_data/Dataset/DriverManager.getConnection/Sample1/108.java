//107
public class func{
	public void main(String args[]){
        Connection c = DriverManager.getConnection("jdbc:mysql://" + hostname + ":" + port + "/mysql", username, password);
        Statement statement = c.createStatement();
        statement.executeUpdate("create database if not exists employees");
        statement.close();
}
}
