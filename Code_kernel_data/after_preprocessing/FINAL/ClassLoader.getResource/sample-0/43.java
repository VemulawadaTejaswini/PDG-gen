public class func{
public void main(String args[]){
      if (cl.getResource (tempFile.getName()) == null) {
          throw new RuntimeException("Returned null instead of " +
                                     tempFile.toURL().toString());
      }
}
}
