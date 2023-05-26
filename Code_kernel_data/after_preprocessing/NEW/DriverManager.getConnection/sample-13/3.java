//3
public class func{
public void getConnection(Environment env,String url,@Nullable Properties properties){
        return new PSqlConnection(env, DriverManager.getConnection("jdbc:" + url, properties == null ? new Properties() : properties));
}
}
