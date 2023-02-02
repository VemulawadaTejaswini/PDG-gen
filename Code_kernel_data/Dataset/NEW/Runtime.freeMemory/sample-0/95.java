//95
public class func{
public void main2(String[] args){
    Runtime lRuntime = Runtime.getRuntime();
    System.out.println("--------------Free Momery:" + lRuntime.freeMemory() + "K");
    System.out.println("--------------Max Momery:" + lRuntime.maxMemory() + "K");
    System.out.println("--------------Total Momery:" + lRuntime.totalMemory() + "K");
    System.out.println("---------------Available Processors :" + lRuntime.availableProcessors());
}
}
