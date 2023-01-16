//249
public class func{
	public void onPreferenceClick(Preference preference){
                        new Thread(new Runnable() {
                                public void run() {
                                    handleSipReceiveCallsOption(enabled);
                                }
                        }).start();
}
}
