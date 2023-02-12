public class func{
public void runTestScript(){
        Thread thread = new Thread(new ScriptRunner(testScript));
        thread.start();
        thread.join();
}
}
