//15
public class func{
public void before(){
        final Connection connection = dataSource.getConnection();
        final Statement statement = connection.createStatement();
        statement.execute("RUNSCRIPT FROM 'classpath:/backup.sql'");
}
}
