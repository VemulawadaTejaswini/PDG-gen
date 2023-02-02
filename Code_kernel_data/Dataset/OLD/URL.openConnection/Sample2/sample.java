//0
public class func{
	public void test_getContentType(){
        URL u = copyAndOpenResourceStream("lf.jar", "");
        assertEquals("Returned incorrect type for jar file", "x-java/jar",
                u.openConnection().getContentType());
        u = copyAndOpenResourceStream("lf.jar", "plus.bmp");
        assertEquals("Returned incorrect type for the entry with known type",
                "image/x-ms-bmp", u.openConnection().getContentType());
        u = copyAndOpenResourceStream("lf.jar", "Manifest.mf");
        assertEquals("Returned incorrect type for the entry with known type",
                "content/unknown", u.openConnection().getContentType());
}
}
//1
public class func{
	public void test_getEntryName(){
        URL u = copyAndOpenResourceStream("lf.jar", "plus.bmp");
        juc = (JarURLConnection) u.openConnection();
        assertEquals("Returned incorrect entryName", "plus.bmp", juc
                .getEntryName());
        u = copyAndOpenResourceStream("lf.jar", "");
        juc = (JarURLConnection) u.openConnection();
        assertNull("Returned incorrect entryName", juc.getEntryName());
        URL url = copyAndOpenResourceStream("lf.jar", "foo.jar!/Bugs/HelloWorld.class");
        assertEquals("foo.jar!/Bugs/HelloWorld.class", ((JarURLConnection) url.openConnection()).getEntryName());
}
}
//2
public class func{
	public void testUrlFactory(){
        URL url = UrlFactory.getUrl("https://www.google.com", null);
        Assert.assertEquals(HttpsUrlHandler.HTTPS, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof HttpUrlConnection);
        url = UrlFactory.getUrl("HTTP://www.opennms.org", null);
        Assert.assertEquals(HttpUrlHandler.HTTP, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof HttpUrlConnection);
        url = UrlFactory.getUrl("sftp://www.opennms.org", null);
        Assert.assertEquals(SftpUrlHandler.PROTOCOL, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof SftpUrlConnection);
        url = UrlFactory.getUrl("sftp.3GPP://junier-router.local/opt/3gpp/data", null);
        Assert.assertEquals(Sftp3gppUrlHandler.PROTOCOL, url.getProtocol());
        Assert.assertTrue(url.openConnection() instanceof Sftp3gppUrlConnection);
}
}
//3
public class func{
	public void testGzipCompression(){
    final URL url = new URL("http://localhost:" + port + "/default");
    final HttpURLConnection get = (HttpURLConnection) url.openConnection();
    get.setRequestProperty("Accept-Encoding", "gzip");
    Assert.assertEquals("gzip", get.getContentEncoding());
    final HttpURLConnection post = (HttpURLConnection) url.openConnection();
    post.setRequestProperty("Accept-Encoding", "gzip");
    post.setRequestMethod("POST");
    Assert.assertEquals("gzip", post.getContentEncoding());
    final HttpURLConnection getNoGzip = (HttpURLConnection) url.openConnection();
    Assert.assertNotEquals("gzip", getNoGzip.getContentEncoding());
    final HttpURLConnection postNoGzip = (HttpURLConnection) url.openConnection();
    postNoGzip.setRequestMethod("POST");
    Assert.assertNotEquals("gzip", postNoGzip.getContentEncoding());
}
}
//4
public class func{
	public void testRequestCacheControlNoCache(){
        server.enqueue(new MockResponse()
                .addHeader("Last-Modified: " + formatDate(-120, TimeUnit.SECONDS))
                .addHeader("Date: " + formatDate(0, TimeUnit.SECONDS))
                .addHeader("Cache-Control: max-age=60")
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("Cache-Control", "no-cache");
        assertEquals("B", readAscii(connection));
}
}
//5
public class func{
	public void lastModified(URL url,String libfile){
  if(url.getProtocol().equals("jar")) {
    return ((JarURLConnection) url.openConnection()).getJarFile().getEntry(libfile).getTime();
  }
  else {
    return url.openConnection().getLastModified();
  }
}
}
//6
public class func{
	public void testVaryMatchesUnchangedRequestHeaderField(){
        server.enqueue(new MockResponse()
                .addHeader("Cache-Control: max-age=60")
                .addHeader("Vary: Accept-Language")
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection connection1 = url.openConnection();
        connection1.addRequestProperty("Accept-Language", "fr-CA");
        assertEquals("A", readAscii(connection1));
        URLConnection connection2 = url.openConnection();
        connection2.addRequestProperty("Accept-Language", "fr-CA");
        assertEquals("A", readAscii(connection2));
}
}
//7
public class func{
	public void testVaryMultipleFieldValuesWithMatch(){
        server.enqueue(new MockResponse()
                .addHeader("Cache-Control: max-age=60")
                .addHeader("Vary: Accept-Language")
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection connection1 = url.openConnection();
        connection1.addRequestProperty("Accept-Language", "en-US");
        assertEquals("A", readAscii(connection1));
        URLConnection connection2 = url.openConnection();
        connection2.addRequestProperty("Accept-Language", "en-US");
        assertEquals("A", readAscii(connection2));
}
}
//8
public class func{
	public void testDefaultExpirationDateFullyCachedForLessThan24Hours(){
        server.enqueue(new MockResponse()
                .addHeader("Last-Modified: " + formatDate(-105, TimeUnit.SECONDS))
                .addHeader("Date: " + formatDate(-5, TimeUnit.SECONDS))
                .setBody("A"));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        URLConnection connection = url.openConnection();
        assertEquals("A", readAscii(connection));
        assertNull(connection.getHeaderField("Warning"));
}
}
//9
public class func{
	public void testAuthorizationRequestHeaderPreventsCaching(){
        server.enqueue(new MockResponse()
                .addHeader("Last-Modified: " + formatDate(-2, TimeUnit.MINUTES))
                .addHeader("Cache-Control: max-age=60")
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection connection = url.openConnection();
        connection.addRequestProperty("Authorization", "password");
        assertEquals("A", readAscii(connection));
        assertEquals("B", readAscii(url.openConnection()));
}
}
//10
public class func{
	public void testPartialRangeResponsesDoNotCorruptCache(){
        server.enqueue(new MockResponse().setBody("AA")
                .setResponseCode(HttpURLConnection.HTTP_PARTIAL)
                .addHeader("Expires: " + formatDate(1, TimeUnit.HOURS))
                .addHeader("Content-Range: bytes 1000-1001/2000"));
        server.enqueue(new MockResponse().setBody("BB"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection range = url.openConnection();
        range.addRequestProperty("Range", "bytes=1000-1001");
        assertEquals("AA", readAscii(range));
        assertEquals("BB", readAscii(url.openConnection()));
}
}
//11
public class func{
	public void assertAuthorizationRequestFullyCached(MockResponse response){
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection connection = url.openConnection();
        connection.addRequestProperty("Authorization", "password");
        assertEquals("A", readAscii(connection));
        assertEquals("A", readAscii(url.openConnection()));
}
}
//12
public class func{
	public void main(String[] args){
        URL url = new URL(getSpec());
        URLConnection connection = url.openConnection();
        String contentType = connection.getContentType();
        if (!contentType.equals(JAR_MIME_TYPE)) {
            throw new RuntimeException("invalid MIME type for JAR archive");
        }
        url = new URL(url, "image.gif");
        connection = url.openConnection();
        contentType = connection.getContentType();
        if (!contentType.equals(GIF_MIME_TYPE)) {
            throw new RuntimeException("invalid MIME type for JAR entry");
        }
}
}
//13
public class func{
	public void testNoDefaultExpirationForUrlsWithQueryString(){
        server.enqueue(new MockResponse()
                .addHeader("Last-Modified: " + formatDate(-105, TimeUnit.SECONDS))
                .addHeader("Date: " + formatDate(-5, TimeUnit.SECONDS))
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/?foo=bar");
        assertEquals("A", readAscii(url.openConnection()));
        assertEquals("B", readAscii(url.openConnection()));
}
}
//14
public class func{
	public void assertNotCached(MockResponse response){
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        assertEquals("B", readAscii(url.openConnection()));
}
}
//15
public class func{
	public void assertFullyCached(MockResponse response){
        server.enqueue(response.setBody("A"));
        server.enqueue(response.setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        assertEquals("A", readAscii(url.openConnection()));
}
}
//16
public class func{
	public void testServerReturnsDocumentOlderThanCache(){
        server.enqueue(new MockResponse().setBody("B")
                .addHeader("Last-Modified: " + formatDate(-4, TimeUnit.HOURS)));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        assertEquals("A", readAscii(url.openConnection()));
}
}
//17
public class func{
	public void testCachePlusCookies(){
        server.enqueue(new MockResponse()
                .addHeader("Set-Cookie: a=SECOND; domain=" + server.getCookieDomain() + ";")
                .setResponseCode(HttpURLConnection.HTTP_NOT_MODIFIED));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        assertCookies(url, "a=FIRST");
        assertEquals("A", readAscii(url.openConnection()));
        assertCookies(url, "a=SECOND");
}
}
//18
public class func{
	public void getConnection(final URL url){
        if (url.getProtocol().startsWith("https")) {
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setReadTimeout(10000); // 10 seconds
            // printHttpsCert(con);
            con.connect();
            return con;
        } else {
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setReadTimeout(10000); // 10 seconds
            con.connect();
            return con;
        }
}
}
//19
public class func{
	public void getInputStream(URL url){
        URLConnection connection = url.openConnection();
        if (connection instanceof JarURLConnection) {
            url = ((JarURLConnection) connection).getJarFileURL();
        }
        URLConnection con = url.openConnection();
        return con.getInputStream();
}
}
//20
public class func{
	public void prepareHttpUrlConnection(URL url){
    Proxy proxy = setupProxy(url);
    Authenticator proxyAuthentication = setupProxyAuthentication(url, proxy);
    if (proxyAuthentication != null) {
      Authenticator.setDefault(proxyAuthentication);
    }
    HttpURLConnection connection = (HttpURLConnection) (proxy != null ?  url.openConnection(proxy) : url.openConnection());
    connection.setConnectTimeout(5000);
    connection.setReadTimeout(5000);
    connection.setUseCaches(false);
}
}
//21
public class func{
	public void create(String url,@Nullable Proxy proxy){
        URLConnection urlConnection = proxy == null ? _url.openConnection() : _url.openConnection(proxy);
        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);
        if (urlConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            httpURLConnection.setRequestMethod("GET");
        }
}
}
//22
public class func{
	public void authenticate(LegacySession session,String serverId,ProxyData proxy){
    URLConnection connection = wrappedProxy == null ? url.openConnection() : url.openConnection(wrappedProxy);
    connection.setConnectTimeout(30000);
    connection.setReadTimeout(30000);
}
}
//23
public class func{
	public void connect(URL targetURL){
    URLConnection connection = httpProxy == null ? targetURL.openConnection() : targetURL.openConnection(httpProxy);
    return (HttpURLConnection) connection;
}
}
//24
public class func{
	public void createConnection(){
      connection = (HttpURLConnection) (proxy == null ?
          url.openConnection() : url.openConnection(proxy));
      connection.setConnectTimeout(connectTimeout);
      connection.setReadTimeout(readTimeout);
}
}
//25
public class func{
	public void openConnection(URL url,Proxy proxy){
    URLConnection urlConnection = (proxy != null ? url.openConnection(proxy) : url.openConnection());
    Assert.isInstanceOf(HttpURLConnection.class, urlConnection);
    return (HttpURLConnection) urlConnection;
}
}
//26
public class func{
	public void getConnection(String urlString){
      conn = connURL.openConnection(m_httpProxy);
      conn = connURL.openConnection();
    conn.setConnectTimeout(60000);
}
}
//27
public class func{
	public void openConnection(URL scriptURL){
        URLConnection urlConnection = scriptURL.openConnection();
        verifyInputStream(urlConnection);
        return scriptURL.openConnection();
}
}
//28
public class func{
	public void test_getEntryName(){
        URL u = createContent("lf.jar", "plus.bmp");
        juc = (JarURLConnection) u.openConnection();
        assertEquals("Returned incorrect entryName", "plus.bmp", juc
                .getEntryName());
        u = createContent("lf.jar", "");
        juc = (JarURLConnection) u.openConnection();
        assertNull("Returned incorrect entryName", juc.getEntryName());
}
}
//29
public class func{
	public void test_getMainAttributes(){
        URL u = createContent("lf.jar", "swt.dll");
        juc = (JarURLConnection) u.openConnection();
        java.util.jar.Attributes a = juc.getMainAttributes();
        assertEquals("Returned incorrect Attributes", "1.0", a
                .get(java.util.jar.Attributes.Name.MANIFEST_VERSION));
        URL invURL = createContent("InvalidJar.jar", "Test.class");
        JarURLConnection juConn = (JarURLConnection) invURL.openConnection();
            juConn.getMainAttributes();
}
}
//30
public class func{
	public void test_getJarEntry(){
        URL u = copyAndOpenResourceStream("lf.jar", "plus.bmp");
        juc = (JarURLConnection) u.openConnection();
        assertEquals("Returned incorrect JarEntry", "plus.bmp", juc
                .getJarEntry().getName());
        u = copyAndOpenResourceStream("lf.jar", "");
        juc = (JarURLConnection) u.openConnection();
        assertNull("Returned incorrect JarEntry", juc.getJarEntry());
}
}
//31
public class func{
	public void test_getContentLength(){
        URL u = copyAndOpenResourceStream("lf.jar", "");
        assertEquals("Returned incorrect size for jar file", 33095,
                u.openConnection().getContentLength());
        u = copyAndOpenResourceStream("lf.jar", "plus.bmp");
        assertEquals("Returned incorrect size for the entry", 190,
                u.openConnection().getContentLength());
}
}
//32
public class func{
	public void testSetIfModifiedSince(){
        server.enqueue(new MockResponse().setBody("A"));
        server.play();
        URL url = server.getUrl("/");
        URLConnection connection = url.openConnection();
}
}
//33
public class func{
	public void getOutputStream(URI uri){
                URL url = getServletContext().getResource(uri.toASCIIString());
                return url.openConnection().getOutputStream();
}
}
//34
public class func{
	public void service(HttpServletRequest req,HttpServletResponse resp){
            URL resource = getServletContext().getResource(path);
            URLConnection conn = resource.openConnection();
            resp.setContentType(conn.getContentType());
            StreamUtil.io(conn.getInputStream(), resp.getOutputStream(), true, false);
}
}
//35
public class func{
	public void service(HttpServletRequest req,HttpServletResponse resp){
                URL resource = getServletContext().getResource(path);
                URLConnection conn = resource.openConnection();
                resp.setContentType(conn.getContentType());
                StreamUtil.io(conn.getInputStream(), resp.getOutputStream(), true, false);
}
}
//36
public class func{
	public void sendSessionRequest(String par1Str,String par2Str,String par3Str){
      InputStream var5 = var4.openConnection(this.mc.getProxy()).getInputStream();
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var5));
      String var7 = var6.readLine();
      var6.close();
}
}
//37
public class func{
	public void getLastModified(URI location,IProgressMonitor monitor){
      URL url = location.toURL();
        return url.openConnection().getLastModified();
}
}
//38
public class func{
	public void getLastUpdateTimestampFor(final URL url){
        return url.openConnection().getLastModified();
}
}
//39
public class func{
	public void timestampForNonFileURL(URL url){
            timestamp = url.openConnection().getLastModified();
}
}
//40
public class func{
	public void getPluginDir(){
      URL pluginUrl = EditorsJunitPlugin.getDefault().getBundle().getEntry("/"); //$NON-NLS-1$
        BundleURLConnection conn = (BundleURLConnection)pluginUrl.openConnection();
        URL fileUrl = conn.getFileURL();
        String file = fileUrl.getFile();
        pluginDir = new File(file);
}
}
//41
public class func{
	public void getPermission(){
        URL jarFileUrl = new File(jarFile.getName()).toURI().toURL();
        return jarFileUrl.openConnection().getPermission();
}
}
//42
public class func{
	public void compress(){
    cx.evaluateReader(scope, new InputStreamReader(cssmin.openConnection()
        .getInputStream()), cssmin.getFile(), 1, null);
    Scriptable exports = (Scriptable) scope.get("exports", scope);
    Scriptable compressor = (Scriptable) exports.get("compressor", exports);
    Function fn = (Function) compressor.get("cssmin", compressor);
}
}
//43
public class func{
	public void createConnection(URL url){
    URLConnection connection = url.openConnection();
    connection.addRequestProperty("User-Agent", "HockeySDK/Android");
}
}
//44
public class func{
	public void like(URL u){
        return like(new InputStreamReader(u.openConnection().getInputStream()));
}
}
//45
public class func{
	public void test_ConstructorLjava_io_InputStream(){
            Support_Resources.copyFile(resources, null, "hyts_gInput.txt.gz");
            final URL gInput = new File(resources.toString() + "/hyts_gInput.txt.gz").toURL();
            TestGZIPInputStream inGZIP = new TestGZIPInputStream(gInput
                    .openConnection().getInputStream());
            assertNotNull("the constructor for GZIPInputStream is null",
                    inGZIP);
            assertEquals("the CRC value of the inputStream is not zero", 0, inGZIP
                    .getChecksum().getValue());
            inGZIP.close();
}
}
//46
public class func{
	public void read(URL url){
        con = url.openConnection();
        con.setRequestProperty("User-Agent", Constants.USER_AGENT);
}
}
//47
public class func{
	public void createConnection(URL url){
        URLConnection con = url.openConnection();
        con.setRequestProperty("User-Agent", USER_AGENT);
}
}
//48
public class func{
	public void deploy(URL resource,boolean xhrCompatible){
    String fileName = ResourceGeneratorUtil.baseName(resource);
    byte[] bytes = Util.readURLAsBytes(resource);
      return deploy(fileName, resource.openConnection().getContentType(),
          bytes, xhrCompatible);
      getLogger().log(TreeLogger.ERROR,
          "Unable to determine mime type of resource", e);
}
}
//49
public class func{
	public void deploy(URL resource,String mimeType,boolean forceExternal){
          ? mimeType : resource.openConnection().getContentType();
      return deploy(fileName, finalMimeType, bytes, forceExternal);
      getLogger().log(TreeLogger.ERROR,
          "Unable to determine mime type of resource", e);
}
}
//50
public class func{
	public void testConnection(){
        URL url = getIndexUrl();
        URLConnection urlConn = url.openConnection();
        urlConn.getContentLength();
}
}
//51
public class func{
	public void exists(URL url){
            return url != null && url.openConnection() != null && url.openConnection().getContentLength() > 0;
}
}
//52
public class func{
	public void write(URL url,FontPackDocument doc){
    OutputStreamWriter wr = new OutputStreamWriter(url.openConnection().getOutputStream());
    json.toJson(doc, FontPackDocument.class, wr);
    wr.close();
}
}
//53
public class func{
	public void getFileFromJBossVfsURL(URL url,ClassLoader loader){
        Object virtualFile = url.openConnection().getContent();
}
}
//54
public class func{
	public void TestURLInputStream(){
        URL url = getTestURL();
        testResourceSize = url.openConnection().getContentLength();
}
}
//55
public class func{
	public void getResourceSize(ClassLoader loader,String resource){
        URL url = loader.getResource(resource);
        URLConnection con = url.openConnection();
        return (long)con.getContentLength();
}
}
//56
public class func{
	public void createDir(URL url){
                Object content = url.openConnection().getContent();
}
}
//57
public class func{
	public void openConnection(URL u){
            URL resourceUrl = getClass().getClassLoader().getResource(u.getPath());
            return resourceUrl.openConnection();
}
}
//58
public class func{
	public void mockingURLWorks(){
    URLConnection urlConnectionMock = mock(URLConnection.class);
    when(url.openConnection()).thenReturn(urlConnectionMock);
}
}
//59
public class func{
	public void fileConnection(final File file){
    final URL url = file.toURI().toURL();
    final URLConnection connection = url.openConnection();
}
}
//60
public class func{
	public void getReader(URL path){
    return new BufferedReader(new InputStreamReader(path.openConnection().getInputStream()));
}
}
//61
public class func{
	public void openShouldOpenAHttpURLConnectionAndInjectItIntoAHttpURLConnectionHttpChannel(){
        when(url.openConnection()).thenReturn(httpURLConnection);
}
}
//62
public class func{
	public void openConnection(URL u){
    final URL resourceUrl = classLoader.getResource(u.getPath());
    return resourceUrl.openConnection();
}
}
//63
public class func{
	public void testHeader_BoundaryCheck(){
        URL url = createTempFileWithContent(RESOURCE_NAME);
        URLConnection urlConnection = url.openConnection();
        assertNull(urlConnection.getHeaderField(Integer.MIN_VALUE));
        assertNull(urlConnection.getHeaderField(Integer.MAX_VALUE));
        assertNull(urlConnection.getHeaderFieldKey(Integer.MIN_VALUE));
        assertNull(urlConnection.getHeaderFieldKey(Integer.MAX_VALUE));
        assertNull(urlConnection.getHeaderField(null));
}
}
//64
public class func{
	public void test503(){
        HttpURLConnection httpURLConnection = EasyMock.createMock(HttpURLConnection.class);
        EasyMock.expect(mock.openConnection()).andReturn(httpURLConnection);
        httpURLConnection.connect();
        EasyMock.expect(httpURLConnection.getContentEncoding()).andReturn("");
}
}
//65
public class func{
	public void resolveFromNested(){
    assertThat(resource.openConnection().getInputStream().read(), equalTo(3));
}
}
//66
public class func{
	public void connectionFromUri(String uri){
        URL url = urlFromUri(uri);
            conn = (TDURLConnection) url.openConnection();
            conn.setDoOutput(true);
}
}
//67
public class func{
	public void retrieveFeed(URL feedUrl){
    Assert.notNull(feedUrl, "feedUrl must not be null");
    URLConnection connection = feedUrl.openConnection();
}
}
//68
public class func{
	public void createFromURL(URL location){
    return createFromStream(location.openConnection().getInputStream());
}
}
//69
public class func{
	public void readBytes(URL url){
        URLConnection conn = url.openConnection();
            return readBytes(conn);
            close(conn);
}
}
//70
public class func{
	public void main(String[] args){
        (new URL("http://localhost/")).openConnection().setDefaultUseCaches(false);
}
}
//71
public class func{
	public void openURL(final URL url){
        return openURL(url.openConnection());
}
}
//72
public class func{
	public void getRemoteContent(URL url,JSONObject data){
    URLConnection con = url.openConnection();
}
}
//73
public class func{
	public void goTo(URL url){
                        url = url.openConnection().getURL();
}
}
//74
public class func{
	public void exists(URL url){
            return url != null && url.openConnection() != null && url.openConnection().getContentLength() > 0;
}
}
//75
public class func{
	public void dumpFields(String url){
        URLConnection conn = (new URL(url)).openConnection();
        Map<String, List<String>> headerFields = conn.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            System.out.print(entry.getKey() + "  ");
            for (String v : entry.getValue()) {
                System.out.println(v + "  ");
            }
        }
}
}
//76
public class func{
	public void UrlExternalResource(URI uri,URL url){
        connection = url.openConnection();
        metaData = new DefaultExternalResourceMetaData(uri, connection.getLastModified(), connection.getContentLength(), connection.getContentType(), null, null);
}
}
//77
public class func{
	public void copy(URL url,File file){
    URLConnection c = url.openConnection();
    copy(c, file);
}
}
//78
public class func{
	public void getURLConnection(){
            return URL.openConnection();
}
}
//79
public class func{
	public void open(URL url){
        return url.openConnection();
}
}
//80
public class func{
	public void openConnectionForceNoProxy(URL url){
    return url.openConnection(Proxy.NO_PROXY);
}
}
//81
public class func{
	public void create(final URL url){
    return url.openConnection();
}
}
//82
public class func{
	public void openConnection(URL url){
    return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
}
}
//83
public class func{
	public void getStreamForURL(URL url){
            URLConnection connection = url.openConnection();
}
}
//84
public class func{
	public void openConnection(final URL url){
            connection = url.openConnection();
}
}
//85
public class func{
	public void testTransferInputStreamToFile(){
        URL u = TestIOUtilities.class.getClassLoader().getResource("io-test.txt");
        IOUtilities.transfer(u.openConnection(), f, null);
}
}
//86
public class func{
	public void safelyOpenConnection(URL url){
      conn = url.openConnection();
      Log.w(TAG, "Bad URI? " + url);
}
}
//87
public class func{
	public void pageContains(String page,String contains){
    String content = StreamUtils.readToString(appUrl.openConnection().getInputStream());
    assertThat(content).contains(contains);
}
}
//88
public class func{
	public void openUrlConnection(URL url){
    return url.openConnection();
}
}
//89
public class func{
	public void sendResource(final WebScriptRequest request,final WebScriptResponse response,final URL resource){
    final String contentType = getContentType(resource);
    response.setContentType(contentType);
    response.setContentEncoding(getContentEncoding(resource));
    final URLConnection connection = resource.openConnection();
}
}
//90
public class func{
	public void createDocSource(URL docSource,String contentType,String href,KMLDoc parent){
    URLConnection conn = docSource.openConnection();
}
}
//91
public class func{
	public void getUrlStream(){
    URL url = this.jarFile.getUrl();
    url.openConnection();
}
}
//92
public class func{
	public void getImage(URL url){
      {  url.openConnection().connect();
}
}
//93
public class func{
	public void getInputStreamWithRetry(URL file){
                reader = file.openConnection().getInputStream();
}
}
//94
public class func{
	public void connect(){
            URL res = getURL();
            return res.openConnection();
}
}
//95
public class func{
	public void openDownloadStream(String targetfile){
        URL url = makeURL(targetfile);
        urlc = url.openConnection();
        InputStream is = urlc.getInputStream();
}
}
//96
public class func{
	public void openUploadStream(String targetfile){
        URL url = makeURL(targetfile);
        urlc = url.openConnection();
        OutputStream os = urlc.getOutputStream();
}
}
//97
public class func{
	public void NetworkFile(URL u){
    name = u.toExternalForm();
    conn = u.openConnection();
}
}
//98
public class func{
	public void URLScript(URL url){
        conn = url.openConnection();
}
}
//99
public class func{
	public void URLTemplateSource(URL url,Boolean useCaches){
        this.conn = url.openConnection();
}
}
//100
public class func{
	public void newResource(File file){
        file = file.getCanonicalFile();
        URL url = Resource.toURL(file);
        URLConnection connection = url.openConnection();
        FileResource fileResource = new FileResource(url, connection, file);
}
}
//101
public class func{
	public void mozOpenConnection(URL l_url){
            return l_url.openConnection();
}
}
//102
public class func{
	public void readOutput(URL url){
    return readConnection(url.openConnection());
}
}
//103
public class func{
	public void testDefaultUseCachesSetsInitialValueOnly(){
            assertTrue(c2.getUseCaches());
            URLConnection c3 = url.openConnection();
            assertFalse(c3.getUseCaches());
}
}
//104
public class func{
	public void UrlResourceContent(URL url,String entryName){
          con = url.openConnection();
}
}
//105
public class func{
	public void testNewURLWithoutHandler_open(){
    URL noHandlerUrl = JWBF.newURLWithoutHandler("http://www.google.com");
      noHandlerUrl.openConnection();
}
}
//106
public class func{
	public void loadImage(URL url){
            URLConnection connection = url.openConnection();
            return (Bitmap) mBitmapContentHandler.getContent(connection);
}
}
//107
public class func{
	public void HTTPRequest(URL url){
    this(url.openConnection());
}
}
//108
public class func{
	public void XmlStreamReader(URL url){
        this(url.openConnection(), null);
}
}
//109
public class func{
	public void toByteArray(final URL url){
        final URLConnection conn = url.openConnection();
            return IOUtils.toByteArray(conn);
            close(conn);
}
}
//110
public class func{
	public void makeRequest(URL source,String cookie){
      JConfig.log().logDebug("makeRequest: " + source.toString());
    URLConnection uc = source.openConnection();
    setConnectionInfo(uc);
}
}
//111
public class func{
	public void loadFromText(final URL url){
        return loadFromText(url.openConnection());
}
}
//112
public class func{
	public void openConnection(final URL url){
      connection = url.openConnection();
}
}
//113
public class func{
	public void AbstractFileWatcher(long checkPeriod,URL u){
        this(checkPeriod, null, u);
        data = doLoad(u.openConnection());
}
}
//114
public class func{
	public void WarURLConnection(URL url,Manifest mf){
        _conn = url.openConnection();
}
}
//115
public class func{
	public void toUrlConnection(@ServiceName URL service){
        return service.openConnection();
}
}
//116
public class func{
	public void contentType(){
    Files.write(path, ImmutableList.of("Hello World"), UTF_8);
    URL url = path.toUri().toURL();
    URLConnection conn = url.openConnection();
}
}
//117
public class func{
	public void openURLStream(final URL url){
        URLConnection connection = url.openConnection();
}
}
//118
public class func{
	public void OnDemandUrlStream(URL source){
        this.source = source.openConnection();
        this.sourceStream = this.source.getInputStream();
        contentLength = this.source.getContentLength();
}
}
//119
public class func{
	public void urlGet(URL url){
    URLConnection conn = url.openConnection();
}
}
//120
public class func{
	public void ClientHttpRequest(URL url){
  public ClientHttpRequest(URL url) throws IOException { this(url.openConnection()); }
}
}
//121
public class func{
	public void createConnection(URL url){
        URLConnection connection = url.openConnection();
}
}
//122
public class func{
	public void URLResource(URL url){
      this(url, url.openConnection());
}
}
//123
public class func{
	public void validResourceUrl(){
        URL resourceUrl = this.resourceUrl();
            resourceUrl.openConnection();
}
}
//124
public class func{
	public void DirectoryInsideJarURLArchive(URL url,String descriptorLocation,Logger logger){
                JarURLConnection.class.cast(url.openConnection());
        jarFile = conn.getJarFile();
        logger.logp(Level.FINER, "DirectoryInsideJarURLArchive",
                "DirectoryInsideJarURLArchive", "jarFile = {0}", jarFile);
        relativeRootPath = conn.getEntryName();
}
}
//125
public class func{
	public void openURLStream(final URL url){
        URLConnection connection = url.openConnection();
}
}
//126
public class func{
	public void getLastModifiedOfResource(RC request,URL resource,boolean template){
            return resource.openConnection().getLastModified();
}
}
//127
public class func{
	public void openConnection(URL url){
    final URLConnection urlConnection = url.openConnection();
}
}
//128
public class func{
	public void mockingURLWorks(){
    URLConnection openConnection = url.openConnection();
    assertSame(openConnection, urlConnectionMock);
}
}
//129
public class func{
	public void remoteResume(URL url,long position,long lastFetchTime,String userAgent,String username,String password){
        URLConnection con = url.openConnection();
        URLConnectionHolder holder = new URLConnectionHolder(con, null);
        return remoteResume(holder, position, lastFetchTime, userAgent, username, password);
}
}
//130
public class func{
	public void mockingInstanceMethodOfFinalSystemClassWorks(){
        URLConnection urlConnection = createMock(URLConnection.class);
        expect(url.openConnection()).andStubReturn(urlConnection);
}
}
//131
public class func{
	public void run(){
                    (new URL(url)).openConnection().getInputStream();
}
}
//132
public class func{
	public void testLoadResource(){
        final VFSClassLoader loader = createClassLoader();
        final URL resource = loader.getResource("read-tests/file1.txt");
        assertNotNull(resource);
        final URLConnection urlCon = resource.openConnection();
        assertSameURLContent(FILE1_CONTENT, urlCon);
}
}
//133
public class func{
	public void prepareInputStream(final URL url,final boolean acceptAnyCertificate){
        final URLConnection conn = url.openConnection();
        prepareForAuthentication(conn);
}
}
//134
public class func{
	public void getResourceStream(@NotNull final URL url){
    val connection = url.openConnection();
    int length = connection.getContentLength();
    val is = connection.getInputStream();
}
}
//135
public class func{
	public void testAttachmentJarURLWithEncodedChars(){
        url.openConnection();
}
}
//136
public class func{
	public void readURLAsBytes(URL url){
      URLConnection conn = url.openConnection();
      conn.setUseCaches(false);
      return readURLConnectionAsBytes(conn);
}
}
//137
public class func{
	public void JarCacheResource(URL classpath){
        this.connection = classpath.openConnection();
}
}
//138
public class func{
	public void mockingURLWorks(){
        URLConnection urlConnectionMock = createMock(URLConnection.class);
        expect(url.openConnection()).andReturn(urlConnectionMock);
}
}
//139
public class func{
	public void mockingURLWorks(){
        assertSame(url.openConnection(), urlConnectionMock);
        verifyAll();
}
}
//140
public class func{
	public void openConnectionThrowIOException(){
    expect(url.openConnection()).andThrow(new IOException());
}
}
//141
public class func{
	public void openConnection(ServerListPlusCore core,URL url,String type){
        URLConnection con = url.openConnection();
}
}
//142
public class func{
	public void useURL(URL url){
        return url.openConnection();
}
}
//143
public class func{
	public void download(String resource){
      URL url = parseURL(resource);
      URLConnection urlConnection = url.openConnection();
      String destination = calculateDesintationFile(url, urlConnection);
      downloadData(urlConnection, destination);
}
}
//144
public class func{
	public void openConnection(URL arg0){
                return arg0.openConnection();
}
}
//145
public class func{
	public void isModified(String url,long lastAccess){
            URL uri = getResource(url);
            URLConnection con = uri.openConnection();
}
}
