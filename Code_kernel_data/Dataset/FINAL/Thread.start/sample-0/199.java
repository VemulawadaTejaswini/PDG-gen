public class func{
public void commitVm(@NotNull VirtualMachine vm){
    new Thread(myRunnable, "Debug Events Processor Thread").start();
}
}
