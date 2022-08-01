//67
public class func{
	public void getNumOfEventsInStore(){
        con = DriverManager.getConnection(URL);
        Statement stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery(countQuery);
        resultSet.next();
        return resultSet.getInt(1);
}
}
