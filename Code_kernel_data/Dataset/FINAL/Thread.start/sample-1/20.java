public class func{
public void createTBI(TeamBroadcastListener list){
    TeamBroadcastInstance ret = new TeamBroadcastInstance();
    Thread t = new Thread(ret, String.format("nbtool-%s", ret.name()));
    t.setDaemon(true);
    t.start();
}
}
