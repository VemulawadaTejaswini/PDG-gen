//5
public class func{
public void listBBSThreads(MapleClient c,int start){
      ps.setInt(1, c.getPlayer().getGuildId());
      ResultSet rs = ps.executeQuery();
      c.announce(MaplePacketCreator.BBSThreadList(rs, start));
      rs.close();
}
}
