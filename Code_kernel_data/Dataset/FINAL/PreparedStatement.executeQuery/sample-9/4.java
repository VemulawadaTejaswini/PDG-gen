public class func{
public void testBETWEENWithUnaryMinusAndPlus(){
      JDBC.assertFullResultSet(ps.executeQuery(), expectedRows, false);
      ps.close();
}
}
