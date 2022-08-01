//0
public class func{
	public void testDuplicate(){
        assertTrue(CatalogUtilities.getRedirect(URI.create(PIZZA_NS), catalog) == null);
        URI duplicateRedirect = CatalogUtilities.getRedirect(URI.create(CatalogEntryManager.DUPLICATE_SCHEME + PIZZA_NS), catalog);
        assertTrue(duplicateRedirect.equals(new File(TEST_DIR, PIZZA_FILE).toURI()) || duplicateRedirect.equals(new File(TEST_DIR, AMINO_ACID_FILE).toURI()));
}
}
//1
public class func{
	public void addRuntimeConfigPath(File runtimeFile,ServerContainer runtime){
    if (this.configURItoRuntimeName.get(runtimeFile.toURI()) == null) {
      this.configURItoRuntimeName.put(runtimeFile.toURI(), new LinkedList<ServerContainer>());
    }
    this.configURItoRuntimeName.get(runtimeFile.toURI()).add(runtime);    
}
}
//2
public class func{
	public void addHandlerConfigPath(File taskHandlerFile,T handler){
    if (this.configURItoHandlerName.get(taskHandlerFile.toURI()) == null) {
      this.configURItoHandlerName.put(taskHandlerFile.toURI(), new LinkedList<T>());
    }
    this.configURItoHandlerName.get(taskHandlerFile.toURI()).add(handler);
}
}
//3
public class func{
	public void getJSRelativePaths(HashSet<String> fullPaths){
    for (String path : fullPaths) {
      relPath = new File(SessionManager.getInstance().getSourceFolder()).toURI().relativize(new File(path).toURI()).getPath();
      relativePaths.add(relPath);
    }
}
}
//4
public class func{
	public void loadFromRootUsingSubpathInFilename(){
    final String contents = PathTest.class.getName() + ": loaded from root";
    final File file = createTempFile(contents);
    final File root = findRoot(file);
    final Path path = new Path(root.getCanonicalPath());
    String relative = root.toURI().relativize(file.toURI()).getPath();
    IResourceStream rs = path.find(PathTest.class, relative);
    assertNotNull(rs);
    assertContents(contents, rs);
}
}
//5
public class func{
	public void generateJar(final File directory,final IOFileFilter fileFilter){
        for (final File file : files) {
            final String relativeName = directory.toURI().relativize(file.toURI()).getPath();
            final byte[] content = FileUtils.readFileToByteArray(file);
            resources.put(relativeName, content);
        }
}
}
//6
public class func{
	public void testJarEntry(){
    jar.as(ZipExporter.class).exportTo(baos);
    URL url = new URL("jar:" + tmp.toURI().toURL() + "!/");
    assertFS(url);
}
}
//7
public class func{
	public void createLocalPath(File file){
    return new Path(file.toURI());
}
}
//8
public class func{
	public void createFileSplit(File file){
            Path lineitemPath = new Path(file.toURI());
}
}
//9
public class func{
	public void apply(final File it){
          URI _uRI = it.toURI();
          return _uRI.toURL();
}
}
//10
public class func{
	public void getFileAsUrl(File outputFile){
      URI uri = outputFile.toURI();
      return uri.toURL();
}
}
//11
public class func{
	public void toURI(File file){
        URI uri = file.toURI();
            return uri.toURL();
}
}
//12
public class func{
	public void create(TreeLogger logger,File webXml){
      return create(logger, webXml.toURI().toURL());
      logger.log(TreeLogger.WARN, "Unable to process '"
          + webXml.getAbsolutePath() + "' for servlet validation", e);
}
}
//13
public class func{
	public void createInputSplit(String content){
    return new FileInputSplit(0, new Path(tempFile.toURI().toString()), 0, tempFile.length(), new String[] {"localhost"});
}
}
//14
public class func{
	public void getURL(File jarFile){
        return new URL("jar:" + jarFile.toURI() + "!/" + TRANSLATIONFILE);
}
}
//15
public class func{
	public void loadAndRegister(File driverJarFile,String driverClassName){
        loadAndRegister(new URL("jar:" + driverJarFile.toURI() + "!/"),
                        driverClassName);
}
}
//16
public class func{
	public void config(){
        return new DefaultCompositeOption(
                SlingPaxOptions.defaultLaunchpadOptions(launchpadVersion),
                CoreOptions.provision(CoreOptions.bundle(thisProjectsBundle.toURI().toString()))
                ).getOptions();
}
}
//17
public class func{
	public void paxConfig(){
        return new DefaultCompositeOption(
                SlingPaxOptions.defaultLaunchpadOptions(launchpadVersion),
                CoreOptions.provision(CoreOptions.bundle(thisProjectsBundle.toURI().toString()))
                
        ).getOptions();
}
}
//18
public class func{
	public void before(){
    File edgesFile = tempFolder.newFile();
    Files.write(GatherSumApplyITCase.EDGES, edgesFile, Charsets.UTF_8);
    edgesPath = edgesFile.toURI().toString();
}
}
//19
public class func{
	public void before(){
        File edgesFile = tempFolder.newFile();
        Files.write(SingleSourceShortestPathsData.EDGES, edgesFile, Charsets.UTF_8);
        edgesPath = edgesFile.toURI().toString();
}
}
//20
public class func{
	public void multiple_implementations_only_one_enabled(){
        assertEquals("Bar", finder.findPluginClass((Iterable) asList(f1.toURI().toURL(), f2.toURI().toURL())));
}
}
//21
public class func{
	public void multiple_implementations_only_one_useful(){
        assertEquals("X", finder.findPluginClass((Iterable) asList(f1.toURI().toURL(), f2.toURI().toURL())));
}
}
//22
public class func{
	public void multiple_implementations_only_one_enabled(){
        IOUtil.writeText("Foo", f1); IOUtil.writeText("Bar", f2);
        assertEquals("Bar", finder.findPluginClass((Iterable) asList(f1.toURI().toURL(), f2.toURI().toURL())));
}
}
//23
public class func{
	public void ReVerbOpenNlpConfFunction(File modelFile){
        this(modelFile.toURI().toURL());
}
}
//24
public class func{
	public void ReVerbIndependentConfFunction(File modelFile){
      this(modelFile.toURI().toURL());
}
}
//25
public class func{
	public void multiple_implementations_only_one_useful(){
        IOUtil.writeText("   ", f1); IOUtil.writeText("X", f2);
        assertEquals("X", finder.findPluginClass((Iterable) asList(f1.toURI().toURL(), f2.toURI().toURL())));
}
}
//26
public class func{
	public void addPathToClassLoader(File path,URLClassLoader classLoader){
      URL u = path.toURI().toURL();
      addUrlMethod.invoke(classLoader, u);
}
}
//27
public class func{
	public void asClickableFileUrl(File path){
      return new URI("file", "", path.toURI().getPath(), null, null).toString();
}
}
//28
public class func{
	public void should_throw_exception_if_url_not_found(){
    URLs.linesOf(missingFile.toURI().toURL(), Charset.defaultCharset());
}
}
//29
public class func{
	public void should_throw_exception_if_url_not_found(){
    URLs.contentOf(missingFile.toURI().toURL(), Charset.defaultCharset());
}
}
//30
public class func{
	public void FopConfParser(File fopConfFile,URI defaultBaseURI){
        this(new FileInputStream(fopConfFile), fopConfFile.toURI(),
                EnvironmentalProfileFactory.createDefault(defaultBaseURI,
                        ResourceResolverFactory.createDefaultResourceResolver()));
}
}
//31
public class func{
	public void appendFilesTo(File directory,Writer writer,URI base){
        writer.write(base.relativize(file.toURI()).getPath());
        writer.write("\n");
}
}
//32
public class func{
	public void testFile(){
    File dir = jar.as(ExplodedExporter.class).exportExploded(f);
    assertFS(dir.toURI().toURL());
}
}
//33
public class func{
	public void getWebXmlAsDocument(File webXml){
        return builder.build( webXml.toURI().toURL() );
}
}
//34
public class func{
	public void StreamSource(File f){
        setSystemId(f.toURI().toASCIIString());
}
}
//35
public class func{
	public void toRelativeFilePath(File file,File ancestor){
    URI ancestorUri = ancestor.toURI();
    URI relativeUri = ancestorUri.relativize(fileUri);
    return relativeUri.getPath();
}
}
//36
public class func{
	public void findAndLoadHostSpecificProperties(){
                CssResourceLocator.locateSiteSpecificResource(HOST_PROPERTIES_FILE_NAME);
            final URL resource = configFile.toURI().toURL();
            openStreamAndLoadProps(resource);
}
}
//37
public class func{
	public void relativize(File from,File to){
    URI toURI = to.toURI();
    String relative = getRelativePath(fromURI.toString(), toURI.toString(), URIUtils.URI_FILE_SEPARATOR);
    relative = convertUriToPlatformSeparator(relative);
}
}
//38
public class func{
	public void saveTempFile(byte[] bytes,String extension){
            return tempFile.toURI().toURL();
}
}
//39
public class func{
	public void getURL(String location){
      return (new File(location)).toURI().toURL();
}
}
//40
public class func{
	public void getURL(String location){
            return (new File(location)).toURI().toURL();
}
}
//41
public class func{
	public void FopConfParser(File fopConfFile,ResourceResolver resourceResolver){
        this(new FileInputStream(fopConfFile), fopConfFile.toURI(), resourceResolver);
}
}
//42
public class func{
	public void loadPropertiesOrFail(File configFile){
            URL configPropURL = configFile.toURI().toURL();
            return loadPropertiesFile(configPropURL, true);
            throw new RuntimeException("Error loading properties from " + configFile, e);
}
}
//43
public class func{
	public void testGetDocumentURL(){
        File tempFile = createTempWsdlFile();
        Document doc = new Stax2DOM().getDocument(tempFile.toURI().toURL());
}
}
//44
public class func{
	public void pathToUrl(File path){
      return path.toURI().toURL();
}
}
//45
public class func{
	public void setUp(){
    m_inputSrc = new BinaryDatasetSource(inputFile.toURI());
}
}
//46
public class func{
	public void setUp(){
    m_outputSrc = new BinaryDatasetSource(outputFile.toURI());
}
}
//47
public class func{
	public void setSystemId(File f){
        this.systemId = f.toURI().toASCIIString();
}
}
//48
public class func{
	public void testFeatureStoreHints(){
        File shpFile = copyShapefiles(STATE_POP);
        URL url = shpFile.toURI().toURL();
        ShapefileDataStore ds = new ShapefileDataStore(url);
        ShapefileFeatureStore store = (ShapefileFeatureStore) ds.getFeatureSource("statepop");
}
}
//49
public class func{
	public void getListCellRendererComponent(JList list,Object value,int index,boolean isSelected,boolean cellHasFocus){
            File f = (File) value;
            Project p = FileOwnerQuery.getOwner(f.toURI());
            String message = f.getAbsolutePath();            
}
}
//50
public class func{
	public void getLocalMetadataRepository(MavenContext context,LocalRepositoryP2Indices localRepoIndices){
            File localMavenRepoRoot = context.getLocalRepositoryRoot();
            RepositoryReader contentLocator = new LocalRepositoryReader(localMavenRepoRoot);
            localMetadataRepository = new LocalMetadataRepository(localMavenRepoRoot.toURI(),
                    localRepoIndices.getMetadataIndex(), contentLocator);
}
}
//51
public class func{
	public void createRepository(File location){
        TychoRepositoryIndex metadataIndex = createMetadataIndex(location);
        return new LocalMetadataRepository(location.toURI(), metadataIndex);
}
}
//52
public class func{
	public void testAttributesWriting(){
        SimpleFeatureCollection features = createFeatureCollection();
        File tmpFile = getTempFile();
        tmpFile.createNewFile();
        ShapefileDataStore s = new ShapefileDataStore(tmpFile.toURI().toURL());
        writeFeatures(s, features);
        s.dispose();
}
}
//53
public class func{
	public void getUri(final File baseDir){
            return URI.create( baseDir.toURI().toString() + this.location );
}
}
//54
public class func{
	public void getLocalFileURL(File localFile){
      return localFile.toURI().toURL().toExternalForm();
}
}
//55
public class func{
	public void createCatalog(ResourceUtils ru,File tmpJar){
        String catalog = catalogTemplate.replace("${osgi-entities-path}", tmpJar.toURI().toString());
}
}
//56
public class func{
	public void createLocalRepository(File localRepository){
        return createRepository( "file://" + localRepository.toURI().getRawPath(),
                                 RepositorySystem.DEFAULT_LOCAL_REPO_ID, true,
                                 ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS, true,
                                 ArtifactRepositoryPolicy.UPDATE_POLICY_ALWAYS,
                                 ArtifactRepositoryPolicy.CHECKSUM_POLICY_IGNORE );
}
}
//57
public class func{
	public void getSystemId(){
      return ((File)location.getSourceRef()).toURI().toASCIIString();
}
}
//58
public class func{
	public void providerUsingAnnotatedStereotype(){
        File out = getTemporaryFile("providerUsingAnnotatedStereotype");
        StreamUtils.copyStream(is, new FileOutputStream(out), true);
        return out.toURI().toURL().toExternalForm();
}
}
//59
public class func{
	public void loadMetadata(File file){
        parser.setXmlInputPath(file.toPath());
        parser.setXmlInputRootPath(file.getParentFile().toPath());
        TechnologyMetadata metadata = parser.processDocument(file.toURI());
        metadataList.add(metadata);
}
}
//60
public class func{
	public void handle(File file,int depth,ProgressEntry parent){
                        progressMonitor.startJob(file.toURI());
}
}
//61
public class func{
	public void testRetrieveAlreadyExists(){
        assertEquals(expectedFile.toURI().toURL(), url);
}
}
//62
public class func{
	public void addJar(String path){
            URL resource = (new File(path)).toURI().toURL();
            addJar(resource, path);
}
}
//63
public class func{
	public void getRelativePath(final File file,final File folder){
        return folder.toURI ().relativize ( file.toURI () ).getPath ();
}
}
//64
public class func{
	public void getRelativePath(final File file,final File folder){
        return folder.toURI ().relativize ( file.toURI () ).getPath ();
}
}
//65
public class func{
	public void manifestClasspath(final File[] sourceDirectory,final File outputDirectory,final List<String> compileClasspathElements){
    String cp = getPath(sourceDirectory);
    cp = cp + outputDirectory.toURI() + " ";
}
}
//66
public class func{
	public void setAbsoluteDestinationDirectory(File absoluteDestDir){
        destinationTarget = absoluteDestDir.toURI();
}
}
//67
public class func{
	public void setAbsoluteDestinationDirectory(File absoluteDestDir){
        destinationTarget = absoluteDestDir.toURI();
}
}
//68
public class func{
	public void toDifferenceSinkFactory(File path){
        return getTestTools().getDifferenceSinkFactory(path.toURI());
}
}
//69
public class func{
	public void LocalLogResource(File file){
        super(file.toURI());
}
}
//70
public class func{
	public void testInternal(File bundle){
        URL bundleURL = bundle.toURI().toURL();
        Resource resource = Resource.create(bundleURL);
}
}
//71
public class func{
	public void relativize(File base,File file){
        return new File( base.toURI().relativize( file.toURI() ).getPath() );
}
}
//72
public class func{
	public void extractDocument(final File file){
        return this.extractDocument(file.toURI());
}
}
//73
public class func{
	public void fileToPath(File file){
    return file.toURI().getPath();
}
}
//74
public class func{
	public void extractAll(final File file){
        return this.extractAll(file.toURI());
}
}
//75
public class func{
	public void addClassPathElement(File container){
            classLoader.addResourceStore(new FileResourceStore(container));
            gScripting.getGroovyClassLoader().addURL(container.toURI().toURL());
}
}
//76
public class func{
	public void startSqoopWithSentryEnable(){
    sqoopServerRunner = new TomcatSqoopRunner(sqoopDir.toString(), SQOOP_SERVER_NAME,
        sentrySitePath.toURI().toURL().toString());
    sqoopServerRunner.start();
}
}
//77
public class func{
	public void setupClasspath(){
            final SystemClassPath systemCP = new SystemClassPath();
            systemCP.addJarsToPath(lib);
            systemCP.addJarToPath(lib.toURI().toURL()); // add dir too like Tomcat/TomEE
}
}
//78
public class func{
	public void loadXMLFile(File resource){
      return loadXMLFile( resource.toURI().toURL() );
}
}
//79
public class func{
	public void getURLForData(String data){
    result.deleteOnExit();
    return Uri.parse(result.toURI().toString());
}
}
//80
public class func{
	public void addAppletContents(byte[] appletJarContents){
            addURL(downloadedAppletJar.toURI().toURL());
}
}
//81
public class func{
	public void createTempRepo(String repoContent,Object... variables){
        return tmp.toURI();
}
}
//82
public class func{
	public void getRelativePath(File base,File childname){
        childPath = childname.toURI().toString();
}
}
//83
public class func{
	public void configurePermutationsFile(final TestManifestServlet servlet,final String path,final File permutations){
    when( servlet.getServletContext().getResource( path ) ).thenReturn( permutations.toURI().toURL() );
}
}
//84
public class func{
	public void getUrlsFromFiles(final File[] files){
            result[i] = pluginFile.toURI().toURL();
}
}
//85
public class func{
	public void createXOManagerFactory(Collection<Class<?>> types){
        XOUnit xoUnit = XOUnitBuilder.create(database.toURI(), Neo4jXOProvider.class, types.toArray(new Class<?>[0]))
                .property(PROPERTY_NEO4J_CACHE_TYPE, VALUE_NEO4J_CACHE_TYPE_NONE).property(PROPERTY_NEO4J_ALLOW_STORE_UPGRADE, Boolean.TRUE.toString())
                .property(PROPERTY_NEO4J_KEEP_LOGICAL_LOGS, Boolean.FALSE.toString()).property(PROPERTY_NEO4J_LOCK_MANAGER, NoOpLockFactory.KEY)
                .property(PROPERTY_NEO4J_DBMS_PAGE_CACHE_MEMORY, "100M").create();
        return XO.createXOManagerFactory(xoUnit);
}
}
//86
public class func{
	public void createJarUri(File jarFile,String entryName){
        URI jarURI = jarFile.toURI().normalize();
            throw new CannotCreateUriError(jarURI + separator + entryName, e);
}
}
//87
public class func{
	public void guessedCssLocationExample2(){
    URI uri = (new File("src/sampleInput.less")).toURI();
    StringSource lessSource = new StringSource(".class { margin: 1 1 1 1; }", "sampleInput.less", uri);
}
}
//88
public class func{
	public void getWorkspaceFiles(File javaFile){
        return root.findFilesForLocationURI(javaFile.toURI());
}
}
//89
public class func{
	public void relativize(File child){
        URI uri = child.toURI();
}
}
//90
public class func{
	public void getFilePath(){
            final File dir = createTempDirectory();
            return ioService().get( dir.toURI() ).resolve( "myTempFile.txt" );
}
}
//91
public class func{
	public void parse(File file){
      return parse(new Input(Files.toString(file, charset).toCharArray(), file.toURI()));
}
}
//92
public class func{
	public void getRelative(File base,File path){
        return base.toURI().relativize(path.toURI()).getPath();
}
}
//93
public class func{
	public void getRelative(File base,File path){
        return base.toURI().relativize(path.toURI()).getPath();
}
}
//94
public class func{
	public void audioPlay(File audioFile){
      AudioClip clip = Applet.newAudioClip(audioFile.toURI().toURL());
      clip.play();
}
}
//95
public class func{
	public void setupImageUri(File imageFile){
      return imageFile.toURI().toURL().toString();
}
}
//96
public class func{
	public void createRepo(File index,String name){
        props.put(FixedIndexedRepo.PROP_LOCATIONS, index.toURI().toString());
}
}
//97
public class func{
	public void copyTemplate(File template,String target){
        return copyTemplate(template.toURI().toASCIIString(), target);
}
}
//98
public class func{
	public void toUrl(File store){
            return store.toURI().toURL().toString();
}
}
//99
public class func{
	public void createFromSLD(File sld){
            SLDParser stylereader = new SLDParser(styleFactory, sld.toURI().toURL());
            return stylereader.readXML();
}
}
//100
public class func{
	public void initSchemaLdifPartition(InstanceLayout instanceLayout,DnFactory dnFactory){
        schemaLdifPartition.setPartitionPath( schemaPartitionDirectory.toURI() );
}
}
//101
public class func{
	public void OutputFileObject(JavacFileManager.Context context,File file,Kind kind,@Nullable String className,JavaFileObject source){
    super(file.toURI(), kind);
}
}
//102
public class func{
	public void initializeCatalog(File folder,XMLCatalog catalog){
        URI relativeFolderUri = CatalogUtilities.relativize(folder.toURI(), catalog);
        ge = FolderGroupManager.createGroupEntry(relativeFolderUri, true, autoUpdate, catalog);
        catalog.addEntry(ge);
        update(ge);
}
}
//103
public class func{
	public void deserialize(File tmpDir){
        IMetadataRepository repository = manager.loadRepository(tmpDir.toURI(), null);
        IQueryResult<IInstallableUnit> queryResult = repository.query(QueryUtil.ALL_UNITS, null);
        Set<IInstallableUnit> result = queryResult.toSet();
}
}
//104
public class func{
	public void toRelativeFilePath(File file,File ancestor){
    checkRelated(file, ancestor);
    URI fileUri = file.toURI();
}
}
//105
public class func{
	public void getUrlForFile(File file){
      IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(file.toURI());
}
}
//106
public class func{
	public void loadSession(File sessionFile,boolean zip,ProgressMonitor progressMonitor){
            loadSession(josIS, sessionFile.toURI(), zip, progressMonitor);
}
}
//107
public class func{
	public void setConfiguration(final File newConfigFile){
        setConfiguration(newConfigFile.toURI(), Files.toByteArray(newConfigFile));
}
}
//108
public class func{
	public void ModuleMetadataRepository(IProvisioningAgent agent,File location){
        super(agent, generateName(location), REPOSITORY_TYPE, location);
        setLocation(location.toURI());
        this.storage = getStorageFile(location);
}
}
//109
public class func{
	public void ModuleArtifactRepository(IProvisioningAgent agent,File location,ModuleArtifactMap artifactsMap){
        super(agent, location.toURI(), ArtifactTransferPolicies.forLocalArtifacts());
}
}
//110
public class func{
	public void testHiddenFilesInJar(){
        parser.parse(emptySet, badClassesJar.toURI(),null);
}
}
//111
public class func{
	public void DirectoryResourceHandle(String name,File file,File codeSource,Manifest manifest){
        this.codeSource = codeSource.toURI().toURL();
}
}
//112
public class func{
	public void relativize(File from,File to){
    URI fromURI = from.toURI();
}
}
//113
public class func{
	public void testCopyStream(){
    IOUtils.copyURLToFile(subFile1.toURI().toURL(), subFile2);
}
}
//114
public class func{
	public void defaultToConfWhenNoConfigFound(){
        assertThat(ctx.getConfigLocation(), equalTo(expected.toURI()));
}
}
//115
public class func{
	public void createPackage(File jarFile,List<IRobotSpecItem> selectedRobots,RobotProperties robotProps){
    checkDbExists();
    List<RobotItem> robotItems = getAllRobotItems(selectedRobots);
    TeamItem teamItem = getTeamItem(selectedRobots);
    String res = JarCreator.createPackage(jarFile, robotItems, teamItem, robotProps);
    refresh(jarFile.toURI().toString());
}
}
//116
public class func{
	public void testEmptyZeroSizeBeansXml(){
        BeanArchiveInformation beanArchiveInformation = bas.getBeanArchiveInformation(emptyBeansXml.toURI().toURL());
        Assert.assertNotNull(beanArchiveInformation);
        Assert.assertEquals(BeanDiscoveryMode.ALL, beanArchiveInformation.getBeanDiscoveryMode());
}
}
//117
public class func{
	public void getSource(){
      return (new File(fileName)).toURI().toURL();
}
}
//118
public class func{
	public void apply(File newFile){
                                setDefinition(newFile.toURI().toURL().toString());
}
}
//119
public class func{
	public void getBaseTestFolder(final FileSystemManager manager){
        final File baseDir = AbstractVfsTestCase.getTestDirectory();
        return manager.resolveFile(baseDir.toURI().toURL().toExternalForm());
}
}
//120
public class func{
	public void viewInBrowser(File f){
    viewInBrowser(f.toURI());
}
}
//121
public class func{
	public void convertFileToURL(File file){
        return convertURIToURL(file.toURI());
}
}
//122
public class func{
	public void select(File it){
          return it.toURI().toURL();
}
}
//123
public class func{
	public void browseDir(String packageName,File directory){
        result.add(new CustomJavaFileObject(childFile.toURI(), JavaFileObject.Kind.CLASS, binaryName));
}
}
//124
public class func{
	public void DirectoryClassPathEntry(File dir){
    assert (dir.isAbsolute());
    this.location = dir.toURI().toString();
}
}
//125
public class func{
	public void testBundleWiringDTO(){
        File bf = createBundle(mf);
        Bundle bundle = framework.getBundleContext().installBundle(bf.toURI().toURL().toExternalForm());
        bundle.start();
        assertEquals("Precondition", Bundle.ACTIVE, bundle.getState());
        BundleWiringDTO dto = bundle.adapt(BundleWiringDTO.class);
        assertEquals(bundle.getBundleId(), dto.bundle);
}
}
//126
public class func{
	public void makeKey(File file){
            return file.toURI().normalize();
}
}
//127
public class func{
	public void addArtifactRepository(File artifactRepositoryLocation){
        artifactRepos.add(artifactRepositoryLocation.toURI());
}
}
//128
public class func{
	public void inputStreamToAnyURI(InputStream inputStream,int scope,Logger logger){
        final FileItem fileItem = prepareFileItemFromInputStream(inputStream, scope, logger);
        final File storeLocation = ((DiskFileItem) fileItem).getStoreLocation();
        return storeLocation.toURI().toString().replace("+", "%2B");
}
}
//129
public class func{
	public void CopyExisting(File source){
            this(source.toURI().toURL());
}
}
//130
public class func{
	public void generateRecursive(GenerationConfig config,SchemaMapper mapper,JCodeModel codeModel,String packageName,List<File> schemaFiles){
                mapper.generate(codeModel, getNodeName(child.toURI().toURL()), defaultString(packageName), child.toURI().toURL());
}
}
//131
public class func{
	public void create(@Nonnull File file){
        checkNotNull(file, "file cannot be null");
        return new IRI(file.toURI());
}
}
//132
public class func{
	public void givenPlatformNullThenPlatformisSomethingValidLooking(){
        String matcher = platformPath.substring( sdkPath.toURI().toString().length() -1 );
        Assert.assertTrue(String.format("Platform [%s] does not match regex: [%s]", matcher,regex), matcher.matches(regex));
}
}
//133
public class func{
	public void scanDirectory(ClassLoader loader,File root){
      URI base = root.toURI();
}
}
//134
public class func{
	public void canExtract(final File file){
        return this.canExtract(file.toURI());
}
}
//135
public class func{
	public void browse(File file){
    browse(file.toURI());
}
}
//136
public class func{
	public void open(File file){
            launch(file.toURI());
            throw new IOException(file.toString());
}
}
//137
public class func{
	public void create(String path){
    rd.url = f.toURI();
}
}
//138
public class func{
	public void addWagonJar(File jar){
            getContainer().getContainerRealm().addURL(jar.toURI().toURL());
}
}
//139
public class func{
	public void crawlCatalogs(File topCatalogFile){
    InvCatalogImpl topCatalog = fac.readXML( topCatalogFile.toURI() );
}
}
//140
public class func{
	public void getCwd(){
        return URIUtils.normalizeURI(cwd.toURI()).toString();
}
}
//141
public class func{
	public void buildURLs(final File templateDirectory){
            return new URL[]{templateDirectory.toURI().toURL()};
}
}
//142
public class func{
	public void setUpEditor(File file){
    IEditorPart editor= EditorUtility.openInEditor(new ExternalTranslationUnit(fCProject, file.toURI(), CCorePlugin.CONTENT_TYPE_CXXSOURCE));
    assertNotNull(editor);
    assertTrue(editor instanceof CEditor);
    fEditor= (CEditor) editor;
    fTextWidget= fEditor.getViewer().getTextWidget();
    assertNotNull(fTextWidget);
    fAccessor= new Accessor(fTextWidget, StyledText.class);
    fDocument= fEditor.getDocumentProvider().getDocument(fEditor.getEditorInput());
    assertNotNull(fDocument);
}
}
//143
public class func{
	public void loadDescriptorsFromRepository(String repository,P2Context p2Context){
        IArtifactRepository loadedRepo = repoManager.loadRepository(repoPath.toURI(), new NullProgressMonitor());
        return loadedRepo.getArtifactDescriptors(DEFAULT_KEY);
}
}
//144
public class func{
	public void locateClassesWithAnnotation(Class<? extends Annotation> annotation,File locationToSearch){
    return AnnotationLocator.locateClassesWithAnnotation( annotation,
                                                          locationToSearch.toURI().toURL() );
}
}
//145
public class func{
	public void newFile(String filename){
            url = (new File(filename)).toURI().toURL().toExternalForm();
}
}
//146
public class func{
	public void HandlerResolverImpl(File file){
        this(file.toURI());
}
}
//147
public class func{
	public void PluginClassLoader(ClassLoader parent,File libDir){
        super(new URL[]{libDir.toURI().toURL()}, parent);
}
}
//148
public class func{
	public void createLocalRepository(File localRepository){
        return new MavenArtifactRepository( DEFAULT_LOCAL_REPO_ID, "file://" + localRepository.toURI().getPath(),
                                            new DefaultRepositoryLayout(), new ArtifactRepositoryPolicy(),
                                            new ArtifactRepositoryPolicy() );
}
}
//149
public class func{
	public void relativeTo(final File target,final File base){
    File _absoluteFile = base.getAbsoluteFile();
    URI _uRI = _absoluteFile.toURI();
}
}
//150
public class func{
	public void resolveArtifactFileURI(Dependency dependency){
    Artifact artifact = resolveArtifact(dependency);
    File file = artifact.getFile();
    return file.toURI();
}
}
//151
public class func{
	public void SymlinkResourceLoader(ClassLoader parentLoader,String symlink,File target){
      _target = target.toURI().toURL();
}
}
//152
public class func{
	public void addMetadataRepository(File metadataRepositoryLocation){
        metadataRepos.add(metadataRepositoryLocation.toURI());
}
}
