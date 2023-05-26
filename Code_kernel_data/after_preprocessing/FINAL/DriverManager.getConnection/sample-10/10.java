public class func{
public void test(){
        Connection cx = DriverManager.getConnection(
            get("connectURL").getDefaultModelObjectAsString(), 
            get("username").getDefaultModelObjectAsString(), 
            get("password").getDefaultModelObjectAsString());
        cx.close();
}
}
