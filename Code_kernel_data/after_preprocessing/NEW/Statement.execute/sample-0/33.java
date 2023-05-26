//33
public class func{
public void assertAuthzExecHookException(Statement statement,String query,String expectedMsg){
      statement.execute(query);
      Assert.fail("Expected SQLException for '" + query + "'");
}
}
