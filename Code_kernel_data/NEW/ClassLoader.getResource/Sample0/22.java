//21
public class func{
	public void getResource(String name){
      for (ClassLoader cl : parents) {
         URL url = cl.getResource(name);
         if (url != null) {
           return url;
         }
       }
}
}
