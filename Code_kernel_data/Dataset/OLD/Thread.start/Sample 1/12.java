//11
public class func{
	public void InternalEventHandler(VirtualMachineImpl vm,EventQueueImpl queue){
        Thread thread = new Thread(vm.threadGroupForJDI(), this,
                                   "JDI Internal Event Handler");
        thread.setDaemon(true);
        thread.start();
}
}
