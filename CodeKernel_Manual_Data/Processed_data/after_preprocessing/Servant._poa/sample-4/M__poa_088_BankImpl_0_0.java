public class A{
	protected POA getAccountPOA() throws org.omg.PortableServer.POAPackage.AdapterNonExistent{
		POA bankPOA = _poa();
		return bankPOA.find_POA(ACCOUNT_POA, true);
	}
}