//38
public class func{
	public void run(){
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while((numRead = br.read(buf,0,256)) != -1) {
          sb.append(buf,0,numRead);
        }
        br.close();
}
}
