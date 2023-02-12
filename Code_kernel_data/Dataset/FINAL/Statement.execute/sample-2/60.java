public class func{
public void tablesExist(Connection c){
        final Statement stmt = c.createStatement();
            stmt.execute("SELECT count(*) FROM COP_WORKFLOW_INSTANCE");
}
}
