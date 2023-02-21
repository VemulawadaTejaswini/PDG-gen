public class A{
	public void trace(Logger log, NameComponent[] n, String method){
		String poaName = "";
		try{
			poaName = this._poa().the_name() + "/";
		}
		catch (Throwable e){
		}
		trace(log, n, method, poaName + getContextID());
	}
}