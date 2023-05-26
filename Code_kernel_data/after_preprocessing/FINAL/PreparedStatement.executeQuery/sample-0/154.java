public class func{
public void doWork(){
        ps.setInt(1, r.nextInt(tableSize));
        ResultSet rs = ps.executeQuery();
        rs.next();
        rs.getInt(1);
        fetchTextColumn(rs, 2);
        rs.close();
}
}
