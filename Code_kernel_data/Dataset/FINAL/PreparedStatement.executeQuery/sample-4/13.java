public class func{
public void getSplitTestRecords(ResultSet[] data1,ResultSet[] data2){
            PreparedStatement ps2 = conn.prepareStatement("SELECT * FROM PLANET WHERE POSITION > 2");
            data2[0] = ps2.executeQuery();
}
}
