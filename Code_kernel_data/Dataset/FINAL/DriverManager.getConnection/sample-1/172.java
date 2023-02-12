public class func{
public void retrieveClosedResult(ResultSet[] closed){
        Connection connect = DriverManager.getConnection(create_url);
        closed[0] = connect.createStatement().executeQuery("VALUES(1)");
        closed[0].close();
}
}
