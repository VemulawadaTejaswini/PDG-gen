//32
public class func{
	public void assertSentrySemanticException(Statement statement,String query,String exceptionType){
      statement.execute(query);
      Assert.fail("Expected SQLException for '" + query + "'");
}
}
