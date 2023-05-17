public class func{
public void launchTool(final String toolClassName,final IToolConfiguration configuration,final ISpace space){
    final Thread launchThread = new Thread(new Runnable() {
      public void run() {
        doLaunch(toolClassName, configuration, space);
      }
    });
    launchThread.start();
}
}
