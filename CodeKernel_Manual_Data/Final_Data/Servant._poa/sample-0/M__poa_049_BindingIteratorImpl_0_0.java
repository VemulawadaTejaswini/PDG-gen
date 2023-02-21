public class A{
	public void destroy(){
		try{
			_poa().deactivate_object( _object_id() );
		}
		catch ( org.omg.PortableServer.POAPackage.ObjectNotActive ex ){
			System.out.println( "INS Warning n?1" );
		}
		catch ( org.omg.PortableServer.POAPackage.WrongPolicy ex ){
			System.out.println( "INS Warning n?2" );
		}
	}
}