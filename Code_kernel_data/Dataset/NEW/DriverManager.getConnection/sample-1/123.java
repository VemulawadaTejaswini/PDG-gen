//123
public class func{
public void spTestBuiltins(){
        c = DriverManager.getConnection("jdbc:default:connection");
        Statement cStmt = c.createStatement();
        ResultSet rs = cStmt.executeQuery(
            "values (user, current_user, current schema, " +
            "        session_user, current_role)");
        JDBC.assertFullResultSet(
            rs,
            new String[][]{{"TEST_DBO", "TEST_DBO", "TEST_DBO", "PHB", null}});
        cStmt.close();
}
}
