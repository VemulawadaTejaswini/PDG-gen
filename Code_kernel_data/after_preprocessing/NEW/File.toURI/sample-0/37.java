//37
public class func{
public void main(String[] aaParamters){
        File file = new File( "\\\\somehost\\someshare\\somefile.ext" );
        URI uri = file.toURI();
        if (!(uri.toURL().toURI().equals(uri))) {
            throw new RuntimeException("Test failed : (uri.toURL().toURI().equals(uri)) isn't hold");
        }
}
}
