public class A{
	public org.omg.CosConcurrencyControl.LockSet create(){
		org.openorb.ccs.kernel.LockSet lockSet = new org.openorb.ccs.kernel.LockSet();
		try{
			_poa().activate_object( lockSet );
		}
		catch ( Exception e ){
			throw new org.omg.CORBA.INTERNAL();
		}
		return lockSet._this();
	}
}