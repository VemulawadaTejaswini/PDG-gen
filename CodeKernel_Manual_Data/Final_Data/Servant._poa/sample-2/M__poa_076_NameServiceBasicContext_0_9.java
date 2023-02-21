public class A{
	public String getContextID(){
		if (this._poa() == getRootPOA()){
			return nameService.getServiceName();
		}
		byte[] oid = this._object_id();
		if (oid == null)return null;
		return new String(oid);
	}
}