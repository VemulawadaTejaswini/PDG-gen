public class func{
public void launchProject(final IProject project,final String runMode,final boolean forceLeinLaunchWhenPossible,final IWithREPLView runOnceREPLAvailable){
      new Thread(new Runnable() {
        @Override public void run() {
          launchProjectCheckRunning(project, new IFile[] {}, getRunMode(runMode), forceLeinLaunchWhenPossible, runOnceREPLAvailable);
        }
      }).start();
}
}
