//5
public class func{
	public void getContent(ResourceCollection rc,String path){
        BufferedReader br = new BufferedReader(new InputStreamReader(rc.addPath(path).getURL().openStream()));
        while((line=br.readLine())!=null)
            buffer.append(line);
        br.close();        
}
}
