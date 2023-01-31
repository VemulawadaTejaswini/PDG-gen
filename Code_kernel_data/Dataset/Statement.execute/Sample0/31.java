//30
public class func{
	public void testSelectNoGenKeys(){
        Statement stmt = createStatement();
        stmt.execute("select * from tab1", Statement.NO_GENERATED_KEYS);
        assertNull("Expected NULL ResultSet after stmt.execute()", stmt
                .getGeneratedKeys());
}
}
