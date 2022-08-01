//78
public class func{
	public void testStatementCopyIn(){
        Statement stmt = con.createStatement();
            stmt.execute("COPY copytest FROM STDIN");
        stmt.close();
}
}
