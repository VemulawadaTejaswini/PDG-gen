//0
public class func{
	public void getResourceStreamWithClassLoader(ClassLoader classLoader,String path){
    if (classLoader != null)
    {
      URL url = classLoader.getResource(path);
      if (url != null)
      {
        return new UrlResourceStream(url);
      }
    }
}
}
//1
public class func{
	public void getSourceLocation(Class<?> clazz){
    final ClassLoader loader = clazz.getClassLoader();
    final URL resource = loader != null ? loader.getResource(name) : ClassLoader.getSystemResource(name);
    return resource != null ? resource.toExternalForm() : "<unknown>";
}
}
//2
public class func{
	public void find(String resource,ClassLoader... loaders){
        for (ClassLoader loader: loaders) {
            if (loader != null) {
                URL url = loader.getResource(resource);
                if (url != null) {
                    return url;
                }
            }
        }
        throw new IllegalArgumentException(JGroupsLogger.ROOT_LOGGER.notFound(resource));
}
}
//3
public class func{
	public void findSourceInClassPath(ClassLoader cl,String sourceTypeName){
    String toTry = sourceTypeName.replace('.', '/') + ".java";
    URL foundURL = cl.getResource(toTry);
    if (foundURL != null) {
      return foundURL;
    }
    int i = sourceTypeName.lastIndexOf('.');
    if (i != -1) {
      return findSourceInClassPath(cl, sourceTypeName.substring(0, i));
    } else {
      return null;
    }
}
}
//4
public class func{
	public void generate(){
      ClassLoader loader = GenHiveTemplate.class.getClassLoader();
      URL url = loader.getResource("org/apache/hadoop/hive/conf/HiveConf.class");
      if (url != null) {
        File file = new File(url.getFile());
        if (file.exists() && file.lastModified() < current.lastModified()) {
          return;
        }
      }
}
}
//5
public class func{
	public void getResource(String name){
        for (ClassLoader parent : parents) {
            URL resource = parent.getResource(name);
            if (resource != null) {
                return resource;
            }
        }
}
}
//6
public class func{
	public void findResource(String name){
    for (ClassLoader delegate : delegateClassLoaders) {
      resource = delegate.getResource(name);
      if (resource != null)
        break;
    }
}
}
//7
public class func{
	public void getResourceURL(String resource,Class<?> c){
        if (c != null) {
            ClassLoader classLoader = c.getClassLoader();
            if (classLoader != null) {
                return classLoader.getResource(resource);
            }
        }
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader != null) {
            return classLoader.getResource(resource);
        }
        return ClassLoader.getSystemResource(resource);
}
}
//8
public class func{
	public void searchParentChain(String fileName){
    if (loader.getParent() != null) {
      URL url = Loader.get(loader.getParent()).searchParentChain(fileName);
      if (url != null) {
        return url;
      }
    }
    return loader.getResource(fileName);
}
}
//9
public class func{
	public void getResource(String name,BeanContextChild bcc){
    if (! contains(bcc))
      throw new IllegalArgumentException("argument not a child");
    ClassLoader loader = bcc.getClass().getClassLoader();
    return (loader == null ? ClassLoader.getSystemResource(name)
            : loader.getResource(name));
}
}
//10
public class func{
	public void getResource(String name){
        for ( final ClassLoader classLoader : this.classLoaders ) {
            URL url = classLoader.getResource( name );
            if ( url != null ) {
                return url;
            }
        }
}
}
//11
public class func{
	public void findResource(String name){
    for (ClassLoader loader : loaders) {
      URL url = loader.getResource(name);
      if (url != null) {
        return url;
      }
    }
}
}
//12
public class func{
	public void findResource(String name){
    for ( ClassLoader classLoader : individualClassLoaders ) {
      final URL resource = classLoader.getResource( name );
      if ( resource != null ) {
        return resource;
      }
    }
}
}
//13
public class func{
	public void findResource(String name){
        for (ClassLoader loader : loaders) {
            URL url = loader.getResource(name);
            if (url != null) {
                return url;
            }
        }
}
}
//14
public class func{
	public void apply(String resource){
      for (ClassLoader loader : classLoaders) {
        if (loader.getResource(resource) != null) {
          loaderForResource = loader;
        }
      }
      return new InternalResourceFile(resource, loaderForResource);
}
}
//15
public class func{
	public void getResource(String name){
    for(ClassLoader classLoader : _classLoaders)
    {
      url = classLoader.getResource(name);

      if(url != null)
        return url;
    }
}
}
//16
public class func{
	public void getResource(String name){
    for (ClassLoader pluginClassloader : pluginClassloaders) {
      URL url = pluginClassloader.getResource(name);
      if (url != null) {
        return url;
      }
    }
}
}
//17
public class func{
	public void findResource(String name){
      for ( ClassLoader classLoader : individualClassLoaders ) {
        final URL resource = classLoader.getResource( name );
        if ( resource != null ) {
          return resource;
        }
      }
}
}
//18
public class func{
	public void getResource(String name){
        for (ClassLoader cl : delegates) {
            URL res = cl.getResource(name);
            if (res != null)
                return res;
        }                
}
}
//19
public class func{
	public void findResource(String name){
        for (ClassLoader cl : loaders) {
            url = cl.getResource(name);
            if (url != null) {
                break;
            }
        }
}
}
//20
public class func{
	public void loadFromSecondaryLoader(String path){
        for (ClassLoader loader : secondaryResourceLoaders) {
            URL url = loader.getResource(path);
            if (url != null) {
                return url;
            }
        }
}
}
//21
public class func{
	public void getResource(String name){
      for (ClassLoader cl : parents) {
         URL url = cl.getResource(name);
         if (url != null) {
           return url;
         }
       }
}
}
//22
public class func{
	public void findResource(String name){
        for (ClassLoader loader : loaders) {
            url = loader.getResource(name);
            if (url != null) {
                return url;
            }
        }
}
}
//23
public class func{
	public void getTestDir(final String name){
        ClassLoader cloader = Thread.currentThread().getContextClassLoader();
        URL resource = cloader.getResource( name );
        if ( resource == null )
        {
            throw new IOException( "Cannot find test directory: " + name );
        }
        return new File( new URI( resource.toExternalForm() ).normalize().getPath() );
}
}
//24
public class func{
	public void getFileForClasspathResource(String resource){
        ClassLoader cloader = Thread.currentThread().getContextClassLoader();
        URL resourceUrl = cloader.getResource( resource );
        if ( resourceUrl == null )
        {
            throw new FileNotFoundException( "Unable to find: " + resource );
        }
        return new File( URI.create( resourceUrl.toString().replaceAll( " ", "%20" ) ) );
}
}
//25
public class func{
	public void findIcon(@NotNull String path,@NotNull ClassLoader classLoader){
    path = undeprecate(path);
    if (isReflectivePath(path)) return getReflectiveIcon(path, classLoader);
    if (!StringUtil.startsWithChar(path, '/')) return null;
    final URL url = classLoader.getResource(path.substring(1));
    return findIcon(url);
}
}
//26
public class func{
	public void resourceURL(String name){
        ClassLoader tcl = Thread.currentThread().getContextClassLoader();
        URL url = tcl.getResource(name);
        return url != null ? url.toString() : null;
}
}
//27
public class func{
	public void resourceURL(String name){
        ClassLoader tcl = Thread.currentThread().getContextClassLoader();
        URL url = tcl.getResource(name);
        return url != null ? url.toString() : null;
}
}
//28
public class func{
	public void locateRuntime(String targetName){
    final ClassLoader loader = Thread.currentThread().getContextClassLoader();
    final URL runtimeSrc = loader.getResource(targetName+"/src");
    if ( runtimeSrc==null ) {
      throw new RuntimeException("Cannot find "+targetName+" runtime");
    }
    return runtimeSrc.getPath();
}
}
//29
public class func{
	public void locateRuntime(){
    final ClassLoader loader = Thread.currentThread().getContextClassLoader();
    final URL runtimeSrc = loader.getResource("JavaScript/src");
    if ( runtimeSrc==null ) {
      throw new RuntimeException("Cannot find JavaScript runtime");
    }
    return runtimeSrc.getPath();
}
}
//30
public class func{
	public void getResource(String name){
        final ClassLoader tccl = Thread.currentThread().getContextClassLoader();
        if (tccl != null) {
            return tccl.getResource(name);
        } else {
            return getClass().getResource(name);
        }
}
}
//31
public class func{
	public void findResourceOnClasspath(ClassLoader classLoader,URI classpathUri){
            pathAsString = pathAsString.substring(1);
        URL resource = classLoader.getResource(pathAsString);
        if (resource==null)
          throw new FileNotFoundOnClasspathException("Couldn't find resource on classpath. URI was '"+classpathUri+"'");
        URI fileUri = URI.createURI(resource.toString(),true);
}
}
//32
public class func{
	public void resource(final String name){
        final ClassLoader classLoader = getClass().getClassLoader();
        final URL resource = classLoader.getResource(name);
        if (resource == null) {
            throw new IllegalArgumentException("Can't locate resource " + name + " on " + classLoader);
        }
}
}
//33
public class func{
	public void toUrl(final ClassLoader classLoader,final String path){
        final URL resource = classLoader.getResource(path);
        if (resource == null) {
            throw new IllegalArgumentException("Failed to find resource " + path);
        }
}
}
//34
public class func{
	public void getResource(String name,ClassLoader loader){
        URL resource = loader.getResource(name);
        if (resource == null) {
            throw new IOException("resource not found: " + name);
        }
}
}
//35
public class func{
	public void getClassURL(final String clazzBinName,final ClassLoader cl){
        final URL url = cl.getResource(getClassFileName(clazzBinName));
        if(null == url) {
            throw new IOException("Cannot not find: "+clazzBinName);
        }
}
}
//36
public class func{
	public void getFileFromClasspath(ClassLoader loader,final String filePath){
            URL fileURL = loader.getResource(filePath);
            if (fileURL == null) {
                throw new FileNotFoundException("File [" + filePath + "] could not be found in classpath");
            }
            return fileURL.openStream();
}
}
//37
public class func{
	public void resourceToFile(String filename){
        ClassLoader loader = FBUtilities.class.getClassLoader();
        URL scpurl = loader.getResource(filename);
        if (scpurl == null)
            throw new ConfigurationException("unable to locate " + filename);
        return new File(scpurl.getFile()).getAbsolutePath();
}
}
//38
public class func{
	public void getSwIcon(String name){
    ClassLoader cls = UiHelper.class.getClassLoader();
    URL url = cls.getResource(name);
    if (url == null) throw new RuntimeException("could not find: " + name);
    return new ImageIcon(url);
}
}
//39
public class func{
	public void loadIcon(String pathname){
        ClassLoader jarLoader = AmazonBrowser.class.getClassLoader();
        URL url = jarLoader.getResource(pathname);
        if (url == null) return null;
        return new ImageIcon(url);
}
}
//40
public class func{
	public void CueBannerPanel(String welcomeLogo){
        ClassLoader cl = Lookup.getDefault().lookup(ClassLoader.class);
        if (cl != null) {
            ImageIcon icon = new ImageIcon(cl.getResource(welcomeLogo));
            autopsyLogo.setIcon(icon);
        }
}
}
//41
public class func{
	public void loadJassLoginConfig(final ClassLoader classLoader){
            final URL resource = classLoader.getResource("client.login.conf");
            if (resource != null) {
                System.setProperty("java.security.auth.login.config", URLDecoder.decode(resource.toExternalForm()));
            }
}
}
//42
public class func{
	public void openStreamFromURL(String path){
        ClassLoader cl = PropertiesUtil.class.getClassLoader();
        URL url = cl.getResource(path);
        if (url != null) {
             try{
                 InputStream stream = url.openStream();
                 return stream;
            } catch (IOException ioex) {
                return null;
            }
        }
}
}
//43
public class func{
	public void main(String args[]){
      if (cl.getResource (tempFile.getName()) == null) {
          throw new RuntimeException("Returned null instead of " +
                                     tempFile.toURL().toString());
      }
}
}
//44
public class func{
	public void getResources(String resName){
              ClassLoader cl = Loader.class.getClassLoader();
              if (cl == null)
                url = ClassLoader.getSystemResource(resName);
              else
                url = cl.getResource(resName);
              return new Singleton(url);
}
}
//45
public class func{
	public void findInSystemBundle(String entry){
        ClassLoader loader = BundleActivator.class.getClassLoader();
        return loader == null ? ClassLoader.getSystemResource(entry) : loader.getResource(entry);
}
}
//46
public class func{
	public void getResourceAsURL(final String resource){
    ClassLoader classLoader = getClassLoaderForResource(resource);
    return classLoader != null ? classLoader.getResource(resource) : null;
}
}
//47
public class func{
	public void getResource(String name){
        ClassLoader parent = getParent( );
        if ( parent != null )
          resource = parent.getResource( name );
}
}
//48
public class func{
	public void getClasspathForResource(ClassLoader classLoader,String name){
        if (classLoader == null) {
            return getClasspathForResource(ClassLoader.getSystemResource(name), name);
        } else {
            return getClasspathForResource(classLoader.getResource(name), name);
        }
}
}
//49
public class func{
	public void getResource(String name){
    final URL url = cl != null ? cl.getResource(resolveName(name)): null;
    return url != null ? url: ClassLocator.class.getResource(name);
}
}
//50
public class func{
	public void getInputStream(ClassLoader loader,String resourceName,boolean reload){
        URL url = loader.getResource(resourceName);
        if (url == null) {
            return null;
        }
        URLConnection connection = url.openConnection();
        connection.setUseCaches(!reload);
        return connection.getInputStream();
}
}
//51
public class func{
	public void findResource(final String name){
    ClassLoader _classLoader = this.classFinder.getClassLoader();
    final URL result = _classLoader.getResource(name);
    if (result != null) {
      _elvis = result;
    } else {
      URL _findResource = super.findResource(name);
      _elvis = _findResource;
    }
}
}
//52
public class func{
	public void getResource(final String name){
      ClassLoader parent = getParent();
      if (parent != null) {
        resource = parent.getResource(name);
      }
}
}
//53
public class func{
	public void getResource(ClassLoader loader,String name){
    if (loader == null) {
        return ClassLoader.getSystemResource(name);
    } else {
        return loader.getResource(name);
    }
}
}
//54
public class func{
	public void getResource(String resourceName){
  String path = resourcePath(resourceName);
  ClassLoader cl = getClassLoader();
  return cl != null ? cl.getResource(path) :
          ClassLoader.getSystemResource(path);
}
}
//55
public class func{
	public void load(CustomTagLibrary taglib,String name,ClassLoader classLoader){
        URL res = classLoader.getResource(taglib.basePath + '/' + name + ".groovy");
        if(res==null)   return null;
}
}
//56
public class func{
	public void getResource(String name){
            if (url != null) {
                break;
            }
            url = cl.getResource(name);
}
}
//57
public class func{
	public void getResource(String fileName,ClassLoader loader){
    if (loader == null) {
      throw new IllegalArgumentException("null loader");
    }
    return loader.getResource(fileName);
}
}
//58
public class func{
	public void _readJalopyXmlFromClassLoader(){
    ClassLoader classLoader = ServiceBuilder.class.getClassLoader();
    URL url = classLoader.getResource("jalopy.xml");
    if (url == null) {
      throw new RuntimeException(
        "Unable to load jalopy.xml from the class loader");
    }
}
}
//59
public class func{
	public void getResource(String name){
            final ClassLoader parent = getParent();
            if (parent != null) {
                url = parent.getResource(name);
            }
}
}
//60
public class func{
	public void getUrlForPath(String path){
        ClassLoader classLoader = HttpServerHandler.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResource(path);
        } else {
            return classLoader.getResource(path);
        }
}
}
//61
public class func{
	public void createDefault(ClassLoader loader){
       if (loader.getResource("j8583.xml") == null) {
         log.warn("ISO8583 ConfigParser cannot find j8583.xml, returning empty message factory");
         return new MessageFactory<>();
       } else {
         return createFromClasspathConfig(loader, "j8583.xml");
       }
}
}
//62
public class func{
	public void getIcon(String iconResource){
    ClassLoader cl = getClassLoaderForResources();
    URL iconUrl = cl.getResource(iconResource);
    if (iconUrl == null)
      return null;
    return new IconUIResource(new ImageIcon(iconUrl));
}
}
//63
public class func{
	public void getPortalCacheConfigurationURL(Configuration configuration,ClassLoader classLoader,String configLocation){
    String cacheConfigurationLocation = configuration.get(configLocation);
    if (Validator.isNull(cacheConfigurationLocation)) {
      return null;
    }
    return classLoader.getResource(cacheConfigurationLocation);
}
}
//64
public class func{
	public void getAllKnownExecutionEnvironments(){
        for (String profileFile : listProps.getProperty("java.profiles").split(",")) {
            Properties props = readProperties(loader.getResource(profileFile.trim()));
            String profileName = props.getProperty("osgi.java.profile.name");
            if (profileName == null) {
                throw new IllegalStateException("osgi.java.profile.name must not be null for profile " + profileFile);
            }
            result.add(profileName);
        }
}
}
//65
public class func{
	public void TestResource(ClassLoader classLoader,String httpUrl){
    URI uri = new URI(httpUrl);
    if (uri.getPath() == null) {
      throw new IllegalArgumentException("Wrong path in uri:" + httpUrl);
    }
    this.resourceUrl = classLoader.getResource(uri.getPath().substring(1));
}
}
//66
public class func{
	public void getResource(BundleWiring bundleWiring,String name){
    Bundle bundle = bundleWiring.getBundle();
    URL url = bundle.getResource(name);
    if ((url == null) && (bundle.getBundleId() == 0)) {
      ClassLoader classLoader = bundleWiring.getClassLoader();

      return classLoader.getResource(name);
    }
    return bundle.getResource(name);
}
}
