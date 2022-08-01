//77
public class func{
	public void count(PrintStream ps){
        PreparedStatement stmt= fConnection.prepareStatement("select count(*) from SCALAR where DATAPOINT_ID not in (select DATAPOINT.ID from DATAPOINT)"); //$NON-NLS-1$
        ResultSet set= stmt.executeQuery();
        if (set.next())
            ps.println("count: " + set.getInt(1)); //$NON-NLS-1$
        set.close();
}
}
