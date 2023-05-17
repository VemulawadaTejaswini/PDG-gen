//116
public class func{
public void contentType(){
    Files.write(path, ImmutableList.of("Hello World"), UTF_8);
    URL url = path.toUri().toURL();
    URLConnection conn = url.openConnection();
}
}
