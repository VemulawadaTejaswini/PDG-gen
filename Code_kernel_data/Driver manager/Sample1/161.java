//160
public class func{
	public void deleteFromATable(){
    Connection con = DriverManager.getConnection("jdbc:default:connection");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("SELECT c1 from new org.apache.derby.catalog.TriggerOldTransitionRows() AS EQ");
}
}
