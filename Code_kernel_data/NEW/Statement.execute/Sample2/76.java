//75
public class func{
	public void dumpTable(Connection conn){
    Statement stmt = conn.createStatement ();
    ResultSet rset = stmt.executeQuery ("select region_id, region_name from regions order by region_id");
    while (rset.next ())
      System.out.println (rset.getInt(1) + " " + rset.getString (2));
    stmt.execute ("delete from regions where region_id > 100");
}
}
