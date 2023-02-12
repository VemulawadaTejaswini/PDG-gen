public class func{
public void executeStatement(String sql){
      Logger.info(this, "Executing " + sql);
      boolean ret=stmt.execute(sql);
      stmt.close();
}
}
