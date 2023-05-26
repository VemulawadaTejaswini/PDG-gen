//10
public class func{
public void compileQuery(String query,List<Object> binds){
        Connection conn = DriverManager.getConnection(getUrl(), props);
            PhoenixPreparedStatement statement = conn.prepareStatement(query).unwrap(PhoenixPreparedStatement.class);
}
}
