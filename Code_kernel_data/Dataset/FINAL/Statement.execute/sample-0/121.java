public class func{
public void verifyUDFNotAllowed(Statement stmt,String tableName,String udfcall,String udfname){
      stmt.execute("SELECT " + udfcall + " from " + tableName);
}
}
