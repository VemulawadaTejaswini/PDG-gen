public class func{
public void parameter2(int a,java.math.BigDecimal b,java.math.BigDecimal c,java.sql.ResultSet[] rs){
        Connection conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement ps = conn.prepareStatement("insert into PT1 values (?, ?, ?)");
        ps.setInt(1, a);
}
}
