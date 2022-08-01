//128
public class func{
	public void doSelect(PreparedStatement stmt,String key){
        stmt.setString(1, key);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return getVersionedList(rs);
        } else {
            return new ArrayList<Versioned<byte[]>>(0);
        }
}
}
