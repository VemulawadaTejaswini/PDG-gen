//161
public class func{
	public void get(String fragment){
        if (fragment == null) {
            url = base;
        } else {
            url = new URL(base, fragment);
        }
        return url.openConnection();
}
}
