//43
public class func{
	public void setupDatabase(){
    basicDataSource.setDriverClassName(jdbcDriver.class.getName());
    basicDataSource.setUrl("jdbc:hsqldb:mem:db");
    basicDataSource.setUsername("sa");
    basicDataSource.setPassword("");
    Connection connection = basicDataSource.getConnection();
    Statement statement = connection.createStatement();
    statement.execute("create table licenses (license varchar(512))");
}
}
