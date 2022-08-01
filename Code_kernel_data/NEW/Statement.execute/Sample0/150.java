//149
public class func{
	public void decorateSQL(Statement stmt){
                stmt.execute("CREATE TABLE MB_CLOBTABLE " +
                        "(K INT CONSTRAINT PK PRIMARY KEY, C CLOB(" +
                        LONG_CLOB_LENGTH + "))");
}
}
