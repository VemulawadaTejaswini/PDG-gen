public class A{
	public org.omg.CosConcurrencyControl.TransactionalLockSet create_transactional_related(org.omg.CosConcurrencyControl.TransactionalLockSet which ){
		org.openorb.ccs.kernel.TransactionalLockSet t_relatedLockSet =new org.openorb.ccs.kernel.TransactionalLockSet();
		org.omg.PortableServer.Servant servant = null;
		
		try{
			_poa().activate_object( t_relatedLockSet );
			servant = _poa().reference_to_servant( which );
		}
		catch ( Exception e ){
			throw new org.omg.CORBA.INTERNAL();
		}
		
		org.openorb.ccs.kernel.TransactionalLockSet whichImpl =( org.openorb.ccs.kernel.TransactionalLockSet ) servant;
		t_relatedLockSet.setRelatedLockSet( whichImpl );
		whichImpl.setRelatedLockSet( t_relatedLockSet );
		return t_relatedLockSet._this();
	}
}