public class func{
public void testPreparedStatement(){
        Connection connection = proxyDataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement("select * from emp where id = ?");
        statement.setInt(1, 2);
        statement.executeQuery();
}
}
