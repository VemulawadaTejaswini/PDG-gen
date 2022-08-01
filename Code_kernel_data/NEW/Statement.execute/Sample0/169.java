//168
public class func{
	public void decorateSQL(Statement s){
                s.execute("CREATE FUNCTION  PADSTRING (DATA VARCHAR(32000), "
                        + "LENGTH INTEGER) RETURNS VARCHAR(32000) EXTERNAL NAME " +
                        "'org.apache.derbyTesting.functionTests.util.Formatters" +
                ".padString' LANGUAGE JAVA PARAMETER STYLE JAVA");
}
}
