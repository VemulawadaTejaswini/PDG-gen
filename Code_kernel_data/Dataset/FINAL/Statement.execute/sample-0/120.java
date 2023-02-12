public class func{
public void testExecuteWithSelect(){
        Statement stat = getProxyConnectionForSelect().createStatement();
        boolean result = stat.execute("SELECT name FROM foo");
}
}
