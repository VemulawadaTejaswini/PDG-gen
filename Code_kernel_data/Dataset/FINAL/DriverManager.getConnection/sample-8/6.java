public class func{
public void insertNumeric(){
        Properties from = new Properties();
        from.put("characterEncoding", "utf8");
        Connection conn = DriverManager.getConnection("jdbc:mysql:
        PreparedStatement pst = conn.prepareStatement("insert into unsignednumeric(id,id1,id2,id3) values (?,?,?,?)");
        pst.setLong(2, Integer.MAX_VALUE);
}
}
