public class func{
public void SetOfRecordTest(String selectSQL){
    Connection conn = DriverManager
        .getConnection("jdbc:default:connection");
    m_statement = conn.prepareStatement(selectSQL);
}
}
