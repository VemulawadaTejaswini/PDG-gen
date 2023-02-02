//3
public class func{
public void testExecuteStatementEmbedded(){
        final Properties props = new Properties();
        props.put("db", gdb);
        final Connection con = DriverManager.getConnection("jdbc:neo4j:instance:db", props);
        runner.executeMultiple(con);
}
}
