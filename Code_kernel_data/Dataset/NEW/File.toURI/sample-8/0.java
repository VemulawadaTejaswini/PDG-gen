//0
public class func{
public void getResource(String ref){
          URL url = Util.class.getClassLoader().getResource(ref);
          if (url==null) {
              try { 
                  File f = createFile(ref);
                  if (f.exists())
                      return f.toURI().toURL();
              } catch (IOException e) {}
          }
}
}
