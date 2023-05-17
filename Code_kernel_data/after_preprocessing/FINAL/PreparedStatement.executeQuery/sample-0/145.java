public class func{
public void firstInt(PreparedStatement stmt){
    ResultSet rs = stmt.executeQuery();
    int i = rs.next() ? rs.getInt(1) : Integer.MIN_VALUE;
}
}
