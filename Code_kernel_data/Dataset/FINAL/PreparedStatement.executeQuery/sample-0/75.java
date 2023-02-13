public class func{
public void countDatapoints(PrintStream ps,Variations v){
        stmt.setString(1, v.toExactMatchString());
        ResultSet set= stmt.executeQuery();
        if (set.next())
            ps.println("datapoints with variation " + v + ": " + set.getInt(1));
}
}
