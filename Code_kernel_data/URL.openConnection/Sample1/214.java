//213
public class func{
	public void call(Context cx,Scriptable scope,Scriptable thisObj,Object[] params){
      InputStream in = new URL((String)params[0]).openConnection().getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
}
}
