//64
public class func{
	public void dumpRequestContent(InputStream is){
                BufferedReader r = new BufferedReader(new InputStreamReader(is));
                while ((l = r.readLine()) != null)
                    if (DEBUG) Log.i(TAG, l);
}
}
