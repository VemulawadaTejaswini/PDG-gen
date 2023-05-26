//4
public class func{
public void testCallTablePrepared(){
    PreparedStatement prep = conn.prepareStatement("call table(x int = (1))");
    prep.executeQuery();
}
}
