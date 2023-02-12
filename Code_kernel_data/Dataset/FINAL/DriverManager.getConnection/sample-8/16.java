public class func{
public void insertEventsInTable(int numEvents){
        Connection con = DriverManager.getConnection(URL);
        PreparedStatement stmt = con.prepareStatement(insert);
}
}
