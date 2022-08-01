//0
public class func{
	public void run(){
                    URL url = classLoader.getResource(resourceName);
                    if (url != null) {
                      URLConnection connection = url.openConnection();
                      if (connection != null) {
                        connection.setUseCaches(false);
                        is = connection.getInputStream();
                      }
                    }
}
}
//1
public class func{
	public void run(){
                                    URL url = classLoader.getResource(resourceName);
                                    if (url != null) {
                                        URLConnection connection = url.openConnection();
                                        if (connection != null) {
                                            // Disable caches to get fresh data for
                                            // reloading.
                                            connection.setUseCaches(false);
                                            is = connection.getInputStream();
                                        }
                                    }
}
}
//2
public class func{
	public void getInputStream(ClassLoader loader,boolean reload,String resourceName){
        if (!reload) { return loader.getResourceAsStream(resourceName); }
        URL url = loader.getResource(resourceName);
        if (url == null) { return null; }
        URLConnection connection = url.openConnection();
        if (connection == null) { return null; }
        connection.setUseCaches(false);
        return connection.getInputStream();
}
}
//3
public class func{
	public void openConnection(URL url){
        if (url.getProtocol().equals("https")) {
            for (String domain : sStaticCA.keySet()) {
                if (url.getHost().endsWith(domain)) {
                    return openCAConnection(sStaticCA.get(domain), url);
                }
            }
        }
        return url.openConnection();
}
}
//4
public class func{
	public void outputStreamFromURL(URL url){
        if ("file".equals(url.getProtocol())) {
            // as with inputStreamFromURL, avoid probs with Windows network mounts:
            String host = url.getHost();
            if (host == null || host.length() == 0) {
                return new FileOutputStream(url.getPath());
            }
        }
        return url.openConnection().getOutputStream();
}
}
//5
public class func{
	public void reload(URL url){
        if (url != null)
        {
            URLConnection connection = url.openConnection();
            if (connection != null)
            {
                connection.setUseCaches(false);
                return connection.getInputStream();
            }
        }
}
}
//6
public class func{
	public void lastModified(){
    URL url = getURL();
    if (ResourceUtils.isFileURL(url) || ResourceUtils.isJarURL(url)) {
      // Proceed with file system resolution...
      return super.lastModified();
    }
    else {
      // Try a URL connection last-modified header...
      URLConnection con = url.openConnection();
      con.setUseCaches(false);
      if (con instanceof HttpURLConnection) {
        ((HttpURLConnection) con).setRequestMethod("HEAD");
      }
      return con.getLastModified();
    }
}
}
//7
public class func{
	public void contentLength(){
    URL url = getURL();
    if (ResourceUtils.isFileURL(url)) {
      // Proceed with file system resolution...
      return super.contentLength();
    }
    else {
      // Try a URL connection content-length header...
      URLConnection con = url.openConnection();
      con.setUseCaches(false);
      if (con instanceof HttpURLConnection) {
        ((HttpURLConnection) con).setRequestMethod("HEAD");
      }
      return con.getContentLength();
    }
}
}
//8
public class func{
	public void openConnection(final URL url){
        final String path = url.getPath();
        if ( Strings.isNullOrEmpty( path ) )
        {
            throw new MalformedURLException( "Path can not be null or empty." );
        }
        final ResourceKey key = ResourceKey.from( path );
        final Bundle bundle = getBundle( key.getApplicationKey() );
        final URL resolvedUrl = bundle.getResource( key.getPath() );
        return resolvedUrl != null ? resolvedUrl.openConnection() : null;
}
}
//9
public class func{
	public void lastModified(){
        URL url = getURL();
        if (GrailsResourceUtils.isFileURL(url) || GrailsResourceUtils.isJarURL(url)) {
            // Proceed with file system resolution...
            return getFile().lastModified();
        }
        URLConnection con = url.openConnection();
        useCachesIfNecessary(con);
        if (con instanceof HttpURLConnection) {
            ((HttpURLConnection) con).setRequestMethod("HEAD");
        }
        return con.getLastModified();
}
}
//10
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
//11
public class func{
	public void getInputStream(String path){
            URL url = getResource(path);
            if (url == null) {
                return null;
            }
            URLConnection connection = url.openConnection();
            connection.setUseCaches(false);
            return connection.getInputStream();
}
}
//12
public class func{
	public void get(String name){
        if(resurl.getProtocol().equals("https"))
      c = ssl.connect(resurl);
        else
      c = resurl.openConnection();
        c.addRequestProperty("User-Agent", "Haven/1.0");
        return(c.getInputStream());
}
}
//13
public class func{
	public void getResourceAsStream(String name){
        URL url = getResource(name);
        if (url != null) {
            try {
                URLConnection con = url.openConnection();
                con.setUseCaches(false);
                return con.getInputStream();
            } catch (IOException e) {
            }
        }
}
}
//14
public class func{
	public void getResourceAsStream(String resourceName,ClassLoader callingClass,boolean useCache){
    URL url = getResourceUrl(resourceName, callingClass);
    if (url != null) {
      URLConnection urlConnection = url.openConnection();
      urlConnection.setUseCaches(useCache);
      return urlConnection.getInputStream();
    }
}
}
//15
public class func{
	public void getResource(String filename){
            URL url = getClassLoader().getResource(filename);
            if (url == null) {
                return null;
            }
            URLConnection connection = url.openConnection();
            connection.setUseCaches(false);
            return connection.getInputStream();
}
}
//16
public class func{
	public void get(String name){
      URL resurl = encodeurl(new URL(baseurl, name + ".res"));
      if(resurl.getProtocol().equals("https"))
    c = ssl.connect(resurl);
      else
    c = resurl.openConnection();
      c.addRequestProperty("User-Agent", "Haven/1.0");
      return(c.getInputStream());
}
}
//17
public class func{
	public void loadDataFromURL(URL url,String contentType,Sail sail){
        String lang = urlToModelLang(url, contentType);
        if (lang != null) {
            URLConnection conn = url.openConnection();
            
            //setRequestHeaders(conn, LongwellUtilities.getLabel() + "/" + LongwellUtilities.getVersion());
            
            conn.connect();
            InputStream stream = conn.getInputStream();
            try {
                loadDataFromStream(stream, url.toExternalForm(), lang, sail);
            } catch (Exception e) {
                throw new RuntimeException("Error loading data from URL: " + url + " " + e.getMessage());
            } finally {
                stream.close();
            }
        } else {
            throw new ModelReadFromFileException("Unknown data format in " + url.toExternalForm());
        }
}
}
//18
public class func{
	public void getTestListReader(String location){
      URL url = getTestListURL( location );
      if(url != null) {
        URLConnection connection = url.openConnection();
        return new LineNumberReader( new InputStreamReader( connection.getInputStream() ) );
      }
}
}
//19
public class func{
	public void getContent(){
      URL resourceURL = _servletContext.getResource(_resourcePath);
      if (resourceURL == null) {
        return null;
      }
      URLConnection urlConnection = resourceURL.openConnection();
      return StringUtil.read(urlConnection.getInputStream());
}
}
//20
public class func{
	public void openStreamFromURL(URL url){
    if (url == null) {
      throw new IllegalArgumentException("url must not be null!");
    }
    URLConnection connection = url.openConnection();
        setURLConnectionDefaults(connection);
        return connection.getInputStream();
}
}
//21
public class func{
	public void getInputStream(String fileName){
    URL url = servletContext.getResource(resourcesDir.concat(fileName));
    if (url == null) {
      return null;
    }
    URLConnection urlConnection = url.openConnection();
    return urlConnection.getInputStream();
}
}
//22
public class func{
	public void openStreamFromURL(URL url,int timeout){
    if (url == null) {
      throw new IllegalArgumentException("url must not be null!");
    }
    URLConnection connection = url.openConnection();
    connection.setConnectTimeout(timeout);
    connection.setReadTimeout(timeout);
        return connection.getInputStream();
}
}
//23
public class func{
	public void getBitmapFromUrl(URL url,String cookies){
    if (url == null)
      return null;
      connection = url.openConnection();
      connection.setUseCaches(true);
}
}
//24
public class func{
	public void lastModified(){
    URL url = getURL();
    if (ResourceUtils.isFileURL(url) || ResourceUtils.isJarURL(url)) {
      // Proceed with file system resolution...
      return super.lastModified();
    }
    else {
      // Try a URL connection last-modified header...
      URLConnection con = url.openConnection();
      customizeConnection(con);
      return con.getLastModified();
    }
}
}
//25
public class func{
	public void lastModified(){
        URL url = getURL();
        if (ResourceUtils.isFileURL(url) || ResourceUtils.isJarURL(url)) {
            // Proceed with file system resolution...
            return super.lastModified();
        } else {
            // Try a URL connection last-modified header...
            URLConnection con = url.openConnection();
            customizeConnection(con);
            return con.getLastModified();
        }
}
}
//26
public class func{
	public void recordTimestamp(String className,ClassLoader loader){
        final URL file = loader.getResource(className.replace(".", "/") + ".class");
        className = className.replace("/", ".");
        if (file != null) {
            URLConnection connection = null;
            try {
                connection = file.openConnection();
                timestamps.put(className, connection.getLastModified());
                loaders.put(className, loader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
}
//27
public class func{
	public void contentLength(){
        URL url = getURL();
        if (ResourceUtils.isFileURL(url)) {
            // Proceed with file system resolution...
            return getFile().length();
        } else {
            // Try a URL connection content-length header...
            URLConnection con = url.openConnection();
            customizeConnection(con);
            return con.getContentLength();
        }
}
}
//28
public class func{
	public void convertToLocalUrl(URL url){
        if (url.getProtocol().equals("bundle"))
        {
            try
            {
                url = ((URLHandlersBundleURLConnection)
                    url.openConnection()).getLocalURL();
            }
            catch (IOException ex)
            {
                // Ignore and add original url.
            }
        }
}
}
//29
public class func{
	public void connect(URL url){
  if(!url.getProtocol().equals("https"))
      throw(new MalformedURLException("Can only be used to connect to HTTPS servers"));
  HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
}
}
//30
public class func{
	public void contentLength(){
    URL url = getURL();
    if (ResourceUtils.isFileURL(url)) {
      // Proceed with file system resolution...
      return getFile().length();
    }
    else {
      // Try a URL connection content-length header...
      URLConnection con = url.openConnection();
      customizeConnection(con);
      return con.getContentLength();
    }
}
}
//31
public class func{
	public void openConnection(URL u){
        final URL resourceUrl = classLoader.getResource(u.getPath());
        return resourceUrl != null ? resourceUrl.openConnection() : null;
}
}
//32
public class func{
	public void openConnection(URL url){
            return MEMORY_URL_PROTOCOL.equals(url.getProtocol()) ? new MemoryURLConnection(url, file) : url.openConnection();
}
}
//33
public class func{
	public void openConnection(URL u){
                URL resource = Tools.getResource(u.getPath().substring(1, u.getPath().length()));
                if (resource != null) {
                  URLConnection conn = resource.openConnection();
                  WebServiceTools.setURLConnectionDefaults(conn);
                  return conn;
                }
}
}
//34
public class func{
	public void openConnection(final URL url){
      LOGGER.trace(String.format("Creating stream for resource <%s>, using class loader <%s>...",resource,classLoader));
    final URL resourceURL=classLoader.getResource(resource);
    if(resourceURL==null) {
      throw new IOException(String.format("Resource <%s> could not be found in the classpath.",resource));
    }
    return resourceURL.openConnection();
}
}
//35
public class func{
	public void getResource(@NotNull ClassLoader loader,@NonNls @NotNull String basePath,@NonNls @NotNull String fileName){
    List<String> bundles = calculateBundleNames(fixedPath, Locale.getDefault());
    for (String bundle : bundles) {
      URL url = loader.getResource(bundle + "/" + fileName);
      if (url == null) continue;

      try {
        url.openConnection();
      }
      catch (IOException e) {
        continue;
      }

      return url;
    }
    return loader.getResource(fixedPath + "/" + fileName);
}
}
//36
public class func{
	public void openConnection(URL u){
                URL resource = Tools.getResource("icons" + u.getPath());
                if (resource != null) {
                  URLConnection conn = resource.openConnection();
                  WebServiceTools.setURLConnectionDefaults(conn);
                  return conn;
                }
}
}
//37
public class func{
	public void openConnection(URL u){
    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
    String resourceId = nameAndLocation.substring(nameAndLocation.indexOf('/') + 1);
    ClassLoader cl = JdtUtils.getClassLoader(project, null);
    URL resource = cl.getResource(resourceId);
    if (resource != null) {
      return resource.openConnection();
    }
}
}
//38
public class func{
	public void getLastModified(String fileName){
        URL url = Externalization.class.getClassLoader().getResource(fileName);
        if (url != null) {
            URLConnection connection = url.openConnection();
            lastModified = connection.getLastModified();
        }
}
}
//39
public class func{
	public void openConnection(final URL url){
        final ResourceKey key = ResourceKey.from( url.getPath() );
        final URL newUrl = this.registry.getUrl( key );
        if ( newUrl != null )
        {
            return newUrl.openConnection();
        }
}
}
//40
public class func{
	public void connect(){
            URL url = bundle.getEntry(bundlePath);
            if (url == null) {
                throw new IOException("Cannot find entry " + bundlePath
                    + " in bundle " + bundle + " for URL " + url);
            }
            delegatee = url.openConnection();
}
}
//41
public class func{
	public void getURLConnection(String originalPath,boolean virtual){
        ServletContextAndPath csAndP = getServletContextAndPath(originalPath,
                virtual);
        ServletContext context = csAndP.getServletContext();
        String path = csAndP.getPath();
        URL url = context.getResource(path);
        if (url == null) {
            throw new IOException("Context did not contain resource: " + path);
        }
        URLConnection urlConnection = url.openConnection();
}
}
//42
public class func{
	public void connect(){
            URL contextURL = resourceProvider.getResource(url.getPath());
            if (contextURL == null) {
                throw new IOException("Resource " + url.getPath()
                    + " does not exist");
            }
            delegatee = contextURL.openConnection();
}
}
//43
public class func{
	public void createAssetURLConnection(final String path){
        final URL url = AssetURLContext.createURL(path);
        final URLConnection c = url.openConnection();
        System.err.println("createAssetURL: "+path+" -> url: "+url+" -> conn: "+c+" / connURL "+(null!=c?c.getURL():null));
}
}
//44
public class func{
	public void createAssetURLConnection(final String path,final ClassLoader cl){
        final URL url = AssetURLContext.createURL(path, cl);
        final URLConnection c = url.openConnection();
        System.err.println("createAssetURL: "+path+" -> url: "+url+" -> conn: "+c+" / connURL "+(null!=c?c.getURL():null));
}
}
//45
public class func{
	public void findCodeSourceConnectionFor(final String name){
        final URL resource = findResource(name);
        if (resource != null) {
            try {
                return resource.openConnection();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
}
//46
public class func{
	public void findCodeSourceConnectionFor(final String name){
    final URL resource = findResource(name);
    if (resource != null) {
      try {
        return resource.openConnection();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
}
}
//47
public class func{
	public void open(final URL url){
        if(null==url) {
            return null;
        }
            final URLConnection c = url.openConnection();
            c.connect(); // redundant
}
}
//48
public class func{
	public void getConnection(JarFile jarFile){
        URL u = urlCache.get(jarFile);
        if (u != null)
            return u.openConnection();
}
}
//49
public class func{
	public void openConnection(final URL url){
    if (proxy != null) {
      connection = url.openConnection(proxy);
    } else {
      connection = url.openConnection();
    }
}
}
//50
public class func{
	public void getImageIcon(URL url){
   {  if (url==null) return null;
      {  url.openConnection().connect();
}
}
//51
public class func{
	public void getMimeType(final String name){
    URL resource = getResource(name);
    if (null != resource) {
      try {
        return resource.openConnection().getContentType();
      } catch (final IOException e) {
        return null;
      }
    }
}
}
//52
public class func{
	public void getConnection(final String key,boolean doNotThrowResourceNotFound){
        final URL u = clazz.getResource(adjustedKey);
        if (u == null) {
            if (doNotThrowResourceNotFound) return null;
            else throw new ResourceNotFoundException(key);
        }
        return u.openConnection();
}
}
//53
public class func{
	public void openConnection(URL url){
    return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
}
}
//54
public class func{
	public void lastModified(final String documentPath){
    final URL url = getBundle().getEntry(documentPath);
    if (url != null) {
      lastModified = url.openConnection().getLastModified();
    }
}
}
//55
public class func{
	public void getResource(String path){
            URL url = getClass().getResource(fullPath);
            if (url == null) {
                System.out.println("url is null: " + fullPath);
            }
            return new URLResource(url, url.openConnection(), path);
}
}
