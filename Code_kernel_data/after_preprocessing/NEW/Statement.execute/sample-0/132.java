//132
public class func{
public void createTestTable(){
    Statement stat = this.dataSource.getConnection().createStatement();
    stat.execute("CREATE TABLE TEST(" +
      "ID INT PRIMARY KEY, " +
      "COLUMN1 VARCHAR, " +
      "COLUMN2 VARCHAR " +
    ")");
}
}
