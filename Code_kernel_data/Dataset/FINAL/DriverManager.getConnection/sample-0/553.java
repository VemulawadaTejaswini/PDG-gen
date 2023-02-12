public class func{
public void f_testExecuteQueryWithNoDynamicResultSets_callable(){
        Connection connect = DriverManager.getConnection(create_url);
        CallableStatement cs = connect.prepareCall("CALL RETRIEVE_DYNAMIC_RESULTS(?)");
        cs.setInt(1, 0);
            cs.executeQuery();
}
}
