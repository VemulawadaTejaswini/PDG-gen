public class func{
public void main(String[] args){
    System.out.println(new URI(FILE_URI).getAuthority());
    System.out.println(new URI(FILE_URI).getFragment());
    System.out.println(new URI(FILE_URI).getHost());
    System.out.println(new URI(FILE_URI).getPath());
    System.out.println(new URI(FILE_URI).getPort());
    System.out.println(new URI(FILE_URI).getScheme());
    System.out.println(new URI(FILE_URI).getSchemeSpecificPart());
    System.out.println(new URI(FILE_URI).getUserInfo());
}
}
