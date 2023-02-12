public class func{
public void getUnionNames(String sqlStr,Connection nuodbConnection,PreparedStatement stmt2){
            stmt2 = nuodbConnection.prepareStatement(sqlStr);
            rs2 = stmt2.executeQuery();
            while (rs2.next()) {
                list.add(rs2.getString(1));
            }
            Assert.assertNotNull(rs2);
            closeAll(rs2, stmt2);
}
}
