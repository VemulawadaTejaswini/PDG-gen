//275
public class func{
	public void invokeHotkeyPressed(final HotkeyEvent e){
      Thread hotkeyThread = new Thread(){
         public void run() {
            hotkeyPressed(e);
         }
      };
      hotkeyThread.start();
}
}
