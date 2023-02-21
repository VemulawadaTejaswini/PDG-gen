public class A{
	public org.omg.CosConcurrencyControl.LockSet createLockSet( java.lang.String objectName ){
		if ( s_lock_sets.containsKey( objectName ) ){
			return ( org.omg.CosConcurrencyControl.LockSet ) s_lock_sets.get( objectName );
		}
		org.openorb.ccs.kernel.LockSet lockSet = new org.openorb.ccs.kernel.LockSet();
		try{
			_poa().activate_object( lockSet );
		}
		catch ( Exception e ){
			e.printStackTrace();
		}
		s_lock_sets.put( objectName, lockSet._this() );
		return lockSet._this();
	}
}