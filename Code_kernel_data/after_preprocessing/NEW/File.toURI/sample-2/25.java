//25
public class func{
public void parse(File file){
            InputSource src = new InputSource(file.toURI().toURL().toExternalForm());
            parse(src);
}
}
