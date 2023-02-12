public class func{
public void dumpScenarios(PrintStream ps,String pattern){
        PreparedStatement stmt= fConnection.prepareStatement("select NAME from SCENARIO where NAME like ? order by NAME"); //$NON-NLS-1$
        stmt.setString(1, pattern);
        ResultSet rs= stmt.executeQuery();
        while (rs.next())
            ps.println(rs.getString(1));
        rs.close();
}
}
