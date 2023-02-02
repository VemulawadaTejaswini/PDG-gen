//6
public class func{
public void testServerMode(){
            SqlRepositoryConfiguration config = sqlFactory.getSqlConfiguration();
            Class.forName(config.getDriverClassName());
            connection = DriverManager.getConnection(config.getJdbcUrl(),
                    config.getJdbcUsername(), config.getJdbcPassword());
            AssertJUnit.assertNotNull(connection);
            if (connection != null) {
                connection.close();
            }
}
}
