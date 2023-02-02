//612
public class func{
public void CandlepinLiquibaseResource(String changelogFile){
            String connectionUrl = getJdbcUrl("testing");
            Connection jdbcConnection = DriverManager.getConnection(connectionUrl, "sa", "");
            DatabaseConnection conn = new JdbcConnection(jdbcConnection);
}
}
