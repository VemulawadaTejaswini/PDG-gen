public class func{
public void getBufferedImage(int level,Connection con){
        PreparedStatement ps = con.prepareStatement(stmt);
        ResultSet rs = ps.executeQuery();
        rs.next();
        byte[] bytes = rs.getBytes(1);
        BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
        rs.close();
}
}
