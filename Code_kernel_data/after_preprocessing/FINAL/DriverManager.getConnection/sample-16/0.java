public class func{
public void testTypeMismatchBoundLimit(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        ColumnResolver resolver = FromCompiler.getResolver(statement, pconn);
        StatementContext context = new StatementContext(new PhoenixStatement(pconn), resolver, binds, scan);
            LimitCompiler.compile(context, statement);
}
}
