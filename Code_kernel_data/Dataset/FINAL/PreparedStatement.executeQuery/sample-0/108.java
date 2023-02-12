public class func{
public void append(PreparedStatement pstmt,StringBuilder newFields,@Nullable String projectKey){
    if (projectKey != null) {
      pstmt.setString(1, projectKey);
      ResultSet rs = null;
      try {
        rs = pstmt.executeQuery();
        if (rs.next()) {
          String projectUuid = DatabaseUtils.getString(rs, "uuid");
          if (projectUuid != null) {
            newFields.append("projectUuids=").append(projectUuid);
          }
        }
      } finally {
        DbUtils.closeQuietly(rs);
      }
    }
}
}
