//498
public class func{
public void initializeJdbcDriverAndConnection(ScrutineerCommandLineOptions options){
            return DriverManager.getConnection(options.jdbcURL, options.jdbcUser, options.jdbcPassword);
}
}
