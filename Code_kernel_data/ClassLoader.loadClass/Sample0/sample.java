//0
public class func{
	public void testClassManager_GetClassLoaderFromDirs(){
        ClassLoader cl = ClassManager.getClassLoaderFromDirs(
            new File[]{new File("./target/classes")},
            Thread.currentThread().getContextClassLoader()
        );
        Assert.assertNotNull(cl);
        Assert.assertNotNull(cl.loadClass("org.clamshellcli.core.Clamshell"));
}
}
//1
public class func{
	public void testClassManager_GetClassLoaderFromFiles(){
        ClassLoader cl = ClassManager.getClassLoaderFromFiles(
            new File[]{new File("../mock-env/plugins")}, 
            Pattern.compile(".*\\.jar"), 
            Thread.currentThread().getContextClassLoader());
        Assert.assertNotNull(cl);
        Assert.assertNotNull(cl.loadClass("org.clamshellcli.test.MockShell"));
}
}
//2
public class func{
	public void assertClassPresent(ClassLoader cl,String name){
      Class<?> clazz = cl.loadClass(name);
      Assert.assertNotNull("Should have found class: " + name, clazz);
      Assert.fail("Counld not load class: " + name + " from " + cl.getClass().getName());
}
}
//3
public class func{
	public void run(){
                    ClassLoader cl = Thread.currentThread().getContextClassLoader();
                    if (cl != null)
                        try {
                            return (Class<AsyncHttpClient>) cl.loadClass(asyncImplClassName);
                        } catch (ClassNotFoundException e) {
                            AsyncHttpClientFactory.logger.info("Couldn't find class : " + asyncImplClassName + " in thread context classpath " + "checking system class path next",
                                    e);
                        }
                    cl = ClassLoader.getSystemClassLoader();
                    return (Class<AsyncHttpClient>) cl.loadClass(asyncImplClassName);
}
}
//4
public class func{
	public void testTryCatchFinally(){
        ClassLoader loader = mergeAndLoad(
                "/testdata/Basic.dex",
                "/testdata/TryCatchFinally.dex");
        Class<?> basic = loader.loadClass("testdata.Basic");
        assertEquals(1, basic.getDeclaredMethods().length);
        Class<?> tryCatchFinally = loader.loadClass("testdata.TryCatchFinally");
        tryCatchFinally.getDeclaredMethod("method").invoke(null);
}
}
//5
public class func{
	public void testClassLoaderDoesNotNeedToSeeInvocationHandlerLoader(){
        ClassLoader loaderB = new ClassLoaderBuilder().withPrivateCopy(prefix).build();
        InvocationHandler invocationHandlerB = (InvocationHandler) loaderB.loadClass(
                prefix + "$TestInvocationHandler").newInstance();
}
}
//6
public class func{
	public void setUp(){
        ClassLoader loader = new ClassLoaderBuilder().withPrivateCopy(prefix).build();
        bStringClass = loader.loadClass(prefix + "$BString");
}
}
//7
public class func{
	public void setUp(){
        ClassLoader cl = new ClassLoaderBuilder()
                .withPrivateCopy(prefix + "$Loadable")
                .without(prefix + "$Unloadable")
                .build();
        loadableClass = cl.loadClass(prefix + "$Loadable");
}
}
//8
public class func{
	public void getResolver(String className){
                ClassLoader cl = Configuration.class.getClassLoader();
                return (DependencyResolver) cl.loadClass(className).newInstance();
}
}
//9
public class func{
	public void getResolver(String className){
            ClassLoader cl = Configuration.class.getClassLoader();
            DependencyResolver resolver = (DependencyResolver) cl.loadClass(className).newInstance();
}
}
//10
public class func{
	public void loadClass(final ClassName className){
        String cn = getClassName(className.toString());
            return classLoader.loadClass(cn);
            throw new PicoClassNotFoundException(cn, e);
}
}
//11
public class func{
	public void loadClass(final ClassLoader classLoader,final String typeName){
                return classLoader.loadClass(typeName);
                throw new PicoClassNotFoundException(typeName, e);
}
}
//12
public class func{
	public void loadClass(final ClassLoader classLoader,final String className){
            return classLoader.loadClass(className);
            throw new PicoClassNotFoundException(className, e);
}
}
//13
public class func{
	public void loadGroupClasses(ClassLoader cloader){
            enabledClass = cloader.loadClass( enabled );
            throw new RuntimeException( "Unable to load category: " + enabled, e );
}
}
//14
public class func{
	public void loadTestClass(ClassLoader testClassLoader,TestFile testFile){
            return testClassLoader.loadClass(testFile.getClassName());
            throw new RuntimeException("Cannot load class: " + testFile, e);
}
}
//15
public class func{
	public void loadClass(ClassLoader classLoader,String className){
            testClass = classLoader.loadClass( className );
            throw new RuntimeException( "Unable to create test class '" + className + "'", e );
}
}
//16
public class func{
	public void newActivity(ClassLoader cl,String className,Intent intent){
        return (Activity) cl.loadClass(className)
                            .newInstance();
}
}
//17
public class func{
	public void pathWithSpacesInTheNameDoesNotFail(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/regression/spaces in path.json", "com.example", Collections.<String, Object>emptyMap());
        Class generatedType = resultsClassLoader.loadClass("com.example.SpacesInPath");
}
}
//18
public class func{
	public void useJodaLocalDatesCausesJodaLocalDateDates(){
        ClassLoader classLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example", config
                ("useJodaLocalDates", true));
        Class<?> classWithDate = classLoader.loadClass("com.example.FormattedProperties");
        assertTypeIsExpected(classWithDate, "stringAsDate", "org.joda.time.LocalDate");
}
}
//19
public class func{
	public void disablingJodaDatesCausesJavaUtilDates(){
        ClassLoader classLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example",
                config("useJodaDates", false));
        Class<?> classWithDate = classLoader.loadClass("com.example.FormattedProperties");
        assertTypeIsExpected(classWithDate, "stringAsDateTime", "java.util.Date");
}
}
//20
public class func{
	public void disablingJodaLocalTimesCausesStrings(){
        ClassLoader classLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example",
                config("useJodaLocalTimes", false));
        Class<?> classWithDate = classLoader.loadClass("com.example.FormattedProperties");
        assertTypeIsExpected(classWithDate, "stringAsTime", "java.lang.String");
}
}
//21
public class func{
	public void useJodaLocalTimesCausesJodaLocalTimeDates(){
        ClassLoader classLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example",
                config("useJodaLocalTimes", true));
        Class<?> classWithDate = classLoader.loadClass("com.example.FormattedProperties");
        assertTypeIsExpected(classWithDate, "stringAsTime", "org.joda.time.LocalTime");
}
}
//22
public class func{
	public void shouldUseDefaultExcludesWithoutIncludesAndExcludes(){
        ClassLoader resultsClassLoader = generateAndCompile(subSchemaUrl, "com.example.sub",
                config("includes", new String[] {}, "excludes", new String[] {}));
        resultsClassLoader.loadClass("com.example.sub.sub2.Sub");
}
}
//23
public class func{
	public void shouldIncludeNestedFilesWithFiltering(){
        ClassLoader resultsClassLoader = generateAndCompile(filteredSchemaUrl, "com.example",
                config("includes", new String[] { "**/*.json" }, "excludes", new String[] { "excluded.json" }));
        resultsClassLoader.loadClass("com.example.sub.Sub");
}
}
//24
public class func{
	public void generateAndCompileClass(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/media/mediaProperties.json", "com.example", config("customAnnotator", QuotedPrintableAnnotator.class.getName()));
        classWithMediaProperties = resultsClassLoader.loadClass("com.example.MediaProperties");
}
}
//25
public class func{
	public void arrayAtRootProducesNoJavaTypes(){
        ClassLoader resultsClassLoader = generateAndCompile("/json/arrayAsRoot.json", "com.example",
                config("sourceType", "json"));
        resultsClassLoader.loadClass("com.example.ArrayAsRoot");
}
}
//26
public class func{
	public void testClassLoaderDoesNotNeedToSeeInvocationHandlerLoader(){
        Class[] interfacesA = { loaderA.loadClass(prefix + "$Echo") };
        Object proxy = Proxy.newProxyInstance(loaderA, interfacesA, invocationHandlerB);
        assertEquals(loaderA, proxy.getClass().getClassLoader());
        assertEquals("foo", proxy.getClass().getMethod("echo", String.class).invoke(proxy, "foo"));
}
}
//27
public class func{
	public void generateAndCompileEnum(){
        ClassLoader relativeRefsClassLoader = generateAndCompile("/schema/ref/refsToA.json", "com.example");
        relativeRefsClass = relativeRefsClassLoader.loadClass("com.example.RefsToA");
}
}
//28
public class func{
	public void generateAndCompileEnum(){
        ClassLoader httpRefsClassLoader = generateAndCompile("/schema/ref/httpRefs.json", "com.example");
        httpRefsClass = httpRefsClassLoader.loadClass("com.example.HttpRefs");
}
}
//29
public class func{
	public void doLazyInit(){
        ClassLoader classLoader = getClassLoader();
            getTypeName = classLoader.loadClass(TYPE_DESCRIPTOR_CLASS_NAME).getMethod("getTypeName", EMPTY_CLASS_ARRAY);
}
}
//30
public class func{
	public void doLazyInit(){
        ClassLoader classLoader = getClassLoader();
            accessDatum = classLoader.loadClass(ANY_DATA_CLASS_NAME).getMethod("accessDatum", EMPTY_CLASS_ARRAY);
}
}
//31
public class func{
	public void resolveClass(ObjectStreamClass objectStreamClass){
                    ? classLoader.loadClass( objectStreamClass.getName() )
}
}
//32
public class func{
	public void simpleTypeAtRootProducesNoJavaTypes(){
        ClassLoader resultsClassLoader = generateAndCompile("/json/simpleTypeAsRoot.json", "com.example",
                config("sourceType", "json"));
        resultsClassLoader.loadClass("com.example.SimpleTypeAsRoot");
}
}
//33
public class func{
	public void generateClasses(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/format/formattedProperties.json", "com.example");
        classWithFormattedProperties = resultsClassLoader.loadClass("com.example.FormattedProperties");
}
}
//34
public class func{
	public void main(String[] args,File episode){
            ClassLoader cl = Runner.class.getClassLoader();
            Class apt = cl.loadClass("com.sun.tools.apt.Main");
            Method processMethod = apt.getMethod("process",AnnotationProcessorFactory.class, String[].class);
}
}
//35
public class func{
	public void testInheritancePositive(){
        assertEquals(Bundle.class, testLoader.loadClass(Bundle.class.getName()));
}
}
//36
public class func{
	public void classIsVisible(ClassLoader classLoader,Class klass){
            return classLoader.loadClass(klass.getName()) == klass;
}
}
//37
public class func{
	public void isolate(String target){
        ClassLoader il = createIsolatedClassLoader();
        Class result = il.loadClass(target);
        assertEquals(result.getName(), target);
}
}
//38
public class func{
	public void generateAndCompileEnum(){
        ClassLoader fragmentRefsClassLoader = generateAndCompile("/schema/ref/fragmentRefs.json", "com.example");
        fragmentRefsClass = fragmentRefsClassLoader.loadClass("com.example.FragmentRefs");
}
}
//39
public class func{
	public void generateAndCompileEnum(){
        ClassLoader classpathRefsClassLoader = generateAndCompile("/schema/ref/classpathRefs.json", "com.example");
        classpathRefsClass = classpathRefsClassLoader.loadClass("com.example.ClasspathRefs");
}
}
//40
public class func{
	public void main(String args[]){
        Class c = loader.loadClass(YUICompressor.class.getName());
        Method main = c.getMethod("main", new Class[]{String[].class});
        main.invoke(null, new Object[]{args});
}
}
//41
public class func{
	public void resolveClass(ObjectStreamClass desc){
        return loader.loadClass(desc.getName());
}
}
//42
public class func{
	public void generateAndCompileEnum(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/enum/typeWithEnumProperty.json", "com.example",
                config("propertyWordDelimiters", "_"));
        enumClass = (Class<Enum>) resultsClassLoader.loadClass("com.example.TypeWithEnumProperty$EnumProperty");
}
}
//43
public class func{
	public void generateAndCompileClass(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/default/default.json", "com.example");
        classWithDefaults = resultsClassLoader.loadClass("com.example.Default");
}
}
//44
public class func{
	public void getCompileMethod(ClassLoader cl){
        return ScalaReflectionUtil.scalaMethod(
                cl,
                "play.router.RoutesCompiler",
                "compile",
                File.class,
                File.class,
                cl.loadClass("scala.collection.Seq"),
                boolean.class,
                boolean.class
        );
}
}
//45
public class func{
	public void testLoadEntityClass(){
        assertFalse(entity instanceof TestEntity);
        assertTrue(entity.getClass().isAnnotationPresent(Entity.class));
        assertTrue(entityClass == tempClassLoader.loadClass(className));
}
}
//46
public class func{
	public void getCompileMethod(ClassLoader cl){
        return ScalaReflectionUtil.scalaMethod(
            cl,
            "play.routes.compiler.RoutesCompiler",
            "compile",
            cl.loadClass("play.routes.compiler.RoutesCompiler$RoutesCompilerTask"),
            cl.loadClass("play.routes.compiler.RoutesGenerator"),
            File.class
        );
}
}
//47
public class func{
	public void testDiffClassloaders(){
      Object key2 = cl2.loadClass(Key.class.getName()).getConstructor(String.class, Boolean.TYPE).newInstance("key1", false);
}
}
//48
public class func{
	public void testDiffClassloaders(){
      Object key1 = cl1.loadClass(Key.class.getName()).getConstructor(String.class, Boolean.TYPE).newInstance("key1", false);
}
}
//49
public class func{
	public void testInheritance(){
        testLoader.loadClass(Bundle.class.getName());
}
}
//50
public class func{
	public void extendsStringCausesNoNewTypeToBeGenerated(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/extends/extendsString.json", "com.example");
        resultsClassLoader.loadClass("com.example.ExtendsString");
}
}
//51
public class func{
	public void multipleEnumArraysWithSameName(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/enum/multipleEnumArraysWithSameName.json", "com.example");
        resultsClassLoader.loadClass("com.example.Status_");
}
}
//52
public class func{
	public void generateAndCompileEnum(){
        ClassLoader selfRefsClassLoader = generateAndCompile("/schema/ref/selfRefs.json", "com.example");
        selfRefsClass = selfRefsClassLoader.loadClass("com.example.SelfRefs");
}
}
//53
public class func{
	public void testCanMockTypesFromADynamicClassLoader(){
    ClassLoader interfaceClassLoader = new SyntheticEmptyInterfaceClassLoader();
    Class<?> interfaceClass = interfaceClassLoader
        .loadClass("$UniqueTypeName$");
    Object o = imposteriser.imposterise(mockObject, interfaceClass,
        new Class[0]);
    assertTrue(interfaceClass.isInstance(o));
}
}
//54
public class func{
	public void filesWithExtensionPrefixesAreNotTruncated(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/regression/foo.baz.json", "com.example", Collections.<String, Object>emptyMap());
        Class generatedType = resultsClassLoader.loadClass("com.example.FooBaz");
}
}
//55
public class func{
	public void isType(JvmTypeReference type,Object object,ClassLoader classLoader){
      Class<?> typeGuard = classLoader.loadClass(type.getIdentifier());
      return typeGuard.isInstance(object);
}
}
//56
public class func{
	public void setupBeforeClass(){
    ClassLoader loader = ClassLoader.getSystemClassLoader();
    loader.setDefaultAssertionStatus(true);
    Class<?> c = loader
        .loadClass("org.apache.hadoop.hdfs.server.namenode.INodeHardLinkFile");
    Constructor<?> ctor = c.getDeclaredConstructor(INodeFile.class, Long.TYPE);
}
}
//57
public class func{
	public void getLogManagerClass(ClassLoader cl){
            logManagerClass = cl.loadClass("org.apache.log4j.LogManager");
}
}
//58
public class func{
	public void setUp(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/properties/initializeCollectionProperties.json", "com.example", config("initializeCollections", false));
        generatedType = resultsClassLoader.loadClass("com.example.InitializeCollectionProperties");
        instance = generatedType.newInstance();
}
}
//59
public class func{
	public void assertJsonRoundTrip(ClassLoader resultsClassLoader,String className,String jsonResource){
        Class generatedType = resultsClassLoader.loadClass(className);
}
}
//60
public class func{
	public void initBValFiltering(){
                final ClassLoader loader = ParentClassLoaderFinder.Helper.get();
                final Object filter = loader.loadClass("org.apache.openejb.bval.BValCdiFilter").newInstance();
}
}
//61
public class func{
	public void initBValFiltering(){
                loader.loadClass("org.apache.bval.cdi.BValExtension").getMethod("setAnnotatedTypeFilter").invoke(null, filter);
}
}
//62
public class func{
	public void checkMyFacesContextFactory(){
    ClassLoader classLoader = JsfUtils.class.getClassLoader();
      Class<?> clazz = classLoader.loadClass("org.apache.myfaces.context.FacesContextFactoryImpl");
}
}
//63
public class func{
	public void enumWithUppercaseProperty(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/enum/enumWithUppercaseProperty.json", "com.example");
        resultsClassLoader.loadClass("com.example.EnumWithUppercaseProperty$TimeFormat");
}
}
//64
public class func{
	public void isolated_class_loader_cannot_load_classes_when_no_given_prefix(){
        ClassLoader cl = isolatedClassLoader().build();
        cl.loadClass("org.mockito.Mockito");
}
}
//65
public class func{
	public void initMain(){
        securityManagerClass = antClassloader.loadClass("org.apache.tools.ant.util.optional.NoExitSecurityManager");
}
}
//66
public class func{
	public void testSanity(){
      ClassLoader loader = createIsolatedClassLoader();
      assertFalse(ProviderMetadata.class.isAssignableFrom(loader
            .loadClass("org.jclouds.providers.JcloudsTestComputeProviderMetadata")));
}
}
//67
public class func{
	public void isGroovyAvailable(){
    ClassLoader classLoader = Loader.getClassLoaderOfClass(EnvUtil.class);
      Class<?> bindingClass = classLoader.loadClass("groovy.lang.Binding");
}
}
//68
public class func{
	public void main(String[] args){
        ClassLoader runclassClassLoader = run_class.getClassLoader();
        System.err.println(runclassClassLoader.loadClass("javax.net.ssl.KeyManager"));
}
}
//69
public class func{
	public void loadClass(String className,ClassLoader classLoader){
        return classLoader.loadClass(className);
}
}
//70
public class func{
	public void testGetApplicationContextClassloader(){
        CamelContext ctx = getOsgiService(CamelContext.class, "(camel.context.symbolicname=CamelBlueprintTestBundle22)", 10000);
        assertNotNull("The application context classloader should not be null", ctx.getApplicationContextClassLoader());
        ClassLoader cl = ctx.getApplicationContextClassLoader();
        assertNotNull("It should load the TestRouteBuilder class", cl.getResource("OSGI-INF/blueprint/test.xml"));
        assertNotNull("It should load the TestRouteBuilder class", cl.loadClass("org.apache.camel.itest.osgi.blueprint.TestRouteBuilder"));
}
}
//71
public class func{
	public void findCompiler(ClassLoader loader){
        Class c = loader.loadClass("com.sun.tools.javac.Main");
}
}
//72
public class func{
	public void getEjbClass(String className,ClassLoader cl){
            return cl.loadClass(className);
}
}
//73
public class func{
	public void setUp(){
    proxyTestClass = (Class<ProxyTest>) testClassLoader.loadClass(ProxyTest.class.getName());
}
}
//74
public class func{
	public void setUp(){
    realClass = (Class<ProxyTestImpl>) testClassLoader.loadClass(ProxyTestImpl.class.getName());
}
}
//75
public class func{
	public void loadClass(String className,ClassLoader classLoader){
                return (ReferenceWithError<Class<? extends D>>)(ReferenceWithError) ReferenceWithError.newInstanceWithoutError((Class<? extends EntityDriver>)classLoader.loadClass(className));
}
}
//76
public class func{
	public void isPresent(final String className,final ClassLoader classLoader){
      return classLoader.loadClass(className) != null;
}
}
//77
public class func{
	public void loadClass(final ClassLoader classLoader,final String className){
        return classLoader.loadClass(className);
}
}
//78
public class func{
	public void getBuildDocHandlerClass(ClassLoader classLoader){
        return classLoader.loadClass("play.core.SBTDocHandler");
}
}
//79
public class func{
	public void getBuildLinkClass(ClassLoader classLoader){
        return classLoader.loadClass("play.core.SBTLink");
}
}
//80
public class func{
	public void doLazyInit(){
            stringValue = classLoader.loadClass(DATUM_CLASS_NAME).getMethod("stringValue", EMPTY_CLASS_ARRAY);
}
}
//81
public class func{
	public void isClassAvailable(final ClassLoader loader,final String name){
            loader.loadClass(name);
}
}
//82
public class func{
	public void loadPluginClass(ClassLoader classLoader){
        String pluginClassName = pluginPropertiesReader.getPluginClassName(classLoader);
        logger.info("Loading plugin class {}", pluginClassName);
            return (Class<? extends Plugin>) classLoader.loadClass(pluginClassName);
}
}
//83
public class func{
	public void loadSessionPackage(ClassLoader loader){
        loader.loadClass
            (basePackage + "StandardManager$PrivilegedDoUnload");
}
}
//84
public class func{
	public void loadClass(String className,ClassLoader classLoader){
            return cast(classLoader.loadClass(className));
}
}
//85
public class func{
	public void loadSessionPackage(ClassLoader loader){
        loader.loadClass(basePackage + "StandardManager$PrivilegedDoUnload");
}
}
//86
public class func{
	public void getClass(ClassLoader classLoader,String typeName){
            return classLoader.loadClass(typeName + "$");
}
}
//87
public class func{
	public void testLoadEntityClassPackage(){
        String className = TestEntity.class.getName();
        Class<?> entityClass = tempClassLoader.loadClass(className);
        assertNotNull("could not load package for entity class that came from NewTempClassLoader", entityClass.getPackage());
}
}
//88
public class func{
	public void getFilter(String expression,ClassLoader classLoader){
        return new AnnotationTypeFilter((Class<Annotation>) classLoader.loadClass(expression));
}
}
//89
public class func{
	public void getFilter(String expression,ClassLoader classLoader){
        return new AssignableTypeFilter(classLoader.loadClass(expression));
}
}
//90
public class func{
	public void newInstance(final String fqcn,final ClassLoader classLoader){
        return newInstance(classLoader.loadClass(fqcn));
}
}
//91
public class func{
	public void forName(ClassLoader cl,String className){
            return cl.loadClass(className);
}
}
//92
public class func{
	public void Jdk6JavaProcessManager(ClassLoader classLoader){
        Validate.notNull( classLoader, "ClassLoader can't be NULL" );
        Class<?> originalClass = classLoader.loadClass( LocalVirtualMachine.ORIGINAL_CLASS_NAME );
        staticVm = WeakCastUtils.staticCast( originalClass, StaticLocalVirtualMachine.class );
}
}
//93
public class func{
	public void resolveClass(ClassLoader classLoader,String className){
      return classLoader.loadClass(className);
}
}
//94
public class func{
	public void test_find_file_in_jar(){
        URL url = getClass().getResource("/org/nutz/lang/one.jar");
        assertNotNull(url);
        ClassLoader classLoader = URLClassLoader.newInstance(new URL[]{url});
        InputStream is = Files.findFileAsStream("org/nutz/plugin/Plugin.w",
                                                classLoader.loadClass("org.nutz.lang.XXXX"));
        assertNotNull(is);
        assertEquals(is.available(), 133);
}
}
//95
public class func{
	public void getLoggerClass(ClassLoader cl){
            loggerClass = cl.loadClass("org.apache.log4j.Logger");
}
}
//96
public class func{
	public void testTutorialGettingStartedTypePool(){
        assertThat(classLoader.loadClass(UnloadedBar.class.getName()).getDeclaredField("qux"), notNullValue(java.lang.reflect.Field.class));
}
}
//97
public class func{
	public void load(ClassLoader classLoader){
                return new Loaded(classLoader.loadClass(componentTypeReference.lookup()), loadedValues);
}
}
//98
public class func{
	public void getServerLoader(final ClassLoader loader){
            return loader.loadClass("org.apache.catalina.Container").getClassLoader();
}
}
//99
public class func{
	public void doLazyInit(){
        ClassLoader classLoader = getClassLoader();
            refClass = classLoader.loadClass(REF);
}
}
//100
public class func{
	public void getClassBy(String className){
      ClassLoader loader = JwbfException.class.getClassLoader();
      return loader.loadClass(className);
}
}
//101
public class func{
	public void HessianServer(final ClassLoader classLoader){
            serializerFactoryClass = classLoader.loadClass("com.caucho.hessian.io.SerializerFactory");
            serializerFactory = serializerFactoryClass.getConstructor(ClassLoader.class).newInstance(loader);
}
}
//102
public class func{
	public void Run(){
      final ClassLoader classpath = JavaCompiler.newClasspath(this.jar);
      final Class<?> clazz = classpath.loadClass("helloworld.HelloWorld");
      ClassExtensions.runMain(clazz);
}
}
//103
public class func{
	public void isClassPresent(String className){
      ClassLoader classLoader = SampleApplication.class.getClassLoader();
      classLoader.loadClass(className);
}
}
//104
public class func{
	public void process(@Nonnull ClassLoader classLoader,@Nonnull Class<?> type,@Nonnull String line){
                String transformationClassName = parts[1].trim();
                    Class<?> transformationClass = classLoader.loadClass(transformationClassName);
                    transformations.put(annotationClassName, (Class<? extends ASTTransformation>) transformationClass);
}
}
//105
public class func{
	public void call(){
      ClassLoader classLoader = ClassLoaderPool.getClassLoader(
        _servletContextName);
        return installSkeleton(
          classLoader, classLoader.loadClass(_skeletonId),
          _targetLocator);
}
}
//106
public class func{
	public void loadClass(String className){
            return cl.loadClass(className.replace('/', '.'));
}
}
//107
public class func{
	public void getActualRemoteControlClientClass(ClassLoader classLoader){
        return classLoader.loadClass("android.media.RemoteControlClient");
}
}
//108
public class func{
	public void findClass(ClassLoader classLoader,String name){
      return classLoader.loadClass(name);
}
}
//109
public class func{
	public void findParentClass(Vector parents,String name){
                return ((ClassLoader) parents.elementAt(i)).loadClass(name);
}
}
//110
public class func{
	public void getDocHandlerFactoryClass(ClassLoader docsClassLoader){
        return docsClassLoader.loadClass("play.docs.SBTDocHandlerFactory");
}
}
//111
public class func{
	public void loadAsClass(){
                clazz = loader.loadClass(getClassName());
}
}
//112
public class func{
	public void testJavaCoreNotOnClassPath(){
      ClassLoader classLoader = org.eclipse.xtext.xbase.XbaseRuntimeModule.class.getClassLoader();
      classLoader.loadClass("org.eclipse.jdt.core.JavaCore");
}
}
//113
public class func{
	public void loadClass(final ClassLoader classLoader,final String className){
            ejbClass = classLoader.loadClass(className);
}
}
//114
public class func{
	public void canLoad(final ClassLoader classLoader,final String type){
            classLoader.loadClass(type);
}
}
//115
public class func{
	public void getDriver(ClassLoader cl){
            driverClass = cl.loadClass("org.h2.Driver");
}
}
//116
public class func{
	public void loadClass(ClassLoader classLoader,String className){
            return classLoader.loadClass(className);
}
}
//117
public class func{
	public void load(ClassLoader classLoader){
                return new Loaded<V>((Class<V>) classLoader.loadClass(componentType.getName()), loadedValues);
}
}
//118
public class func{
	public void shouldAllowEmptyPackageName(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/emptyPackageName", "",
                config("includes", new String[] {}, "excludes", new String[] {}));
        resultsClassLoader.loadClass("levelOne.levelTwo.LevelTwoType");
}
}
//119
public class func{
	public void classOrNull(ClassLoader loader,String className){
            return loader.loadClass(className);
}
}
//120
public class func{
	public void testNonLinkingClass(){
            classLoader.loadClass(ClassA.class.getName());
}
}
//121
public class func{
	public void getLevelClass(ClassLoader cl){
            levelClass = cl.loadClass("org.apache.log4j.Level");
}
}
//122
public class func{
	public void loadClass(String clazz,Context context){
    ClassLoader cl = getClassLoaderOfObject(context);
    return cl.loadClass(clazz);
}
}
//123
public class func{
	public void createPlugin(String classNameCheck,String pluginName){
            ClassLoader loader = VMPluginFactory.class.getClassLoader();
            return (VMPlugin) loader.loadClass(pluginName).newInstance();
}
}
//124
public class func{
	public void callSendSystemOutAndErrToSLF4JInClassLoader(ClassLoader classLoader){
        Class<?> sysOutOverSLF4JClass = classLoader.loadClass(SysOutOverSLF4J.class.getName());
}
}
//125
public class func{
	public void loadAndCompareClasses(String originalClassName,String delegateClassName){
            ClassLoader classLoader = TestDelegates.class.getClassLoader();
            Class<?> delegateClass = classLoader.loadClass(delegateClassName);
            compare(originalClass, delegateClass);
}
}
//126
public class func{
	public void getSeparateClassLoadedPdx(boolean field1First){
    Class clazz1 = loader1.loadClass(getClass().getPackage().getName() + ".SeparateClassloaderPdx");
    Constructor constructor = clazz1.getConstructor(boolean.class);
    constructor.setAccessible(true);
}
}
//127
public class func{
	public void loadServletsPackage(ClassLoader loader){
        loader.loadClass(basePackage + "DefaultServlet");
}
}
//128
public class func{
	public void loadTestClass(String className){
               ClassLoader classLoader = JMXTestRunner.class.getClassLoader();
               return classLoader.loadClass(className);
}
}
//129
public class func{
	public void isClassAvailable(final ClassLoader loader,final String name){
            loader.loadClass(name);
}
}
//130
public class func{
	public void canLoadClass(ClassLoader classloader,String classname){
      classloader.loadClass(classname);
}
}
//131
public class func{
	public void loadTomcatPackage(ClassLoader loader){
        loader.loadClass(basePackage + "util.security.PrivilegedSetTccl");
}
}
//132
public class func{
	public void testWithoutPatch(){
                appClassLoader.loadClass(AnonymousClassInfo.class.getName()).getClassLoader());
}
}
//133
public class func{
	public void getLoggingEvents(ClassLoader classLoader){
        Class<?> testLoggerFactoryClass = classLoader.loadClass(TestLoggerFactory.class.getName());
}
}
//134
public class func{
	public void type(final ClassLoader loader,final Injection next){
            return loader.loadClass(next.getClassname()).getDeclaredField(next.getName()).getGenericType();
}
}
//135
public class func{
	public void doLazyInit(){
            createXML = classLoader.loadClass(XML_TYPE_CLASS_NAME).getMethod("createXML", Connection.class,
                    String.class);
}
}
//136
public class func{
	public void loadUtilPackage(ClassLoader loader){
        loader.loadClass(basePackage + "ParameterMap");
}
}
//137
public class func{
	public void CommonReflector(@Nonnull ClassLoader surefireClassLoader){
            startupReportConfiguration = surefireClassLoader.loadClass( StartupReportConfiguration.class.getName() );
}
}
//138
public class func{
	public void loadClassFromClassloader(ClassLoader loader,String beanClassName){
      return loader.loadClass( beanClassName );
}
}
//139
public class func{
	public void loadLoaderPackage(ClassLoader loader){
        loader.loadClass
            (basePackage +
             "loader.WebappClassLoader$PrivilegedFindResourceByName");
}
}
//140
public class func{
	public void process(@Nonnull ClassLoader classLoader,@Nonnull String line){
                line = line.trim();
                    classes.add(classLoader.loadClass(line));
                    LOG.warn("'" + line + "' could not be resolved as a Class");
}
}
//141
public class func{
	public void getFileFromJBossVfsURL(URL url,ClassLoader loader){
        Class<?> virtualFileClass = loader.loadClass("org.jboss.vfs.VirtualFile");
        Method getNameMethod = Reflections.getMethod(virtualFileClass, "getName");
        File physicalFile = (File) Reflections.invoke(getPhysicalFileMethod, virtualFile);
        checkNotNull(physicalFile, "org.jboss.vfs.VirtualFile.getPhysicalFile() returned null");
        String name = (String) Reflections.invoke(getNameMethod, virtualFile);
        checkNotNull(name, "org.jboss.vfs.VirtualFile.getName() returned null");
}
}
//142
public class func{
	public void loadJavaxPackage(ClassLoader loader){
        loader.loadClass("javax.servlet.http.Cookie");
}
}
//143
public class func{
	public void isClassPresent(String name){
         ClassLoader classLoader = getThreadContextClassLoader();
         classLoader.loadClass(name); 
}
}
//144
public class func{
	public void invokeMain(ClassLoader classloader,String classname,String[] args){
        Class<?> invoked_class = classloader.loadClass(classname);
}
}
//145
public class func{
	public void addClasses(WebArchive war,String clazz,ClassLoader cl){
            Class<?> current = cl.loadClass(clazz);
            addClasses(war, current);
}
}
//146
public class func{
	public void antTaskExecutesSuccessfullyWithValidSchemas(){
        File outputDirectory = invokeAntBuild("/ant/build.xml");
        ClassLoader resultsClassLoader = compile(outputDirectory, buildCustomClasspath());
        Class<?> generatedClass = resultsClassLoader.loadClass("com.example.WordDelimit");
}
}
//147
public class func{
	public void additionalPropertiesAreNotDeserializableWhenDisallowed(){
        ClassLoader resultsClassLoader = generateAndCompile("/schema/additionalProperties/noAdditionalProperties.json", "com.example");
        Class<?> classWithNoAdditionalProperties = resultsClassLoader.loadClass("com.example.NoAdditionalProperties");
        mapper.readValue("{\"a\":\"1\", \"b\":2}", classWithNoAdditionalProperties);
}
}
//148
public class func{
	public void loadJobExecutorClass(ClassLoader processApplicationClassloader,String jobExecutorClassname){
      return (Class<? extends JobExecutor>) processApplicationClassloader.loadClass(jobExecutorClassname);
}
}
//149
public class func{
	public void getClazz(ClassLoader builtProjectClassLoader,String className){
      return builtProjectClassLoader.loadClass(className);
      throw new JavascriptClassGenerationException(className, "Cannot load class:" + e);
}
}
//150
public class func{
	public void buildAndTest(InjectionNode delegateInjectionNode){
        Class<Provider<MockDelegate>> generatedFactoryClass = (Class<Provider<MockDelegate>>) classLoader.loadClass(TEST_PACKAGE_FILENAME.getCanonicalName());
        assertNotNull(generatedFactoryClass);
        Provider<MockDelegate> provider = generatedFactoryClass.newInstance();
        runMockDelegateTests(provider.get());
}
}
//151
public class func{
	public void loadExtension(String serviceClassName,final ClassLoader loader){
            return (Class<Extension>) loader.loadClass(serviceClassName);
}
}
//152
public class func{
	public void isJaninoAvailable(){
    ClassLoader classLoader = EnvUtil.class.getClassLoader();
      Class<?> bindingClass = classLoader.loadClass("org.codehaus.janino.ScriptEvaluator");
}
}
//153
public class func{
	public void loadClassSilently(ClassLoader cl,String name){
      clz = cl.loadClass(name);
}
}
//154
public class func{
	public void loadClass(String name){
        ClassLoader cls = new MyClassLoader();
        return cls.loadClass(name);
}
}
//155
public class func{
	public void loadClass(String name,ClassLoader loader){
            return loader.loadClass(name);
}
}
//156
public class func{
	public void startCodeGen(String[] args,ClassLoader classLoader){
      Class<?> codeGenRunner = classLoader.loadClass(serviceCodeGenClassName);
      startCodeGen(args, codeGenRunner);
}
}
//157
public class func{
	public void loadRuntimeClass(ClassLoader loader){
            return (Class<? extends Qi4jRuntime>) loader.loadClass( "org.qi4j.runtime.Qi4jRuntimeImpl" );
}
}
//158
public class func{
	public void loadClass(ClassLoader targetClassLoader,String className){
            return (Class<? extends T>) targetClassLoader.loadClass(className);
}
}
//159
public class func{
	public void findClass(String clazz){
        ClassLoader loader = new InVivoClassLoader(clazz, context);
        return loader.loadClass(clazz);
}
}
//160
public class func{
	public void resetPropetyCache(){
            ClassLoader classLoader = ResetSpringStaticCaches.class.getClassLoader();
            Map annotationCache = (Map) ReflectionHelper.get(null,
                    classLoader.loadClass("org.springframework.core.convert.Property"), "annotationCache");
            annotationCache.clear();
}
}
//161
public class func{
	public void isOnClasspath(String className,ClassLoader classLoader){
            classLoader.loadClass(className);
}
}
//162
public class func{
	public void getPluginClass(String packageName,String className){
        Context pluginContext = mContext.createPackageContext(packageName,
                Context.CONTEXT_INCLUDE_CODE |
                Context.CONTEXT_IGNORE_SECURITY);
        ClassLoader pluginCL = pluginContext.getClassLoader();
        return pluginCL.loadClass(className);
}
}
//163
public class func{
	public void assertStored(ClassLoader loader,Object expected){
            Class<?> store = loader.loadClass("com.example.Store");
            Field field = store.getDeclaredField("result");
            Object result = field.get(null);
}
}
//164
public class func{
	public void dependencyJarsAreLoadedInThePluginClassLoader(){
        ClassLoader classLoader = plugin.getClass().getClassLoader();
        classLoader.loadClass("org.apache.commons.math.random.RandomGenerator");
}
}
//165
public class func{
	public void loadUtilPackage(ClassLoader loader){
        loader.loadClass(basePackage + "util.DefaultAnnotationProcessor$4");
}
}
//166
public class func{
	public void checkHibernateEjb(ClassLoader classLoader){
            classLoader.loadClass("org.hibernate.ejb.HibernatePersistence");
}
}
//167
public class func{
	public void newInstanceInClassLoader(Class<E> classToReturn,ClassLoader classLoader,Class<? extends E> classToGetInstanceOf,Class<?>[] constructorArgTypes,Object... constructorArgs){
        Class<?> class1 = classLoader.loadClass(classToGetInstanceOf.getName());
        Object newInstance = Whitebox.invokeConstructor(class1, constructorArgTypes, constructorArgs);
        return CrossClassLoaderTestUtils.moveToCurrentClassLoader(classToReturn, newInstance);
}
}
//168
public class func{
	public void loadClassAtPath(String baseDir,String path){
      return classLoader.loadClass(getBinaryName(path));
}
}
//169
public class func{
	public void initializeNMS(ClassLoader loader,String nmsPackage){
            READ_LIMITER_CLASS = loader.loadClass(nmsPackage + ".NBTReadLimiter");
}
}
//170
public class func{
	public void getPOJOInterfaces(TargetMetaDef targetMetaDef){
      pojoClass = classLoader.loadClass(targetMetaDef.getClassName());
}
}
//171
public class func{
	public void interfaceClass(final ClassLoader classLoader){
        getLog().debug("generating command line interface report for " + interfac3);
            return classLoader.loadClass(interfac3);
            throw new MavenReportException("Unable to load interface class " + interfac3, e);
}
}
