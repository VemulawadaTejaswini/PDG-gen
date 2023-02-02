//587
public class func{
	public void call(Context cx,Scriptable scope,Scriptable thisObj,Object[] params){
        return DriverManager.getConnection((String)params[1]);
}
}
