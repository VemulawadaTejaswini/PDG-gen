public class func{
public void setConn(String dbPassword){
      this.conn=DriverManager.getConnection("jdbc:mysql:
      if (!this.conn.isValid(0)) {
        s_logger.error("Connection to DB failed to establish");
      }
}
}
