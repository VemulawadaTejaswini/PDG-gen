//179
public class func{
	public void beforeClass(){
    ctx = DSL.using(DriverManager.getConnection("jdbc:h2:mem:test"), SQLDialect.H2);
    ctx.execute("INSERT INTO orders values (456, 789, '123 Main Street', 'SF', null)");
}
}
