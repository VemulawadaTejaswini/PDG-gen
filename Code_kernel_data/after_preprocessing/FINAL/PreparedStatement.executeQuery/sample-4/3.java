public class func{
public void dumpMessages(){
        java.sql.Connection conn = ((JDBCPersistenceAdapter) broker.getPersistenceAdapter()).getDataSource().getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT ID, MSG FROM ACTIVEMQ_MSGS");
        ResultSet result = statement.executeQuery();
}
}
