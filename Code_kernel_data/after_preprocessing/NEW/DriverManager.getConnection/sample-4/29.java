//29
public class func{
public void getTestEnvConnection(){
    if (this.conn == null) {
      this.conn =
          DriverManager.getConnection(OracleUtils.CONNECT_STRING,
              OracleUtils.ORACLE_USER_NAME, OracleUtils.ORACLE_USER_PASS);
      this.conn.setAutoCommit(false);
    }
}
}
