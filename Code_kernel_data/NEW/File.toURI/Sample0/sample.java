//0
public class func{
	public void basedir_configURLonly(){
        createLoader(null, //
                     new File(srcdir, "aaa/config.xml").toURI().toURL(), // basedir=srcdir/aaa
                     new SearchPath("../WEB-INF", true), // srcdir/aaa/../WEB-INF
                     new SearchPath(new File(srcdir, "aaa/bbb").getAbsolutePath(), false)); // srcdir/aaa/bbb
}
}
//1
public class func{
	public void toFileList(File parent,List<String> names){
        for (String name : names) {
            // don't call getCanonicalFile here because otherwise we'll be forced to call getCanonical* everywhere
            result.add(new File(new File(parent, name).toURI().normalize()));
        }
}
}
//2
public class func{
	public void setUp(){
    file = new File("./tmp");
    rm(file);
    URI uri = new File(file,"hdfs").toURI();
    Path hdfsDirPath = new Path(uri.toString());
    directory = new HdfsDirectory(hdfsDirPath);
}
}
//3
public class func{
	public void getProjectDataPath(){
    File home = URIUtils.getAbsoluteFile(getProjectHome());
    home = new File(home, "_data");
    home = new File(home, getProjectID());
    return home.toURI();    
}
}
//4
public class func{
	public void getWadlPath(String uri,String configRoot){
        if (Paths.get(uri).isAbsolute()) {
            return new File(uri).toString();
        } else {
            return new File(configRoot, uri).toURI().toString();
        }
}
}
//5
public class func{
	public void basedir_rel(){
        createLoader("..", // srcdir/aaa/..
                     new File(srcdir, "aaa/config.xml").toURI().toURL(), // srcdir/aaa
                     new SearchPath("WEB-INF", true), // srcdir/WEB-INF
                     new SearchPath(new File(srcdir, "aaa").getAbsolutePath(), false)); // srcdir/aaa
}
}
//6
public class func{
	public void parseManifestFile(String pManifestPath){
    Document document = parseXML(new File(pManifestPath).toURI().toURL());
    String pPath = new File(pManifestPath).getParent();
    return parsePlugin(document, pPath);
}
}
//7
public class func{
	public void BldProject(URI relLoc,Properties overrides){
        loc = new File(".").toURI().resolve(relLoc).normalize();
        config = new BldConfig(loc);
        convert = new BldConverter(config);
        File f = new File(loc);
        lastModified = f.lastModified();
        baseDir = f.getParentFile();
}
}
//8
public class func{
	public void doInBackground(){
      URI osPath = new File(ConfigurationSettings.getOutputSheetsDir()).toURI();
      File xsltFile = new File(osPath.resolve(uri));
}
}
//9
public class func{
	public void addUserDefinedFolders(List<URL> urls){
    if (this.folders != null) {
      for (String folder : this.folders) {
        urls.add(new File(folder).toURI().toURL());
      }
    }
}
}
//10
public class func{
	public void addShipResources(Set<String> fileNames){
        for (String fileName : fileNames) {
            fileName = fileName.trim();
            if (fileName.length() > 0) {
                URL url = new File(fileName).toURI().toURL();
                addExtraResource(url);
            }
        }
}
}
//11
public class func{
	public void normaliseFilePathToUrl(String path){
        if(path.startsWith("file:") 
                || path.startsWith("http:") 
                || path.startsWith("https:")) {
            return new URI(path).toURL();
        } else {
            return new File(path).toURI().toURL();
        }
}
}
//12
public class func{
	public void createClassLoader(ClassLoader parent){
        getLog().debug("Using classpath: " + classpathElements);
        int size = classpathElements.size();
        for (int i = 0; i < size; i++) {
            String name = (String) classpathElements.get(i);
            File file = new File(name);
            urls[i] = file.toURI().toURL();
            getLog().debug("URL: " + urls[i]);
        }
        URLClassLoader loader = new URLClassLoader(urls, parent);
}
}
//13
public class func{
	public void addClassPath(String path){
    if (path != null) {
      URL url = new File(path).toURI().toURL();
      URL[] urls = new URL[appClassPath.length + 1];
      System.arraycopy(appClassPath, 0, urls, 0, appClassPath.length);
      urls[appClassPath.length] = url;
      appClassPath = urls;
    }
}
}
//14
public class func{
	public void getJarUrls(String jars){
        for (String token : tokens) {
            File file = new File(token);
            urls.add(file.toURI().toURL());
        }
}
}
//15
public class func{
	public void addProject(Collection<IProject> projects,String location){
    for(IContainer container : root.findContainersForLocationURI(new File(location).toURI())) {
      if(container instanceof IProject) {
        projects.add((IProject) container);
        break;
      }
    }
}
}
//16
public class func{
	public void getURLs(final String[] paths){
            for (final String path : paths) {
                try {
                    urls.add(new File(path).toURI().toURL());
                } catch (final MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
}
}
//17
public class func{
	public void buildExpectedClassPath(String expectedClassPath){
        for (String path : paths) {
            urls.add(new File(path).toURI().toURL());
        }
}
}
//18
public class func{
	public void toFileUrls(final List<String> thirdPartyJars){
        for (String path : thirdPartyJars) {
            thirdPartyClassPath.add(new File(path).toURI().toURL());
        }
}
}
//19
public class func{
	public void getCompiledClassloader(){
        for (Object object : project.getTestClasspathElements()) {
          String path = (String) object;
          urls.add(new File(path).toURI().toURL());
        }
        return new URLClassLoader(urls.toArray(new URL[urls.size()]), getClass().getClassLoader());
}
}
//20
public class func{
	public void primaryClassLoader(List<String> classpath){
    URL[] urls = new URL[classpath.size()];
    for (String element : classpath) {
      urls[index] = new File(element).toURI().toURL();
      index = index + 1;
    }
    return new URLClassLoader(urls);
}
}
//21
public class func{
	public void resolveJarUrl(final String jarUrl){
    String jarUrlS = environmentSubstitute( jarUrl );
    if ( jarUrlS.indexOf( "://" ) == -1 ) {
      // default to file://
      File jarFile = new File( jarUrlS );
      return jarFile.toURI().toURL();
    } else {
      return new URL( jarUrlS );
    }
}
}
//22
public class func{
	public void ensureFilePathIsUrl(String url){
        if (isFilePath(url) && !url.startsWith("file:")) {
            try {
                return new File(url).toURI().toURL().toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
}
}
//23
public class func{
	public void urlClassLoader(List<String> runtimeClassPath){
      URL[] urls = new URL[runtimeClassPath.size()];
      for(String s : runtimeClassPath) {
        urls[i++] = new File(s).toURI().toURL();
      }
      return new URLClassLoader(urls);
}
}
//24
public class func{
	public void makeUrl(String filename){
        if (filename.indexOf("://") > 0 || filename.startsWith("file:")) {
            url = filename;
        } else {
            url = new File(filename).toURI().toString();
        }
}
}
//25
public class func{
	public void getAsUrlList(){
        for (String path : unmodifiableElements) {
            File f = new File(path);
            urls.add(f.toURI().toURL());
        }
}
}
//26
public class func{
	public void openFileDialog(){
    FileDialog fileDialog = new FileDialog(owner.getShell(),  SWT.OPEN);
    String file = fileDialog.open();
    if (file!=null) {
      return new File(file).toURI();
    }
}
}
//27
public class func{
	public void widgetSelected(SelectionEvent e){
        FileDialog dialog = new FileDialog(parent.getShell());
        String file = dialog.open();
        if (file != null)
        {
          text.setText(new File(file).toURI().toString());
        }
}
}
//28
public class func{
	public void load(String filename){
        if (filename != null) {
            setTopologyLocation(new File(filename).toURI());
        } else {
            load(getTopologyLocation());
        }
}
}
//29
public class func{
	public void toUri(final String s){
        URI uri = createURI(s);
        if (uri.getScheme() != null) {
            final Matcher matcher = supportedUriSchemeRe.matcher(uri.getScheme());
            Preconditions.checkArgument(matcher.find(), "Supported URI schemes are: http, https and file");
            return uri;
        }
        return new File(s).toURI().normalize();
}
}
//30
public class func{
	public void doGetResource(String path){
        String realPath = servletContext.getRealPath(path);
        if (realPath != null) {
          return new File(realPath).toURI().toURL();
        }
        else {
          return servletContext.getResource(path);
        }
}
}
//31
public class func{
	public void accept(final File aDir,final String aName){
        if ( aName.endsWith( ".jar" ) )
        {
          plugins.add( new File( aDir, aName ).toURI().toString() );
        }
}
}
//32
public class func{
	public void handleExternalLocationChanged(){
    final String text= fExternalLocationControl.getText();
    if (text != null && !"".equals(text)) //$NON-NLS-1$
      fScriptLocation= new File(text).toURI();
    else
      fScriptLocation= null;
}
}
//33
public class func{
	public void loadInternal(String method,String url){
        if (!TextUtils.isEmpty(url) && url.startsWith("/"))
            url = new File(url).toURI().toString();
}
}
//34
public class func{
	public void processURIArg(String arg){
    if (arg == null) {
      return null;
    } else {
      return new File(arg).toURI();
    }
}
}
//35
public class func{
	public void initialize(){
        if (shapefile == null) {
            throw new IllegalStateException("shapefile path is not set");
        }
        ShapefileDataStore store = new ShapefileDataStore(new File(shapefile).toURI().toURL());
        String name = store.getTypeNames()[0];
        FeatureSource source = store.getFeatureSource(name);
        collection = source.getFeatures();
}
}
//36
public class func{
	public void codeLocation(){
        String outputDirectory = outputDirectory();
            return outputDirectory != null ? new File(outputDirectory).toURI().toURL() : null;
}
}
//37
public class func{
	public void main(String[] aaParamters){
        File file = new File( "\\\\somehost\\someshare\\somefile.ext" );
        URI uri = file.toURI();
        if (!(uri.toURL().toURI().equals(uri))) {
            throw new RuntimeException("Test failed : (uri.toURL().toURI().equals(uri)) isn't hold");
        }
}
}
//38
public class func{
	public void cleanupReplacement(String... expectedFiles){
      for (String efile : expectedFiles)
        expected.add(new File(rootTabletDir, efile).toURI().toString());
      Assert.assertEquals(expected, new HashSet<String>(ret));
}
}
//39
public class func{
	public void getWSDLURL(String location){
        if (location.startsWith("http://")) {
            return new URL(location);
        } else {
            return new File(getAbsolutePath(location)).toURI().toURL();
        }
}
}
//40
public class func{
	public void toUrls(Collection<String> paths){
    for (String s : paths) {
      urls.add(new File(s).toURI().toURL());
    }
}
}
//41
public class func{
	public void classpathToUrls(String[] classPath,List<URL> urls){
            for (String cp : classPath)
                urls.add(new File(cp).toURI().toURL());
}
}
//42
public class func{
	public void toUrls(final Set<String> strings){
        for (final String s : strings) {
            try {
                urls.add(new File(s).toURI().toURL());
            } catch (final MalformedURLException e) {
                throw new IllegalArgumentException(e);
            }
        }
}
}
//43
public class func{
	public void configureDescriptor(final AppModule appModule,final Descriptor descriptor){
        URL resource = appModule.getClassLoader().getResource(descriptor.path());
            appModule.getAltDDs().put(descriptor.name(), resource == null ? new File(descriptor.path()).toURI().toURL() : resource);
}
}
//44
public class func{
	public void getConfigLocationUri(){
        if (getConfigName() != null) {
            return String.valueOf(new File(getConfigName()).toURI());
        }
}
}
//45
public class func{
	public void getRelativeBaseDirPath(String baseDir){
        String path = new File(".").toURI().relativize(new File(baseDir).toURI()).getPath();
        if (StringUtils.isEmpty(path)) {
            path = ".";
        }
}
}
//46
public class func{
	public void setUp(){
    if(m_topologyProvider == null) {
      m_topologyProvider = new SimpleGraphProvider();
      m_topologyProvider.setTopologyLocation(new File("target/test-classes/graph.xml").toURI());
    }
    m_topologyProvider.resetContainer();
}
}
//47
public class func{
	public void Shell(BundleContext context,CommandProcessor processor){
        String baseDir = context.getProperty("gosh.home");
        baseDir = (baseDir == null) ? context.getProperty("user.dir") : baseDir;
        baseURI = new File(baseDir).toURI();
}
}
//48
public class func{
	public void normalizeName(String name){
        if (StringUtils.startsWithIgnoreCase(name, "classpath:")) {
            name = StringUtils.removeStartIgnoreCase(name, "classpath:");
        }
        name = "/"+StringUtils.strip(name, "/\\");
        String path = new File(name).toURI().normalize().getRawPath();
        return StringUtils.stripStart(path, "/\\");
}
}
//49
public class func{
	public void validateXliffFile(String fileLocalPath){
    IFile file = root.getFileForLocation(URIUtil.toPath(new File(fileLocalPath).toURI()));
    if (file == null) {
      Shell shell = Display.getDefault().getActiveShell();
      MessageDialog.openError(shell, Messages.getString("file.XLFValidator.msgTitle"),
          Messages.getString("file.XLFValidator.msg9"));
      return false;
    }
    return validateXliffFile(file);
}
}
//50
public class func{
	public void getClassPaths(){
    for ( int i = 0; i < urls.length; i++ ) {
      urls[i] = new File( paths[i] ).toURI( ).toURL( );
    }
}
}
//51
public class func{
	public void addResources(List<URL> urls){
      for (Resource resource : this.project.getResources()) {
        File directory = new File(resource.getDirectory());
        urls.add(directory.toURI().toURL());
        FileUtils.removeDuplicatesFromOutputDirectory(this.classesDirectory,
            directory);
      }
}
}
//52
public class func{
	public void urls(final String line,final StrSubstitutor lookup){
        for (final String location : ProvisioningUtil.realLocation(lookup.replace(line))) { // should have 1 item
            try {
                urls.add(new File(location).toURI().toURL());
            } catch (final MalformedURLException e) {
                throw new IllegalArgumentException(e);
            }
        }
}
}
//53
public class func{
	public void manifestClasspath(final File[] sourceDirectory,final File outputDirectory,final List<String> compileClasspathElements){
    for (String classpathElement : compileClasspathElements) {
      cp = cp + new File(classpathElement).toURI() + " ";
    }
    cp = cp.replaceAll("\\s+", "\\ ");
}
}
//54
public class func{
	public void main(String[] args){
        File file = new File(System.getProperty("test.src", "."), "ding.dls");
        URL url = file.toURI().toURL();
}
}
//55
public class func{
	public void addCP(){
        List runtimeClasspathElements = project.getRuntimeClasspathElements();
        for (Object runtimeClasspathElement : runtimeClasspathElements) {
            String element = (String) runtimeClasspathElement;
            addUrl(new File(element).toURI().toURL());
        }
}
}
//56
public class func{
	public void getWorkingDirectory(){
      File file = new File(System.getProperty("user.dir"));
      return file.toURI().toURL();
}
}
//57
public class func{
	public void createInstrumentationClassFinder(final String classPath){
    for (StringTokenizer tokenizer = new StringTokenizer(classPath, File.pathSeparator); tokenizer.hasMoreTokens();) {
      final String s = tokenizer.nextToken();
      urls.add(new File(s).toURI().toURL());
    }
    final URL[] urlsArr = (URL[])urls.toArray(new URL[urls.size()]);
    return new InstrumentationClassFinder(urlsArr);
}
}
//58
public class func{
	public void testBindingFormatStringURL(){
        File file = new File(INPUT_SRC_OXM_XML);
        URL url = file.toURI().toURL();
        properties.put(JAXBContextFactory.ECLIPSELINK_OXM_XML_KEY, url.toExternalForm());
        JAXBContext jCtx = (JAXBContext) JAXBContextFactory.createContext(classes, properties, loader);
        doTestInputSrc(jCtx);
}
}
//59
public class func{
	public void url_$_is_opened(String s){
        File file = new File( targetReportDir, "index.html" );
        String url = file.toURI().toURL().toString() + s;
        webDriver.get( url );
}
}
//60
public class func{
	public void setDBContextClassLoader(String jarName){
    String root = System.getProperty("derby.system.home", System.getProperty("user.dir"));
    File jar = new File(root, jarName);
    URLClassLoader cl = new URLClassLoader(new URL[] {jar.toURI().toURL()});
}
}
//61
public class func{
	public void testUnmarshalStreamSourceURLJSON(){
        File file = new File(ClassLoader.getSystemResource(JSON_RESOURCE).getFile());
        String systemId = file.toURI().toURL().toExternalForm();
        StreamSource ss = new StreamSource(systemId);
        Object testObject = jaxbUnmarshaller.unmarshal(ss);
        jsonToObjectTest(testObject);
}
}
//62
public class func{
	public void testUnmarshalStreamSourceURLJSONWithClass(){
        File file = new File(ClassLoader.getSystemResource(JSON_RESOURCE).getFile());
        String systemId = file.toURI().toURL().toExternalForm();
        StreamSource ss = new StreamSource(systemId);
        JAXBElement jbe = jaxbUnmarshaller.unmarshal(ss, EmployeeCollection.class);
        jsonToObjectTest(jbe.getValue());
}
}
//63
public class func{
	public void addFileToCatalog(){
        File file = new File( "C:\\data\\cities.shp" );
        URL url = file.toURI().toURL();
}
}
//64
public class func{
	public void getSavedWsdlUrl(String fileBaseName,File targetFolder){
        File file = new File(targetFolder, fileBaseName + ".wsdl");
            return file.toURI().toURL();
}
}
//65
public class func{
	public void initROCF(){
    File file = new File(SCAN1_FILE_AS_STR);
    ConfigurationWatchListUtil.setMainWatchURL(loggerContext, file.toURI().toURL());
}
}
//66
public class func{
	public void testXmlReader(){
        File file = new File("src/test/resources/reader/sample.xml");
        final URL testdata  = file.toURI().toURL();
        reader.parse(testdata, creator);
        assertEquals("Did not create expected number of nodes", 1, creator.size());
}
}
//67
public class func{
	public void cachesWsdl(){
        File file = new File(UrlWsdlLoaderTest.class.getResource("/test6/TestService.wsdl").toURI());
        WsdlLoader loader = new UrlWsdlLoader(file.toURI().toURL().toString());
        DefinitionCacheConfig cachedWsdl = WsdlUtils.cacheWsdl(loader);
}
}
//68
public class func{
	public void fileToURLAndBack(){
    File file = new File("a b.xml");
    URL url = file.toURI().toURL();
}
}
//69
public class func{
	public void setUp(){
        urls.add(new File("./target/test-classes").toURI().toURL());
}
}
//70
public class func{
	public void pathToUrl(String path){
            return new File(path).toURI().toURL();
}
}
//71
public class func{
	public void addPath(String path){
      url = new File(path).toURI().toURL();
      addURL(url);
      logger.warning("Don't understand path: " + path);
}
}
//72
public class func{
	public void EOModelHelper(String path){
        this(new File(path).toURI().toURL());
}
}
//73
public class func{
	public void loadEOModel(String path,boolean generateClientClass){
        return loadEOModel(new File(path).toURI().toURL(), generateClientClass);
}
}
//74
public class func{
	public void loadModeIndex(String path){
        return loadModeIndex(new File(path).toURI().toURL());
}
}
//75
public class func{
	public void toAbsolutePath(final String path){
            final URL url = new File(path).toURI().toURL();
            return toFilePath(url);
            throw new RuntimeException("Failed to resolve relative path for: " + path, e);
}
}
//76
public class func{
	public void setUp(){
        urls.add(new File("./target/test-classes").toURI().toURL());
}
}
//77
public class func{
	public void generateIndepInstallDirPath(){
    String installDirPath = System.getProperty("osgi.install.area").replace(URI_FILE_PREFIX, "");
    File installDirFile = new File(installDirPath);
    URI platformIndependentFile = installDirFile.toURI();
    String platformIndepInstallDirPath = platformIndependentFile.toString();
}
}
//78
public class func{
	public void testLoadFromJarFile(){
    ClassLoader tempLoader = new URLClassLoader(new URL[]{new File("src/test/resources/SpyDotPropertiesTest.jar").toURI().toURL()}, currentThreadLoader);
}
}
//79
public class func{
	public void loadClassAtPath(String baseDir,String path){
      ClassLoader classLoader = new URLClassLoader(new URL[] {new File(baseDir).toURI().toURL()});
}
}
//80
public class func{
	public void getClassLoader(JavaArchive jar){
        jar.as(ExplodedExporter.class).exportExploded(tmp, "root");
        URL url = new File(tmp, "root").toURI().toURL();
        return new URLClassLoader(new URL[]{url});
}
}
//81
public class func{
	public void resourcesInJar(){
        URLClassLoader classLoader = new URLClassLoader(
            new URL[] { new File("src/test/resources/classpath-scanner/classpath-scanner.jar").toURI().toURL() });
}
}
//82
public class func{
	public void getAnnotationSearchClassLoader(){
        return new URLClassLoader( new URL[] { new File( getProject().getBuild().getOutputDirectory() ).toURI().toURL() } );
}
}
//83
public class func{
	public void getFileSystem(){
      URL url = new File(getFile(), "jrt-fs.jar").toURI().toURL();
      ClassLoader loader = new URLClassLoader(new URL[]{url}, null);
      fs = call(newFileSystem, ROOT_URI, EMPTY_ENV, loader);
      myFileSystem = new SoftReference<Object>(fs);
}
}
//84
public class func{
	public void resourcesInDirectory(){
        URLClassLoader classLoader = new URLClassLoader(new URL[] { new File("src/test/resources/classpath-scanner/classes/").toURI().toURL() });
}
}
//85
public class func{
	public void setupDirectory(){
    URI uri = new File(file, "hdfs-join").toURI();
    Path hdfsDirPath = new Path(uri.toString());
}
}
//86
public class func{
	public void setupDirectory(){
    URI uri = new File(file, "hdfs").toURI();
    Path hdfsDirPath = new Path(uri.toString());
}
}
//87
public class func{
	public void setupDirectory(){
    URI uri = new File(file, "hdfs").toURI();
    Path hdfsDirPath = new Path(uri.toString());
}
}
//88
public class func{
	public void messageSource(){
        File file = new File(System.getProperty("user.dir"), "src/main/webapp/WEB-INF/messages");
        messageSource.setBasename(file.toURI().toString());
}
}
//89
public class func{
	public void toURI(){
        Assert.assertEquals(repo.configToHttpUri("@apple:1.0"), new File(repo.getTargetRepo(), "prod/apple/1.0/apple-1.0.config").toURI());
        Assert.assertEquals(repo.binaryToHttpUri("apple:1.0"), new File(repo.getTargetRepo(), "food/fruit/apple/1.0/apple-1.0.tar.gz").toURI());
}
}
//90
public class func{
	public void testWebapp_2_2(){
        File appDir = new File("test/webapp-2.2");
                new JspCServletContext(null, appDir.toURI().toURL(), null);
        Assert.assertEquals(2, context.getEffectiveMajorVersion());
        Assert.assertEquals(2, context.getEffectiveMinorVersion());
}
}
//91
public class func{
	public void testWebapp_3_1(){
        File appDir = new File("test/webapp-3.1");
        JspCServletContext context = new JspCServletContext(
                null, appDir.toURI().toURL(), null, false, false);
        Assert.assertEquals(3, context.getEffectiveMajorVersion());
        Assert.assertEquals(1, context.getEffectiveMinorVersion());
}
}
//92
public class func{
	public void testWebapp_2_2(){
        File appDir = new File("test/webapp-2.2");
        JspCServletContext context = new JspCServletContext(
                null, appDir.toURI().toURL(), null, false, false);
        Assert.assertEquals(2, context.getEffectiveMajorVersion());
        Assert.assertEquals(2, context.getEffectiveMinorVersion());
}
}
//93
public class func{
	public void testWebresources(){
        File appDir = new File("test/webresources/dir1");
                new JspCServletContext(null, appDir.toURI().toURL(), null);
        Assert.assertEquals(3, context.getEffectiveMajorVersion());
        Assert.assertEquals(1, context.getEffectiveMinorVersion());
}
}
//94
public class func{
	public void createBridgeContext(FontInfo fontInfo){
        FOUserAgent userAgent = FopFactory.newInstance(new File(".").toURI()).newFOUserAgent();
}
}
//95
public class func{
	public void testPDFA(){
        FOUserAgent userAgent = FopFactory.newInstance(new File(".").toURI()).newFOUserAgent();
        userAgent.getRendererOptions().put("pdf-a-mode", "PDF/A-1b");
}
}
//96
public class func{
	public void initialize(){
            fopFactory = FopFactory.newInstance(new File(".").toURI());
}
}
//97
public class func{
	public void parseConfig(RendererConfBuilder builder){
        userAgent = FopFactory.newInstance(
                new File(".").toURI(), builder.endRendererConfig().build()).newFOUserAgent();
}
}
//98
public class func{
	public void createPath(String strCleanPath){
        File file = new File(strCleanPath);
        URI uri = file.toURI();
        return new Path(uri.getPath());
}
}
//99
public class func{
	public void prepare(){
            fopFactory = FopFactory.newInstance(new File(".").toURI());
}
}
//100
public class func{
	public void setUp(){
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent userAgent = fopFactory.newFOUserAgent();
        userAgent.setAccessibility(true);
}
}
//101
public class func{
	public void getServicePortFromWSDL(String wsdlFileName){
        File wsdlFile = new File(System.getProperty("jbossas.ts.submodule.dir") + "/src/test/java/org/jboss/as/test/integration/ws/wsa/" + wsdlFileName);
        URL wsdlURL = wsdlFile.toURI().toURL();
        Service service = Service.create(wsdlURL, serviceName);
        ServiceIface proxy = (ServiceIface) service.getPort(ServiceIface.class);
        BindingProvider bp = (BindingProvider) proxy;
}
}
//102
public class func{
	public void apply(final VirtualFile it){
            String _path = it.getPath();
            File _file = new File(_path);
            URI _uRI = _file.toURI();
            return _uRI.toURL();
}
}
//103
public class func{
	public void filePathAsURL(String path){
    URI uri = new File(path).toURI();
      return uri.toURL();
}
}
//104
public class func{
	public void apply(final String str){
          File _file = new File(str);
          java.net.URI _uRI = _file.toURI();
          return _uRI.toURL();
}
}
//105
public class func{
	public void createFileResource(String path){
          File f = new File(path);
          URI uri = f.toURI();
          URL url = uri.toURL();
            return new FileResource(url);
}
}
//106
public class func{
	public void testRegexpHeaderURL(){
            createCheckConfig(RegexpHeaderCheck.class);
        URI uri = new File(getPath("regexp.header")).toURI();
        checkConfig.addAttribute("headerFile", uri.toString());
}
}
//107
public class func{
	public void getJarURL(){
            String url = new File(jarFile.getName()).toURI().toURL().toExternalForm();
            return new URL("jar:" + url + "!/");
}
}
//108
public class func{
	public void testReadWrite(){
        Path descriptor = new Path(new File("parent").toURI().toString(),"descriptor.xml");
}
}
//109
public class func{
	public void testGetJobIdFromIncorrectPath(){
    File jobHistoryfile = new File(JOB_HISTORY_FILE_NAME);
    Path srcPath = new Path(jobHistoryfile.toURI());
    FileLister.getJobIdFromPath(srcPath);
}
}
//110
public class func{
	public void testVersioned04(){
        extractor.setPhysicalAddress(new File(VERSIONED_LOCATION2).toURI());
        OWLOntologyID id = extractor.getOntologyId();
        assertTrue(id.getOntologyIRI().toString().equals(VERSIONED_NAME));
        assertTrue(id.getVersionIRI().toString().equals(VERSIONED_VERSION));
}
}
//111
public class func{
	public void testVersioned01(){
        extractor.setPhysicalAddress(new File(VERSIONED_LOCATION).toURI());
        OWLOntologyID id = extractor.getOntologyId();
        assertTrue(id.getOntologyIRI().toString().equals(VERSIONED_NAME));
        assertTrue(id.getVersionIRI().toString().equals(VERSIONED_VERSION));
}
}
//112
public class func{
	public void testPizza02(){
        extractor.setPhysicalAddress(new File(PIZZA_LOCATION).toURI());
        OWLOntologyID id = extractor.getOntologyId();
        assertTrue(id.getOntologyIRI().toString().equals(PIZZA_NAME));
        assertTrue(id.getVersionIRI() == null);
}
}
//113
public class func{
	public void testAmbiguous01(){
        extractor.setPhysicalAddress(new File(AMBIGUOUS_LOCATION).toURI());
        OWLOntologyID id = extractor.getOntologyId();
        assertTrue(id.getOntologyIRI().toString().equals(AMBIGUOUS_NAME));
        assertTrue(id.getVersionIRI() == null);
}
}
//114
public class func{
	public void test(){
        scan(new File("./target/test-classes").toURI().toURL());
}
}
//115
public class func{
	public void setUp(){
        _scannedURLs.add(new File("./target/test-classes").toURI().toURL());
}
}
//116
public class func{
	public void addPath(String s){
    File f = new File(s);
    URL u = f.toURI().toURL();
}
}
//117
public class func{
	public void getVDBMetadata(String vdbFile){
      File f = new File(vdbFile);
      return getVDBMetadata(f.getName(), f.toURI().toURL(), null);
}
}
//118
public class func{
	public void testWithUrl(){
        File f = new File( "./target/test-jcl.jar" );
        JarClassLoader jc = new JarClassLoader( new URL[] { f.toURI().toURL() } );
        Object testObj = jc.loadClass( "org.xeustechnologies.jcl.test.Test" ).newInstance();
        assertNotNull( testObj );
}
}
//119
public class func{
	public void scan(TldScanner.TldScannerCallback callback,File webapp,String path){
        String fullPath = new File(webapp, path).toURI().toString();
        URL jarUrl = new URL("jar:" + fullPath + "!/");
        JarURLConnection connection = (JarURLConnection) jarUrl.openConnection();
        callback.scan(connection, path, true);
}
}
//120
public class func{
	public void getURL(){
            return new File(jarFile.getName()).toURI().toURL();
}
}
//121
public class func{
	public void toURL(String element){
            return new File(element).toURI().toURL();
}
}
//122
public class func{
	public void testImportJarToDiagramStringArrayString(){
        jarImporter.importJarToDiagram(new File("test_files/accuracytests/classpath/test_1.jar").toURI().toURL(),
            "main");
}
}
//123
public class func{
	public void testImportJarURLArray(){
        jarImporter.importJar(new File("test_files/accuracytests/classpath/test_1.jar").toURI().toURL());
}
}
//124
public class func{
	public void testImportJarsURLArray(){
        jarImporter.importJars(new URL[] {new File("test_files/accuracytests/classpath/test_1.jar").toURI().toURL() });
}
}
//125
public class func{
	public void JarBundleFile(JarFile jarFile){
            urlBase = "jar:" + new File(jarFile.getName()).toURI().toURL() + "!/";
}
}
//126
public class func{
	public void getControllerConfig(WebappInfo webAppInfo){
        Assert.notNull("webAppInfo", webAppInfo);
        String filePath = webAppInfo.getLocation().concat(controllerXmlFileName);
        File configFile = new File(filePath);
        return getControllerConfig(configFile.toURI().toURL());
}
}
//127
public class func{
	public void testDeploymentViaUrl(){
        String url = new File(tmpDir, "archives/" + TEST).toURI().toURL().toString();
}
}
//128
public class func{
	public void testUploadURL(){
        String url = new File(tmpDir, "archives/" + TEST).toURI().toURL().toString();
}
}
//129
public class func{
	public void testWithNotGlowrootJarButWithDelegateJavaagent(){
            File glowrootJar = new File("x/classes");
            CodeSource codeSource = new CodeSource(glowrootJar.toURI().toURL(), new Certificate[0]);
            assertThat(Agent.getGlowrootJarFile(codeSource)).isNull();
}
}
//130
public class func{
	public void testWithNotGlowrootJar(){
        File glowrootJar = new File("x/classes");
        CodeSource codeSource = new CodeSource(glowrootJar.toURI().toURL(), new Certificate[0]);
        Agent.getGlowrootJarFile(codeSource);
}
}
//131
public class func{
	public void testExtraElementInConfig(){
                ImportControlLoader.load(new File(
                        "src/test/resources/com/puppycrawl/tools/checkstyle/imports/import-control_WithNewElement.xml").toURI());
        assertNotNull(root);
}
}
//132
public class func{
	public void testLoad(){
                ImportControlLoader.load(new File(
                        "src/test/resources/com/puppycrawl/tools/checkstyle/imports/import-control_complete.xml").toURI());
        assertNotNull(root);
}
}
//133
public class func{
	public void OpenFileWithSystemEditor(IWorkbenchPage page,String filePath){
    OpenFileWithSystemEditor(page, new File(filePath).toURI());
}
}
//134
public class func{
	public void OpenFileWithSystemEditor(String filePath){
    OpenFileWithSystemEditor(new File(filePath).toURI());
}
}
//135
public class func{
	public void configure(){
                File file = new File("./src/test/resources/jsse/localhost.ks");
                URI keyStoreUrl = file.toURI();
                component.setSslKeystore(keyStoreUrl.getPath());
}
}
//136
public class func{
	public void useFont(String fontName,String filename,boolean useAdvanced){
        URI baseURI = new File("test/resources/fonts/ttf").toURI();
        InternalResourceResolver resolver = ResourceResolverFactory.createDefaultInternalResourceResolver(baseURI);
}
}
//137
public class func{
	public void setUp(){
        sut = new AFPResourceManager(ResourceResolverFactory.createDefaultInternalResourceResolver(
                                                            new File(".").toURI()));
}
}
//138
public class func{
	public void readSuspendablesFile(String fileName,Set<String> set,Set<String> classSet){
            parse(new File(fileName).toURI().toURL(), set, classSet);
}
}
//139
public class func{
	public void absolutePathWithFileProtocol(){
    final String expected = new File(tmpDir).toURI().toString();
}
}
//140
public class func{
	public void getResourceIDs(){
            l.add(new File(url).toURI().toURL());
}
}
//141
public class func{
	public void formFileUri(String path){
        File file = new File(path);
        return file.toURI().toString();
}
}
//142
public class func{
	public void setComponentPropertyTest(){
        File configFile = new File("src/test/resources/edu/cmu/sphinx/util/props/ConfigurationManagerTest.testconfig.sxl");
        ConfigurationManager cm = new ConfigurationManager(configFile.toURI().toURL());
}
}
//143
public class func{
	public void modificationTimeWithFileProtocol(){
    final String path = new File(tmpDir).toURI().toString() + "/file.txt";
    fs.createTextFile(path, "blah");
    final long millisSinceModified = System.currentTimeMillis() - fs.modificationTime(path);
    assertEquals(millisSinceModified + " millis ago", true, millisSinceModified < 1000);
}
}
//144
public class func{
	public void toURI(){
        Assert.assertEquals(repo.configToHttpUri("@apple:1.0"), new File(repo.getTargetRepo(), "prod/apple/1.0/apple-1.0.config").toURI());
}
}
//145
public class func{
	public void testBadUrl(){
    URL url = new File("nonexistent.web.xml").toURI().toURL();
    builder.expectWarn("Unable to process '" + url.toExternalForm()
        + "' for servlet validation", IOException.class);
    UnitTestTreeLogger logger = builder.createLogger();
    ServletValidator validator = ServletValidator.create(logger, url);
    assertNull(validator);
    logger.assertCorrectLogEntries();
}
}
//146
public class func{
	public void testLocal(){
    File file = new File("output/rafsource/test1.bin");
    URI uri = file.toURI();
    URIDataFileSink sink = new URIDataFileSink(uri);
    sink.writeFile(m_data);
}
}
//147
public class func{
	public void testLocal(){
    File file = new File("output/rafsink/test1.bin");
    URI uri = file.toURI();
    URIDataFileSink sink = new URIDataFileSink(uri, "test1.bin", file);
    doTest(sink, false);
    URIDataFileSource src = new URIDataFileSource(uri);
    assertTrue("data", Arrays.equals(m_data, src.getFileBytes()));
}
}
//148
public class func{
	public void validTrustStoreURLFailoverTest(){
        executeTest(FAILOVER_SSL_TRANSPORT, new File(TRUST_STORE_DIRECTORY_NAME + TRUST_STORE_FILE_NAME).toURI().toString());
}
}
//149
public class func{
	public void invalidTrustStoreURLTest(){
        executeTest(SSL_TRANSPORT, new File(TRUST_STORE_DIRECTORY_NAME + TRUST_STORE_FILE_NAME + ".dummy").toURI().toString());
}
}
//150
public class func{
	public void testFileUriToMissingFile(){
        File f = new File(Environment.getExternalStorageDirectory() + "/somefilethatdoesntexist");
        Uri fileUri = Uri.parse(f.toURI().toString());
            performApiTest(fileUri, null, f, false, true);
            f.delete();
}
}
//151
public class func{
	public void toURI(String line){
            return (URI.create(line));
            return new File(line).toURI();
}
}
//152
public class func{
	public void testShadowed(){
        assertTrue(CatalogUtilities.getRedirect(URI.create(AMINO_ACID_NS), catalog).equals(new File(TEST_DIR, AMINO_ACID_FILE).toURI()));     
        assertTrue(CatalogUtilities.getRedirect(URI.create(CatalogEntryManager.SHADOWED_SCHEME + AMINO_ACID_NS), catalog).equals(new File(TEST_DIR, subDirectoryName + "/" + AMINO_ACID_FILE).toURI()));     
}
}
//153
public class func{
	public void test(){
    H5File file=HDF5Reader.readHDF5File(new File("./src/test/resources/H5DatasetCreate.h5").toURI().toURL(),-1l);
    Assert.notNull(file);
}
}
//154
public class func{
	public void testUseOSLastModified(){
        File input = new File("src/test/resources/reader/datefallbacksample.xml");
        final URL testdata = input.toURI().toURL();
        reader.parse(testdata, creator);
}
}
//155
public class func{
	public void removeResource(String bundleName){
        File bundleFile = new File(this.repoLocation, bundleName);
        this.bundles.remove(bundleFile.toURI().toString());
        bundleFile.delete();
}
}
//156
public class func{
	public void extendPath(URI base,String child){
    return new File(URIUtils.getAbsoluteFile(base), child).toURI();
}
}
//157
public class func{
	public void getRelativePath(File base,File path){
        String cleanedPath = FilenameUtils.normalize(path.toString());
        return new File(cleanedBase).toURI().relativize(new File(cleanedPath).toURI()).getPath();
}
}
//158
public class func{
	public void addJar(String jar){
        addURL(new File(jar).toURI().toURL());
}
}
//159
public class func{
	public void createLemmatizer(){
    Lemmatizer gateLemmatizer = new GateLemmatizer(new File(lemmatizerRulesFileName).toURI().toURL());
    Lemmatizer lemmatizer = new LemmatizerFilterApostrophe(gateLemmatizer);
    lemmatizer.init();
}
}
//160
public class func{
	public void getClassPathEntry(File jarFile,String path){
      return new File(jarFile.getParentFile(), path.replace('/', File.separatorChar)).toURI();
}
}
//161
public class func{
	public void _prepareServletContext(ServletContext servletContext){
    File webINFFile = new File(_testDir, ServletContextUtil.PATH_WEB_INF);
    servletContext.setAttribute(
      ServletContextUtil.URI_ATTRIBUTE, webINFFile.toURI());
}
}
//162
public class func{
	public void getLocationURI(){
    String projectFolder = getProjectName();
    return new File(parentDir, projectFolder).toURI();
}
}
//163
public class func{
	public void getKeystorePaths(){
                {new File(getFile("server.ks")).toURI().toString()},
}
}
//164
public class func{
	public void testGetExtension(){
        assertEquals("zip:" + new File(droidZipFileName).toURI() + "!/profile.xml",
                zipResource.getIdentifier().getUri().toString());
        assertEquals(metaData, zipResource.getRequestMetaData());
}
}
//165
public class func{
	public void testP2ResolutionWithLowerBREEThanRequiredBundle(){
        verifier.getCliOptions().add("-Dp2.repo.url=" + new File(buildResult, "repository1/target/repository").toURI());
}
}
//166
public class func{
	public void getRelativePath(File base,File path){
        return new File(cleanedBase).toURI().relativize(new File(cleanedPath).toURI()).getPath();
}
}
//167
public class func{
	public void getBpmPlatformXmlLocationFromJndi(){
    assertEquals(new File(BPM_PLATFORM_XML_FILE_ABSOLUTE_LOCATION).toURI().toURL(), url);
}
}
//168
public class func{
	public void utestMyFile(){
    File f = new File( "z:/tmp/catalog.xml");
    URI uri = f.toURI();
}
}
//169
public class func{
	public void name(String name){
      database.setName(name);
      File databaseFolder = new File(warehouseFolder, name + ".db");
      String databaseLocation = "raw://" + databaseFolder.toURI().getPath();
      database.setLocationUri(databaseLocation);
}
}
//170
public class func{
	public void setUp(){
    clitestDataDir = new File(TEST_CACHE_DATA_DIR).
    toURI().toString().replace(' ', '+');
}
}
//171
public class func{
	public void getRelativePath(String fileName){
        String relative = new File(base).toURI().relativize(new File(fileName).toURI()).getPath();
}
}
//172
public class func{
	public void getRelativePath(String fileName){
        String relative = new File(base).toURI().relativize(new File(fileName).toURI()).getPath();
}
}
//173
public class func{
	public void loadPlugins(){
        pm.addPluginsFrom(new File(PLUGINS_DIRECTORY).toURI());
}
}
//174
public class func{
	public void testURI(){
    String expectedUri = new File(new File(File.separator + "testDir"), "testFile").toURI().toString();
}
}
//175
public class func{
	public void getSomeDirectory(){
            return new File(ReflectionsTest.getUserDir()).toURI().toURL();
}
}
//176
public class func{
	public void toUrl(final String jarPath){
            return new File(jarPath).toURI().toURL();
}
}
//177
public class func{
	public void testAbsoluteURI(){
        File tazbm = new File(root, "wcs/BlueMarble.tiff");
        StringValidatable validatable = new StringValidatable(tazbm.toURI().toString());
        validator.validate(validatable);
        assertTrue(validatable.isValid());
}
}
//178
public class func{
	public void addVersionFile(String pdkDir){
            new File(pdkDir, "../lib");
        URL versionProps = versionProperties.toURI().toURL();
        addURLs(new URL[] {versionProps});
}
}
//179
public class func{
	public void assertResolves(String path){
        String asuri = new File(path).toURI().toASCIIString();
}
}
//180
public class func{
	public void addClasspath(String name){
                ((LaunchClassLoader) DepLoader.class.getClassLoader()).addURL(new File(v_modsDir, name).toURI().toURL());
}
}
//181
public class func{
	public void registerNewResource(String file){
        URL urlToAdd = new File(file).toURI().toURL();
}
}
//182
public class func{
	public void getCustomTemplatesURL(){
      return new File(getCustomTemplatesPath()).toURI().toURL();
}
}
//183
public class func{
	public void findFile(String path){
    URI uri = new File(repository.getWorkTree(), path).toURI();
}
}
//184
public class func{
	public void validPkcs12TrustStoreURLTest(){
        executeTest(SSL_TRANSPORT, new File(TRUST_STORE_DIRECTORY_NAME + TRUST_STORE_PKCS12_FILE_NAME).toURI().toString(), "pkcs12");
}
}
//185
public class func{
	public void shouldSetHeadersAndBaseDirectory(){
        assertThat(resourceHandler.getResourceBase(), isSameFileAs(new File("WEB-INF/rails.root/public/assets").toURI().toString()));
}
}
//186
public class func{
	public void shouldAddPluginNamespaceToPassedInElement(){
        registry.xsdFor(PluginTestUtil.bundleCtxWithHeaders(m(PluginNamespace.XSD_NAMESPACE_PREFIX, "second", PluginNamespace.XSD_NAMESPACE_URI, "uri-1")), new File("file:///tmp/foo1").toURI().toURL());
}
}
//187
public class func{
	public void shouldAddPluginNamespaceToPassedInElement(){
        registry.xsdFor(PluginTestUtil.bundleCtxWithHeaders(m(PluginNamespace.XSD_NAMESPACE_PREFIX, "something", PluginNamespace.XSD_NAMESPACE_URI, "uri")), new File("file:///tmp/foo").toURI().toURL());
}
}
//188
public class func{
	public void testToConfigDeclaration(){
        assertEquals(urls[0], new File(path).toURI().normalize().toURL());
}
}
//189
public class func{
	public void apply(String input){
                        return new File(input).toURI().toURL();
}
}
//190
public class func{
	public void ImageLoaderTestCase(){
        FopFactoryBuilder builder = new FopFactoryBuilder(new File(".").toURI());
        builder.setSourceResolution(72);
        builder.setTargetResolution(300);
        fopFactory = builder.build();
}
}
//191
public class func{
	public void setUp(){
        File file = new File("test/resources/fonts/ttf/DejaVuLGCSerif.ttf");
        FontUris fontUris = new FontUris(file.toURI(), null);
        font = FontLoader.loadFont(fontUris, "", true, EmbeddingMode.AUTO, EncodingMode.AUTO,
                false, false, resolver);
}
}
//192
public class func{
	public void setSignatureFile(String signatureFile){
        this.signatureFile = new File(signatureFile).toURI();
}
}
//193
public class func{
	public void loadFile(SAXParser parser,String fileName){
            String a = new File(fileName).toURI().toString().replace("file:/", "file:///");
            Main.info(a);
            parser.parse(a, this);
}
}
//194
public class func{
	public void toURL(String urlText){
          return new File(urlText).toURI().toURL();
}
}
//195
public class func{
	public void getRelativeBaseDirPath(String baseDir){
        String path = new File(".").toURI().relativize(new File(baseDir).toURI()).getPath();
}
}
//196
public class func{
	public void addOutputDir(String outputDir){
            addURL( new File( outputDir ).toURI().toURL() );
}
}
//197
public class func{
	public void WelcomeDashboard(){
    File contentInstance = DashboardCopier.getCopy(file, new NullProgressMonitor());
    File welcomeHtml = new File(contentInstance, "index.html");
    setHomeUrl(welcomeHtml.toURI().toString());
}
}
//198
public class func{
	public void getPredefinedCssURI(){
      final String path = MarkdownPluginUtil.getMarkdownPluginPath() + "/lib/default.css";
      return new File(path).toURI().toString();
}
}
//199
public class func{
	public void testGetExtension(){
        assertEquals("tar:" + new File(fileName).toURI() + "!/saved/profile.xml",
                tarResource.getIdentifier().getUri().toString());
        assertEquals(metaData, tarResource.getRequestMetaData());
}
}
//200
public class func{
	public void toUri(){
            String zipName = new File(getZipName()).toURI().normalize().getPat
}
}
//201
public class func{
	public void testStringToURL(){
        assertEquals( new File( "/foo/bar").toURI().toURL() , c.convert( "/foo/bar", URL.class ) );
}
}
//202
public class func{
	public void testWkDirPath(){
        AvlRdnIndex.setWkDirPath( new File( dbFileDir, "foo" ).toURI() );
}
}
//203
public class func{
	public void testShadowed(){
        OntologyCatalogManager catalogManager = new OntologyCatalogManager(Collections.singletonList(new FolderGroupManager()));
        XMLCatalog catalog = catalogManager.ensureCatalogExists(TEST_DIR);
        assertTrue(CatalogUtilities.getRedirect(URI.create(AMINO_ACID_NS), catalog).equals(new File(TEST_DIR, AMINO_ACID_FILE).toURI()));     
}
}
//204
public class func{
	public void getDefaultViewConfigFile(){
                    return new File(getId() + "-config.xml").toURI().toURL();
}
}
//205
public class func{
	public void getAndroidLibrary(){
              return new File("data/android-2.3.7_r1.jar").toURI();
}
}
//206
public class func{
	public void getPatchFileURI(final String patchFilePath){
        return firstNonNull(uri, new File(patchFilePath).toURI());
}
}
//207
public class func{
	public void getFakeBundlePath(){
            return new File("/FAKE_BUNDLE").toURI().toURL().toExternalForm();
}
}
//208
public class func{
	public void ContentBasedJavaFileObject(String name,String content){
      super(new File(name).toURI(), Kind.SOURCE);
}
}
//209
public class func{
	public void main(final String[] args){
        final File file = new File(CONFIG);
        Configurator.initialize("LogTest", LogRolloverTest.class.getClassLoader(), file.toURI());
}
}
//210
public class func{
	public void addDocumentToRoot(){
            final InputSource is = new InputSource(new File("samples/shakespeare/hamlet.xml").toURI().toASCIIString());
            assertNotNull(is);
}
}
//211
public class func{
	public void should_return_the_asset_contents(){
      String filePath = new File("src/test/resources/locator/asset.js").toURI().toString();
}
}
//212
public class func{
	public void getUri(){
    return new File(path).toURI();
}
}
//213
public class func{
	public void apply(String from){
          return new File(from).toURI().toURL();
}
}
//214
public class func{
	public void shouldProvideShortJarPathUrlContentAsString(){
        assertThat(classLoader.toString(),
                containsString("urls=" + classLoader.asShortPaths(new File("one.jar").toURI().toURL(), new File("/target/classes").toURI().toURL())));
}
}
//215
public class func{
	public void shouldProvideShortJarPathUrlContentAsString(){
                containsString("urls=" + classLoader.asShortPaths(new File("one.jar").toURI().toURL(), new File("/target/classes").toURI().toURL())));
}
}
//216
public class func{
	public void insertFace(SimpleAttributeSet set,String face){
            StyleConstants.setIcon(set, sizeIcon(new File(face).toURI().toURL()));
}
}
//217
public class func{
	public void getConfigurationDataURI(){
    File configurationFile = new File(_keyStoreDirectory, _configurationFileName); 
    return configurationFile.toURI();
}
}
//218
public class func{
	public void setUpForTest(String pathDDL,String config){
            File ddlFile = new File(pathDDL);
            URL ddlURL = ddlFile.toURI().toURL();
            s_singleton.setupSchema(ddlURL, config, false);
}
}
//219
public class func{
	public void testIDURI(){
        File file = new File("foo.txt");
        URI uri = file.toURI();
        ID idURI = new ID(uri);
        assertEquals(uri, idURI.toURI());
}
}
//220
public class func{
	public void buildProfileResourceNodeAtUriWithJob(String filePath){
        ProfileResourceNode node = new ProfileResourceNode(new File(filePath).toURI());
}
}
//221
public class func{
	public void prepareDistributionUri(){
            return new File(propertiesFile.getParentFile(), source.getSchemeSpecificPart()).toURI();
}
}
//222
public class func{
	public void getFileItemAsString(){
        assertThat(new File(fi).toURI().getPath(), containsString("config/test.txt"));
}
}
//223
public class func{
	public void fullConfig(){
        assertEquals(new File("/tmp/upload").toURI().toString(), upload.getRepository().toURI().toString());
        assertEquals("100", upload.getSizeMax().toString());
        assertEquals("200", upload.getFileSizeMax().toString());
        assertEquals("300", upload.getSizeThreshold().toString());
        assertEquals(true, upload.isKeepFormFieldInMemory());
        assertArrayEquals(new String[] { "filename", "fname" }, upload.getFileNameKey());
}
}
//224
public class func{
	public void appSample(){
    URI scriptUri = new File("samples/app.groovy").toURI();
    assertTrue("Wrong output: " + output,
        output.contains("Hello World! From " + scriptUri));
}
}
//225
public class func{
	public void configureShell(CpsFlowExecution context,GroovyShell shell){
            shell.getClassLoader().addURL(new File(repo.workspace,"src").toURI().toURL());
}
}
//226
public class func{
	public void SAJDIClassLoader(ClassLoader parent,String classPath){
            addURL(new File(classPath).toURI().toURL());
}
}
//227
public class func{
	public void testGetInstanceString(){
        File f = new File(fedoraUsersXML);
        FedoraUsers fu = FedoraUsers.getInstance(f.toURI());
        assertNotNull(fu);
}
}
//228
public class func{
	public void testDefaultJarImporterUMLModelManagerURLArray(){
        new DefaultJarImporter(modelManager, new URL[] {new File(
            "test_files/accuracytests/classpath/base_exception.jar").toURI().toURL() });
}
}
//229
public class func{
	public void testHasProperties(){
        final URL url = new File(new File(DIRECTORY), "dummy.shp").toURI().toURL();
        parser = new ShpDocPropertyParser(url);
        assertFalse("Property file exist.", parser.hasProperties());
}
}
//230
public class func{
	public void addPath(String s){
        File f = new File(s);
        URI u = f.toURI();
}
}
//231
public class func{
	public void setup(){
        expect(mockCtx.getConfigLocation()).andReturn(new File("/a a/b b/c c/d d/e e/log4j2 file.xml").toURI());
}
}
//232
public class func{
	public void bundlePathURL(){
      return new File(bundlePath()).toURI().toURL();
}
}
//233
public class func{
	public void TestLoader(){
                      new File("/Storage Card/test.jar").toURI().toURL()
}
}
//234
public class func{
	public void TestLoader(){
                      new File(BUILDDIR + "/test-classes").toURI().toURL(),
}
}
//235
public class func{
	public void TestLoader(){
                      new File(BUILDDIR + "/classes").toURI().toURL(),
}
}
//236
public class func{
	public void createId(String locationPath){
            URL locationUrl = new File(locationPath).toURI().toURL();
}
}
//237
public class func{
	public void BasePDFTest(InputStream confStream){
        fopFactory = new FopConfParser(confStream, new File(".").toURI()).getFopFactoryBuilder()
                                                                         .build();
}
}
//238
public class func{
	public void testDoNotStartExtraneousRootRegionBundles(){
    bundleContext.installBundle(new File(BUNDLE_A).toURI().toURL().toString());
}
}
//239
public class func{
	public void testGetInputStream(){
        URL txtFile = new File( "target/test-classes/source.txt" ).toURI().toURL();
        UrlSource source = new UrlSource( txtFile );
}
}
