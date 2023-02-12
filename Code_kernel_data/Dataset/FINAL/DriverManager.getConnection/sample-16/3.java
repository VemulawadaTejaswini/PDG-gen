public class func{
public void compileStatement(String query){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        ColumnResolver resolver = FromCompiler.getResolver(statement, pconn);
        statement = StatementNormalizer.normalize(statement, resolver);
        StatementContext context = new StatementContext(new PhoenixStatement(pconn), resolver, binds, scan);
        Expression whereClause = WhereCompiler.compile(context, statement);
        return WhereOptimizer.pushKeyExpressionsToScan(context, statement, whereClause);
}
}
