public class A{
	public void destroy(){
		try{
			byte[] oid = _poa().servant_to_id( this );
			_poa().deactivate_object( oid );
		}
		catch ( WrongPolicy wp ){
			System.err.println( "Can't destroy meeting servant" );
			System.err.println( wp.toString() );
		}
		catch ( ServantNotActive sna ){
			System.err.println( "Can't destroy meeting servant" );
			System.err.println( sna.toString() );
		}
		catch ( ObjectNotActive ona ){
			System.err.println( "Can't destroy meeting servant" );
			System.err.println( ona.toString() );
		}
		
	}
}