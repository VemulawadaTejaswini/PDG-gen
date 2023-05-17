//7
public class func{
public void getInputStream(URL url,int connectTimeout,int readTimeout){
    URLConnection conn = url.openConnection();
    conn.setConnectTimeout( connectTimeout );  // CRITICAL: if fail to establish finite timeout here and on next line, run a grave danger out being unable to close the InputStream because the underlying socket is sometimes seen to wait forever for a remote response
    conn.setReadTimeout( readTimeout );
    conn.connect();  // hmm, this may not really be necessary, as conn.getInputStream the call below will connect it if not done already?
    return conn.getInputStream();
}
}
