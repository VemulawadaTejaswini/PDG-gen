//35
public class func{
	public void getClassURL(final String clazzBinName,final ClassLoader cl){
        final URL url = cl.getResource(getClassFileName(clazzBinName));
        if(null == url) {
            throw new IOException("Cannot not find: "+clazzBinName);
        }
}
}
