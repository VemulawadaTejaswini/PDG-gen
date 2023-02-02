//13
public class func{
public void insertRowsInTable(String tableName,long numRows){
        Connection conn = DriverManager.getConnection(getUrl());
        PreparedStatement stmt = conn.prepareStatement(dml);
}
}
