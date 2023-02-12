public class func{
public void ContentBasedJavaFileObject(String name,String content){
      super(new File(name).toURI(), Kind.SOURCE);
}
}
