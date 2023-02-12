public class func{
public void init(Partition p){
        conn = DriverManager.getConnection(jdbcNeo4JDeepJobConfig.getConnectionUrl(),
                jdbcNeo4JDeepJobConfig.getUsername(),
                jdbcNeo4JDeepJobConfig.getPassword());
        Statement statement = conn.createStatement();
}
}
