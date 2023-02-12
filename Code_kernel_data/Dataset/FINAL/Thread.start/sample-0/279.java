public class func{
public void startPattern(final VmProxy vmProxy,final VmBindings desiredBindings,final BindingsChecker bindingsChecker,Handler<VmBindings> successHandler,Handler<LopError> errorHandler,long pollingInterval){
        new Thread(this).start();
}
}
