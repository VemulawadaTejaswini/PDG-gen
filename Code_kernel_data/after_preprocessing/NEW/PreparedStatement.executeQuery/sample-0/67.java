//67
public class func{
public void countSamples(PrintStream ps,Variations v){
        stmt.setString(1, v.toExactMatchString());
        ResultSet set= stmt.executeQuery();
        if (set.next())
            n= set.getInt(1);
        ps.println("samples with variation " + v + ": " + n); //$NON-NLS-1$ //$NON-NLS-2$
}
}
