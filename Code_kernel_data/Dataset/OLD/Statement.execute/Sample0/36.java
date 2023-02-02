//35
public class func{
	public void assertAuthzException(Statement statement,String query){
      statement.execute(query);
      Assert.fail("Expected SQLException for '" + query + "'");
}
}
