//118
public class func{
	public void doGet(HttpServletRequest req,HttpServletResponse resp){
            con = DriverManager.getConnection(MicroTestCase.CONNECTION_STRING);
            Statement stmt = con.createStatement();
            stmt.execute("select * from Users where name=" + name);     /* BAD */
}
}
