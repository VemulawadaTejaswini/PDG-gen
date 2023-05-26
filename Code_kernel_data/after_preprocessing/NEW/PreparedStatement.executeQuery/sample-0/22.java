//22
public class func{
public void existsSequence(String schemaName,String seqName,Connection con){
    PreparedStatement ps = con.prepareStatement(
        "select seqschema,seqname from syscat.sequences where seqschema = ? and seqname = ?");
    ps.setString(2,seqName);
    ResultSet rs = ps.executeQuery();
    if (rs.next())
      retval = true;
    rs.close();
}
}
