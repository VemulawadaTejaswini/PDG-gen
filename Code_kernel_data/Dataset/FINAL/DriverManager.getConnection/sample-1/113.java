public class func{
public void getConnectionH2(){
        final Connection connection = DriverManager.getConnection("jdbc:h2:mem:Log4j", "sa", "");
        final Statement statement = connection.createStatement();
        statement
                .executeUpdate("CREATE TABLE jpaBasicLogEntry ( "
                        + "id INTEGER IDENTITY, timemillis BIGINT, level NVARCHAR(10), loggerName NVARCHAR(255), "
                        + "message NVARCHAR(1024), thrown NVARCHAR(1048576), contextMapJson NVARCHAR(1048576),"
                        + "loggerFQCN NVARCHAR(1024), contextStack NVARCHAR(1048576), marker NVARCHAR(255), source NVARCHAR(2048),"
                        + "threadName NVARCHAR(255)" + " )");
        statement.close();
}
}
