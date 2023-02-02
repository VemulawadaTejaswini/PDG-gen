//3
public class func{
public void setConn(String dbPassword){
      this.conn=DriverManager.getConnection("jdbc:mysql://" + param.get("db") + "/cloud", "root", dbPassword);
      if (!this.conn.isValid(0)) {
        s_logger.error("Connection to DB failed to establish");
      }
}
}
