//44
public class func{
	public void getConfigLocationUri(){
        if (getConfigName() != null) {
            return String.valueOf(new File(getConfigName()).toURI());
        }
}
}
