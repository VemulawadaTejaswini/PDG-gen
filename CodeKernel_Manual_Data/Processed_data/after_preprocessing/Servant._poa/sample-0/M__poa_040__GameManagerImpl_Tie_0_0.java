public class A{
	public void deactivate(){
		try{
			_poa().deactivate_object(_poa().servant_to_id(this));
		}
		catch (org.omg.PortableServer.POAPackage.WrongPolicy exception){
		}
		catch (org.omg.PortableServer.POAPackage.ObjectNotActive exception){
		}
		catch (org.omg.PortableServer.POAPackage.ServantNotActive exception){
		}
	}
}