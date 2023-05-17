public class func{
public void getResultSet(Connection conn,String query){
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
}
}
