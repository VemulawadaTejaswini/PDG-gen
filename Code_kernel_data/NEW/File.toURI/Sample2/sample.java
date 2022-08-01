//0
public class func{
	public void fromFilename(String filename){
        if (filename == null) return null;
        File file = new File(filename);
            if (file.exists()) url = file.toURI().toURL();
}
}
//1
public class func{
	public void getResource(String resourcePath){
        File file = new File(resourcePath);
        if (file.exists() && file.isFile()) {
            return file.toURI().toURL();
        }
}
}
//2
public class func{
	public void findInPaths(String iconPath){
        for(String dataDir : DEFAULT_XDG_DATA_DIRS) {
            File file = new File(dataDir + iconPath);
            if(file.exists()) {
                try {
                    return file.toURI().toURL();
                } catch (MalformedURLException e) {
                    LoggerFactory.getLogger().warn(e.toString());
                }
            }
        }
}
}
//3
public class func{
	public void getLocation(File file){
        if (file.isDirectory()) {
            return "jardir:" + file.getPath();
        } else {
            return file.toURI().toURL().toExternalForm();
        }
}
}
//4
public class func{
	public void loadImages(File iconRootDirectory,String parent,ImageRegistry registry){
    File icons = new File(iconRootDirectory, parent);
    File[] files = icons.listFiles();
    for (File file : files) {
      if (file.isFile() && file.getName().endsWith(".gif")) { //$NON-NLS-1$
        URL url = file.toURI().toURL();
        String name = getResourceName(url);
        ImageDescriptor id = ImageDescriptor.createFromURL(url);
        registry.put(parent + "_" + name, id); //$NON-NLS-1$
      }
    }
}
}
//5
public class func{
	public void getResource(String path){
        if (File.separatorChar != '/') {
            path = path.replace('/', File.separatorChar);
        }
        File file = new File(themeDir, "/resources/" + path);
        return file.isFile() ? file.toURI().toURL() : null;
}
}
//6
public class func{
	public void asFile(final String path){
        File file = new File(path);
        if (file.exists()) {
            try {
                return file.toURI().toURL();
            } catch (MalformedURLException ignored) {
                EmptyStatement.ignore(ignored);
            }
        }
}
}
//7
public class func{
	public void getURL(gov.nasa.worldwind.util.Tile tile,String imageFormat){
      File file = new File(directory, tile.getLevelNumber()
          + File.separator + paddedInt(tile.getRow(), 4)
          + File.separator + paddedInt(tile.getRow(), 4) + "_"
          + paddedInt(tile.getColumn(), 4) + ".bil");
      if (file.exists())
        return file.toURI().toURL();
}
}
//8
public class func{
	public void resolveFile(File file){
        if (!file.isFile()) {
            throw new ViewNotFoundException(null, null, file.getAbsolutePath());
        }
            return file.toURI().toURL();
}
}
//9
public class func{
	public void toURL(File file){
        if (file.exists() && file.canRead()) {
            try {
                return file.toURI().toURL();
            }
            catch (MalformedURLException e) {
            }
        }
}
}
//10
public class func{
	public void getURL(String filename){
    File file = new File( filename );
    if ( file.exists() ) {
      url = file.toURI().toURL();
    } else {
      ClassLoader classLoader = getClass().getClassLoader();
      url = classLoader.getResource( filename );
    }
}
}
//11
public class func{
	public void getURL(String name){
            File file = getFile(name);
            if (file.exists()) {
                return file.toURI().toURL();
            }
            log.error("Failed to transform file to URL: " + name, e);
}
}
//12
public class func{
	public void findUrl(String suffix){
        File file = findFile(suffix);
        if (file != null) {
            return file.toURI().toURL();
        }
        return Main.class.getResource("/" + suffix);
}
}
//13
public class func{
	public void create(final File file){
            return file != null ? file.toURI().toURL() : null;
}
}
//14
public class func{
	public void createFallbackClassLoader(Collection<File> files){
        List<URL> urls = new ArrayList<URL>(files.size());
        for (File file : files) {
            urls.add(file.toURI().toURL());
        }
        return new URLClassLoader(urls.toArray(new URL[urls.size()]), null);
}
}
//15
public class func{
	public void toUrls(FileCollection collection){
        for (File file : collection.getFiles())
            urls.add(file.toURI().toURL());
        return urls.toArray(new URL[urls.size()]);
}
}
//16
public class func{
	public void getAsURLs(){
        for (File file : files) {
            try {
                urls.add(file.toURI().toURL());
            } catch (MalformedURLException e) {
                throw UncheckedException.throwAsUncheckedException(e);
            }
        }
}
}
//17
public class func{
	public void toUrls(File... files){
        for (File file : files) {
            try {
                urls.add(file.toURI().toURL());
            } catch (MalformedURLException e) {
                // intentionally left empty
            }
        }
}
}
//18
public class func{
	public void toUrl(Collection<File> cp){
        final URL[] urls = new URL[cp.size()];
        for (File file : cp) {
            urls[i++] = file.toURI().toURL();
        }
}
}
//19
public class func{
	public void FileClassLoader(ClassLoader parent,List<File> files){
            for (File file : files) {
                // I guess here we have to quetly ignore invalid URLs...
                try {
                    addURL(file.toURI().toURL());
                } catch (MalformedURLException ex) {
                }
            }
}
}
//20
public class func{
	public void exposeClassPath(ClassPathLoader classPathLoader){
        for (File file : dir.listFiles(getFileFilter())) {
            try {
                classPathLoader.addUrl(file.toURI().toURL());
            } catch (IOException exception) {
                throw new ClassPathException(exception);
            }
        }
}
}
//21
public class func{
	public void addFiles(List<File> files){
      for (File file : files) {
        addURL(file.toURI().toURL());
      }
}
}
//22
public class func{
	public void addURLs(Classpath cp){
        for (final File file : cp) {
            try {
                addURL(file.toURI().toURL());
            } catch (final MalformedURLException e) {
            }
        }
}
}
//23
public class func{
	public void buildClassLoaderFromDirectory(File dir){
        for (File file : listFiles(dir)) {
            log.debug("    %s", file);
            urls.add(file.toURI().toURL());
        }
        return createClassLoader(urls);
}
}
//24
public class func{
	public void testURLStringConstructor(){
        Map<ShpFileType, File> expected = createFiles(
                "testURLStringConstructor", ShpFileType.values(), false);
        File file = expected.values().iterator().next();
        ShpFiles shapefiles = new ShpFiles(file.toURI().toURL()
                .toExternalForm());
        assertEqualMaps(expected, shapefiles.getFileNames());
}
}
//25
public class func{
	public void parse(File file){
            InputSource src = new InputSource(file.toURI().toURL().toExternalForm());
            parse(src);
}
}
//26
public class func{
	public void relative(final File file){
        final String urlPath = file.toURI().toURL().toExternalForm();
}
}
//27
public class func{
	public void relative(File file){
        String urlPath = file.toURI().toURL().toExternalForm();
}
}
//28
public class func{
	public void BoxRenderer(File file,int width){
    this(file.toURI().toURL().toExternalForm(), width);
}
}
//29
public class func{
	public void BoxRenderer(File file,int width,int height){
    this(file.toURI().toURL().toExternalForm(), width, height);
}
}
//30
public class func{
	public void shouldFailIfResourceFileCouldNotBeFoundAsUrl(){
        assertThat(file.exists(), is(false));
        URL url = file.toURI().toURL();
        nodeTypeManager.registerNodeTypes(url, true);
}
}
//31
public class func{
	public void checkHtmlFile(File file,boolean asUTF8){
        InputSource is = new InputSource(new FileInputStream(file));
        is.setSystemId(file.toURI().toURL().toString());
}
}
//32
public class func{
	public void lex(File file){
    checkNotNull(file, "file cannot be null");
    checkArgument(file.isFile(), "file \"%s\" must be a file", file.getAbsolutePath());
      return lex(file.toURI().toURL());
      throw new LexerException("Unable to lex file: " + file.getAbsolutePath(), e);
}
}
//33
public class func{
	public void convert(File file){
      return file.toURI().toURL().toString();
}
}
//34
public class func{
	public void asUrl(File file){
      return file.toURI().toURL().toString();
}
}
//35
public class func{
	public void createObjectResource(final String contents){
    return file.toURI().toURL().toString();
}
}
//36
public class func{
	public void testFileURLs(){
        Map<ShpFileType, File> expected = createFiles("testShapefileFilesAll",
                ShpFileType.values(), false);
        File file = expected.values().iterator().next();
        ShpFiles shapefiles = new ShpFiles(file.toURI().toURL());
        assertEqualMaps(expected, shapefiles.getFileNames());
}
}
//37
public class func{
	public void add(ArrayList<URL> urls,File file){
           urls.add(file.toURI().toURL());
}
}
//38
public class func{
	public void addResource(URLClassLoader classLoader,File file){
      addURL.invoke(classLoader, new Object[] { file.toURI().toURL() });
}
}
//39
public class func{
	public void addClasspath(String path){
            method.invoke(urlClassLoader, new Object[] { file.toURI().toURL() });
}
}
//40
public class func{
	public void load(File file){
      return load(file.toURI().toURL(), false);
      generalErrorMessage(ex, file.getPath());
      generalErrorMessage(ex, file.getPath());
}
}
//41
public class func{
	public void getFeatureSource(File file){
        map.put(ShapefileDataStoreFactory.URLP.key, file.toURI().toURL());
        map.put(ShapefileDataStoreFactory.CREATE_SPATIAL_INDEX.key, Boolean.TRUE);
        DataStore shapefileStore = DataStoreFinder.getDataStore(map);
        String typeName = shapefileStore.getTypeNames()[0]; // Shape files do only have one type name
        featureSource = shapefileStore.getFeatureSource(typeName);
}
}
//42
public class func{
	public void FileDeletingInputStream(File file){
            super(file.toURI().toURL().openStream());
}
}
//43
public class func{
	public void fileToDataStore(File file,String encoding){
            map.put("url", file.toURI().toURL());
}
}
//44
public class func{
	public void validate(final File file){
        final InputStream openStream = file.toURI().toURL().openStream();
}
}
//45
public class func{
	public void actionPerformed(final ActionEvent event){
                final File file = daeFiles.get(fileIndex);
                    loadColladaModel(new URLResourceSource(file.toURI().toURL()));
                    t1.setText(file.getName());
}
}
//46
public class func{
	public void loadCustomMod(File file,String className){
            URLClassLoader loader = new URLClassLoader(new URL[]{file.toURI().toURL()}, getClass().getClassLoader());
            return loadCustomMod(loader, className);
}
}
//47
public class func{
	public void createInstance(File file){
        return createInstance(file.toURI().toURL());
}
}
//48
public class func{
	public void FileStream(SoundManager soundmgr,File file,boolean loop){
        super(soundmgr, file.toURI().toURL(), loop);
}
}
//49
public class func{
	public void addToSrcUrls(File file){
         srcDirectories.add(file.toURI().toURL());
}
}
//50
public class func{
	public void read(File file,Drawing drawing,boolean replace){
        this.url = file.toURI().toURL();
}
}
//51
public class func{
	public void source(final File file){
            return source( file.toURI().toURL() );
}
}
//52
public class func{
	public void storeAsJson(final Object o,final File file){
            return file.toURI().toURL();
}
}
//53
public class func{
	public void toURL(File file){
      return file.toURI().toURL();
}
}
//54
public class func{
	public void createPermutationsXML(final TestManifestServlet servlet,final String fileContent){
    final File file = createFile( "permutations", "xml", fileContent );
      thenReturn( file.toURI().toURL() );
}
}
//55
public class func{
	public void testFileUrl(){
    URL url = file.toURI().toURL();
    validateResource(url);
}
}
//56
public class func{
	public void testDuplicateColumnNames(){
        File file = TestData.file(TestCaseSupport.class, "bad/state.shp");
        ShapefileDataStore dataStore = new ShapefileDataStore(file.toURI().toURL());
        SimpleFeatureSource states = dataStore.getFeatureSource();
        SimpleFeatureType schema = states.getSchema();
        assertEquals(6, schema.getAttributeCount());
        assertTrue(states.getCount(Query.ALL) > 0);
        dataStore.dispose();
}
}
//57
public class func{
	public void chooseImage(){
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.showOpenDialog(this);
    File file = fileChooser.getSelectedFile();
    Icon imageIcon = new ImageIcon(file.toURI().toURL());
    setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight() + 100);
    imageLabel.setIcon(imageIcon);
    String decodeText = getDecodeText(file);
    textArea.setText(decodeText);
}
}
//58
public class func{
	public void toURL(File file){
    return file.toURI().toURL();
}
}
//59
public class func{
	public void detect(File file){
        return detect(file.toURI().toURL());
}
}
//60
public class func{
	public void fileConnection(final File file){
    final URL url = file.toURI().toURL();
    final URLConnection connection = url.openConnection();
}
}
//61
public class func{
	public void DirectoryResourceHandle(String name,File file,File codeSource,Manifest manifest){
        url = file.toURI().toURL();
}
}
//62
public class func{
	public void textOf(File file){
      return textOf(file.toURI().toURL());
}
}
//63
public class func{
	public void SaxReader(File file,DSLHandler dslHandler){
            xmlFile = file.toURI().toURL();
}
}
//64
public class func{
	public void handleAsFile(File file){
            handleAsURL(file.toURI().toURL());
            throw illegalValue(file, URL.class, e);
}
}
//65
public class func{
	public void fileToURL(File file){
      return file.toURI().toURL();
}
}
//66
public class func{
	public void toURL(File file){
        return file.toURI().toURL();
}
}
//67
public class func{
	public void open(File file){
      String cmd = String.format(opencmd, file.toURI().toURL());
}
}
//68
public class func{
	public void defaultArchive(){
            final File file = JarLocation.jarLocation(reference);
            return ClasspathArchive.archive(reference.getClassLoader(), file.toURI().toURL());
}
}
//69
public class func{
	public void addClasspath(File file){
                loader.addURL(file.toURI().toURL());
}
}
//70
public class func{
	public void fetchFileName(File file){
        URL pathUrl = file.toURI().toURL();
        String[] pathArray = pathUrl.getFile().split("/");
}
}
//71
public class func{
	public void buildOther(){
        return file.toURI().toURL();
}
}
//72
public class func{
	public void dml(String contents){
        return file.toURI().toURL();
}
}
//73
public class func{
	public void urlFor(File file){
            return file.toURI().toURL();
}
}
//74
public class func{
	public void getFeatureCollection(File file){
            featureCollection = FeatureUtils.getFeatureSource(file.toURI().toURL()).getFeatures();
}
}
//75
public class func{
	public void toURL(File file){
            url = file.toURI().toURL();
}
}
//76
public class func{
	public void toURL(File file){
        return file.toURI().toURL();
}
}
//77
public class func{
	public void ClassMirror(File file){
    this(new FileInputStream(file), file.toURI().toURL());
}
}
//78
public class func{
	public void parse(File file){
        return parse(file.toURI().toURL());
}
}
//79
public class func{
	public void IndexLocation(File file){
      tempUrl = file.toURI().toURL();
}
}
//80
public class func{
	public void getContents(File file){
            return getContents(file.toURI().toURL());
}
}
//81
public class func{
	public void returnsTrueForRealStaticResources(){
  when(context.getResource(key)).thenReturn(file.toURI().toURL());
}
}
//82
public class func{
	public void ShpFiles(File file){
        init(file.toURI().toURL());
}
}
//83
public class func{
	public void loadJar(File file){
            method.invoke(ClassLoader.getSystemClassLoader(), new Object[]{file.toURI().toURL()});
}
}
//84
public class func{
	public void getURL(File file){
            return file.toURI().toURL();
}
}
//85
public class func{
	public void main(String args[]){
        splitStream(file, aligner.align(file.toURI().toURL(), args[3]));
}
}
//86
public class func{
	public void eval(File file){
        return file.toURI().toURL();
}
}
//87
public class func{
	public void testGetAllContentFromURL(){
        final File file = File.createTempFile("test", "test");
        IOUtil.writeContentToFile("theContent\nVeryGreatContent", file);
        assertArrayEquals("theContent\nVeryGreatContent".getBytes(), IOUtil.getAllContentFrom(file.toURI().toURL()));
}
}
