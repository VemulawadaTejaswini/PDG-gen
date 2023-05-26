public class func{
public void dropInMemoryDb(){
        StringBuffer sb = constructUrl().append(";drop=true");
            DriverManager.getConnection(sb.toString());
}
}
