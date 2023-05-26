//22
public class func{
public void getConnection(){
        if (conn == null) {
            final Connection originalConn = DriverManager.getConnection("jdbc:log4jdbc:hsqldb:mem:test", "sa", "");
            conn = Mockito.spy(originalConn);
            Mockito.doAnswer(new Answer<PreparedStatement>() {
                @Override
                public PreparedStatement answer(InvocationOnMock invocation)
                        throws Throwable {
                    String originalSQL = (String) invocation.getArguments()[0];
                    String replacedSQL = originalSQL.replaceAll("(\\S+) ~ \\?", "regexp_matches($1, ?)");
                    replacedSQL = replacedSQL.replaceAll("(\\S+) !~ \\?", "regexp_matches($1, ?) = FALSE");
                    return originalConn.prepareStatement(replacedSQL);
                }
            }).when(conn).prepareStatement(Mockito.anyString());
            executeDDL(conn, "drop schema public cascade;");
        }
}
}
