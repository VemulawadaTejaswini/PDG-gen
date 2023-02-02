//82
public class func{
public void showCompareData(PreparedStatement psS,String[] expectedValues){
    ResultSet rs = psS.executeQuery();
    while (rs.next()) {
                        String actualValue = rs.getInt(1) + " " + showData(rs.getBytes(2)) + "  " + rs.getInt(3) + " " + showData(rs.getBytes(4));
      assertEquals(expectedValues[i],actualValue);
      i++;
    }
    rs.close();
}
}
