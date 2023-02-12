public class func{
public void createTabs(Statement statement,String dbName,String tableNames[]){
    for (String tabName : tableNames) {
      statement.execute("DROP TABLE IF EXISTS " + dbName + "." + tabName);
      statement.execute("create table " + dbName + "." + tabName
          + " (under_col int comment 'the under column', value string)");
    }
}
}
