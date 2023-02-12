public class func{
public void getResultSet(){
    m_statement = DriverManager.getConnection("jdbc:default:connection")
        .createStatement();
    return m_statement.executeQuery("SELECT * FROM pg_user WHERE "
        + m_filter);
}
}
