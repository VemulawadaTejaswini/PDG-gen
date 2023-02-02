//103
public class func{
	public void countDimension(PrintStream ps,Dim dim){
        stmt.setInt(1, dim.getId());
        ResultSet set= stmt.executeQuery();
        if (set.next())
            ps.println("dimension " + dim + ": " + set.getInt(1)); //$NON-NLS-1$ //$NON-NLS-2$
}
}
