//144
public class func{
	public void locateClassesWithAnnotation(Class<? extends Annotation> annotation,File locationToSearch){
    return AnnotationLocator.locateClassesWithAnnotation( annotation,
                                                          locationToSearch.toURI().toURL() );
}
}
