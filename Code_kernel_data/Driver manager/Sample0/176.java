//175
public class func{
	public void init(){
                create = DSL.using(DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD), JOOQ_DIALECT);
}
}
