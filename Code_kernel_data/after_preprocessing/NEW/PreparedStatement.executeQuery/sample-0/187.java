//187
public class func{
public void executeScalar(PreparedStatement ps,Long defaultValue){
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
            closeQuietly(rs);
}
}
