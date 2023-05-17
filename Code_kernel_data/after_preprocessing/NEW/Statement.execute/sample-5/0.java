//0
public class func{
public void tearDown(SQLExecutor sqlExec){
            stmt = conn.createStatement();
            stmt.execute(dropTableSql);
            JdbcUtils.close(stmt);
        conn.close();
}
}
