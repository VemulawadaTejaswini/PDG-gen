public class A{
	public org.omg.CosConcurrencyControl.LockSet create_related(org.omg.CosConcurrencyControl.LockSet which ){
		org.openorb.ccs.kernel.LockSet relatedLockSet = new org.openorb.ccs.kernel.LockSet();
		org.omg.PortableServer.Servant servant = null;
		try{
			_poa().activate_object( relatedLockSet );
			servant = _poa().reference_to_servant( which );
		}
		catch ( Exception e ){
			throw new org.omg.CORBA.INTERNAL();
		}
		org.openorb.ccs.kernel.LockSet whichImpl = ( org.openorb.ccs.kernel.LockSet ) servant;
		relatedLockSet.setRelatedLockSet( whichImpl );
		whichImpl.setRelatedLockSet( relatedLockSet );
		
		return relatedLockSet._this();
	}
}