//137
public class func{
	public void run(IAction action){
      URL url = Platform.find(bundle, new Path("samples/manifest.txt")); //$NON-NLS-1$
      url = Platform.resolve(url);
      Object content = url.getContent();
      InputStream ins = (InputStream) content;
      int count = ins.available();
      BufferedReader in = new BufferedReader(new InputStreamReader(ins));
      in.read(cbuf);
      in.close();
}
}
