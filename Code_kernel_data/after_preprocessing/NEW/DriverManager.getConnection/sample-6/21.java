//21
public class func{
public void createConnection(boolean autoCommit){
        Connection connection = DriverManager.getConnection("jdbc:postgresql://" + m_dbSvr + ":5432/"+m_dbName, m_dbUser, m_dbPass);
        connection.setAutoCommit(autoCommit);
}
}
