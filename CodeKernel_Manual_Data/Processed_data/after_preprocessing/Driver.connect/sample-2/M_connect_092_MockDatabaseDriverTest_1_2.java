public class A{
	public void testConnect() throws SQLException {
		final Connection c = MockConnection.getInstance();
		final Driver d = MockDatabaseDriver.getInstance();
		assertNull(d.connect("d200610151816", new Properties()));
		MockDatabaseDriver.addConnection("jdbc:d200610151819", c);
		assertSame(c, d.connect("jdbc:d200610151819", new Properties()));
		assertSame(MockDatabaseDriver.class, MockDatabaseDriver.getLastDriverUsed());
	}
}