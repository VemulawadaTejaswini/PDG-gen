//5
public class func{
public void testNegativeBoundLimit(){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        ColumnResolver resolver = FromCompiler.getResolver(statement, pconn);
        StatementContext context = new StatementContext(new PhoenixStatement(pconn), resolver, binds, scan);
        assertNull(LimitCompiler.compile(context, statement));
}
}
