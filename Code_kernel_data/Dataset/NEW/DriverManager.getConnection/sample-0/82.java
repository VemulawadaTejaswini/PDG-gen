//82
public class func{
public void JdbcWriter(JdbcDeepJobConfig jdbcDeepJobConfig){
        Class.forName(jdbcDeepJobConfig.getDriverClass());
        this.conn = DriverManager.getConnection(jdbcDeepJobConfig.getConnectionUrl(),
                jdbcDeepJobConfig.getUsername(),
                jdbcDeepJobConfig.getPassword());
}
}
