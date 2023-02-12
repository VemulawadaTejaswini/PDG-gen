public class func{
public void testCallTablePrepared(Connection conn){
        PreparedStatement prep = conn.prepareStatement("call table(x int = (1))");
        prep.executeQuery();
}
}
