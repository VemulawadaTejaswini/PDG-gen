public class func{
public void createTemplate(String url){
        Connection conn = DriverManager.getConnection(url, "auser", "sa");
        SingleConnectionDataSource dataSource = new SingleConnectionDataSource(conn, false);
        return new JdbcTemplate(dataSource);
}
}
