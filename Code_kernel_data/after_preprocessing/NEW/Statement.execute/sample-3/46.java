//46
public class func{
public void createExportTableFromTemplate(Connection connection,OracleTable newTable,String tableStorageClause,OracleTable templateTable,boolean noLogging){
    Statement statement = connection.createStatement();
    statement.execute(sql);
    statement.close();
}
}
