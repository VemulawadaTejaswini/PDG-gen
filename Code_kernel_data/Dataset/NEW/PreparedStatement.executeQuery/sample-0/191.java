//191
public class func{
public void selectData(Connection connection,long fileSourceId){
    PreparedStatement pstmt = connection.prepareStatement("select binary_data from file_sources where id=?");
      pstmt.setLong(1, fileSourceId);
      rs = pstmt.executeQuery();
      rs.next();
      InputStream data = rs.getBinaryStream(1);
      return FileSourceDto.decodeSourceData(data);
      DbUtils.closeQuietly(pstmt);
}
}
