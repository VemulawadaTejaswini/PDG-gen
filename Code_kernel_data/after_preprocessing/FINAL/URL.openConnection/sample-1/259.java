public class func{
public void main(String[] args){
        final URL url = new URL((args.length > 0) ? args[0] : "http:
        final InputStream is = url.openConnection().getInputStream();
}
}
