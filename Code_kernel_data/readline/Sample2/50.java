//49
public class func{
	public void readLine(final BufferedReader in){
        do line = in.readLine();
        while (line!=null && ((line=line.trim()).length()==0 || line.charAt(0)=='#'));
}
}
