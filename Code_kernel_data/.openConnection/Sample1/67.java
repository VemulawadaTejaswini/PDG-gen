//66
public class func{
	public void main(String[] args){
            URL u = new URL("https://www.nonexistent-site.com/");
            URLConnection uc = u.openConnection();
            InputStream is = uc.getInputStream();
            is.close();
}
}
