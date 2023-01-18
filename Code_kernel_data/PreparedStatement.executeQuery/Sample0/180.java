//179
public class func{
	public void numberOfTiles(long zoomLevel){
            PreparedStatement ps = prepare(
                    cx, format("SELECT COUNT(*) FROM %s WHERE zoom_level=?", TABLE_TILES)).set(zoomLevel).statement();
            ResultSet rs = ps.executeQuery();
            rs.next();
            size = rs.getInt(1);
            rs.close();
}
}
