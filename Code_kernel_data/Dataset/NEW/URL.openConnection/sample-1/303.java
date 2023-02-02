//303
public class func{
public void readBlockInefficiently(){
    sb.append((offset + count)-1);
    LOGGER.fine("Reading block:" + urlOrPaths[0] + "("+sb.toString()+")");
    URL u = new URL(urlOrPaths[0]);
    URLConnection uc = u.openConnection();
}
}
