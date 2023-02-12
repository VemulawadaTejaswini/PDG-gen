public class func{
public void geH2Connection(){
        return DriverManager.getConnection("jdbc:h2:mem:my_test;", "sa", "");
}
}
