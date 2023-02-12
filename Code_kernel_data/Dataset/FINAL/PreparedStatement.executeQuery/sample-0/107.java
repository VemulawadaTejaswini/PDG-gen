public class func{
public void minColumn(long zoomLevel){
            PreparedStatement ps = prepare(
                    cx, format("SELECT MIN(tile_column) FROM %s WHERE zoom_level=?", TABLE_TILES)).set(zoomLevel).statement();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                size = rs.getLong(1);
            }
            rs.close();
}
}
