//60
public class func{
	public void getReader(URL path){
    return new BufferedReader(new InputStreamReader(path.openConnection().getInputStream()));
}
}
