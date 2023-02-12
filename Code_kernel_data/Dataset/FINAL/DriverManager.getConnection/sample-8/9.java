public class func{
public void getQueryPlan(String query,List<Object> binds){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            PhoenixPreparedStatement statement = conn.prepareStatement(query).unwrap(PhoenixPreparedStatement.class);
}
}
