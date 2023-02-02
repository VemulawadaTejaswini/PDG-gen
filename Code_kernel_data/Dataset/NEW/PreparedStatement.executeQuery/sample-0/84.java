//84
public class func{
public void countAllDimensions(PrintStream ps){
        PreparedStatement stmt= fConnection.prepareStatement("select distinct DIM_ID from SCALAR"); //$NON-NLS-1$
        ResultSet set= stmt.executeQuery();
        while (set.next()) {
            Dim dimension= Dim.getDimension(set.getInt(1));
            if (dimension != null)
                countDimension(ps, dimension);
        }
}
}
