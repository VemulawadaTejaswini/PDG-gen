//22
public class func{
public void getSplitTestRecords(ResultSet[] data1,ResultSet[] data2){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
            PreparedStatement ps1 = conn.prepareStatement("SELECT * FROM PLANET WHERE POSITION <= 2");
            data1[0] = ps1.executeQuery();
}
}
