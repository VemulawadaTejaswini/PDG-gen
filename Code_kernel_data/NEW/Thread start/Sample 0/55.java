//54
public class func{
	public void triggerBillingAsync(final Date runDate){
      Thread t =new Thread(new Runnable(){
         IBillingProcessSessionBean processBean = Context.getBean(Context.Name.BILLING_PROCESS_SESSION);
        public void run()
        {
           processBean.trigger(runDate);
        }
      });
      t.start();
}
}
