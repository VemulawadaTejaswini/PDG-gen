//54
public class func{
public void createSQLJSchema(){
    Statement stmt = m_connection.createStatement();
    stmt.execute("GRANT USAGE ON SCHEMA sqlj TO public");
    stmt.close();
}
}
