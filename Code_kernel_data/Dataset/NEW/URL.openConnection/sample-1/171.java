//171
public class func{
public void main(String[] args){
        for (int i = 0; i < REFERENCE.length; i++)
        {
            URL url = new URL(REFERENCE[i]);
            URLConnection urlconn = url.openConnection();
            urlconn.connect();
            InputStream is = (InputStream) urlconn.getContent();
            parse(read(is));
        }
        printByteCodes();
}
}
