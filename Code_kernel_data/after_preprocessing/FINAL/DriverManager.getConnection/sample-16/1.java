public class func{
public void compileStatement(String query,Scan scan,List<Object> binds,Integer limit,Set<Expression> extractedNodes){
        PhoenixConnection pconn = DriverManager.getConnection(getUrl(), TEST_PROPERTIES).unwrap(PhoenixConnection.class);
        ColumnResolver resolver = FromCompiler.getResolver(statement, pconn);
        statement = StatementNormalizer.normalize(statement, resolver);
        StatementContext context = new StatementContext(new PhoenixStatement(pconn), resolver, binds, scan);
        Integer actualLimit = LimitCompiler.compile(context, statement);
        assertEquals(limit, actualLimit);
        GroupBy groupBy = GroupByCompiler.compile(context, statement);
        statement = HavingCompiler.rewrite(context, statement, groupBy);
        WhereCompiler.compileWhereClause(context, statement, extractedNodes);
}
}
