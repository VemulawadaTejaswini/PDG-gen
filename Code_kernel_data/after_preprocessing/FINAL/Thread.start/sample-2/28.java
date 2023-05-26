public class func{
public void execute(){
    (new Thread(new PreviousNames(plugin, new PreviousCallback(plugin, sender), target, targetUUID, senderName))).start();
}
}
