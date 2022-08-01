//81
public class func{
	public void returnsTrueForRealStaticResources(){
  when(context.getResource(key)).thenReturn(file.toURI().toURL());
}
}
