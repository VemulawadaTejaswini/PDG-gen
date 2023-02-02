//169
public class func{
public void executeStatement(String sql,Connection con){
      Logger.info(this, "Executing " + sql);
      boolean ret=stmt.execute(sql);
      Logger.info(this, "Finished Executing " + sql);
}
}
