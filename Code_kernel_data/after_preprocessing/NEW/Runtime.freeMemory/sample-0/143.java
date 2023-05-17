//143
public class func{
public void runCommand(String[] args){
    Runtime run = Runtime.getRuntime();
    Process p = run.exec(args);
    String strReturn = run(p);
    run.freeMemory();
}
}
