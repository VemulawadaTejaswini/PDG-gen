public class func{
public void find(Connection conn,String sql,Object... paras){
    for (int i=0; i<paras.length; i++) {
      pst.setObject(i + 1, paras[i]);
    }
    ResultSet rs = pst.executeQuery();
    List<Record> result = RecordBuilder.build(rs);
    DbKit.closeQuietly(rs, pst);
}
}
