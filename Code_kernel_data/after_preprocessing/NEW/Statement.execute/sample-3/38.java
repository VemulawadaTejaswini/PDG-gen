//38
public class func{
public void drop(Connection connection){
    Statement statement = connection.createStatement();
      statement.execute(" DROP TABLE POLICY_SUMMARY");  
      statement.close();
}
}
