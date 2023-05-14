public class A{
	public Connection connect(Properties properties) throws DatabaseException {
		try {
			return this.instantiateDriver(this.loadDriver()).connect(this.getConnectionString(), properties);
		} catch (SQLException exception) {
			throw DatabaseException.sqlException(exception);
		}
	}
}