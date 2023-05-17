public class func{
public void setupTable(String tableName){
    Statement statement = localStatement.get();
    statement.execute("CREATE TABLE " + tableName
      + " (under_col INT COMMENT 'the under column', value STRING)"
      + " COMMENT ' test table'");
}
}
