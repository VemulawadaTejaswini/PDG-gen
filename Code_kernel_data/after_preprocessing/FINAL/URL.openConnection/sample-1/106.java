public class func{
public void main(String[] args){
        URL url = new URL ("jar:file:./foo2.jar!/bar.txt");
        URLConnection urlc = url.openConnection ();
        urlc.setUseCaches (false);
        InputStream is = urlc.getInputStream();
        is.read();
        is.close();
}
}
