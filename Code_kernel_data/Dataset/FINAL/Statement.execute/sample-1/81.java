public class func{
public void setUp(){
            Statement s = createStatement();
            s.execute("CREATE FUNCTION  PADSTRING (DATA VARCHAR(32000), "
                    + "LENGTH INTEGER) RETURNS VARCHAR(32000) EXTERNAL NAME "
                    + "'org.apache.derbyTesting.functionTests.util.Formatters"
                    + ".padString' LANGUAGE JAVA PARAMETER STYLE JAVA");
            createLockTableQueryEntries(s);
            s.close();
}
}
