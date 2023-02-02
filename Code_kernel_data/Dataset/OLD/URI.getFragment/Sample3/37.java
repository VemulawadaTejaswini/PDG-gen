//36
public class func{
	public void finishProcess(HTTPRequest req,String overrideType,String path,URI u,boolean noRelative){
      if(u.getFragment() != null){
        try{
        // FIXME encode it properly
          p += URLEncoder.encode(u.getFragment(),"UTF-8");
        }catch (UnsupportedEncodingException e1){
          throw new Error("Impossible: JVM doesn't support UTF-8: " + e, e);
        }
      }
}
}
