//43
public class func{
	public void configureDescriptor(final AppModule appModule,final Descriptor descriptor){
        URL resource = appModule.getClassLoader().getResource(descriptor.path());
            appModule.getAltDDs().put(descriptor.name(), resource == null ? new File(descriptor.path()).toURI().toURL() : resource);
}
}
