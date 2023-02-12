public class func{
public void calledNestedFk(){
            DriverManager.getConnection("jdbc:default:connection");
        final Statement cStmt = c.createStatement();
        cStmt.executeUpdate("insert into t select i*2, j*2 from t");
}
}
