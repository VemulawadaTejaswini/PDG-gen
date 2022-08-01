//88
public class func{
	public void getFilter(String expression,ClassLoader classLoader){
        return new AnnotationTypeFilter((Class<Annotation>) classLoader.loadClass(expression));
}
}
