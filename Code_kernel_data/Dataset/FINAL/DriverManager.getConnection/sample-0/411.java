public class func{
public void open(){
        connection = DriverManager.getConnection("jdbc:h2:file:" + getFile().getAbsolutePath());
}
}
