//136
public class func{
public void open(File file){
            launch(file.toURI());
            throw new IOException(file.toString());
}
}
