//1
public class func{
public void setProperties(File file){
    if (!file.isFile())
      error("No such file %s", file);
    else {
      setProperties(file.toURI());
    }
}
}
