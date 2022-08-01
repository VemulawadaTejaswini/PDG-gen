//178
public class func{
	public void setUp(){
      con = DriverManager.getConnection("jdbc:derby:memory:" + dbName);
      context = DSL.using(con, SQLDialect.DERBY);
      jinq = JinqJooqContext.using(context, App.APP);
}
}
