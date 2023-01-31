//212
public class func{
	public void JdbcNeo4JWriter(JdbcNeo4JDeepJobConfig config){
        this.conn = DriverManager.getConnection(jdbcNeo4JDeepJobConfig.getConnectionUrl(),
                jdbcNeo4JDeepJobConfig.getUsername(),
                jdbcNeo4JDeepJobConfig.getPassword());
}
}
