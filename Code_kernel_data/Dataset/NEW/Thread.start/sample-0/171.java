//171
public class func{
public void processInitializeSettingsFile(File initializeSettingsFile){
    Thread t = new Thread(new ProcessInitialize(initializeSettingsFile));
    t.start();
}
}
