//57
public class func{
	public void getResource(String fileName,ClassLoader loader){
    if (loader == null) {
      throw new IllegalArgumentException("null loader");
    }
    return loader.getResource(fileName);
}
}
