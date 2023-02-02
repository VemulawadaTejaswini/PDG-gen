//123
public class func{
public void showData(PreparedStatement psS,int id,byte[] original,String expectedValue){
    psS.setInt(2, id + 10);
    ResultSet rs = psS.executeQuery();
    while (rs.next()) {
      String actualValue = "ORG " + showData(original) + "";
      actualValue += "CHR " + showData(rs.getBytes(1)) + "";
      actualValue += "VAR " + showData(rs.getBytes(2)) + "";
      actualValue += "LVC " + showData(rs.getBytes(3)) + "";
      actualValue += "BLOB " + showData(rs.getBytes(4));
      assertEquals(expectedValue, actualValue);
    }
    rs.close();
}
}
