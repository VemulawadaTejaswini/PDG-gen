//90
public class func{
public void halt(){
        Thread shutdownThread = new Thread() {
            @Override
            public void run() {
                hostLog.warn("VoltDB node shutting down as requested by @StopNode command.");
                System.exit(0);
            }
        };
        shutdownThread.start();
}
}
