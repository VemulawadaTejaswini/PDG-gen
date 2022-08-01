//76
public class func{
	public void countScalars(PrintStream ps,Variations v){
        stmt.setString(1, v.toExactMatchString());
        ResultSet set= stmt.executeQuery();
        if (set.next())
            ps.println("scalars with variation " + v + ": " + set.getInt(1)); //$NON-NLS-1$ //$NON-NLS-2$
}
}
