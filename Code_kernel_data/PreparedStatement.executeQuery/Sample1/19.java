//18
public class func{
	public void select(String sql,Class<T> clazz){
            sql = sql.replaceAll("\\{namespace\\}", tableNamespace);
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            throw new RuntimeException("Could no run sql: " + sql, ex);
}
}
