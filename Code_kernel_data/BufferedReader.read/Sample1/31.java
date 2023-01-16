//30
public class func{
	public void decode(){
        while ((readLen = br.read(readBuf)) > 0) {
          tempMessage.append(readBuf, 0, readLen);
        }
        message = tempMessage.toString();
        if (message.startsWith("\n"))
          message = message.substring(1);
}
}
