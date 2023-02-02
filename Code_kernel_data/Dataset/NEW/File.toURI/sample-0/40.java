//40
public class func{
public void toUrls(Collection<String> paths){
    for (String s : paths) {
      urls.add(new File(s).toURI().toURL());
    }
}
}
