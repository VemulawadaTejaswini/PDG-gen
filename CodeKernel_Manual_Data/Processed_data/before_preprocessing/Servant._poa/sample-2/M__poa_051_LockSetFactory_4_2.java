public class A{
	public org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional(){
		org.openorb.ccs.kernel.TransactionalLockSet t_lockSet =new org.openorb.ccs.kernel.TransactionalLockSet();
		try{
			_poa().activate_object( t_lockSet );
		}
		catch ( Exception e ){
			throw new org.omg.CORBA.INTERNAL();
		}
		return t_lockSet._this();
	}
}