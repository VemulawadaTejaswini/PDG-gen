//80
public class func{
public void deleteSqlByID(int sqlmap_file_id){
      stmt = conn.createStatement();
      stmt.execute(command);
      int rows=stmt.getUpdateCount();
      stmt.close();
      logger.info(rows+" is deleted.");
}
}
