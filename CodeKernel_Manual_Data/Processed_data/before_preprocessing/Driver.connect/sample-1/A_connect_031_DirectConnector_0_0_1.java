public class A{
	public Connection connect(Properties properties) throws DatabaseException {
		//...
		return this.instantiateDriver(this.loadDriver()).connect(this.getConnectionString(), properties);
	}
}