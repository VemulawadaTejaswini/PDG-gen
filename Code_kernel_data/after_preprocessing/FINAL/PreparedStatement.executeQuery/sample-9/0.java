public class func{
public void testSelectWithUnaryMinusAndPlus(){
      JDBC.assertFullResultSet(ps.executeQuery(), expectedRows, false);
      ps.close();
}
}
