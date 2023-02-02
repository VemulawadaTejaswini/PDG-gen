//10
public class func{
public void resultSetWithNull(Connection conn){
        PreparedStatement statement = conn.prepareStatement(
                "select null from system_range(1,1)");
        return statement.executeQuery();
}
}
