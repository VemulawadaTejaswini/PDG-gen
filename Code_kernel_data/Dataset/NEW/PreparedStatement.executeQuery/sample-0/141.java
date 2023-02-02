//141
public class func{
public void run(PreparedStatement stm){
            stm.setString(1, token);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return toIntermediateReps(rs);
            }
}
}
