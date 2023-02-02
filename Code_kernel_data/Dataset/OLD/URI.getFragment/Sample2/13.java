//12
public class func{
	public void show(int i,String title,String rawURI,boolean query,boolean fragment){
    System.out.printf("\t- Scheme..............: %s%n",uri.getScheme());
    System.out.printf("\t- Scheme specific part: %s%n",uri.getSchemeSpecificPart());
    System.out.printf("\t  + Authority.........: %s%n",uri.getAuthority());
    System.out.printf("\t    * User info.......: %s%n",uri.getUserInfo());
    System.out.printf("\t    * Host............: %s%n",uri.getHost());
    System.out.printf("\t    * Port............: %s%n",uri.getPort());
    System.out.printf("\t  + Path..............: %s%n",uri.getPath());
    System.out.printf("\t  + Query.............: %s%n",uri.getQuery());
    System.out.printf("\t- Fragment............: %s%n",uri.getFragment());
    System.out.printf("\t- Flags...............: %s%n",flags(uri));
}
}
