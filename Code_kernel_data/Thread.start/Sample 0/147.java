//146
public class func{
	public void launchRemoteTestNG(final String portArg,final int portValue){
    new Thread(new Runnable() {
      @Override
      public void run() {
        RemoteTestNG.main(new String[] {
            portArg, Integer.toString(portValue), "-dontexit",
            getPathToResource("testng-remote.xml")
          });
        }
      }).start();
}
}
