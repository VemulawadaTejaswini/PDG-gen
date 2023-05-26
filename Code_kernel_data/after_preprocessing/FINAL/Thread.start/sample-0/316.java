public class func{
public void enter(){
            new Thread(new Runnable() {
                public void run() {
                    writeApConfiguration(mWifiApConfig);
                    sendMessage(WifiStateMachine.CMD_SET_AP_CONFIG_COMPLETED);
                }
            }).start();
}
}
