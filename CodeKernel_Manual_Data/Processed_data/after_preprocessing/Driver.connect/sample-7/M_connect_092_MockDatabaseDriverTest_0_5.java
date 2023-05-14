public class A{
	public void testConnectSQLException() {
		try {
			MockDatabaseDriver.getInstance().connect(MockDatabaseDriver.EXCEPTION_URL, new Properties());
			fail("Expected exception.");
		} catch (SQLException ex) {
			assertEquals(MockDatabaseDriver.CONNECT_EXCEPTION_MESSAGE, ex.getMessage());
		}
	}
}