//425
public class func{
public void shutdownEmbeddedDB(String username,String password){
            DriverManager.getConnection("jdbc:derby:;shutdown=true",
                                        username,
                                        password);
}
}
