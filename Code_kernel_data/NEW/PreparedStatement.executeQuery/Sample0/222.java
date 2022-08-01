//221
public class func{
	public void count(final String sql){
        LOG.debug("SQL: " + sql);
            statement = connection.prepareStatement(sql);
            final ResultSet result = statement.executeQuery();
            result.next();
            final int count = result.getInt(1);
}
}
