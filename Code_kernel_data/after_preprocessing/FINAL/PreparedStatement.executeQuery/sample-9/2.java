public class func{
public void testSQRTWithUnaryMinusAndPlus(){
      JDBC.assertFullResultSet(ps.executeQuery(), expectedRows, true);
      ps.close();
}
}
