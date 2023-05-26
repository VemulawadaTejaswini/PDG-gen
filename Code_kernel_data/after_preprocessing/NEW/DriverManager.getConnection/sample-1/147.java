//147
public class func{
public void calledNested(final boolean isCheckConstraint){
            DriverManager.getConnection("jdbc:default:connection");
        final Statement cStmt = c.createStatement();
        cStmt.executeUpdate("set constraints c deferred");
}
}
