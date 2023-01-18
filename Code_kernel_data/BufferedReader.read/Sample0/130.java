//129
public class func{
	public void process(){
            reader = new BufferedReader(
                new InputStreamReader(resourceLoader.getResourceStream(name),
                                      encoding));
            while ( ( len = reader.read( buf, 0, 1024 )) != -1)
                sw.write( buf, 0, len );
            setData(sw.toString());
}
}
