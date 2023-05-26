public class func{
public void dropTab1(final Connection c){
        final Statement stmt = c.createStatement();
            stmt.execute("drop table tab1");
}
}
