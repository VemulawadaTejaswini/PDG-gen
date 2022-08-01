//212
public class func{
	public void execute(){
        Ban banControl = new Ban(plugin, BanType.UNBAN.getActionName(), target, targetUUID, "", senderName, senderUUID, "", "", "", null, false);
        Thread triggerThread = new Thread(banControl);
        triggerThread.start();
}
}
