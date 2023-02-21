public class A{
	//...
	public static void main(){
		if (log.isDebugEnabled())log.debug("getContextID:POA=" + this._poa().the_name() + " ctxPOA=" + this.getCtxPOA().the_name()+ " objId=" + new String(this._object_id()));
	}
}