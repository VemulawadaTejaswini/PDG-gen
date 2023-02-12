public class func{
public void find(PreparedStatement stmt){
    ResultSet rs = stmt.executeQuery();
    while (rs.next()) {
      result.add(buildHeaderFromResultSet(rs));
    }
    rs.close();
}
}
