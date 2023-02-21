public class A{
	private boolean registerSynchronization ( org.omg.CosTransactions.Coordinator current ){
		Synchronization synchro = new Synchronization ( this, current );
		byte [] id = null;
		try{
			id = _poa().activate_object ( synchro );
		}
		catch ( org.omg.PortableServer.POAPackage.WrongPolicy wp ){
			return false;
		}
		catch ( org.omg.PortableServer.POAPackage.ServantAlreadyActive saa ){
			return false;
		}
		
		try{
			current.register_synchronization (org.omg.CosTransactions.SynchronizationHelper.narrow(_poa().id_to_reference( id ) ) );
		}
		catch ( org.omg.CosTransactions.SynchronizationUnavailable e ){
			System.out.println ( " Synchronization Unavailable " );
			return false;
		}
		catch ( org.omg.CosTransactions.Inactive ex ){
			System.out.println ( " Transaction Inactive " );
			return false;
		}
		catch ( Exception e ){
			return false;
		}
		return true;
	}
}