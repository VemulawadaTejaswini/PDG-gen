//0
public class func{
	public void parse(CharSequence text){
                        ClassLoader cl = Thread.currentThread().getContextClassLoader();
                        if(cl!=null)
                            return cl.loadClass(name);
                        else
                            return Class.forName(name);
}
}
//1
public class func{
	public void getCustomizeInstance(final String className){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if (loader == null) {
            loader = ClassLoader.getSystemClassLoader();
        }
        Class<?> c = loader.loadClass(className);
        return c.newInstance();
}
}
//2
public class func{
	public void loadStrategyFromClassName(String strategyClassName){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader != null) {
            try {
                Class<?> clazz = classLoader.loadClass(strategyClassName);
                return (CellMappingStrategy) clazz.newInstance();
            } catch (Throwable e) {
                LOG.warn("Failed to load HBase cell mapping strategy from class {}.", strategyClassName);
            }
        }
}
}
//3
public class func{
	public void loadClass(String className){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        c = classLoader.loadClass(className);
}
}
//4
public class func{
	public void getCollectionClass(String collectionType){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = SelectManyRendererBase.class.getClassLoader();
        }
            collectionClass = classLoader.loadClass(collectionType).asSubclass(Collection.class);
}
}
//5
public class func{
	public void getValidator(String validator){
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        if (cl == null) {
            cl = ConfigureCxfSecurity.class.getClassLoader();
        }
        return cl.loadClass(validator).newInstance();
}
}
//6
public class func{
	public void loadClass(String className){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            return Class.forName(className);
        } else {
            return classLoader.loadClass(className);
        }
}
}
//7
public class func{
	public void loadClass(final String classname){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = MonitoringUtils.class.getClassLoader();
        }
        return classLoader.loadClass(classname);
}
}
//8
public class func{
	public void loadType(String fullName){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        return loader != null ? loader.loadClass(fullName) : Class.forName(fullName);
}
}
//9
public class func{
	public void getClass(String name){
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            return classLoader != null ? classLoader.loadClass( name ) : null;
}
}
//10
public class func{
	public void findClass(String className,Class referencePoint){
            ClassLoader cl = referencePoint.getClassLoader();
            if (cl == null) {
                cl = ClassLoader.getSystemClassLoader();
            }
            return cl.loadClass(className);
}
}
//11
public class func{
	public void newApplication(String str,ClassLoader classLoader){
        Class loadClass = classLoader.loadClass(str);
        if (loadClass == null) {
            throw new ClassNotFoundException(str);
        }
        Application application = (Application) loadClass.newInstance();
        OpenAtlasHacks.Application_attach.invoke(application,
                RuntimeVariables.androidApplication);
}
}
//12
public class func{
	public void getImplementationNamed(String className,Class<T> pluginClass){
        final ClassLoader classLoader = implementationToClassLoader.get(className);
        if (classLoader == null) {
            throw new ClassNotFoundException("Couldn't find a class loader for " + className);
        }
        return classLoader.loadClass(className).asSubclass(pluginClass);
}
}
//13
public class func{
	public void wire(ClassLoader classLoader,String className,Object invoker){
        final Class clazz = classLoader.loadClass( className );
        if (clazz != null) {
            if (invoker instanceof Wireable) {
                ( (Wireable) invoker ).wire( clazz.newInstance() );
            }
        } else {
            throw new ClassNotFoundException( className );
        }
}
}
//14
public class func{
	public void loadClass(ClassLoader loader,String className){
        if (loader == null || osgiVersion >= OSGI_1_5 && !checkValidLoader(loader)) {
            throw new ClassNotFoundException(className);
        }
        return loader.loadClass(className);
}
}
//15
public class func{
	public void exec(File jarFile,String[] args,ClassLoader classLoader){
    String mainClassName = getMainClassName(jarFile);
    if (mainClassName == null) {
      throw new ClassNotFoundException("Unable to extract name of Main-Class of " + jarFile.getAbsolutePath() );
    }
    Class mainClass = classLoader.loadClass(mainClassName);
    Method mainMethod = mainClass.getMethod("main", new Class[]{ String[].class } );
    mainMethod.invoke(null, new Object[]{ args } );
}
}
//16
public class func{
	public void DBToasterEngine(String queryClass){
            ClassLoader cl = this.getClass().getClassLoader();
            if (cl == null) cl = ClassLoader.getSystemClassLoader();
            _query = (IQuery) cl.loadClass(queryClass).newInstance();
}
}
//17
public class func{
	public void canLoadClass(ClassLoader loader,String className){
    if (loader == null) {
      loader = ClassLoader.getSystemClassLoader();
    }
      loader.loadClass(className);
}
}
//18
public class func{
	public void relFindClass(Class home,String name){
            ClassLoader loader = home.getClassLoader();
            if (loader != null)
                return loader.loadClass(name);
            else
                return Class.forName(name);
}
}
//19
public class func{
	public void createVerticle(String verticleName,ClassLoader classLoader){
    verticleName = VerticleFactory.removePrefix(verticleName);
    if (verticleName.endsWith(".java")) {
      CompilingClassLoader compilingLoader = new CompilingClassLoader(classLoader, verticleName);
      String className = compilingLoader.resolveMainClassName();
      clazz = compilingLoader.loadClass(className);
    } else {
      clazz = classLoader.loadClass(verticleName);
    }
    return (Verticle) clazz.newInstance();
}
}
//20
public class func{
	public void tryLoadClass(String className,ClassLoader classLoader){
        if (className.startsWith("[")) {
            return Class.forName(className, false, classLoader);
        } else {
            return classLoader.loadClass(className);
        }
}
}
//21
public class func{
	public void loadClass(String className,ClassLoader classLoader){
        if (classLoader == null) {
            return Class.forName(className);
        }
        return classLoader.loadClass(className);
}
}
//22
public class func{
	public void loadClass(ClassLoader classLoader,String className){
        Class cls = primitivesMap.get( className );
        if ( cls == null ) {
            cls = classLoader.loadClass( className );
        }
}
}
//23
public class func{
	public void loadClass(ClassLoader loader,String className){
      if (loader.getClass() == MLet.class) return ((MLet)loader).loadClass(className, null);
      return loader.loadClass(className);
}
}
//24
public class func{
	public void loadClass(String className,ClassLoader loader){
      RmiConnectorActivator.log(LogService.LOG_DEBUG,"Loading class: " + className +" From "+loader,null);
      if (loader == null){
         loader= ProviderHelper.class.getClassLoader();
         RmiConnectorActivator.log(LogService.LOG_DEBUG,"a new loader "+loader,null);
         
           //Thread.currentThread().getContextClassLoader();
      }
      return loader.loadClass(className);
}
}
//25
public class func{
	public void forName0(String arg1,boolean arg2,ClassLoader arg3){
        return (arg3 == null) ? VmSystem.forName(arg1) : arg3.loadClass(arg1, arg2);
}
}
//26
public class func{
	public void try2Load(String newName,ClassLoader loader){
            if (loader == null)
                return (Class<T>) getClass().getClassLoader().loadClass(newName);
            return (Class<T>) loader.loadClass(newName);
}
}
//27
public class func{
	public void locateParserClass(GrammarInfo grammarInfo,ClassLoader classLoader){
        String parserClassName = grammarInfo.getGrammarName() + "Parser";
        if ( grammarInfo.getGrammarPackage() != null ) {
            parserClassName = grammarInfo.getGrammarPackage()+ "." + parserClassName;
        }
        return classLoader.loadClass( parserClassName );
}
}
//28
public class func{
	public void loadClass(ClassLoader classLoader,String classname){
            if (classLoader == null || classname == null) {
                return null;
            }
                return classLoader.loadClass(classname);
}
}
//29
public class func{
	public void loadClass(String fqcn){
            ClassLoader cl = getClassLoader();
            if (cl != null) {
                try {
                    clazz = cl.loadClass(fqcn);
                } catch (ClassNotFoundException e) {
                    if (log.isTraceEnabled()) {
                        log.trace("Unable to load clazz named [" + fqcn + "] from class loader [" + cl + "]");
                    }
                }
            }
}
}
//30
public class func{
	public void load(ClassLoader classLoader){
            if (type != null) {
                return type;
            }
            return classLoader.loadClass(typeName);
}
}
//31
public class func{
	public void getClass(final ClassLoader classLoader,final String className){
        if (!isEmpty(className)) {
            try {
                return classLoader.loadClass(className);
            } catch (ClassNotFoundException e) {
                throw new DeploymentUnitProcessingException(e);
            }
        }
}
}
//32
public class func{
	public void loadClass(String className,ClassLoader loader){
        if (loader == null) {
            return ClassLoaderUtils.loadClass(className, getClass());
        } else {
            return loader.loadClass(className);
        }
}
}
//33
public class func{
	public void delegateToParent(String classname){
        ClassLoader cl = getParent();
        if (cl != null)
            return cl.loadClass(classname);
        else
            return findSystemClass(classname);
}
}
//34
public class func{
	public void classIsPresent(String className,ClassLoader classLoader){
      if (classLoader == null) {
        Class.forName(className);
      } else {
        classLoader.loadClass(className);
      }
}
}
//35
public class func{
	public void createProviderInstance(final String providerClass,final ClassLoader classLoader){
        if (providerClass != null && providerClass.length() > 0 && !providerClass.equals(ProviderWrapper.class.getName())) {
            try {
                final Class<? extends Provider> clazz = classLoader.loadClass(providerClass).asSubclass(Provider.class);
                return clazz.newInstance();
            } catch (final Throwable e) {
                logger.warning("Unable to construct provider implementation " + providerClass, e);
            }
        }
}
}
//36
public class func{
	public void loadClass(Storage storage,String name){
        ClassLoader loader = storage.getClassLoader();
        if (loader != null) { 
            try { 
                return loader.loadClass(name);
            } catch (ClassNotFoundException x) {}
        }
}
}
//37
public class func{
	public void createExclusion(ClassLoader cl,File root){
        if (exclusion != null) {
            Class<MethodExclusion> clazz = (Class<MethodExclusion>) cl.loadClass(exclusion);
            return clazz.getConstructor(File.class).newInstance(root);
        } else {
            return FileMethodExclusion.create(root);
        }
}
}
//38
public class func{
	public void addClassLoader(final ClassLoadingPicoContainer parentContainer,final Element childElement,final ClassLoadingPicoContainer metaContainer){
        if (parentClass != null && !EMPTY.equals(parentClass)) {
            parentClassLoader = parentClassLoader.loadClass(parentClass).getClassLoader();
        }
        ClassLoadingPicoContainer scripted = new DefaultClassLoadingPicoContainer(parentClassLoader, parentContainer);
        addComponentsAndChildContainers(scripted, childElement, metaContainer);
}
}
//39
public class func{
	public void loadClass(String name,boolean resolve){
          ClassLoader parent = getParent();
          return parent == null ? ClassLoader.getSystemClassLoader().loadClass(name) : parent.loadClass(name);
}
}
//40
public class func{
	public void load(ClassLoader classLoader,String ejbClass){
        if (ejbClass != null) {
            try {
                return classLoader.loadClass(ejbClass);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
}
}
