//119
public class func{
public void decorateSQL(Statement stmt){
                stmt.execute("create procedure CREATEARCHIVE(jarName VARCHAR(20)" +
                        " , path VARCHAR(20), dbName VARCHAR(20))" +
                        " LANGUAGE JAVA PARAMETER STYLE JAVA" +
                        " NO SQL" +
                        " EXTERNAL NAME 'org.apache.derbyTesting.functionTests.tests.lang.dbjarUtil.createArchive'");
}
}
