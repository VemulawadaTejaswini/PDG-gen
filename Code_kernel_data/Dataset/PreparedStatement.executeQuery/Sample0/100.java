//99
public class func{
	public void closestZoom(long zoomLevel){
            PreparedStatement ps = prepare(
                    cx, format("SELECT zoom_level FROM %s ORDER BY abs(zoom_level - ?)", TABLE_TILES)).set(zoomLevel).statement();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                zoom = rs.getLong(1);
            }
            rs.close();
}
}
