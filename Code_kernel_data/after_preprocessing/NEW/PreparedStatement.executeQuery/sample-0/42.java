//42
public class func{
public void hasBannedIP(){
      ps.setString(1, session.getRemoteAddress().toString());
      ResultSet rs = ps.executeQuery();
      rs.next();
      if (rs.getInt(1) > 0) {
        ret = true;
      }
      rs.close();
}
}
