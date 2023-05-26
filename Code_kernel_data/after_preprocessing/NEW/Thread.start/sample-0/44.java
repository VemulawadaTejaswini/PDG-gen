//44
public class func{
public void maybePerformUpdateCheck(Shell shell,int buildNumber){
    final IPreferenceStore preferences = Activator.getDefault().getPreferenceStore();
    if(preferences.getBoolean(IPreferenceConstants.P_UPDATE_CHECK_ENABLED) && (buildNumber != 0)) {
      final UpdateCheckTask task = new UpdateCheckTask(shell, buildNumber);
      final Thread thread = new Thread(task);
      thread.start();
    }
}
}
