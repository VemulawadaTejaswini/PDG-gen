//8
public class func{
public void loadPolymorphs(){
      con = L1DatabaseFactory.getInstance().getConnection();
      pstm = con.prepareStatement("SELECT * FROM polymorphs");
      rs = pstm.executeQuery();
      fillPolyTable(rs);
}
}
