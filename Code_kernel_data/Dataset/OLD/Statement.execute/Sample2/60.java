//59
public class func{
	public void setup(Connection conn){
    Statement stmt = conn.createStatement ();
      stmt.execute("delete from departments where department_id >= 300");
}
}
