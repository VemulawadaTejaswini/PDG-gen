//30
public class func{
public void onPlayerQuit(final PlayerQuitEvent event){
        (new Thread(new DisconnectRequest(plugin, event.getPlayer().getName()))).start();
}
}
