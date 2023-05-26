public class func{
public void f_testExecuteQueryWithNoDynamicResultSets(){
        Connection connect = DriverManager.getConnection(create_url);
        Statement stmt = connect.createStatement();
            stmt.executeQuery("CALL RETRIEVE_DYNAMIC_RESULTS(0)");
}
}
