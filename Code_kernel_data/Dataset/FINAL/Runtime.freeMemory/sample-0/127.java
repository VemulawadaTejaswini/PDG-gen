public class func{
public void main(String[] args){
    Runtime run = Runtime.getRuntime();
    double freeMemory = (double) run.freeMemory() / (1024 * 1024);
}
}
