public class func{
public void verifyPatchTableNotLocked(String database){
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:" + database, "sa", "");
        PreparedStatement stmt = conn.prepareStatement("SELECT patch_in_progress FROM patches WHERE system_name = ? AND ( patch_in_progress <> 'F' OR patch_level in ( SELECT MAX(patch_level) FROM patches WHERE system_name = ? ))");
        stmt.setString(2, database);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        assertEquals("F", rs.getString("patch_in_progress"));
        SqlUtil.close(conn, stmt, rs);
}
}
