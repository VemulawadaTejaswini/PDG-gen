//93
public class func{
public void getClassType(URI classURI){
    if (classURI.toString().equals(OntEntityTypes.OWL_THING_CLASS.pattern()))
      return OntEntityTypes.OWL_THING_CLASS;
    String className = classURI.getFragment();
}
}
