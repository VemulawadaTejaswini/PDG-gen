public class func{
public void selectFromSpecificSchema(int p1){
    Connection conn = DriverManager.getConnection("jdbc:default:connection");
    PreparedStatement ps = conn.prepareStatement("select * from mamta1.t12RoutineTest");
    ps.executeQuery();
    ps.close();
}
}
