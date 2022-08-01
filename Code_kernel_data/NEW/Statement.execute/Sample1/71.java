//70
public class func{
	public void setUp(){
        Statement stmt = createStatement();
        stmt.execute("insert into app.t1 values (1, 'one'), "
            + "(2, 'two'), (4, 'four')");
        stmt.close();
}
}
