//64
public class func{
public void main(String args[]){
            URL url = new URL ("http://localhost:"+port);
            URLConnection urlc = url.openConnection ();
            InputStream is = urlc.getInputStream ();
            read (is);
            is.close();
}
}
