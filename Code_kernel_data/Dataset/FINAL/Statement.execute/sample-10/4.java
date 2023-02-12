public class func{
public void testConnectionRollback(){
        ResultSet rs = stat.executeQuery("SELECT * FROM TEST");
        assertFalse(rs.next());
        stat.execute("DROP TABLE TEST");
}
}
