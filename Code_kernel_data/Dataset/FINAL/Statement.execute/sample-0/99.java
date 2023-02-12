public class func{
public void exec(final AbstractClassMetaData cmd,final Statement statement){
        final String sql = buildSqlToExec(cmd);
        return statement.execute(sql);
}
}
