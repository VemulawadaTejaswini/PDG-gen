public class func{
public void getResultSet(){
    m_statement = DriverManager.getConnection("jdbc:default:connection")
        .prepareStatement("SELECT * FROM propertyExample()");
    return m_statement.executeQuery();
}
}
