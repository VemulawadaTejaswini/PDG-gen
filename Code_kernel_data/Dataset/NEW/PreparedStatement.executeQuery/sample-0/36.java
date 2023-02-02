//36
public class func{
public void getAgreProductList(String sqlStr,Connection nuodbConnection,PreparedStatement stmt2){
            stmt2 = nuodbConnection.prepareStatement(sqlStr);
            rs2 = stmt2.executeQuery();
            while (rs2.next()) {
                map.put(rs2.getString(2), rs2.getInt(1));
            }
            Assert.assertNotNull(rs2);
            closeAll(rs2, stmt2);
}
}
