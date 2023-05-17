public class func{
public void dumpMessages(){
        java.sql.Connection conn = ((JDBCPersistenceAdapter) service.getPersistenceAdapter()).getDataSource().getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT ID, MSG FROM MYPREFIX_ACTIVEMQ_MSGS");
        ResultSet result = statement.executeQuery();
}
}
