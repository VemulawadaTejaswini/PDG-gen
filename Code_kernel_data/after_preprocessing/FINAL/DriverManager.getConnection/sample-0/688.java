public class func{
public void installRoutines(){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    TestRoutines.installRoutines(conn);
}
}
