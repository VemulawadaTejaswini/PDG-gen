public class func{
public void prepareDatabase(String sqlFile,DbImportConfiguration dbImportConfiguration){
    for (String sql : SQLReader.statements(sqlUrl, ";")) {
      stmt.execute(sql);
    }
}
}
