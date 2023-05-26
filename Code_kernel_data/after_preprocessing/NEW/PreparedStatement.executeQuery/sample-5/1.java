//1
public class func{
public void testAddToDate(){
         PreparedStatement prep = getPreparedStatement(select);
         prep.setInt(1, 10);
         prep.executeQuery();
         prep.close();
}
}
