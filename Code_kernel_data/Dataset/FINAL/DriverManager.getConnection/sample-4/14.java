public class func{
public void getConnection(){
    if (conn == null) {

      try {
        Connection con = DriverManager.getConnection(HOST_URL,
            DATABASE_USER, DATABASE_PASSWORD);
        conn = con;
        return con;
      } catch (SQLException e) {
        LOG.error("Get SQLException during setting up connection: " + StringUtils.stringifyException(e));
        return null;
      }
    }
}
}
