//2
public class func{
public void expectNullResult(PreparedStatement ps){
        JDBC.assertSingleValueResultSet(ps.executeQuery(), null);
}
}
