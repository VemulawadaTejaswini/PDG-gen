public class A{
	public String getContextID(){
		try{
			if (log.isDebugEnabled())log.debug("getContextID:POA=" + this._poa().the_name() + " ctxPOA=" + this.getCtxPOA().the_name()+ " objId=" + new String(this._object_id()));
			if (this._poa() == this.getCtxPOA()){
				byte[] oid = this._object_id();
				if (oid == null)return "";
				return new String(oid);
			}
		}
		catch (Throwable e){
		}
	}
}