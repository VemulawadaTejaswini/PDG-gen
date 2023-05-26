//52
public class func{
public void getTableName(Connection conn,int tableId){
          conn.prepareStatement("SELECT " + COL_TABLES_NAME + " FROM " + TB_TABLES + " WHERE " + COL_TABLES_PK + "=?");
      pstmt.setInt(1, tableId);
      res = pstmt.executeQuery();
      if (!res.next()) {
        throw new TajoInternalError("Cannot get any table name from TID");
      }
      return res.getString(1);
      CatalogUtil.closeQuietly(pstmt, res);
}
}
