//4
public class func{
public void compileStatement(String query,List<Object> binds){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        ColumnResolver resolver = FromCompiler.getResolver(statement, pconn);
        statement = StatementNormalizer.normalize(statement, resolver);
        context = new StatementContext(new PhoenixStatement(pconn), resolver, binds, scan);
        GroupBy groupBy = GroupByCompiler.compile(context, statement);
        statement = HavingCompiler.rewrite(context, statement, groupBy);
        Expression having = HavingCompiler.compile(context, statement, groupBy);
        Expression where = WhereCompiler.compile(context, statement);
        where = WhereOptimizer.pushKeyExpressionsToScan(context, statement, where);
        return new Expressions(where,having);
}
}
