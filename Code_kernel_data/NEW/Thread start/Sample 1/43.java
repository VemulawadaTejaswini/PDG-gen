//42
public class func{
	public void startFailureEmulator(){
    FailureEmulator failureEmulator = new FailureEmulator();
    Thread failureEmulatorThread = new Thread(failureEmulator);
    failureEmulatorThread.setDaemon(true);
    failureEmulatorThread.setName("Failure Emulator");
    failureEmulatorThread.start();
}
}
