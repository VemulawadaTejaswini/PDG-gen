//0
public class func{
	public void openConnection(String url){
    if (proxy != null)
      urlConnection = (HttpURLConnection) u.openConnection(proxy);
    else
      urlConnection = (HttpURLConnection) u.openConnection();
    urlConnection.setRequestProperty("User-Agent", userAgent);
}
}
//1
public class func{
	public void testExtensionAuthFilter(){
    URL url = new URL("http://localhost:" + port + "/default");
    HttpURLConnection get = (HttpURLConnection) url.openConnection();
    get.setRequestProperty(DummyAuthFilter.AUTH_HDR, DummyAuthFilter.SECRET_USER);
    Assert.assertEquals(HttpServletResponse.SC_OK, get.getResponseCode());
    get = (HttpURLConnection) url.openConnection();
    get.setRequestProperty(DummyAuthFilter.AUTH_HDR, "hacker");
    Assert.assertEquals(HttpServletResponse.SC_UNAUTHORIZED, get.getResponseCode());
}
}
//2
public class func{
	public void testEnforceSlash(){
        final TestWebServer testWebServer = createTestWebServer(new MyResource());
        int port = testWebServer.getPort();
        URL serverURL = new URL("http://localhost:" + port + "/foo/bar");
        HttpURLConnection connection = (HttpURLConnection) serverURL.openConnection();
        connection = (HttpURLConnection) serverURL.openConnection();
        connection.setRequestMethod("GET");
        connection.addRequestProperty("Accept", "text/html, */*; q=.2");    
        Assert.assertEquals(204, connection.getResponseCode());
}
}
//3
public class func{
	public void setupConnection(Context context,URL url,ConnectionCallback callback){
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn = (HttpURLConnection)url.openConnection();
        conn.setInstanceFollowRedirects(false);
        conn.setDoInput(true);
        addAuthentication(context, conn);
}
}
//4
public class func{
	public void verifyRedirection(URL url){
    LOG.info("Verifying redirection of " + url);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.connect();
    assertEquals(HttpURLConnection.HTTP_MOVED_TEMP, conn.getResponseCode());
    conn.disconnect();
    URL redirectedUrl = new URL(conn.getHeaderField("Location"));
    conn = (HttpURLConnection) redirectedUrl.openConnection();
    conn.connect();
    assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
    conn.disconnect();
}
}
//5
public class func{
	public void testVaryMatchesChangedRequestHeaderField(){
        server.enqueue(new MockResponse()
                .addHeader("Cache-Control: max-age=60")
                .addHeader("Vary: Accept-Language")
                .setBody("A"));
        server.enqueue(new MockResponse().setBody("B"));
        server.play();
        URL url = server.getUrl("/");
        HttpURLConnection frConnection = (HttpURLConnection) url.openConnection();
        frConnection.addRequestProperty("Accept-Language", "fr-CA");
        assertEquals("A", readAscii(frConnection));
        HttpURLConnection enConnection = (HttpURLConnection) url.openConnection();
        enConnection.addRequestProperty("Accept-Language", "en-US");
        assertEquals("B", readAscii(enConnection));
}
}
//6
public class func{
	public void test1(){
    connection = (HttpURLConnection) urlToto.openConnection();
    contents = getContents(connection).toString();
    assertEquals("tata", contents.trim());
    connection = (HttpURLConnection) urlTiti.openConnection();
    contents = getContents(connection).toString();
    assertEquals("titi", contents.trim());
}
}
//7
public class func{
	public void dispatchRequest(String argURL){
            URL url = new URL(argURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxy);
            connection.setRequestProperty("Cache-Control", "no-transform");
            connection.setRequestMethod("GET");
            connection.setInstanceFollowRedirects(true);
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                Logger.logError("JGoogleAnalyticsTracker: Error requesting url '{}', received response code {}" + argURL + responseCode);
            }
            Logger.logDebug("Error making tracking request", e);
}
}
//8
public class func{
	public void getRequest(String path){
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(5000);
        if (conn.getResponseCode() == 200) {
            return conn.getInputStream();
        }
}
}
//9
public class func{
	public void invoke(String method,String resource,String queryString,String contentType){
        if (queryString != null) {
            s += "?" + queryString;
        }
        HttpURLConnection conn = (HttpURLConnection) new URL(s).openConnection();
        conn.setRequestProperty("content-type", contentType);
        conn.setRequestMethod(method);
        conn.connect();
        return conn.getResponseCode();
}
}
//10
public class func{
	public void get(String url,Type type){
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("GET");
    if (con.getResponseCode() == 200) {
      Reader reader = new InputStreamReader(con.getInputStream(), "UTF-8");
      return GSON.fromJson(reader, type);
    }
}
}
//11
public class func{
	public void getImageStreamFromUrl(String path){
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(12 * 1000);
        conn.setRequestMethod("GET");
        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
            return conn.getInputStream();
        }
}
}
//12
public class func{
	public void dispatchRequest(String argURL){
            URL url = new URL(argURL);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection(proxy);
            connection.setRequestMethod("GET");
            connection.setInstanceFollowRedirects(true);
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                logger.error("JGoogleAnalyticsTracker: Error requesting url '{}', received response code {}", argURL, responseCode);
            } else {
                logger.debug("JGoogleAnalyticsTracker: Tracking success for url '{}'", new Object[]{argURL});
            }
            logger.error("Error making tracking request", e);
}
}
//13
public class func{
	public void http(String method,String uri){
      URL url = new URL(uri);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod(method);
        Object content = conn.getContent();
        if(content instanceof InputStream)
            return new Response(conn.getResponseCode(), IOUtils.toString((InputStream) content, "UTF-8"));
        else if(content instanceof String)
            return new Response(conn.getResponseCode(), (String) content);
        else
            return new Response(conn.getResponseCode(), "unknown");
}
}
//14
public class func{
	public void readCoreStatus(){
        URL coreStatusURL = new URL("http://localhost:8983/solr/admin/cores?action=STATUS");
        HttpURLConnection coreStatusConn = (HttpURLConnection) coreStatusURL.openConnection();
        coreStatusConn.connect();
        if (coreStatusConn.getResponseCode() != 200) {
            throw new RuntimeException("Fetch Solr core status: expected status 200 but got: " +
                    coreStatusConn.getResponseCode());
        }
        InputStream is = coreStatusConn.getInputStream();
        Document doc = DocumentHelper.parse(is);
        is.close();
}
}
//15
public class func{
	public void checkTaskGraphServlet(JobID job,int jobTrackerInfoPort){
    URL url = new URL(jtURL + "/taskgraph?jobid=" + job.toString() + "&type=map");
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setRequestMethod("GET");
    connection.connect();
    assertEquals(200, connection.getResponseCode());
    String contents = slurpContents(connection);
    if (contents.trim().length() > 0) {
      assertTrue("Bad contents for job " + job + ":\n" + contents,
          contents.contains("</svg>"));
    }
}
}
//16
public class func{
	public void connect(String urlStr){
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Connection", "Keep-Alive");
        conn.connect();
        System.out.println(conn.getResponseCode() + ":" + conn.getResponseMessage());
}
}
//17
public class func{
	public void isValidUrl(String name){
        if (isHttpUrl(name)) {
            String url = StringUtils.strip(name);
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
                connection.setConnectTimeout(ResourceLoader.TIMEOUT);
                connection.setReadTimeout(ResourceLoader.TIMEOUT);
                int responseCode = connection.getResponseCode();
                if (responseCode == 200) {
                    return true;
                }
            } catch (IOException e) {
                return false;
            }
        }
}
}
//18
public class func{
	public void awsApiCall(String url){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");
            if (conn.getResponseCode() != 200)
                throw new ConfigurationException("Ec2Snitch was unable to execute the API call. Not an ec2 node?");
            int cl = conn.getContentLength();
            d = new DataInputStream((FilterInputStream) conn.getContent());
            d.readFully(b);
            return new String(b, StandardCharsets.UTF_8);
            FileUtils.close(d);
            conn.disconnect();
}
}
//19
public class func{
	public void getResponse(String requestMethod,String path,UrlResponse response){
        URL url = new URL("http://localhost:" + PORT + path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(requestMethod);
        connection.connect();
        String res = IOUtils.toString(connection.getInputStream());
        response.status = connection.getResponseCode();
        response.headers = connection.getHeaderFields();
}
}
//20
public class func{
	public void get(String uri){
        URL u = new URL(uri);
        HttpURLConnection uc = (HttpURLConnection)u.openConnection();
        uc.setRequestMethod("GET");
        int status = uc.getResponseCode();
        String mediaType = uc.getContentType();
        InputStream in = uc.getInputStream();
}
}
//21
public class func{
	public void getResponseAsStream(String url){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestProperty("User-Agent", UA_DEFAULT);
        conn.setConnectTimeout(6000);
        if (conn.getResponseCode() != 200)
            return null;
        InputStream in = conn.getInputStream();
}
}
//22
public class func{
	public void doInBackground(String... serverURL){
                URL u = new URL(serverURL[0]);
                HttpURLConnection huc = (HttpURLConnection) u.openConnection();
                huc.setRequestMethod("GET"); // OR huc.setRequestMethod
                huc.connect();
                int code = huc.getResponseCode();
                if (code == 200) {
                    return true;
                }
}
}
//23
public class func{
	public void delete(String murl){
    URL url = new URL(murl);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("DELETE");
    conn.setConnectTimeout(5000);
    if (conn.getResponseCode() == 204) {
      return true;
    }
}
}
//24
public class func{
	public void invalidRequestUri(final String path){
        final URL url = new URL(getBaseUri().toString() + path + "/resource{");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "text/plain");
        connection.connect();
        assertEquals(400, connection.getResponseCode());
}
}
//25
public class func{
	public void runClient(String urlStr){
        HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
        conn.setRequestMethod("HEAD");
        int status = conn.getResponseCode();
        if (status != 200) {
            throw new RuntimeException("HEAD request doesn't return 200, but returns " + status);
        }
}
}
//26
public class func{
	public void validateIcon(Service service,String serviceFilePath){
    String icon = service.getIcon();
    if (icon.startsWith("http")) {
      HttpURLConnection connection = (HttpURLConnection) new URL(icon).openConnection();
      connection.setRequestMethod("HEAD");
      Assert.assertEquals("The icon URL cannot establish a connection", HttpURLConnection.HTTP_OK,
          connection.getResponseCode());
      connection.disconnect();
    }else{
      File iconFile = new File(serviceFilePath, service.getIcon());
      Assert.assertTrue("Icon file not found in location: " + iconFile.getAbsolutePath(), iconFile.exists());
    }
}
}
//27
public class func{
	public void testCallIndexPage(){
    URL url = new URL(this.baseUrl);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestProperty("Authorization", "bearer 74eccf5f-0995-4e1c-b08c-d05dd5a0f89b");
    connection.connect();
    assertEquals(200, connection.getResponseCode());
    String output = IOUtils.toString(connection.getInputStream());
    assertTrue(output.contains("emma.blunt"));
}
}
//28
public class func{
	public void fileExistsURL(String url){
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestProperty(CACHE_CONTROL, "no-transform");
            connection.setRequestMethod("HEAD");
            int code = connection.getResponseCode();
}
}
//29
public class func{
	public void getResponseCode(String theme){
            URL url = new URL(String.format("%s/VAADIN/themes/%s/favicon.ico",
                    getBaseURL(), theme));
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            return connection.getResponseCode();
}
}
//30
public class func{
	public void isValid(String url){
        URL u = new URL(url);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.setRequestMethod("HEAD");
        huc.connect();
        isValid = huc.getResponseCode() == HttpURLConnection.HTTP_OK;
}
}
//31
public class func{
	public void isPutIntoOven(){
            final URL url = new URL("https://www.google.com/search?q=potato");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int inOven = connection.getResponseCode();
}
}
//32
public class func{
	public void testWrongContentType(){
        URL url = new URL(endpointAddress);
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        urlConnection.setReadTimeout(30000); // 30 seconds tops
        urlConnection.setConnectTimeout(30000); // 30 second tops
        urlConnection.addRequestProperty("Content-Type", "MissingSeparator");
        urlConnection.setRequestMethod("POST");
        assertEquals(415, urlConnection.getResponseCode());
}
}
//33
public class func{
	public void exists(String URLName){
                    (HttpURLConnection) new URL(URLName).openConnection();
            con.setRequestMethod("HEAD");
            con.setConnectTimeout(10000);
            return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
}
}
//34
public class func{
	public void isExiste(String logoUrl){
      URL u = new URL(logoUrl);
      HttpURLConnection huc = (HttpURLConnection) u.openConnection();
      huc.setRequestMethod("GET"); // OR huc.setRequestMethod ("HEAD");
      huc.connect();
      code = huc.getResponseCode();
}
}
//35
public class func{
	public void getURLcode(String htmlPage){
            String url = "http://" + TestSuiteEnvironment.getServerAddress() + ":8080/explodedDeployment/"
            logger.infof("%s is the built URL.", url);
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            code = urlConnection.getResponseCode();
            logger.infof("Received response code of: " + code);
}
}
//36
public class func{
	public void sendShutdown(){
        URL url = new URL(getServerUrl() + "/shutdown?token=" + _shutdownToken);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.getResponseCode();
            LOG.info("Shutting down " + url + ": " + connection.getResponseCode() + " " + connection.getResponseMessage());
            LOG.debug("Not running");
}
}
//37
public class func{
	public void testUrlReachable(String strUtl){
        URL url = new URL(strUtl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int rc = conn.getResponseCode();
        assertEquals(HttpStatus.SC_OK, rc);
        conn.disconnect();
}
}
//38
public class func{
	public void createLargeCacheFromNetwork(String type,String name,String url,ProgressCallback callback){
    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
    conn.setRequestMethod("GET");
    conn.setConnectTimeout(5000);
    createCacheFromStream(type, name, conn.getInputStream(), conn.getContentLength(), callback);
    conn.disconnect();
}
}
//39
public class func{
	public void createCacheFromNetwork(String type,String name,String url,ProgressCallback callback){
    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
    conn.setRequestMethod("GET");
    conn.setConnectTimeout(5000);
    byte[] buf = readInputStream(conn.getInputStream(), conn.getContentLength(), callback);
    createCache(type, name, buf);
    conn.disconnect();
}
}
//40
public class func{
	public void run(){
      URL url = new URL(HTTP_ADDR);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        InputStream is = conn.getInputStream();

        is.read();
      }
}
}
//41
public class func{
	public void testDeleteCustomer(){
        URL url = new URL(getURL() + "/" + 10);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("DELETE");
        int response = connection.getResponseCode();
        connection.disconnect();
        assertEquals(204, response);
}
}
//42
public class func{
	public void retrieveSfdcSessionId(){
        refreshConsumerAndProvider();
        final URL loginUrl = new URL(getSfdcLoginUrl());
        request = (HttpURLConnection) loginUrl.openConnection();
        request.setRequestMethod("POST");
        consumer.sign(request);
        request.connect();
        final String loginResult = new Scanner(request.getInputStream()).useDelimiter("\\A").next();
}
}
//43
public class func{
	public void testGetAddress(){
        URL url = new URL(getURL() + "/" + "2");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");
        InputStream xml = connection.getInputStream();
}
}
//44
public class func{
	public void proxyRequest(String uri){
      connection = (HttpURLConnection) new URL(uri).openConnection();
      connection.setRequestMethod("GET");
      connection.setDoOutput(true);
      connection.setReadTimeout(10000);
      is = connection.getInputStream();
}
}
//45
public class func{
	public void urlExists(String url){
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            if (connection.getResponseCode() != 200) {
                throw new IOException("Couldn't find full-size image at " + url);
            }
}
}
//46
public class func{
	public void testPutNoOperation(){
    URL url = new URL(TestJettyHelper.getJettyURL(),
                      MessageFormat.format("/webhdfs/v1/foo?user.name={0}", user));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setRequestMethod("PUT");
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_BAD_REQUEST);
}
}
//47
public class func{
	public void verifyThatUrlIsHudson(Candidate target){
            HttpURLConnection con = (HttpURLConnection) new URL(target.url).openConnection();
            con.connect();
            if (con.getResponseCode() == HttpURLConnection.HTTP_FORBIDDEN) {
                throw new RetryException(
                        "This jenkins server requires Authentication!.");
            }
            String v = con.getHeaderField("X-Hudson");
            if (v == null) {
                throw new RetryException("This URL doesn't look like Jenkins.");
            }
            throw new RetryException("Failed to connect to " + target.url, e);
}
}
//48
public class func{
	public void testEmptyPost(){
        URL url = new URL(ADDRESS);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoInput(true);
        int i = connection.getResponseCode();
        assertEquals(200, i);
        assertTrue(connection.getContentType().indexOf("xml") != -1);
}
}
//49
public class func{
	public void verifyHelperForPostPutJSON(int id){
        URL url = new URL(getURL() + "/" + id);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/json");
        InputStream inputStream = connection.getInputStream();
        StreamSource json = new StreamSource(inputStream);
}
}
//50
public class func{
	public void verifyHelperForPostPut(int id){
        URL url = new URL(getURL() + "/" + id);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");
        InputStream xml = connection.getInputStream();
}
}
//51
public class func{
	public void callService(String endpoint,String signature){
        String query = rs.getCanonicalizedQueryString(attributes);
        URL url = new URL("https", endpoint, -1, "/?" + query);
        HttpURLConnection httpConnection = (HttpURLConnection) (url.openConnection());
        httpConnection.setRequestMethod(Constants.GET);
        httpConnection.setDoOutput(false);
        httpConnection.connect();
        return httpConnection.getInputStream();
}
}
//52
public class func{
	public void getUrl(String url){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(10000);
            byte[] bytes = Utils.toByteArray(conn.getInputStream());
            return new String(bytes, StandardCharsets.UTF_8);
            conn.disconnect();
}
}
//53
public class func{
	public void checkTaskGraphServlet(JobID job){
    URL url = new URL(jtURL + "/taskgraph?jobid=" + job.toString() + "&type=map");
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setRequestMethod("GET");
    connection.connect();
    assertEquals(200, connection.getResponseCode());
    String contents = slurpContents(connection);
    assertTrue("Bad contents for job " + job + ":\n" + contents,
      contents.contains("</svg>"));
}
}
//54
public class func{
	public void downloadUrl(String urlString){
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(10000 /* milliseconds */);
        conn.setConnectTimeout(15000 /* milliseconds */);
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();
        InputStream stream = conn.getInputStream();
}
}
//55
public class func{
	public void testServletTestCase(){
        URL url = new URL(getServletURL() + "bla");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.connect();
        assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
            new BufferedReader(new InputStreamReader(conn.getInputStream()));
        assertEquals("ping", reader.readLine());
        assertEquals(null, reader.readLine());
}
}
//56
public class func{
	public void getStatusCode(final String url){
      final URL u = new URL(url);
      final HttpURLConnection huc = (HttpURLConnection) u
          .openConnection();
      huc.setRequestMethod("GET"); // OR huc.setRequestMethod ("HEAD");
      huc.connect();
      final int code = huc.getResponseCode();
}
}
//57
public class func{
	public void performBackgroundOperation(MediaItem[] params){
                            URL mediaUrl = new URL(mediaItem.getSource().toString());
                            HttpURLConnection connection = (HttpURLConnection) mediaUrl.openConnection();
                            connection.setRequestMethod("GET");
                            connection.connect();
                            responseCode = connection.getResponseCode();
}
}
//58
public class func{
	public void performCoreAction(String action,String coreName,String moreParams){
        URL coreActionURL = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) coreActionURL.openConnection();
        conn.connect();
        int response = conn.getResponseCode();
        conn.disconnect();
        if (response != 200) {
            throw new RuntimeException("Core " + action + ": expected status 200 but got: " + response + ": "
                    + conn.getResponseMessage());
        }
}
}
//59
public class func{
	public void exists(){
            HttpURLConnection con = (HttpURLConnection) new URL(path).openConnection();
            con.setRequestMethod("HEAD");
            int responseCode = con.getResponseCode();
}
}
//60
public class func{
	public void testGetMissingBackurl(){
        URL url = new URL(container.getServletURL("/"));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
        assertEquals("missing or invalid 'backurl' parameter", conn.getResponseMessage());
}
}
//61
public class func{
	public void testHeaderListMultipleHeaders(){
        final URL url = new URL(getBaseUri().toString() + "resource");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("hello", "world");
        connection.addRequestProperty("hello", "universe");
        connection.setDoOutput(false);
        connection.connect();
}
}
//62
public class func{
	public void staticFileExists(String file){
            HttpURLConnection connection = (HttpURLConnection) new URL(getStaticCreeperhostLink(file)).openConnection();
            connection.setRequestProperty(CACHE_CONTROL, "no-transform");
            connection.setRequestMethod("HEAD");
            return (connection.getResponseCode() == 200);
}
}
//63
public class func{
	public void exists(String url){
           HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
           con.setRequestMethod("HEAD");
           return con.getResponseCode() == HttpURLConnection.HTTP_OK;
}
}
//64
public class func{
	public void testGetSuccess(){
        assertEquals(MessageFormat.format(loginPageTemplate, "", "", "http://foo:11000/oozie"), html);
        url = new URL(container.getServletURL("/") + "?backurl=http://foo:11000/oozie&username=foo");
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        html = getHTML(conn);
}
}
//65
public class func{
	public void testGetSuccess(){
        URL url = new URL(container.getServletURL("/") + "?backurl=http://foo:11000/oozie");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        String html = getHTML(conn);
}
}
//66
public class func{
	public void exists(final String path,final ProcessContext processContext){
        final HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
        con.setRequestMethod("HEAD");
        return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
}
}
//67
public class func{
	public void call(){
            new URL("http://localhost:8088/ws/v1/cluster/delegation-token");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty(RMWebServices.DELEGATION_TOKEN_HEADER,
          tokenString);
        setupConn(conn, "DELETE", null, null);
        InputStream response = conn.getInputStream();
        assertEquals(Status.OK.getStatusCode(), conn.getResponseCode());
}
}
//68
public class func{
	public void main(String[] args){
        while ((localPort = Redirect.listenPort) == -1) {
            Thread.sleep(1000);
        }
        URL url = new URL(page);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.connect();
        if (conn.getResponseCode() != 302) {
            throw new RuntimeException("Test failed. Should get RespCode: 302. Got:"+conn.getResponseCode());
        }
}
}
//69
public class func{
	public void getUrl(String path,BBuffer out){
        URL url = new URL(path);
            (HttpURLConnection) url.openConnection();
        connection.setReadTimeout(10000);
        connection.connect();
        int rc = connection.getResponseCode();
        InputStream is = connection.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        while((rd = bis.read(buf)) > 0) {
            out.append(buf, 0, rd);
        }
}
}
//70
public class func{
	public void getResponseCode(String URL){
    URL testUrl = new URL(URL);
    conn = (HttpURLConnection) testUrl.openConnection();
    conn.setConnectTimeout(connectionTimeoutInMS);
    conn.setReadTimeout(socketOperationsTimeoutInMS);
    conn.setRequestMethod("HEAD");
    int responseCode = conn.getResponseCode();
}
}
//71
public class func{
	public void ping(String url,int timeout){
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(timeout);
            connection.setReadTimeout(timeout);
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
}
}
//72
public class func{
	public void testInvalidContentTypeHeader(){
        final URL url = new URL(getBaseUri().toString() + "ContentType");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "^^^");
        connection.setDoOutput(true);
        connection.connect();
        final OutputStream outputStream = connection.getOutputStream();
}
}
//73
public class func{
	public void createConnection(){
    URL url = new URL(PROFILE_URL);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Content-Type", "application/json");
    connection.setConnectTimeout(15000);
    connection.setReadTimeout(15000);
    connection.setUseCaches(false);
    connection.setDoInput(true);
    connection.setDoOutput(true);
}
}
//74
public class func{
	public void httpGet(String api){
               url = new URL(api);
               conn = (HttpURLConnection) url.openConnection();
               conn.setRequestMethod("GET");
               rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
               while ((line = rd.readLine()) != null) {
                  result += line;
               }
               rd.close();
}
}
//75
public class func{
	public void getFromHTTP(String url){
    URL u = new URL(url);
    LOG.info("Accessing URL "+url+" as URL: "+u);
    HttpURLConnection connection = (HttpURLConnection) u.openConnection();
    connection.setConnectTimeout(100000);
    connection.connect();
    if(connection.getResponseCode() >= 400) {
      // error!
      LOG.warn("HTTP Response code when connecting to {} was {}", url, connection.getResponseCode());
      is = connection.getErrorStream();
    } else {
      is = connection.getInputStream();
    }
    return IOUtils.toString(is, connection.getContentEncoding() != null ? connection.getContentEncoding() : "UTF-8");
}
}
//76
public class func{
	public void testGetCollectionOfObjects(){
        URL url = new URL(getURL() + "/" + "findCustomerByCity" + "/"
                + "Ottawa");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");
        InputStream xml = connection.getInputStream();
}
}
//77
public class func{
	public void getRedirectURL(String url){
      HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
      conn.setInstanceFollowRedirects(false);
      if(conn.getResponseCode() == HttpServletResponse.SC_TEMPORARY_REDIRECT)
        redirectUrl = conn.getHeaderField("Location");
}
}
//78
public class func{
	public void getDocumentFromUrl(String url){
    HttpURLConnection urlConnection = (HttpURLConnection) new URL(url)
        .openConnection();
    urlConnection.setRequestMethod("GET");
    urlConnection.setDoOutput(true);
    urlConnection.setDoInput(true);
    urlConnection.connect();
}
}
//79
public class func{
	public void testPutNoOperation(){
    URL url = new URL(getJettyURL(), MessageFormat.format("/foo?user.name={0}", user));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setRequestMethod("PUT");
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_BAD_REQUEST);
}
}
//80
public class func{
	public void isInternetAvailable(){
      final URL url = new URL("http://www.orientechnologies.com");
      final HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
      urlConn.setConnectTimeout(1000 * 10); // mTimeout is in seconds
      urlConn.connect();
      if (urlConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
        return true;
      }
}
}
//81
public class func{
	public void assertClientSuppliedCondition(MockResponse seed,String conditionName,String conditionValue){
        server.enqueue(new MockResponse().setResponseCode(HttpURLConnection.HTTP_NOT_MODIFIED));
        server.play();
        URL url = server.getUrl("/");
        assertEquals("A", readAscii(url.openConnection()));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.addRequestProperty(conditionName, conditionValue);
        assertEquals(HttpURLConnection.HTTP_NOT_MODIFIED, connection.getResponseCode());
        assertEquals("", readAscii(connection));
        return server.takeRequest();
}
}
//82
public class func{
	public void createCacheFromNetwork(String type,String name,String url){
    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
    conn.setRequestMethod("GET");
    conn.setConnectTimeout(5000);
    byte[] buf = readInputStream(conn.getInputStream());
    createCache(type, name, buf);
}
}
//83
public class func{
	public void createConnection(final String uri,final String authValue){
        final URL url = new URL(uri);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(0);
        connection.setReadTimeout(0);
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Authorization", authValue);
        connection.setDoOutput(true);
}
}
//84
public class func{
	public void sendFileNotification(String serverBase,String fileName){
        URL url = new URL(serverBase + NOTIFICATION_PATH + fileName);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoOutput(true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));
        while ((line = reader.readLine()) != null) {
            log.info(line);
        }
        reader.close();
}
}
//85
public class func{
	public void testBlobRangeEndGreaterThanContentSize(@ArquillianResource URL url){
        URL pageUrl = new URL(url, "serveblob?name=testrangeend.txt&mimeType=text/plain&contents=" + CONTENTS + "&blobRange=bytes=2-1000");
        HttpURLConnection connection = (HttpURLConnection) pageUrl.openConnection();
            String response = readFullyAndClose(connection.getInputStream());
            assertEquals(PARTIAL_CONTENT, connection.getResponseCode());
            assertEquals("bytes 2-25/26", connection.getHeaderField("Content-Range"));
            assertEquals(CONTENTS.substring(2), response);
            connection.disconnect();
}
}
//86
public class func{
	public void download(String urlAsString){
            URL url = new URL(urlAsString);
            HttpURLConnection hConn = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            hConn.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux i686; rv:7.0.1) Gecko/20100101 Firefox/7.0.1");
            hConn.addRequestProperty("Referer", "http://jetsli.de/crawler");
            hConn.setConnectTimeout(2000);
            hConn.setReadTimeout(2000);
            InputStream is = hConn.getInputStream();
            if ("gzip".equals(hConn.getContentEncoding()))
                is = new GZIPInputStream(is);
            return getInputStream(is);
}
}
//87
public class func{
	public void pingURL(String urlLoc){
      final URL url = new URL(urlLoc);
      final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.162 Safari/535.19");
      conn.setConnectTimeout(5000);
      int response = conn.getResponseCode();
}
}
//88
public class func{
	public void testMbw(String param){
        final TestWebServer testWebServer = createTestWebServer(new MyResource());
        int port = testWebServer.getPort();
        URL serverURL = new URL("http://localhost:" + port + "/foo/bar?name=" + param);
        HttpURLConnection connection = (HttpURLConnection) serverURL.openConnection();
        connection.setRequestMethod("GET");
        connection.addRequestProperty("Accept", "application/json, */*; q=.2");
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        String line = br.readLine();
        Assert.assertEquals("{\"name\":\""+param+"\"}", line);
        testWebServer.stop();
}
}
//89
public class func{
	public void doTestForbiddenMethods(int port,String method){
    URL url = new URL("http://0.0.0.0:" + String.valueOf(port) + "/metrics");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod(method);
    Assert.assertEquals(HttpServletResponse.SC_FORBIDDEN,
      conn.getResponseCode());
}
}
//90
public class func{
	public void testJetty(){
    URL url = new URL(getJettyURL(), "/bar");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_OK);
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    Assert.assertEquals(reader.readLine(), "foo");
    reader.close();
}
}
//91
public class func{
	public void testPostInvalidUsernamePassword(){
        URL url = new URL(container.getServletURL("/") + "?backurl=http://foo:11000/oozie&username=foo&password=bar");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        String html = getHTML(conn);
}
}
//92
public class func{
	public void put(String uri){
        URL u = new URL(uri);
        HttpURLConnection uc = (HttpURLConnection)u.openConnection();
        uc.setRequestMethod("PUT");
        int status = uc.getResponseCode();
}
}
//93
public class func{
	public void shouldAccessInitialPage(){
        URL url = new URL("http://localhost:8090/modeshape-explorer");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int code = connection.getResponseCode();
        assertEquals(200, code);
}
}
//94
public class func{
	public void put(String uri,String mediaType,InputStream in){
        URL u = new URL(uri);
        HttpURLConnection uc = (HttpURLConnection)u.openConnection();
        uc.setRequestMethod("PUT");
        uc.setRequestProperty("Content-Type", mediaType);        
        uc.setDoOutput(true);
        OutputStream out = uc.getOutputStream();
}
}
//95
public class func{
	public void httpPost(WebServer webServer,String path,String body){
        URL url = new URL(webServer.getUri().toURL(), path);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        urlConnection.setDoOutput(true);
}
}
//96
public class func{
	public void main(String[] args){
            server = new HttpServer (new SetChunkedStreamingMode(), 1, 10, 0);
            URL url = new URL ("http://127.0.0.1:"+server.getLocalPort()+"/");
            HttpURLConnection urlc = (HttpURLConnection)url.openConnection();
            urlc.setChunkedStreamingMode (0);
            urlc.setRequestMethod("POST");
            urlc.setDoOutput(true);
            InputStream is = urlc.getInputStream();
}
}
//97
public class func{
	public void testPostSuccess(){
        URL url = new URL(container.getServletURL("/") + "?backurl=about:blank&username=foo&password=foo");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        assertEquals(HttpServletResponse.SC_FOUND, conn.getResponseCode());
        String cookies = getCookies(conn);
        String username = getUsernameFromCookies(cookies);
        assertEquals("foo", username);
}
}
//98
public class func{
	public void httpRequest(String urlStr,String requestType){
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod(requestType);
            return con.getResponseCode();
}
}
//99
public class func{
	public void postSeamReload(){
        String loopbackURL = Framework.getProperty("nuxeo.loopback.url");
        URL location = new URL(loopbackURL + "/restAPI/seamReload");
        HttpURLConnection uc = (HttpURLConnection) location.openConnection();
        uc.setRequestMethod("POST");
        return uc.getResponseCode() == HttpURLConnection.HTTP_OK;
}
}
//100
public class func{
	public void createRequest(String endpointUrl){
    HttpURLConnection connection = (HttpURLConnection) new URL(endpointUrl).openConnection();
    connection.setRequestMethod("GET");
    connection.setAllowUserInteraction(false);
    connection.setRequestProperty("Content-Length", "0");
    return new HttpURLConnectionRequestAdapter(connection);
}
}
//101
public class func{
	public void createRequest(String endpointUrl){
        HttpURLConnection connection = (HttpURLConnection) new URL(endpointUrl).openConnection();
        connection.setRequestMethod("POST");
        connection.setAllowUserInteraction(false);
        connection.setRequestProperty("Content-Length", "0");
        return new HttpURLConnectionRequestAdapter(connection);
}
}
//102
public class func{
	public void testHeaders(){
        URL url = new URL("http", "localhost", HTTP_SERVER_PORT, "/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("X-SetHeaders", "Location: /abcd|X-Dummy: none");
        conn.connect();
        assertEquals(200, conn.getResponseCode());
        assertEquals("OK", conn.getResponseMessage());
        assertEquals("/abcd",conn.getHeaderField("Location"));
        assertEquals("none",conn.getHeaderField("X-Dummy"));
}
}
//103
public class func{
	public void isLocalCommunityServerRunning(){
            HttpURLConnection conn = (HttpURLConnection) new URL("http://" + TEST_COMMUNITY_SERVER
                    + "/community").openConnection();
            if (conn.getResponseCode() == HttpServletResponse.SC_BAD_REQUEST) {
                return true;
            }
            conn.disconnect();
}
}
//104
public class func{
	public void testPing(){
    final URL url = new URL("http://"+ SERVER_HOST + ":" + webServerPort + "/ping");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
    String response = IOUtils.toString(conn.getInputStream());
    Assert.assertEquals("pong\n", response);
}
}
//105
public class func{
	public void downloadAndUpdate(List<String> downloadList){
        for (String filename : downloadList) {
            URL url = new URL(URL_PREFIX + filename);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();

            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                FileHelper.downloadFile(filename, urlConnection);
            } else {
                System.out.println(filename + " error status : " + urlConnection.getResponseMessage());
            }
        }
}
}
//106
public class func{
	public void execute(){
        if (url != null) {
            try {
                URL url = new URL(this.url);
                HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
                if (urlConn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    handleRetry();
                }
            }
            catch (IOException ex) {
                handleRetry();
            }
        }
}
}
//107
public class func{
	public void httpGet(String urlString){
        url = new URL(urlString);
        conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        while ((line = br.readLine()) != null) {
          doc += line;
        }
        br.close();
}
}
//108
public class func{
	public void testSuccess(){
    HttpURLConnection c = (HttpURLConnection)new URL("http://localhost:" + PORT + "/foobar").openConnection();
    assertEquals(c.getResponseCode(), RestStatus.OK);
    InputStream in = c.getInputStream();
}
}
//109
public class func{
	public void testGet(@ArquillianResource URL url){
        URL testURL = new URL(url, "simple");
        HttpURLConnection conn = (HttpURLConnection) testURL.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.setDoOutput(false);
        conn.connect();
}
}
//110
public class func{
	public void testDoPost(){
        url=new URL("http://127.0.0.1:"+connector.getLocalPort()+"/test/dump/info?query=foo");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.addRequestProperty(HttpHeaders.CONTENT_LENGTH, "10");
}
}
//111
public class func{
	public void getUrlBytes(String urlToRead){
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            InputStream in = conn.getInputStream();
                return IOUtils.toByteArray(in);
                in.close();
}
}
//112
public class func{
	public void httpPostCompressed(WebServer webServer,String path,String body){
        URL url = new URL(webServer.getUri().toURL(), path);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.addRequestProperty("Content-Encoding", "gzip");
        urlConnection.setRequestMethod("POST");
        urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        urlConnection.setDoOutput(true);
}
}
//113
public class func{
	public void sendMessageByHttp(int port,String topic,int partition,byte[] data){
        URL url = new URL(String.format("http://127.0.0.1:%s/",port));
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("partition",""+partition);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.getOutputStream().write(data);
        conn.getOutputStream().flush();
        conn.getOutputStream().close();
}
}
//114
public class func{
	public void checkURLisReachable(String url){
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(timeout);
            connection.setReadTimeout(timeout);
            int responseCode = connection.getResponseCode();
            if (200 <= responseCode && responseCode <= 399) {
                return null;
            }
            return String.format("The update server is unreachable: The attempt to connect to the update server has resulted in %d code.", responseCode);
}
}
//115
public class func{
	public void getConnection(String urlString,String username,String password){
    URL url = new URL(urlString);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("POST");
    connection.setReadTimeout(1000 * 60 * 60);
    connection.setConnectTimeout(1000 * 10);
}
}
//116
public class func{
	public void testOnlyPartOfBlobServedWhenResponseContainsBlobRangeHeader(@ArquillianResource URL url){
        URL pageUrl = new URL(url, "serveblob?name=testrange.txt&mimeType=text/plain&contents=" + CONTENTS + "&blobRange=bytes=2-5");
        HttpURLConnection connection = (HttpURLConnection) pageUrl.openConnection();
            String response = readFullyAndClose(connection.getInputStream());
            assertEquals(PARTIAL_CONTENT, connection.getResponseCode());
            assertEquals("bytes 2-5/26", connection.getHeaderField("Content-Range"));
            assertEquals(CONTENTS.substring(2, 5 + 1), response);
            assertNull("header should have been removed from response", connection.getHeaderField("X-AppEngine-BlobRange"));
            connection.disconnect();
}
}
//117
public class func{
	public void createConnection(int page){
        URL url = new URL(PROFILE_URL+page);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setUseCaches(false);
        connection.setDoInput(true);
        connection.setDoOutput(true);
}
}
//118
public class func{
	public void perform(){
                    final HttpURLConnection conn = (HttpURLConnection)new URL(baseURL, "auth").openConnection();
                    conn.setRequestProperty("Referer", "http:/geekseek.com");
                    conn.setInstanceFollowRedirects(false);
                    Assert.assertEquals(302, conn.getResponseCode());
                    Assert.assertEquals(conn.getHeaderField("Location"), "http:/geekseek.com");
}
}
//119
public class func{
	public void waitForServerToBack(){
                HttpURLConnection con = (HttpURLConnection)new URL(hudsonUrl,"tcpSlaveAgentListener/").openConnection();
                con.connect();
                if(con.getResponseCode()==200)
                    return;
}
}
//120
public class func{
	public void sendAction(String action){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        if (conn.getResponseCode() != HttpServletResponse.SC_OK) {
            throw new IOException("Bad status: " + conn.getResponseCode() + " for action: "
                    + action);
        }
}
}
//121
public class func{
	public void httpClientTest(){
            URL url = new URL("http://www.google.com");
            urlConnection = (HttpURLConnection) url.openConnection();
            if (urlConnection.getResponseCode() == 200) {
                mHttpClientTestResult = "Pass";
            } else {
                mHttpClientTestResult = "Fail: Code: " + urlConnection.getResponseMessage();
            }
}
}
//122
public class func{
	public void testStatus(){
        URL url = new URL("http", "localhost", HTTP_SERVER_PORT, "/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("X-ResponseStatus", "302 Temporary Redirect");
        conn.connect();
        assertEquals(302, conn.getResponseCode());
        assertEquals("Temporary Redirect", conn.getResponseMessage());
}
}
//123
public class func{
	public void testHdfsAccess(){
    URL url = new URL(getJettyURL(), MessageFormat.format("/?user.name={0}&op=list", user));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_OK);
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    reader.readLine();
    reader.close();
}
}
//124
public class func{
	public void testGetAuthorizationUrl(){
      assertNotNullOrEmpty(String.format(RESOURCE_MISSING_MESSAGE, "Test callback URL."), TestConstants.TEST_CALLBACK_URL);
    String authorizationUrl = service.getAuthorizationUrl(TestConstants.TEST_CALLBACK_URL);
    assertNotNullOrEmpty("Authorization URL should not be null.", authorizationUrl);
            URL               url     = new URL(authorizationUrl);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
      if (request.getResponseCode() != HttpURLConnection.HTTP_OK) {
        fail(convertStreamToString(request.getErrorStream()));
      }
}
}
//125
public class func{
	public void testNotAuthenticated(){
    auth.start();
      URL url = new URL(auth.getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      Assert.assertEquals(HttpURLConnection.HTTP_UNAUTHORIZED, conn.getResponseCode());
      Assert.assertTrue(conn.getHeaderField(KerberosAuthenticator.WWW_AUTHENTICATE) != null);
      auth.stop();
}
}
//126
public class func{
	public void testGlobFilter(){
    URL url = new URL(getJettyURL(), MessageFormat.format("/?user.name={0}&op=list&filter=f*", user));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_OK);
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    reader.readLine();
    reader.close();
}
}
//127
public class func{
	public void testHdfsAccess(){
    URL url = new URL(TestJettyHelper.getJettyURL(),
                      MessageFormat.format("/webhdfs/v1/?user.name={0}&op=liststatus", user));
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(), HttpURLConnection.HTTP_OK);
    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    reader.readLine();
    reader.close();
}
}
//128
public class func{
	public void connect(){
      URL url = new URL(URL);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //sink, leak
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();
}
}
//129
public class func{
	public void ga(final Map<String,Object> prop){
        final String ua="User-Agent: Java/"+prop.get("java.version")
                + " (" +prop.get("os.name")
                + " )" + "batoo/"+prop.get("batoojpa.build");
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("User-Agent", ua);
        return con.getResponseCode();
}
}
//130
public class func{
	public void get(final String path){
        final InetSocketAddress address = new InetSocketAddress(getPort());
        final URL url = new URL("http://" + address.getHostName() + ":" + address.getPort() + path);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
}
}
//131
public class func{
	public void executeHttpPost(InputStream data,String url){
    HttpURLConnection http = (HttpURLConnection) new URL(url).openConnection();
    http.setChunkedStreamingMode(1024 * 1024);
    http.setRequestMethod("POST");
    http.setRequestProperty("Content-Type", "application/octet-stream");
    http.setDoOutput(true);
    IOUtils.copy(data, http.getOutputStream());
    http.getOutputStream().flush();
    http.getOutputStream().close();
}
}
//132
public class func{
	public void hasOsmTileETag(String eTag){
            url = new URL(tile.getUrl());
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            prepareHttpUrlConnection(urlConn);
            urlConn.setRequestMethod("HEAD");
            urlConn.setReadTimeout(30000); // 30 seconds read timeout
            String osmETag = urlConn.getHeaderField("ETag");
            if (osmETag == null)
                return true;
            return (osmETag.equals(eTag));
}
}
//133
public class func{
	public void post(String urlString,String xmlRequest){
        URL url = new URL(urlString);
        HttpURLConnection  conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "text/xml");
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream(), UTF8.UTF8);
        wr.write(xmlRequest);
        wr.flush();
}
}
//134
public class func{
	public void testAnonymousAllowed(){
    setAuthenticationHandlerConfig(getAuthenticationHandlerConfiguration(true));
    start();
      URL url = new URL(getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
      stop();
}
}
//135
public class func{
	public void shouldAllow404ReturnCodeOnAcceptHeaderRequests(){
        HttpURLConnection con = (HttpURLConnection)new URL(base, "app/MISSING_RESOURCES").openConnection();
        con.setRequestProperty("Accept", "application/vnd.ced+json");
        int response = con.getResponseCode();
        con.disconnect();
        Assert.assertEquals(404, response);
}
}
//136
public class func{
	public void simpleGetRequest(String url){
      connection = (HttpURLConnection) new URL(url).openConnection();
      prepareConnection(connection, null);
            return parseResponseWrapper(connection);
      if (connection != null) {
        try {
          return new DfeResponse<T>(connection.getResponseCode(), connection.getResponseMessage(), e);
        } catch (IOException ignored) {
        }
      }
}
}
//137
public class func{
	public void call(WorkflowStore store){
        if (url != null) {
            try {
                URL url = new URL(this.url);
                HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
                if (urlConn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    handleRetry();
                }
            }
            catch (IOException ex) {
                handleRetry();
            }
        }
}
}
//138
public class func{
	public void cacheTile(String aURL){
            URL url = new URL(aURL);
            HttpURLConnection uc = (HttpURLConnection) url.openConnection();
            int status = uc.getResponseCode();
            if (status == 200) {
                int contentLength = uc.getContentLength();

                if (contentLength == -1) {
                    // LOGGER.debug("Tile '{}' content length: -1", aURL);
                }
            } else if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Problem caching '{}' tile (status: {})", aURL, status);
            }
}
}
//139
public class func{
	public void call(){
      URL url = new URL(this.url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty("User-Agent", userAgent);
        conn.setConnectTimeout(15000);
        conn.setReadTimeout(15000);
        return new VerificationResponseImpl(conn.getInputStream());
}
}
//140
public class func{
	public void getHttpStatusCode(String urlstring,String userName){
    URL url = new URL(urlstring + "?user.name=" + userName);
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.connect();
    return connection.getResponseCode();
}
}
//141
public class func{
	public void callPingBack(){
            String pingServerURL = defaultPingBackUrl.concat("-ent");
                url = new URL(pingServerURL);
                urlConn = (HttpURLConnection) url.openConnection();
                urlConn.connect();
                return (HttpURLConnection.HTTP_NOT_FOUND != urlConn.getResponseCode());
}
}
//142
public class func{
	public void testPathParam(){
    assertNotNull(url);
    URL url = new URL(AbstractResponseViewActionTestCase.url);
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.connect();
    assertEquals(302, conn.getResponseCode());
    Map<String, String> headers = Tools.responseHeaders(conn);
    String redirect = headers.get("Location");
    driver.get(redirect);
}
}
//143
public class func{
	public void prepareRequest(){
        HttpURLConnection conn = (HttpURLConnection) new URL(URL).openConnection();
        conn.setRequestMethod(HTTP_POST_METHOD);
        conn.setRequestProperty("Content-Type", CONTENT_TYPE);
        request = new HttpURLConnectionRequestAdapter(conn);
}
}
//144
public class func{
	public void doRequest(OAuthClientRequest req){
        URL url = new URL(req.getLocationUri());
        HttpURLConnection c = (HttpURLConnection)url.openConnection();
        c.setInstanceFollowRedirects(true);
        c.connect();
        c.getResponseCode();
}
}
//145
public class func{
	public void testPathParam(){
    assertNotNull(url);
    URL url = new URL(AbstractResponseViewNoRedirectActionTestCase.url);
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.connect();
    assertEquals(200, conn.getResponseCode());
    assertEquals("bar_value", bar);
}
}
//146
public class func{
	public void perform(){
                    final HttpURLConnection conn = (HttpURLConnection)new URL(baseURL, "auth").openConnection();
                    conn.setInstanceFollowRedirects(false);
                    Assert.assertEquals(400, conn.getResponseCode());
}
}
//147
public class func{
	public void execute(){
                AuthorizationRequest authorizationRequest = (AuthorizationRequest) request;
                String locationURL = authorizationRequest.getLocation() + "?" + authorizationRequest.asQueryParams();
                URL url = new URL(locationURL);
                HttpURLConnection c = (HttpURLConnection) url.openConnection();
                c.setInstanceFollowRedirects(true);
                c.connect();
                response.setStatusCode(c.getResponseCode());
                response.setResponseMessage(c.getResponseMessage());
}
}
//148
public class func{
	public void createConnection(){
        URL url = new URL(domainApiUrl);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
        connection.addRequestProperty("Accept", APPLICATION_DMR_ENCODED);
        connection.setRequestProperty("Content-Type", APPLICATION_DMR_ENCODED);
}
}
//149
public class func{
	public void getConnection(String query){
        postURL = new URL(query);
        HttpURLConnection conn = (HttpURLConnection) postURL.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        conn.setAllowUserInteraction(false);
}
}
//150
public class func{
	public void getConnection(String urlString,String username,String password){
      URL url = new URL(urlString);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("DELETE");
      connection.setReadTimeout(1000 * 60 * 60);
      connection.setConnectTimeout(1000 * 10);
}
}
//151
public class func{
	public void connect(String url){
        connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");
        connection.setUseCaches(false);
}
}
//152
public class func{
	public void execute(ClientRequest request){
    String uri = request.getUri();
    String httpMethod = request.getHttpMethod();
    HttpURLConnection connection = (HttpURLConnection) new URL(uri).openConnection();
    connection.setRequestMethod(httpMethod);
}
}
//153
public class func{
	public void get(String request,IOUtils.LineRead callback,int timeout){
        URL url = new URL(request);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");
            connection.setUseCaches(false);
}
}
//154
public class func{
	public void get(String urlS){
        URL url = new URL(urlS);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        return getResponseBody(connection);
}
}
//155
public class func{
	public void getBitmapFromURL(String source){
            URL url = new URL(source);
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
            httpConnection.setDoInput(true);
            httpConnection.connect();
            InputStream inputStream = httpConnection.getInputStream();
            return BitmapFactory.decodeStream(inputStream);
            Log.e(TAG, "getBitmapFromUrl: " + source, e);
}
}
//156
public class func{
	public void getBitmapFromURL(String src){
      URL url = new URL(src);
      HttpURLConnection connection = (HttpURLConnection) url
          .openConnection();
      connection.setDoInput(true);
      connection.connect();
      InputStream input = connection.getInputStream();
      return BitmapFactory.decodeStream(input);
}
}
//157
public class func{
	public void testNoCacheHeader(){
    URL url = new URL(baseUrl, "/echo?a=b&c=d");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
    assertEquals("no-cache", conn.getHeaderField("Cache-Control"));
    assertEquals("no-cache", conn.getHeaderField("Pragma"));
    assertNotNull(conn.getHeaderField("Expires"));
    assertNotNull(conn.getHeaderField("Date"));
    assertEquals(conn.getHeaderField("Expires"), conn.getHeaderField("Date"));
}
}
//158
public class func{
	public void checkThatWeHaveLocalGeoServer(){
        URL url = new URL( getCapabilities );
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();
            if( responseCode == 200 ){
                localGeoserver = true;
            }
}
}
//159
public class func{
	public void init(){
      URL url = new URL(urlstr);
      HttpURLConnection connection = (HttpURLConnection) url
          .openConnection();
      connection.setConnectTimeout(30000);
      connection.setRequestMethod("GET");
      fileSize = connection.getContentLength();
}
}
//160
public class func{
	public void testNotAuthenticated(){
    setAuthenticationHandlerConfig(getAuthenticationHandlerConfiguration());
    start();
      URL url = new URL(getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      assertEquals(HttpURLConnection.HTTP_UNAUTHORIZED, conn.getResponseCode());
      assertTrue(conn.getHeaderField(KerberosAuthenticator.WWW_AUTHENTICATE) != null);
      stop();
}
}
//161
public class func{
	public void execute(String method,String urlS,String body){
        URL url = new URL(urlS);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(method);
}
}
//162
public class func{
	public void makePreSignedRequest(String method,String preSignedUrl,Map headers){
            URL url = new URL(preSignedUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);
            addHeaders(connection, headers);
}
}
//163
public class func{
	public void loadInBackground(){
        final URL url = new URL(mUrl);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoInput(true);
        connection.connect();
        final InputStream input = connection.getInputStream();
        final Bitmap myBitmap = BitmapFactory.decodeStream(input);
}
}
//164
public class func{
	public void testResponseLength(){
        URL url = new URL("http", "localhost", HTTP_SERVER_PORT, "/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("X-ResponseLength", "10");
        conn.connect();
        final InputStream inputStream = conn.getInputStream();
        assertEquals(10, IOUtils.toByteArray(inputStream).length);
        inputStream.close();
}
}
//165
public class func{
	public void googleIsReachable(){
            URL url = new URL("http://www.google.com");
                    (HttpURLConnection) url.openConnection();
            httpURLConnection.connect();
            return HttpURLConnection.HTTP_OK == httpURLConnection
                    .getResponseCode();
}
}
//166
public class func{
	public void testAnonymousDisallowed(){
    auth.start();
      URL url = new URL(auth.getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      Assert.assertEquals(HttpURLConnection.HTTP_UNAUTHORIZED, conn.getResponseCode());
      Assert.assertTrue(conn.getHeaderFields().containsKey("WWW-Authenticate"));
      Assert.assertEquals("Authentication required", conn.getResponseMessage());
      auth.stop();
}
}
//167
public class func{
	public void doPost(String request){
    URL url = new URL("http://localhost:8080/exist/rest" + XmldbURI.ROOT_COLLECTION);
    HttpURLConnection connect = (HttpURLConnection) url.openConnection();
    connect.setRequestMethod("POST");
    connect.setDoOutput(true);
    OutputStream os = connect.getOutputStream();
}
}
//168
public class func{
	public void test8(String u){
        URL url = new URL (u);
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection ();
        urlc.setFixedLengthStreamingMode (0);
        urlc.setDoOutput(true);
        urlc.setRequestMethod ("POST");
        OutputStream os = urlc.getOutputStream ();
        os.close();
}
}
//169
public class func{
	public void getVersion(){
            HttpURLConnection con = (HttpURLConnection) new URL(URL).openConnection();
            con.setDoOutput(true);
            con.setRequestMethod("POST");
}
}
//170
public class func{
	public void httpCall(String url,String method,String params){
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.setRequestMethod(method);
    connection.setDoOutput(true);
}
}
//171
public class func{
	public void testAnonymousAllowed(){
    auth.start();
      URL url = new URL(auth.getBaseURL());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.connect();
      Assert.assertEquals(HttpURLConnection.HTTP_OK, conn.getResponseCode());
      auth.stop();
}
}
//172
public class func{
	public void testPingUsingHttpURLConnection(){
    final URL url = new URL("http://"+ SERVER_HOST + ":" + webServerPort + "/ping");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(HttpURLConnection.HTTP_UNAUTHORIZED, conn.getResponseCode());
    String errorMessage = IOUtils.toString(conn.getErrorStream());
    Assert.assertTrue(errorMessage.contains("Authentication required"));
}
}
//173
public class func{
	public void getUrlInfos(String urlAsString,int timeout){
            URL url = new URL(urlAsString);
            HttpURLConnection hConn = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            hConn.setRequestProperty("User-Agent", "Mozilla/5.0 Gecko/20100915 Firefox/3.6.10");
            hConn.setConnectTimeout(timeout);
            hConn.setReadTimeout(timeout);
            BufferedInputStream in = new BufferedInputStream(hConn.getInputStream(), arr.length);
            in.read(arr);
            return getUrlInfosFromText(arr);
}
}
//174
public class func{
	public void isConnectedToInternet(){
        String pingServerURL = pingBackUrl.substring(0, pingBackUrl.indexOf("/", "http://url".length()));
            URL url = new URL(pingServerURL);
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            urlConn.connect();
            return (HttpURLConnection.HTTP_NOT_FOUND != urlConn.getResponseCode());
}
}
//175
public class func{
	public void _getImageAsStream(String urlStr){
    URL url = new URL(urlStr);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.connect();
    return conn.getInputStream();
}
}
//176
public class func{
	public void getHTTPConnection(String urlString,String httpMethod){
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setAllowUserInteraction(true);
        conn.addRequestProperty("Cookie", cookie);
        conn.setRequestMethod(httpMethod);
        connectWithRetry(conn);
}
}
//177
public class func{
	public void testProxy(InetSocketAddress proxySocketAddress,String fetchUrl){
    URL url = new URL(fetchUrl);
    HttpURLConnection uc = (HttpURLConnection) url.openConnection(proxy);
    uc.connect();
    InputStream is = uc.getInputStream();
    String html = IoUtils.readAll(is);
    is.close();
}
}
//178
public class func{
	public void getData(String urlString){
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        InputStream is = connection.getInputStream();
        while ((i = is.read()) != -1) {
            incomingMessage = incomingMessage + (char) i;
        }
        is.close();
}
}
//179
public class func{
	public void getCurrentCIDR(){
      URL url = new URL("http://checkip.amazonaws.com/");
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.connect();
      return Strings2.toStringAndClose(connection.getInputStream()).trim() + "/32";
}
}
//180
public class func{
	public void testPathParam(){
    WebElement link = driver.findElement(By.id("link"));
    URL url = new URL(link.getAttribute("href"));
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(500, conn.getResponseCode());
}
}
//181
public class func{
	public void testAdmin(@ArquillianResource URL url){
        URLConnection uc = new URL(url, "_ah/admin").openConnection();
        HttpURLConnection conn = (HttpURLConnection) uc;
        conn.connect();
        conn.getInputStream().read();
}
}
//182
public class func{
	public void HttpContinueStackOverflow(){
        URL url = new URL("http", "localhost", s.getLocalPort(), "anything.html");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.getResponseCode();
}
}
//183
public class func{
	public void testWeather7(){
    WebElement link = driver.findElement(By.tagName("link"));
    String href = link.getAttribute("href");
    url = new URL(href);
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(200, conn.getResponseCode());
}
}
//184
public class func{
	public void makeHttpCall(){
            URL url = new URL("http" , InetAddress.getLocalHost().getHostAddress(),
                                server.getLocalPort(), "/");
            HttpURLConnection uc = (HttpURLConnection)url.openConnection();
            System.out.println(uc.getResponseCode());
}
}
//185
public class func{
	public void testServerStartSequence(){
        server.start();
        waitForStart(server);
        int port = server.httpPort();
        URL url = new URL("http://localhost:" + port + "/test");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        assertThat(connection.getResponseCode()).isEqualTo(404);
}
}
//186
public class func{
	public void doWork(){
            URL url = new URL("http://localhost:" + port + "/?id=" + id);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            assertThat(connection.getResponseCode()).isEqualTo(200);
}
}
//187
public class func{
	public void main(String[] args){
        ExecutorService s =  Executors.newCachedThreadPool();
        server.setExecutor (s);
        server.start ();
        URL url = new URL ("http://localhost:" + server.getAddress().getPort()+
                "/Foo/bar/test.html");
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection();
        int r = urlc.getResponseCode();
}
}
//188
public class func{
	public void getResponseCode(String url){
      HttpURLConnection c = (HttpURLConnection)new URL(url).openConnection();
      return c.getResponseCode();
}
}
//189
public class func{
	public void doClientSide(){
        URL url = new URL("https://localhost:" + serverPort + "/");
        HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
        System.out.println("response is " + urlc.getResponseCode());
}
}
//190
public class func{
	public void createConnection(String urlStr){
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setUseCaches(true);
        conn.setRequestProperty("Accept-Encoding", acceptEncoding);
        conn.setReadTimeout(timeout);
        conn.setConnectTimeout(timeout);
}
}
//191
public class func{
	public void getUrlAsDocument(String urlAsString,int timeout){
        URL url = new URL(urlAsString);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection();
        hConn.setReadTimeout(timeout);
        hConn.setConnectTimeout(timeout);
        InputStream is = hConn.getInputStream();
}
}
//192
public class func{
	public void call(){
        for (UUID uuid : uuids) {
            HttpURLConnection connection = (HttpURLConnection) new URL(PROFILE_URL + uuid.toString().replace("-", "")).openConnection();
            JSONObject response = (JSONObject) jsonParser.parse(new InputStreamReader(connection.getInputStream()));
            String name = (String) response.get("name");
            if (name == null) {
                continue;
            }
            String cause = (String) response.get("cause");
            String errorMessage = (String) response.get("errorMessage");
            if (cause != null && cause.length() > 0) {
                throw new IllegalStateException(errorMessage);
            }
            uuidStringMap.put(uuid, name);
        }
}
}
//193
public class func{
	public void doInBackground(ApiPacket... params){
        url = new URL(getString(R.string.djImageApiURL) + pack.main.dj.id);
        HttpURLConnection conn = (HttpURLConnection) url
            .openConnection();
        conn.setDoInput(true);
        conn.connect();
        InputStream is = conn.getInputStream();
        image = BitmapFactory.decodeStream(is);
}
}
//194
public class func{
	public void getBitmapFromWeb(String src){
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
}
}
//195
public class func{
	public void getBitmapFromUrl(String urlSource){
      URL url = new URL(urlSource);
      HttpURLConnection connection = (HttpURLConnection) url
          .openConnection();
      connection.setDoInput(true);
      connection.connect();
      InputStream input = connection.getInputStream();
      Bitmap myBitmap = BitmapFactory.decodeStream(input);
}
}
//196
public class func{
	public void readUrl(String urlAsString,int timeout){
        URL url = new URL(urlAsString);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection();
        hConn.setReadTimeout(timeout);
        hConn.setConnectTimeout(timeout);
        return readInputStream(hConn.getInputStream());
}
}
//197
public class func{
	public void testExecute_methodUnchanged(){
          (HttpURLConnection) new URL("http://www.google.com").openConnection();
      connection.setRequestMethod(method);
      NetHttpRequest request = new NetHttpRequest(connection);
      setContent(request, "text/html", "");
        request.execute().getContent().close();
      assertEquals(method, connection.getRequestMethod());
}
}
//198
public class func{
	public void post(String url,Map<String,Object> parts){
    HttpURLConnection post = (HttpURLConnection) new URL(url)
        .openConnection();
    post.setRequestMethod("POST"); //$NON-NLS-1$
    return post(post, parts);
}
}
//199
public class func{
	public void getURLReader(final String uri){
      URL url = new URL( uri );
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.connect();
      InputStream in = connection.getInputStream();
      return new InputStreamReader( in );
}
}
//200
public class func{
	public void getResourceLength(String path){
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(12 * 1000);
        conn.setRequestMethod("GET");
        return conn.getContentLength();
}
}
//201
public class func{
	public void openConnection(String url){
        HttpURLConnection hConn = (HttpURLConnection) new URL(url).openConnection();
        hConn.setRequestProperty("content-charset", "UTF-8");
        hConn.setConnectTimeout(timeoutInMillis);
        hConn.setReadTimeout(timeoutInMillis);
        hConn.connect();
}
}
//202
public class func{
	public void doInBackground(Void... params){
                    URL imageUrl = new URL(mUrl);
                    HttpURLConnection connection = (HttpURLConnection) imageUrl.openConnection();
                    connection.setConnectTimeout(TIMEOUT);
                    connection.setReadTimeout(TIMEOUT);
                    connection.setInstanceFollowRedirects(true);
                    InputStream inputStream = connection.getInputStream();
}
}
//203
public class func{
	public void openUrlConnection(String url){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setUseCaches(false);
        conn.setChunkedStreamingMode(0);
        conn.setRequestProperty("User-Agent", USER_AGENT);
        conn.connect();
}
}
//204
public class func{
	public void getCopyOfBitmap(){
                URL url = new URL(TULIP_IMG_URL);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream input = connection.getInputStream();
                sBitmap = ShadowBitmapFactory.decodeStream(input);
}
}
//205
public class func{
	public void doInBackground(Void... params){
            URL urlConnection = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlConnection
                    .openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
}
}
//206
public class func{
	public void createConnection(ClientRequest request){
      String uri = request.getUri();
      String httpMethod = request.getHttpMethod();
      HttpURLConnection connection = (HttpURLConnection) new URL(uri).openConnection();
      connection.setRequestMethod(httpMethod);
}
}
//207
public class func{
	public void setupSignRequestTest(String urlStr,String method){
        final URL url = new URL(urlStr);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(method);
}
}
//208
public class func{
	public void testFoo(){
    WebElement trigger = driver.findElement(By.id("trigger"));
    url = new URL(trigger.getAttribute("href"));
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    assertEquals(302, conn.getResponseCode());
    Map<String, String> headers = Tools.responseHeaders(conn);
    assertTrue(headers.containsKey("Location"));
    assertEquals("http://www.foobar.com", headers.get("Location"));
}
}
//209
public class func{
	public void testGetBookNotExistent(){
        URL url = new URL(endpointAddress);
        HttpURLConnection connect = (HttpURLConnection)url.openConnection();
        connect.addRequestProperty("Accept", "application/xml");
        assertEquals(405, connect.getResponseCode());
        InputStream in = connect.getErrorStream();
        assertNotNull(in);           
        assertEquals("Exception is not mapped correctly", 
                     "StringTextWriter - Nonexistent method",
                     getStringFromInputStream(in).trim());
}
}
//210
public class func{
	public void loadImage(String url){
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(15000);
            is = new BufferedInputStream(connection.getInputStream());
}
}
//211
public class func{
	public void isw3OrgReachable(){
            HttpURLConnection connection = (HttpURLConnection) new URL("http://www.w3.org")
                    .openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            connection.disconnect();
}
}
//212
public class func{
	public void getHttpURLConnection(String urlAsString){
        URL url = new URL(urlAsString);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
        hConn.setInstanceFollowRedirects(false);
        hConn.setRequestMethod("HEAD");
}
}
//213
public class func{
	public void checkLatestVersion(){
            URL url = new URL(VERSION_URL + REALM_VERSION);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setConnectTimeout(CONNECT_TIMEOUT);
            conn.setReadTimeout(READ_TIMEOUT);
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            result = rd.readLine();
            rd.close();
}
}
//214
public class func{
	public void testRender(){
    assertEquals(applicationURL("/foo").getPath(), url.getPath());
    assertNull(url.getQuery());
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.setRequestMethod("POST");
    conn.connect();
    assertEquals(302, conn.getResponseCode());
    url = new URL(Tools.responseHeaders(conn).get("Location"));
    assertEquals(applicationURL("/foo").getPath(), url.getPath());
}
}
//215
public class func{
	public void testURL(String wicketId,String uri){
        if (uri!=null) 
            urlString+=uri;
        URL url = new URL(urlString);        
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.getInputStream().close();
}
}
//216
public class func{
	public void postProperty(){
    URL url = new URL("http://localhost:8080/jabylon/api/apiproject/master/folder/test11.properties");
    HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
    httpCon.setDoOutput(true);
    httpCon.setRequestMethod("PUT");
    PrintStream printStream = new PrintStream(httpCon.getOutputStream());
    printStream.println("narf = blah");
    printStream.close();
}
}
//217
public class func{
	public void getURLContent_old(final String uri,final StringBuffer content){
    URL url = new URL( uri );
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.connect();
    InputStream in = connection.getInputStream();
}
}
//218
public class func{
	public void test9(String u){
        URL url = new URL (u);
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection ();
        urlc.setChunkedStreamingMode (-1);
        urlc.setDoOutput(true);
        urlc.setRequestMethod ("POST");
        OutputStream os = urlc.getOutputStream ();
}
}
//219
public class func{
	public void drawableFromUrl(Context context,String url){
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.connect();
        InputStream input = connection.getInputStream();
        x = BitmapFactory.decodeStream(input);
}
}
//220
public class func{
	public void fetchXml(String doi){
    URL url = new URL(doi);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.connect();
    InputStream is = conn.getInputStream();
    String result = IOUtils.toString(is);
    is.close();
}
}
//221
public class func{
	public void invokeServer(String uri){
    URL url = new URL("http://localhost:" + RANDOM_SERVER_PORT + uri);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    Util.readToString(connection.getInputStream());
}
}
//222
public class func{
	public void getOriginatingIp(){
    URL url = new URL("http://checkip.amazonaws.com/");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.connect();
    return IOUtils.toString(connection.getInputStream()).trim() + "/32";
}
}
//223
public class func{
	public void createUrlConnection(String urlAsStr,int timeout){
        URL url = new URL(urlAsStr);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
        hConn.setRequestProperty("Accept-Encoding", "gzip, deflate");
        hConn.setConnectTimeout(timeout);
        hConn.setReadTimeout(timeout);
}
}
//224
public class func{
	public void testInvalidadHttpFSAccess(){
    URL url = new URL(TestJettyHelper.getJettyURL(),
                      "/webhdfs/v1/?op=GETHOMEDIRECTORY");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    Assert.assertEquals(conn.getResponseCode(),
                        HttpURLConnection.HTTP_UNAUTHORIZED);
}
}
//225
public class func{
	public void _getImageAsStream(String urlStr){
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        return conn.getInputStream();
}
}
//226
public class func{
	public void getURLInputStream(final String uri){
      URL url = new URL( uri );
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.connect();
      InputStream in = connection.getInputStream();
}
}
//227
public class func{
	public void testSecurePing(@ArquillianResource URL url){
        URLConnection uc = new URL(url, "secure").openConnection();
        HttpURLConnection conn = (HttpURLConnection) uc;
        conn.connect();
            conn.getInputStream();
}
}
//228
public class func{
	public void testDoubleCompression(){
        for (String endpoint : Arrays.asList("autoZip","ownZip")) {
            HttpURLConnection con = (HttpURLConnection) new URL(this.url, endpoint).openConnection();
            con.setRequestProperty("Accept-Encoding","gzip");
            byte[] data = IOUtils.toByteArray(con.getInputStream());
            data = IOUtils.toByteArray(new GZIPInputStream(new ByteArrayInputStream(data)));
            assertEquals(new String(data), CONTENT);
        }
}
}
//229
public class func{
	public void createConnection(UUID id){
    URL url = new URL(PROFILE_URL + id.toString().replace("-", ""));
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setConnectTimeout(15000);
    connection.setReadTimeout(15000);
    connection.setUseCaches(false);
    connection.setDoInput(true);
    connection.setDoOutput(true);
}
}
//230
public class func{
	public void eventGoesToAppenders(){
    URL url = new URL(JETTY_FIXTURE.getUrl());
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    String result = Util.readToString(connection.getInputStream());
    assertEquals("hello world", result);
}
}
//231
public class func{
	public void makeHttpCall(){
            URL url = new URL("https" , firstNonLoAddress.getHostAddress(),
                                server.getLocalPort(), "/");
            HttpURLConnection uc = (HttpURLConnection)url.openConnection();
            System.out.println(uc.getResponseCode());
}
}
//232
public class func{
	public void download(String uri,String filePath){
      URL url = new URL(uri);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestProperty("User-Agent", AGENT);
      readStreamToFile(conn.getInputStream(), filePath);
}
}
//233
public class func{
	public void openHttpURLConnection(String url){
        URL submitURL = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) submitURL.openConnection();
        httpURLConnection.setConnectTimeout(3000);
        httpURLConnection.setReadTimeout(3000);
        httpURLConnection.setRequestProperty("Content-Language", "utf-8");
}
}
//234
public class func{
	public void makeRequest(){
        HttpURLConnection connection = (HttpURLConnection) new URL("http://localhost:8092/").openConnection();
        connection.addRequestProperty("Connection", "keep-alive");
        InputStream in = connection.getInputStream();
        while (in.available() > 0) {
            in.read();
        }
        in.close();
}
}
//235
public class func{
	public void getResponse(URL contextUrl,String uri){
        URL url = new URL(contextUrl, uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            byte[] bytes = IOUtils.toBytes(connection.getInputStream(), true);
            return new String(bytes, "UTF-8");
            connection.disconnect();
}
}
//236
public class func{
	public void connectTo(String url){
    String encodedUrl = Uri.encode(url, ALLOWED_URI_CHARS);
    HttpURLConnection conn = (HttpURLConnection) new URL(encodedUrl).openConnection();
    conn.setConnectTimeout(connectTimeout);
    conn.setReadTimeout(readTimeout);
    conn.connect();
}
}
//237
public class func{
	public void getConnection(String alias,int timeout){
        HttpURLConnection urlConn = (HttpURLConnection) new URL("http", "localhost", PORT, alias).openConnection();
        urlConn.setConnectTimeout(5 * 1000);
        urlConn.setReadTimeout(timeout);
        urlConn.connect();
}
}
//238
public class func{
	public void testException(){
    HttpURLConnection c2 = (HttpURLConnection)new URL("http://localhost:" + PORT + "/error").openConnection();
    assertEquals(c2.getResponseCode(), RestStatus.INTERNAL_SERVER_ERROR);
}
}
//239
public class func{
	public void HttpContinueStackOverflow(int port){
        URL url = new URL("http", "localhost", port, "anything.html");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        int respCode = conn.getResponseCode();
}
}
//240
public class func{
	public void execUrl(String uri){
      URL url = new URL(uri);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestProperty("User-Agent", AGENT);
      res = readStream(conn.getInputStream());
}
}
//241
public class func{
	public void CheckUrl(String urlvalue){
      URL url = new URL(urlvalue);
      HttpURLConnection urlConnection = (HttpURLConnection) url
          .openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(
          urlConnection.getInputStream()));
      inputLine = in.readLine().toString();
}
}
//242
public class func{
	public void readData(String dest){
            HttpURLConnection con = (HttpURLConnection) new URL(dest).openConnection();
                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                return reader.readLine();
}
}
//243
public class func{
	public void testQuery(){
        URL url = new URL("http://localhost:" + port + path);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDefaultUseCaches(false);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                conn.getInputStream()));
        String s = in.readLine();
        assertTrue(s.contains("~kilim"));
        assertTrue(s.contains("desc:Rolls Royce"));
        in.close();
}
}
//244
public class func{
	public void queryBing(String query){
        String urlString = "http://dev.virtualearth.net/REST/v1/Locations?query=" + URLEncoder.encode(query, "utf-8") + "&output=json&key=" + URLEncoder.encode(key, "utf-8");
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        String responseText = IOUtils.toString(connection.getInputStream(), "UTF-8");
        JSONObject responseJson = new JSONObject(responseText);
        return toLumifyGeocodeJson(responseJson);
}
}
//245
public class func{
	public void getInputStreamFromUrl(String urlStr){
    URL url = new URL(urlStr);
    HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();  
      urlConn.setConnectTimeout(5000); 
      urlConn.setReadTimeout(70000);
      InputStream inputStream = urlConn.getInputStream();
}
}
//246
public class func{
	public void readUrlAsDocument(String urlAsString,int timeout){
        URL url = new URL(urlAsString);
        HttpURLConnection hConn = (HttpURLConnection) url.openConnection();
        hConn.setReadTimeout(timeout);
        hConn.setConnectTimeout(timeout);
        return newDocumentBuilder().parse(hConn.getInputStream());
}
}
//247
public class func{
	public void testCookieEcho(){
    HttpURLConnection c = (HttpURLConnection)new URL("http://localhost:" + PORT + "/headerEcho").openConnection();
    c.setRequestProperty(HttpConstants.REQUEST_COOKIE_HEADER_NAME, cookie);
    assertEquals(c.getHeaderField(HttpConstants.RESPONSE_COOKIE_HEADER_NAME), cookie);
}
}
//248
public class func{
	public void makeConnection(String contextPath){
    URL url = new URL(contextPath);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setConnectTimeout(CONNECTION_TIMEOUT);
    conn.connect();
}
}
//249
public class func{
	public void doInBackground(View[] params){
        URL url = new URL(((EditText) params[0]).getText().toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        String header = conn.getHeaderField("Content-Disposition");
        if (header != null && header.indexOf("=") != -1) {
          return new Object[]{params[1], header.split("=")[1].replace("\"", "")};
        }
}
}
//250
public class func{
	public void sendSolrUpdateRequest(String request,String core){
        URL url = new URL("http://localhost:8983/solr/" + core + "/update");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "text/xml");
        OutputStream os = conn.getOutputStream();
}
}
//251
public class func{
	public void httpCall(){
      URL url1 = new URL(url);
      connection = (HttpURLConnection)url1.openConnection();
      System.out.println("using proxy: " + connection.usingProxy());
      if (connection != null) {
        connection.disconnect();
      }
}
}
//252
public class func{
	public void performRequest(String urlString){
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        conn.disconnect();
}
}
//253
public class func{
	public void testBlobServedWhenResponseContainsBlobKeyHeader(@ArquillianResource URL url){
        URL pageUrl = new URL(url, "serveblob?name=testblob.txt&mimeType=" + MIME_TYPE + "&contents=" + CONTENTS);
        HttpURLConnection connection = (HttpURLConnection) pageUrl.openConnection();
            String response = readFullyAndClose(connection.getInputStream());
            assertEquals(MIME_TYPE, connection.getContentType());
            assertEquals(CONTENTS, response);
            assertNull("header should have been removed from response", connection.getHeaderField("X-AppEngine-BlobKey"));
            connection.disconnect();
}
}
//254
public class func{
	public void main(String[] args){
            server = new HttpServer (new RelativeRedirect(), 1, 10, 0);
            URL url = new URL("http://localhost:"+server.getLocalPort());
            HttpURLConnection urlc = (HttpURLConnection)url.openConnection ();
            InputStream is = urlc.getInputStream ();
            is.close();
}
}
//255
public class func{
	public void checkSSLServer(){
        URL testSSLURL = new URL(getProxyCallbackURLPrefix().getProtocol(),
                getProxyCallbackURLPrefix().getHost(),getProxyCallbackURLPrefix().getPort(),"/test");
        HttpURLConnection con = (HttpURLConnection) testSSLURL.openConnection();
        con.getInputStream().close();
}
}
//256
public class func{
	public void getInputStream(){
        URL url = new URL("http://developer.usa.gov/1usagov");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        return request.getInputStream();
}
}
//257
public class func{
	public void onCreate(Bundle savedInstanceState){
      URL url = new URL("http://www.vogella.de");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      readStream(con.getInputStream());
}
}
//258
public class func{
	public void get(String url){
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    printResponse(connection.getInputStream());
}
}
//259
public class func{
	public void fetchJson(@NotNull final String url){
            c = (HttpURLConnection)new URL(url).openConnection();
            return objectMapper.readTree(c.getInputStream());
}
}
//260
public class func{
	public void doRequest(String uri){
        URL url = new URL(uri + "?foo="+reqnum);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        InputStream in = http.getInputStream();
}
}
//261
public class func{
	public void runClient(Proxy proxy,int serverPort){
            URL url = new URL(urlStr);
            HttpURLConnection uc = (HttpURLConnection) url.openConnection(proxy);
            uc.getInputStream();
}
}
//262
public class func{
	public void testSleep(){
        URL url = new URL("http", "localhost", HTTP_SERVER_PORT, "/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("X-Sleep", "1000");
        conn.connect();
}
}
//263
public class func{
	public void getRequest(){
    URL url = new URL("http://localhost:" + RANDOM_SERVER_PORT + "/");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setDoInput(true);
    String result = Util.readToString(connection.getInputStream());
    assertEquals("hello world", result);
}
}
//264
public class func{
	public void openConnection(String url){
        URL u = new URL(url);
        urlConnection = (HttpURLConnection)u.openConnection();
        urlConnection.setRequestProperty("User-Agent", userAgent);
        urlConnection.setUseCaches(true);
}
}
//265
public class func{
	public void openConnection(String url){
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT_MILLIS);
    connection.setReadTimeout(DEFAULT_READ_TIMEOUT_MILLIS);
    connection.setDoInput(true);
}
}
//266
public class func{
	public void serializeResource(String resourceURL){
    URL url = new URL(resourceURL);
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.addRequestProperty("Cache-Control", "max-age=0");
    mediaContainer = serializer.read(MediaContainer.class,
        con.getInputStream(), false);
}
}
//267
public class func{
	public void testPathParam(){
    WebElement trigger = driver.findElement(By.tagName("body"));
    URL url = new URL(trigger.getText());
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.connect();
}
}
//268
public class func{
	public void testHeaderEcho(){
    HttpURLConnection c = (HttpURLConnection)new URL("http://localhost:" + PORT + "/headerEcho").openConnection();
    c.setRequestProperty("Header2", "bar");
    assertEquals(c.getHeaderField("header1"), "foo");
    assertEquals(c.getHeaderField("header2"), "bar");
}
}
//269
public class func{
	public void openUrlConnection(String url){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setUseCaches(false);
        conn.setChunkedStreamingMode(0);
        conn.setRequestProperty("connection", "close");    // Disable keep-alive because of issues with it
}
}
//270
public class func{
	public void getConnection(String path){
        logger.log(Level.INFO, "sending request to {0}", path);
        URL url = new URL("http", "localhost", PORT, path);
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
        urlConn.connect();
}
}
//271
public class func{
	public void openConnectionInternal(){
        String params = getParameterString();
        if (params != null && params.length() > 0) {
            url = url + "?" + params;
        }
        URL getUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) getUrl.openConnection();
}
}
//272
public class func{
	public void openConnection(Uri path){
    HttpURLConnection connection = (HttpURLConnection) new URL(path.toString()).openConnection();
    connection.setConnectTimeout(Utils.DEFAULT_CONNECT_TIMEOUT);
    connection.setReadTimeout(Utils.DEFAULT_READ_TIMEOUT);
}
}
//273
public class func{
	public void createConnection(String url,Object extra){
    String encodedUrl = Uri.encode(url, ALLOWED_URI_CHARS);
    HttpURLConnection conn = (HttpURLConnection) new URL(encodedUrl).openConnection();
    conn.setConnectTimeout(connectTimeout);
    conn.setReadTimeout(readTimeout);
}
}
//274
public class func{
	public void loadDataFromNetwork(){
            final HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
            return processStream(httpURLConnection.getContentLength(), httpURLConnection.getInputStream());
}
}
//275
public class func{
	public void testApp(){
    HttpURLConnection conn = (HttpURLConnection) new URL(url)
        .openConnection();
    InputStream in = conn.getInputStream();
    BufferedImage src = ImageIO.read(in);
    in.close();
}
}
//276
public class func{
	public void doClientSide(){
        URL url = new URL("https://"+host+":"+serverPort+"/index.html");
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection();
        InputStream is = urlc.getInputStream();
        is.close();
}
}
//277
public class func{
	public void main(String[] args){
            URL u = new URL ("http://127.0.0.1:"+port+"/foo\nbar");
            HttpURLConnection urlc = (HttpURLConnection)u.openConnection ();
            InputStream is = urlc.getInputStream();
}
}
//278
public class func{
	public void makeRemoteRequest(String baseURL,String relativePath){
      URL url = new URL(baseURL + "/" + relativePath);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      return readResponse(connection.getInputStream());
}
}
//279
public class func{
	public void doDownload(String from){
        URL url = new URL(from);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            InputStream in = conn.getInputStream();
}
}
//280
public class func{
	public void getInputStream(){
        URL url = new URL("http://stream.meetup.com/2/rsvps");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        return request.getInputStream();
}
}
//281
public class func{
	public void makeConnection(String resource){
    HttpURLConnection conn = (HttpURLConnection)(new URL(resource).openConnection());
        conn.setDoOutput(true);
}
}
//282
public class func{
	public void connect(String url,String sessionId){
        HttpURLConnection huc = (HttpURLConnection)new URL(url).openConnection();
        huc.setInstanceFollowRedirects(false);
        huc.setDoOutput(false);
}
}
//283
public class func{
	public void Encode(){
        String url = "http://localhost:" + Integer.toString(ss.getLocalPort()) +
        HttpURLConnection uc =  (HttpURLConnection)new URL(url).openConnection();
        uc.connect();
}
}
//284
public class func{
	public void createConnection(String alias,int port){
        URL url = new URL("http", "localhost", port, alias);
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
        urlConn.setReadTimeout(10 * 1000);
}
}
//285
public class func{
	public void ConnBuilder(Credentials credentials,String container,String object){
                if (object != null) {
                    url = url + "/" + object;
                }
                con = (HttpURLConnection) new URL(url).openConnection();
}
}
//286
public class func{
	public void ConnBuilder(Credentials credentials,String container,String object){
                    if (object != null) {
                        url = url + "/" + object;
                    }
                    con = (HttpURLConnection) new URL(url).openConnection();
                    con.addRequestProperty(ACCEPT_HEADER, "*/*");
}
}
//287
public class func{
	public void createConnection(String uri){
        URL url = new URL(uri);
            (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Connection", "close");
}
}
//288
public class func{
	public void executeGet(String urlString,JSONHandler handler,boolean authenticated){
        LOGD(TAG, "Requesting URL: " + urlString);
        URL url = new URL(urlString);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestProperty("User-Agent", mUserAgent);
}
}
//289
public class func{
	public void open(String base,FormValues fv){
        if (fv != null) {
            String url = base + "?" + fv.queryString();
            conn = (HttpURLConnection) new URL(url).openConnection();
        } else {
            conn = (HttpURLConnection) new URL(base).openConnection();
        }
}
}
//290
public class func{
	public void openUrlConnection(String url){
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setConnectTimeout(connectTimeout);
        connection.setReadTimeout(readTimeout);
}
}
//291
public class func{
	public void createConnection(String url){
    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
    connection.setConnectTimeout(3000);
    connection.setReadTimeout(3000);
}
}
//292
public class func{
	public void postRequest(String address){
        URL url = new URL(address);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
}
}
//293
public class func{
	public void check(final String containerId){
        final URL url = new URL("http", dockerHost.address(), port, healthCheck.getPath());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(CONNECT_TIMEOUT_MILLIS);
}
}
//294
public class func{
	public void setupConnection(String url,String authHeaderValue){
        logger.debug("Intitiating connection to URL: " + url);
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
}
}
//295
public class func{
	public void ServiceConnectionSE(String url){
        connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setDoInput(true);
}
}
//296
public class func{
	public void HttpRequest(final CharSequence url,final String method){
      connection = (HttpURLConnection) new URL(url.toString())
          .openConnection();
      connection.setRequestMethod(method);
}
}
//297
public class func{
	public void createHttpConnection(Uri uri){
        return (HttpURLConnection)new URL(uri.toString()).openConnection();
}
}
//298
public class func{
	public void uploadDeviceConfig(UploadDeviceConfigRequest request,String deviceConfigToken){
            connection = (HttpURLConnection) new URL(UPLOAD_DEVICE_CONFIG_URL).openConnection();
}
}
//299
public class func{
	public void Net(String urlStr,boolean useCache,Context ctxt){
        URL url = new URL(urlStr);
        mUrlConnection = (HttpURLConnection) url.openConnection();
        mUrlConnection.setRequestProperty("User-Agent", USERAGENT);
        mUrlConnection.setUseCaches(useCache);
}
}
//300
public class func{
	public void getConnection(String urlString){
    URL url = new URL(urlString);
    return (HttpURLConnection) url.openConnection();
}
}
//301
public class func{
	public void pingLink(String Url){
      URL url = new URL(Url);
      HttpURLConnection con = (HttpURLConnection)(url.openConnection());
}
}
//302
public class func{
	public void updateMirrorsYMLCache(){
        URL url = new URL("http://get.spout.org/mirrors.yml");
        HttpURLConnection con = (HttpURLConnection) (url.openConnection());
}
}
//303
public class func{
	public void ProxyableConnection(Proxy proxy,String repo){
        conn = (HttpURLConnection) new URL(repo).openConnection(proxy);
}
}
//304
public class func{
	public void testServerOk(){
        URL server = new URL(SERVER_URL);
        HttpURLConnection conn = (HttpURLConnection) server.openConnection();
}
}
//305
public class func{
	public void createConnection(){
                this.connection = (HttpURLConnection) new URL(completeUrl).openConnection(proxy);
}
}
//306
public class func{
	public void getConnection(String spec){
    return (HttpURLConnection) new URL(spec).openConnection();
}
}
//307
public class func{
	public void connectTo(String endpoint){
        URL url = new URL(endpoint);
        return (HttpURLConnection) url.openConnection();
}
}
//308
public class func{
	public void test4(String u){
        URL url = new URL (u);
        HttpURLConnection urlc = (HttpURLConnection)url.openConnection ();
}
}
//309
public class func{
	public void openConnection(String url){
        return (HttpURLConnection) new URL(url).openConnection();
}
}
//310
public class func{
	public void getConnection(String url){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
}
}
//311
public class func{
	public void connnectTo(String path){
            URL test = new URL(url, path);
            return (HttpURLConnection) test.openConnection();
}
}
//312
public class func{
	public void getRawHTTPConnection(String urlString){
      URL url = new URL(urlString);      
      return (HttpURLConnection)url.openConnection();
}
}
//313
public class func{
	public void Request(String url,int connectTimeout,int readTimeout){
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(connectTimeout);
            connection.setReadTimeout(readTimeout);
}
}
//314
public class func{
	public void createConnection(){
    return (HttpURLConnection) new URL(url).openConnection();
}
}
//315
public class func{
	public void buildConnection(RequestMethod requestMethod,String urlString){
        URL url = new URL(configuration.getBaseURL() + urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
}
}
//316
public class func{
	public void get(String url,Map<String,String> headers,boolean allowRedirect){
        HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
        setCommonProperties(headers, urlConnection, allowRedirect);
            in = readInputStream(urlConnection);
}
}
//317
public class func{
	public void testLongHeader(){
    URL url = new URL(baseUrl, "/longheader");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
}
}
//318
public class func{
	public void HttpTestClient(String host,int port,byte[] object){
            connection = (HttpURLConnection)new URL(url).openConnection();
}
}
//319
public class func{
	public void method1(){
    String imei = TelephonyManager.getDeviceId();
      URL url = new URL(imei);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
}
}
//320
public class func{
	public void openConnection(String url){
      return (HttpURLConnection) new URL(url).openConnection();
}
}
//321
public class func{
	public void testMultiValuedHeaderEcho(){
    HttpURLConnection c = (HttpURLConnection)new URL("http://localhost:" + PORT + "/headerEcho").openConnection();
}
}
//322
public class func{
	public void setupHTTPConnection(String url){
    HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection(Proxy.NO_PROXY);
}
}
//323
public class func{
	public void pingUrl(String Url){
      URL url = new URL(Url);
      HttpURLConnection con = (HttpURLConnection)(url.openConnection());
}
}
//324
public class func{
	public void request_id_header_01(){
        String qs = Convert.encWWWForm("ASK{}") ;
        URL u = new URL(serviceQuery+"?query="+qs);
        HttpURLConnection conn = (HttpURLConnection) u.openConnection();
        Assert.assertTrue(conn.getHeaderField("Fuseki-Request-ID") != null);
}
}
//325
public class func{
	public void createURLConnection(String url,boolean dev){
        HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
        connection.setInstanceFollowRedirects(false);
}
}
//326
public class func{
	public void syndFeed(){
        URL feedUrl = new URL(_url);
        HttpURLConnection feedConn = (HttpURLConnection) feedUrl.openConnection();
        feedConn.addRequestProperty("User-Agent", "Mozilla/5.001 (windows; U; NT4.0; en-us) Gecko/25250101");
}
}
//327
public class func{
	public void call(Server server){
                    url = new URL("http://" + server.getHost() + ":" + server.getPort() + path);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    return Observable.just(conn.getResponseMessage());
                    return Observable.error(e);
}
}
//328
public class func{
	public void testOpenSslConnection_http(){
        final URL httpUrl = new URL("http://example.com");
        final HttpURLConnection connection = (HttpURLConnection) httpUrl.openConnection();
        client.openSslConnection(connection);
        assertFalse(connection instanceof HttpsURLConnection);
}
}
//329
public class func{
	public void ObaDefaultConnection(Uri uri){
            Log.d(TAG, uri.toString());
        URL url = new URL(uri.toString());
        mConnection = (HttpURLConnection) url.openConnection();
        mConnection.setReadTimeout(30 * 1000);
}
}
//330
public class func{
	public void openConnection(String uri){
                String cleanUri = uri.substring(0, uri.indexOf(";deviceside=true"));
                URL url = new URL(cleanUri);
                return new HttpConnectionWrapper((HttpURLConnection) url.openConnection());
}
}
//331
public class func{
	public void isInternetReachable(){
            URL url = new URL("http://checkstyle.sourceforge.net/");
            HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
            Object objData = urlConnect.getContent();
}
}
//332
public class func{
	public void test(){
        URL url = new URL("http://www.naver.com");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.getHeaderFields();
}
}
//333
public class func{
	public void deleteFile(long fileId,String fileType){
            HttpURLConnection conn = (HttpURLConnection) new URL(deleteUrl).openConnection();
}
}
//334
public class func{
	public void getConnection(String url){
        URL u = new URL(url);
        return (HttpURLConnection) u.openConnection();
}
}
//335
public class func{
	public void createConnection(){
      connection = (HttpURLConnection) new URL(completeUrl).openConnection();
}
}
//336
public class func{
	public void create(URL otherUrl){
        return (HttpURLConnection) new URL(url).openConnection();
}
}
//337
public class func{
	public void createConnection(String uri){
    URL url = new URL(createUri(uri));
    return (HttpURLConnection) url.openConnection();
}
}
//338
public class func{
	public void open(MethodType methodType,String url,Charset charset){
        HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
}
}
//339
public class func{
	public void ProxyableConnection(Proxy proxy,String repo){
        conn = (HttpURLConnection) new URL(repo).openConnection();
}
}
//340
public class func{
	public void getConnection(final String url){
        final URL u = new URL(url);
        return (HttpURLConnection) u.openConnection();
}
}
//341
public class func{
	public void getHttpURLConnection(String strUrl){
    URL url = new URL(strUrl);
    HttpURLConnection httpURLConnection = (HttpURLConnection) url
        .openConnection();
}
}
//342
public class func{
	public void createConnection(){
                this.connection = (HttpURLConnection) new URL(completeUrl).openConnection();
}
}
//343
public class func{
	public void connect(){
    URL url = new URL(address);
    conn = (HttpURLConnection) url.openConnection();
    conn.setConnectTimeout(CONNECT_TIMEOUT);
    conn.setReadTimeout(READ_TIMEOUT);
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Accept", "*/*");
}
}
//344
public class func{
	public void getRawHTTPConnection(String urlString){
        URL url = new URL(urlString);
        return (HttpURLConnection)url.openConnection();
}
}
//345
public class func{
	public void getConnection(URI uri){
        String s = uri.toString();
        LOGGER.log(Level.INFO, s);
        URL url = new URL(s);
        return (HttpURLConnection) url.openConnection();
}
}
//346
public class func{
	public void getGDataUrlConnection(String urlString){
    URL url = new URL(urlString);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
}
}
//347
public class func{
	public void AndroidHttpConnection(final String name,final int mode,final boolean timeouts){
      final URL url = new URL(name);
      connection = (HttpURLConnection) url.openConnection();
}
}
//348
public class func{
	public void openConnection(String urlString){
        URL url = new URL(urlString);
        HttpURLConnection uc = (HttpURLConnection) url.openConnection();
}
}
//349
public class func{
	public void connect(String url){
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
}
}
//350
public class func{
	public void httpGet(final String httpurl,final Map<String,String>... requestProperties){
        HttpURLConnection connection = (HttpURLConnection) new URL(httpurl).openConnection();
}
}
//351
public class func{
	public void getConnection(String url){
    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
}
}
//352
public class func{
	public void createConnection(final String uri,final String contentType,final String accept){
        final URL url = new URL(safeUri(uri));
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
}
}
//353
public class func{
	public void simplePostRequest(String url,String postType,byte[] data){
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
      prepareConnection(connection, postType);
      writeData(connection, data, false);
            return parseResponseWrapper(connection);
}
}
//354
public class func{
	public void testLongHeader(){
    URL url = new URL(baseUrl, "/longheader");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    testLongHeader(conn);
}
}
//355
public class func{
	public void testMultipleCookiesEcho(){
    HttpURLConnection c = (HttpURLConnection)new URL("http://localhost:" + PORT + "/headerEcho").openConnection();
}
}
//356
public class func{
	public void createConnection(final String method,final String testName){
        URL testURL = new URL(createTestUri(testName));
        HttpURLConnection conn = (HttpURLConnection) testURL.openConnection();
}
}
//357
public class func{
	public void getUrlConnection(final String url){
        return (HttpURLConnection) new URL( url ).openConnection();
}
}
//358
public class func{
	public void havingEmptyQueryString(){
        final URL url = new URL("http://localhost:" + port() + "/?");
        final HttpURLConnection c = (HttpURLConnection) url.openConnection();
}
}
//359
public class func{
	public void open(String base,FormValues fv){
            conn = (HttpURLConnection) new URL(base).openConnection();
}
}
//360
public class func{
	public void getStringFromUrl(String url,int connectTimeout,int readTimeout){
    URL urlObject = new URL(url);
    HttpURLConnection urlConn = (HttpURLConnection)urlObject.openConnection();
}
}
//361
public class func{
	public void call(){
                params.put("user", getTestUser());
                URL url = createURL("", params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("content-type", RestConstants.XML_CONTENT_TYPE);
                conn.setDoOutput(true);
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                JSONObject obj = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertEquals("Valid workflow-app", obj.get(JsonTags.VALIDATE));
}
}
//362
public class func{
	public void deleteFile(ActiveMQBlobMessage message){
        URL url = createMessageURL(message);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.connect();
        connection.disconnect();
        if (!isSuccessfulCode(connection.getResponseCode())) {
            throw new IOException("DELETE was not successful: " + connection.getResponseCode() + " "
                                  + connection.getResponseMessage());
        }
}
}
//363
public class func{
	public void call(){
                Map<String, String> params = new HashMap<String, String>();
                URL url = createURL("", params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONArray array = (JSONArray) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertEquals(2, array.size());
                assertEquals(OozieClient.WS_PROTOCOL_VERSION, array.get(1));
}
}
//364
public class func{
	public void call(){
                final String id = bundleJobBean.getId();
                URL url = createURL(id, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject obj = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertEquals(id, obj.get("bundleJobId"));
}
}
//365
public class func{
	public void _requestToServer(String bulkRequest){
        Map<String, String> params = new HashMap<String, String>();
        params.put(RestConstants.LEN_PARAM, "5");
        URL url = createURL("", params);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
        JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
        JSONArray array = (JSONArray) json.get(JsonTags.BULK_RESPONSES);
}
}
//366
public class func{
	public void call(){
                Map<String, String> map = new HashMap<String, String>();
                map.put(RestConstants.SHARE_LIB_REQUEST_KEY, "pig");
                URL url = createURL(RestConstants.ADMIN_LIST_SHARELIB, map);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertEquals(null, json.get(JsonTags.SHARELIB_LIB));
}
}
//367
public class func{
	public void call(){
                URL url = createURL(RestConstants.ADMIN_OS_ENV_RESOURCE, Collections.EMPTY_MAP);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
}
}
//368
public class func{
	public void call(){
                URL url = createURL(RestConstants.ADMIN_JAVA_SYS_PROPS_RESOURCE, Collections.EMPTY_MAP);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertTrue(json.containsKey("java.version"));
}
}
//369
public class func{
	public void call(){
                URL url = createURL(RestConstants.ADMIN_TIME_ZONES_RESOURCE, Collections.EMPTY_MAP);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                assertTrue(json.containsKey(JsonTags.AVAILABLE_TIME_ZONES));
                JSONArray array = (JSONArray) json.get(JsonTags.AVAILABLE_TIME_ZONES);
                assertFalse(array.isEmpty());
}
}
//370
public class func{
	public void call(){
                URL url = createURL(RestConstants.ADMIN_BUILD_VERSION_RESOURCE, Collections.EMPTY_MAP);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
                JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
                             json.get(JsonTags.BUILD_VERSION));
}
}
//371
public class func{
	public void call(){
                final String id = bundleJobBean.getId();
                URL url = createURL(id, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
                String ct = conn.getHeaderField("content-type");
                assertTrue(ct.startsWith(RestConstants.XML_CONTENT_TYPE));
                String response = IOUtils.getReaderAsString(new InputStreamReader(conn.getInputStream()), -1);
                assertTrue(response!= null && response.length() > 0);
}
}
//372
public class func{
	public void getSLAJSONResponse(Map<String,String> queryParams){
        URL url = createURL("", queryParams);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
        assertTrue(conn.getHeaderField("content-type").startsWith(RestConstants.JSON_CONTENT_TYPE));
        JSONObject json = (JSONObject) JSONValue.parse(new InputStreamReader(conn.getInputStream()));
        JSONArray array = (JSONArray) json.get(JsonTags.SLA_SUMMARY_LIST);
}
}
//373
public class func{
	public void checkWsdl(URL wsdlURL,String hostOrPort){
        HttpURLConnection connection = (HttpURLConnection) wsdlURL.openConnection();
            connection.connect();
            Assert.assertEquals(200, connection.getResponseCode());
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line = in.readLine()) != null) {
                if (line.contains("address location")) {
                    Assert.assertTrue(line.contains(hostOrPort));
                    return;
                }
            }
}
}
//374
public class func{
	public void delete(String mapName,String key){
            HttpURLConnection urlConnection = (HttpURLConnection) (new URL(url)).openConnection();
            urlConnection.setRequestMethod("DELETE");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setUseCaches(false);
            urlConnection.setAllowUserInteraction(false);
            urlConnection.setRequestProperty("Content-type", "text/xml; charset=" + "UTF-8");
            return urlConnection.getResponseCode();
}
}
//375
public class func{
	public void deleteAll(String mapName){
            HttpURLConnection urlConnection = (HttpURLConnection) (new URL(url)).openConnection();
            urlConnection.setRequestMethod("DELETE");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            urlConnection.setUseCaches(false);
            urlConnection.setAllowUserInteraction(false);
            urlConnection.setRequestProperty("Content-type", "text/xml; charset=" + "UTF-8");
            return urlConnection.getResponseCode();
}
}
//376
public class func{
	public void checkWsdl(URL wsdlURL,String host){
        HttpURLConnection connection = (HttpURLConnection) wsdlURL.openConnection();
            connection.connect();
            Assert.assertEquals(200, connection.getResponseCode());
      BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      while ((line = in.readLine()) != null) {
        if (line.contains("address location")) {
          Assert.assertTrue(line.contains(host));
          return;
        }
      }
}
}
//377
public class func{
	public void testInjection(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setRequestProperty("Accept-Language", "fr-FR");
    conn.connect();
    assertEquals(200, conn.getResponseCode());
    String result = Tools.read(conn.getInputStream());
    assertTrue("Was expecting <" + result + "> to contain def", result.contains("def"));
}
}
//378
public class func{
	public void downloadUrl(final URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(NET_READ_TIMEOUT_MILLIS /* milliseconds */);
        conn.setConnectTimeout(NET_CONNECT_TIMEOUT_MILLIS /* milliseconds */);
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        conn.connect();
        return conn.getInputStream();
}
}
//379
public class func{
	public void call(){
                params.put("user", getTestUser());
                URL url = createURL("", params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("content-type", RestConstants.XML_CONTENT_TYPE);
                conn.setDoOutput(true);
                assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
                String message = conn.getHeaderField(RestConstants.OOZIE_ERROR_MESSAGE);
                assertEquals("E0701", error);
}
}
//380
public class func{
	public void getInputStreamFromUrl(URL url){
    logger.debug("Connecting to URL " + url.toString());
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    connection.addRequestProperty("User-Agent", USER_AGENT);
    connection.connect();
    return new Buffe
}
}
//381
public class func{
	public void testHelloWorld(){
        URL getUrl = UriBuilder.fromUri(getBaseUri()).path(App.ROOT_PATH).build().toURL();
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "text/plain");
            assertEquals(HttpURLConnection.HTTP_OK, connection.getResponseCode());
            connection.disconnect();
}
}
//382
public class func{
	public void call(){
                Map<String, String> params = new HashMap<String, String>();
                params.put(RestConstants.ACTION_PARAM, RestConstants.JOB_ACTION_START);
                URL url = createURL(MockCoordinatorEngineService.JOB_ID + 1, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("PUT");
                conn.setRequestProperty("content-type", RestConstants.XML_CONTENT_TYPE);
                conn.setDoOutput(true);
                assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
                assertEquals(null, MockCoordinatorEngineService.did);
}
}
//383
public class func{
	public void verifyHttpResponseCode(int expectedCode,URL url){
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    connection.connect();
    assertEquals(expectedCode, connection.getResponseCode());
}
}
//384
public class func{
	public void exists(Path path){
    URL url = makeUrl( path );
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod( "HEAD" );
    connection.connect();
    debugConnection( connection );
    return connection.getResponseCode() == 200;
}
}
//385
public class func{
	public void open(Path path,int i){
    URL url = makeUrl( path );
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod( "GET" );
    connection.connect();
    debugConnection( connection );
    return new FSDataInputStream( new FSDigestInputStream( connection.getInputStream(), getMD5SumFor( getConf(), path ) ) );
}
}
//386
public class func{
	public void getRemoteFileSize(final URL downloadUrl){
        final URLConnection urlConn = downloadUrl.openConnection();
        final HttpURLConnection httpConn = (HttpURLConnection)urlConn;
        httpConn.setRequestMethod("HEAD");
        if (httpConn.getResponseCode() == 200) {
            return urlConn.getContentLengthLong();
        } else {
            throw new IOException("Url not reachable : " + downloadUrl.toString());
        }
}
}
//387
public class func{
	public void verifyURLAvailable(URL url){
    if (null == url)
      return false;
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("HEAD");
      return (200 == connection.getResponseCode());
}
}
//388
public class func{
	public void openConnection(URL url){
            if (logger.isFinestEnabled()) {
                logger.finest("Opening collector connection:" + url);
            }
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setConnectTimeout(CONNECTION_TIMEOUT_MILLIS);
            connection.setReadTimeout(CONNECTION_TIMEOUT_MILLIS);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestMethod("POST");
}
}
//389
public class func{
	public void doesUrlExistAndIsImage(URL url){
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("HEAD");
            boolean result = (con.getResponseCode() == HttpURLConnection.HTTP_OK)
                    && con.getContentType().contains("image");
            con.disconnect();
}
}
//390
public class func{
	public void createGETRequestConnection(URL website){
        HttpURLConnection connection = (HttpURLConnection) website.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        connection.connect();
}
}
//391
public class func{
	public void call(){
                Map<String, String> params = new HashMap<String, String>();
                params.put(RestConstants.JOB_SHOW_PARAM, RestConstants.JOB_SHOW_GRAPH);
                URL url = createURL(MockDagEngineService.JOB_ID + 1 + MockDagEngineService.JOB_ID_END, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
                assertEquals(ErrorCode.E0306.name(), conn.getHeaderField(RestConstants.OOZIE_ERROR_CODE));
}
}
//392
public class func{
	public void testGetResponseCodeNoResponseBody(){
        server.enqueue(new MockResponse()
                .addHeader("abc: def"));
        server.play();
        URL url = server.getUrl("/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoInput(false);
        assertEquals("def", conn.getHeaderField("abc"));
        assertEquals(200, conn.getResponseCode());
            conn.getInputStream();
}
}
//393
public class func{
	public void isUrlValid(URL url){
      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
      connection.setRequestMethod("HEAD");
      int responseCode = connection.getResponseCode();
}
}
//394
public class func{
	public void call(){
                final String id = bundleJobBean.getId();
                URL url = createURL(id, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("PUT");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
}
}
//395
public class func{
	public void existsHttpURL(URL url){
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.setRequestMethod("HEAD");
      return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
}
}
//396
public class func{
	public void getHttpCode(URL resource){
    HttpURLConnection con = (HttpURLConnection) resource.openConnection();
    con.setRequestMethod("HEAD");
    return con.getResponseCode();
}
}
//397
public class func{
	public void call(){
                final String id = bundleJobBean.getId();
                URL url = createURL(id, params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                assertEquals(HttpServletResponse.SC_OK, conn.getResponseCode());
}
}
//398
public class func{
	public void exists(){
            HttpURLConnection con = (HttpURLConnection) URL.openConnection();
            con.setRequestMethod("HEAD");
            return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
}
}
//399
public class func{
	public void getFileSize(URL url){
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            conn.getInputStream();
            return conn.getContentLength();
}
}
//400
public class func{
	public void openPostResponseConnection(){
            if (logger.isFinestEnabled()) {
                logger.finest("Opening sendResponse connection:" + url);
            }
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(CONNECTION_TIMEOUT_MILLIS);
            connection.setReadTimeout(CONNECTION_TIMEOUT_MILLIS);
}
}
//401
public class func{
	public void getUrlConnection(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.connect();
}
}
//402
public class func{
	public void createConnection(URL url,int timeout){
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setDoInput(true);
    connection.setDoOutput(true);
    connection.setRequestMethod("POST");
    connection.setConnectTimeout(timeout);
    connection.setReadTimeout(timeout);
    connection.setRequestProperty("User-Agent", "Die Fledermaus/11");
}
}
//403
public class func{
	public void testQueryRedirect(){
        URL url = new URI("http",null,"localhost",HTTP_SERVER_PORT,"/path","redirect=/a/b/c/d?q",null).toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setInstanceFollowRedirects(false);
        conn.connect();
        assertEquals(302, conn.getResponseCode());
        assertEquals("Temporary Redirect", conn.getResponseMessage());
        assertEquals("/a/b/c/d?q",conn.getHeaderField("Location"));
}
}
//404
public class func{
	public void openConnection(String path,String query){
    query = addDelegationTokenParam(query);
    final URL url = getNamenodeURL(path, query);
    final HttpURLConnection connection = (HttpURLConnection)url.openConnection();
      connection.setRequestMethod("GET");
      connection.connect();
      throwIOExceptionFromConnection(connection, ioe);
}
}
//405
public class func{
	public void createPostConnection(String url){
    conn = (HttpURLConnection) (new URL(url)).openConnection();
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setRequestMethod(LumongoConstants.POST);
    conn.connect();
}
}
//406
public class func{
	public void doGet(URL url){
      HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
      if (HttpURLConnection.HTTP_OK != urlc.getResponseCode()) {
        fatal("Solr returned an error #" + urlc.getResponseCode() + 
            " " + urlc.getResponseMessage());
      }
      fatal("An error occured posting data to "+url+". Please check that Solr is running.");
}
}
//407
public class func{
	public void getHttpURLConnection(URL url,int timeout){
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(40000);
                httpURLConnection.setReadTimeout(timeout);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setRequestMethod("POST");
}
}
//408
public class func{
	public void testPathParam(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.connect();
    assertEquals(302, conn.getResponseCode());
    Map<String, String> headers = Tools.responseHeaders(conn);
    String redirect = headers.get("Location");
    driver.get(redirect);
}
}
//409
public class func{
	public void testPathParam(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.setInstanceFollowRedirects(false);
    conn.connect();
    assertEquals(200, conn.getResponseCode());
    assertEquals("bar_value", bar);
}
}
//410
public class func{
	public void getHttpURLConnection(URL requestUrl){
      conn = (HttpURLConnection)requestUrl.openConnection();
      conn.setRequestMethod("POST");
      conn.setRequestProperty("Content-Type", "application/json");
      conn.setUseCaches (false);
      conn.setDoOutput(true);
}
}
//411
public class func{
	public void testQueryStatus(){
        URL url = new URI("http",null,"localhost",HTTP_SERVER_PORT,"/path","status=303 See Other",null).toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.connect();
        assertEquals(303, conn.getResponseCode());
        assertEquals("See Other", conn.getResponseMessage());
}
}
//412
public class func{
	public void createConnection(URL url,String method){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(method);
        if (method.equals("POST") || method.equals("PUT")) {
            conn.setDoOutput(true);
        }
}
}
//413
public class func{
	public void testRender(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    conn.connect();
    assertEquals(404, conn.getResponseCode());
    url = applicationURL("/foo");
    driver.get(url.toString());
}
}
//414
public class func{
	public void POST(Object json,URL url){
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setDoOutput(true);
    connection.setInstanceFollowRedirects(false);
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Content-Type", "application/json");
    OutputStream output = connection.getOutputStream();
    m_jsonMapper.writeValue(output, json);
}
}
//415
public class func{
	public void isNotFound(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        return connection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND;
}
}
//416
public class func{
	public void checkWsdl(URL wsdlURL){
        HttpURLConnection connection = (HttpURLConnection) wsdlURL.openConnection();
            connection.connect();
            Assert.assertEquals(proxyUsed.toString(), HttpServletResponse.SC_OK, connection.getResponseCode());
}
}
//417
public class func{
	public void getTotalBytes(URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("HEAD");
        conn.setRequestProperty("accept",  "*/*");
}
}
//418
public class func{
	public void sendRequest(String method,URL url,String cookie,boolean followRedirects){
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod(method);
        conn.setDoInput(true);
        conn.setInstanceFollowRedirects(followRedirects);
}
}
//419
public class func{
	public void httpSend(URL url){
  (HttpURLConnection) url.openConnection();
conn.setRequestMethod("POST");
conn.setDoOutput(true);
}
}
//420
public class func{
	public void downloadTempLocally(URL url){
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            if (connection.getResponseCode() == 200) {
                java.io.File temp = java.io.File.createTempFile("urlToVfs", "tmp");
                FileOutputStream out = new FileOutputStream(temp);
                DataInputStream in = new DataInputStream(connection.getInputStream());

                int len; byte ch[] = new byte[1024];
                while ((len = in.read(ch)) != -1) {out.write(ch, 0, len);}

                connection.disconnect();
                return temp;
            }
}
}
//421
public class func{
	public void getGzipResult(final String url){
        final HttpURLConnection conn = (HttpURLConnection) (new URL(url)).openConnection();
        conn.setRequestProperty("Accept-Encoding", "gzip,deflate");
        conn.setDoInput(true);
        InputStream in = conn.getInputStream();
        Assert.assertTrue(conn.getContentEncoding().contains("gzip"));
        in = new GZIPInputStream(in);
        String result = read(in);
        in.close();
}
}
//422
public class func{
	public void connectToPath(final String path){
    final URL url = url(path);
    final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
}
}
//423
public class func{
	public void assertServletReturnsResponseCode(int responseCode,URL pageUrl){
        HttpURLConnection connection = (HttpURLConnection) pageUrl.openConnection();
            assertEquals(responseCode, connection.getResponseCode());
            connection.disconnect();
}
}
//424
public class func{
	public void openConnection(final URL url){
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
}
}
//425
public class func{
	public void pushData(URL target,String data){
    HttpURLConnection c = (HttpURLConnection) target.openConnection();
    c.setDoOutput(true);
    c.setRequestMethod("PUT");
    c.addRequestProperty("Content-type", "application/json");
    OutputStreamWriter wr = new OutputStreamWriter(c.getOutputStream());
    wr.write(data);
    wr.flush();
}
}
//426
public class func{
	public void test(URL initialURL){
    HttpURLConnection conn = (HttpURLConnection)initialURL.openConnection();
    conn.addRequestProperty("Accept-Language", "fr-FR");
    assertEquals(200, conn.getResponseCode());
    assertEquals(Locale.FRANCE, locale);
}
}
//427
public class func{
	public void assertResponseCode(int expected,URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            assertEquals(expected, conn.getResponseCode());
            conn.disconnect();
}
}
//428
public class func{
	public void load(URL url){
            HttpURLConnection c = (HttpURLConnection) url.openConnection();
            c.setConnectTimeout(2000);
            c.connect();
            String headerField = c.getHeaderField(0);
            return headerField.endsWith("200 OK");
}
}
//429
public class func{
	public void performGetRequest(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Referer", REFERRER);
            return readFullyAndClose(connection.getInputStream()).trim();
}
}
//430
public class func{
	public void testPathParam(){
    String pass = driver.findElement(By.tagName("body")).getText();
    assertEquals("juu", pass);
    url = applicationURL("/foo/bar");
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(200, conn.getResponseCode());
}
}
//431
public class func{
	public void testWith(String expected,Charset charset){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(200, conn.getResponseCode());
    Map<String, String> headers = Tools.responseHeaders(conn);
    String contentType = headers.get("Content-Type");
    assertNotNull(contentType);
}
}
//432
public class func{
	public void getNotificationsJsonData(){
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(8000);
            return connection.getInputStream();
}
}
//433
public class func{
	public void testStatus(){
    URL url = applicationURL("/status");
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(200, conn.getResponseCode());
    Map<String, String> headers = Tools.responseHeaders(conn);
    assertEquals("Juzu/1.0.0", headers.get("X-Powered-By"));
}
}
//434
public class func{
	public void call(){
                Map<String, String> params = new HashMap<String, String>();
                params.put(RestConstants.LEN_PARAM, "5");
                URL url = createURL("", params);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
}
}
//435
public class func{
	public void testPathParam(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
    assertEquals(500, conn.getResponseCode());
}
}
//436
public class func{
	public void run(){
        final URL url = mockWebServer.getUrl(path);
          conn = (HttpURLConnection) url.openConnection();
          responseCode.set(conn.getResponseCode()); // Force the connection to hit the "server".
}
}
//437
public class func{
	public void simpleDispatch(){
    mockWebServer.setDispatcher(dispatcher);
    final URL url = mockWebServer.getUrl("/");
    final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.getResponseCode(); // Force the connection to hit the "server".
}
}
//438
public class func{
	public void urlGetBytes(URL url){
    URLConnection conn = url.openConnection();
    HttpURLConnection hc = (HttpURLConnection)conn;
    assertEquals(HttpURLConnection.HTTP_OK, hc.getResponseCode());
}
}
//439
public class func{
	public void testOriginServerSends407(){
        server.enqueue(new MockResponse().setResponseCode(407));
        server.play();
        URL url = server.getUrl("/");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.getResponseCode();
}
}
//440
public class func{
	public void openConnection(URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestProperty(HDR_X_FORWARDED_SSL, "on");
        conn.connect();
}
}
//441
public class func{
	public void getInputStream(String path,List<Parameter> parameters){
            logger.debug("GET URL: {}", url.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.addRequestProperty("Pragma", "no-cache"); 
        conn.setRequestMethod("GET");
}
}
//442
public class func{
	public void getInputStream(String path,List<Parameter> parameters){
      LOG.debug("GET URL: {}", url.toString());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.addRequestProperty("Pragma", "no-cache");
    conn.setRequestMethod("GET");
}
}
//443
public class func{
	public void getWebContent(URL url){
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setInstanceFollowRedirects(true) ;
    BufferedReader input = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8")) ;
}
}
//444
public class func{
	public void connectToUrl(URL url){
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setConnectTimeout(CONNECT_TIMEOUT_MS);
    connection.setReadTimeout(READ_TIMEOUT_MS);
    connection.connect();
}
}
//445
public class func{
	public void getConnectedDownloadConnection(URL downloadURL){
            connection = (HttpURLConnection) downloadURL.openConnection();
            connection.setConnectTimeout(CONNECT_TIMEOUT);
            connection.setReadTimeout(READ_TIMEOUT);
            connection.connect();
}
}
//446
public class func{
	public void openConnection(URL url){
        if (conn == null) {
            conn = (HttpURLConnection) url.openConnection();
        }
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(25000);
}
}
//447
public class func{
	public void buildHttpConnection(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("User-Agent", USER_AGENT);
        connection.setConnectTimeout(20000);
        connection.setReadTimeout(20000);
}
}
//448
public class func{
	public void doGet(final String url){
                HttpURLConnection httpUrlConnection = (HttpURLConnection) (new URL(url)).openConnection();
                BufferedReader rd = new BufferedReader(new InputStreamReader(httpUrlConnection.getInputStream()));
}
}
//449
public class func{
	public void getSensorDetails(URL target,String url){
    HttpURLConnection c = (HttpURLConnection) target.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
}
}
//450
public class func{
	public void getPDFContent(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        InputStream is = connection.getInputStream();
        PDDocument pdd = PDDocument.load(is);
}
}
//451
public class func{
	public void getUrl(HttpRequest request){
        URL url = request.getUrl();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        copyHeadersExceptEncoding(request, conn);
        return ioUtils.toString(conn.getInputStream());
}
}
//452
public class func{
	public void ssoLogout(){
        URL logoutUrl = createURLFromCasURI(GeoServerCasConstants.LOGOUT_URI);
        HttpURLConnection conn = (HttpURLConnection) logoutUrl.openConnection();
        addCasCookies(conn);
        conn.getInputStream().close();
}
}
//453
public class func{
	public void testGetContentLength(){
            conn = (HttpURLConnection) (new URL(broadURLString)).openConnection();
            String contentLength = conn.getHeaderField("Content-length");
            assertEquals("249250621", contentLength);
            if (conn != null) {
                conn.disconnect();  // <- this really doesn't do anything (see Sun documentation)
            }
}
}
//454
public class func{
	public void openDefaultConnection(URL url,int connectTimeOut,int readTimeOut){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(connectTimeOut);
        connection.setReadTimeout(readTimeOut);
        connection.setUseCaches(false);
        connection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36");
}
}
//455
public class func{
	public void performPostRequest(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            PrintWriter out = new PrintWriter(connection.getOutputStream());
                out.println("foo=bar");
                out.close();
}
}
//456
public class func{
	public void getConnection(URL url,int timeout){
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setInstanceFollowRedirects(true);
    connection.setConnectTimeout(timeout);
}
}
//457
public class func{
	public void connect(final String path,final int timeout_seconds){
        final URI uri = new URI("http", null, host, port, path, null, null);
        final URL url = uri.toURL();
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "text/xml");
}
}
//458
public class func{
	public void performHeadHTTPMethod(URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setUseCaches(false);
        conn.setAllowUserInteraction(true);
        conn.setRequestProperty("Connection", "Keep-Alive");
}
}
//459
public class func{
	public void open(URL url){
        HttpURLConnection c = (HttpURLConnection)url.openConnection();
        c.setReadTimeout(TIMEOUT);
        c.setConnectTimeout(TIMEOUT);
}
}
//460
public class func{
	public void newHttpConnection(URL url){
      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
      connection.setRequestProperty("User-Agent", userAgent);
}
}
//461
public class func{
	public void HttpFileDownloadInputStream(URL url){
        if (!url.getProtocol().equals("http")) { 
            throw new MalformedURLException("URL is not a http URL"); 
        }
        connection = (HttpURLConnection) url.openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(false);
        connection.setUseCaches(false);
        connection.setRequestMethod("GET"); 
        connection.connect();
        input = connection.getInputStream();
}
}
//462
public class func{
	public void openHttpConnection(URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(false);
}
}
//463
public class func{
	public void getHttpURLConnection(URL url){
    if (proxy != null) {
      return (HttpURLConnection) url.openConnection(proxy);
    } else {
      return (HttpURLConnection) url.openConnection();
    }
}
}
//464
public class func{
	public void getXML(String url,XMLHandler handler){
            Proxy proxy = DefaultToolOptions.getDefaultProxy();
            if (proxy != null) {
                connection = (HttpURLConnection) endpoint.openConnection(proxy);
            } else {
                connection = (HttpURLConnection) endpoint.openConnection();
            }
}
}
//465
public class func{
	public void openConnection(URL url){
    if (proxy != null) {
      return (HttpURLConnection) url.openConnection(proxy);
    } else {
      return (HttpURLConnection) url.openConnection();
    }
}
}
//466
public class func{
	public void createConnection(String uri){
    if ( null == proxy )     {
      return (HttpURLConnection) url.openConnection();
    } else {
      return (HttpURLConnection) url.openConnection( proxy );
    }
}
}
//467
public class func{
	public void createConnection(URL url){
      Proxy proxy = getProxy();
      if (proxy != null)
            return (HttpURLConnection) url.openConnection(proxy);
        else
          return (HttpURLConnection) url.openConnection();
}
}
//468
public class func{
	public void initConnection(HttpRequest request){
      URL url = request.getEndpoint().toURL();
      HttpURLConnection connection = (HttpURLConnection) url.openConnection(proxyForURI.apply(request.getEndpoint()));
      if (connection instanceof HttpsURLConnection) {
         HttpsURLConnection sslCon = (HttpsURLConnection) connection;
         if (utils.relaxHostname())
            sslCon.setHostnameVerifier(verifier);
         if (sslContextSupplier != null) {
             // used for providers which e.g. use certs for authentication (like FGCP)
             // Provider provides SSLContext impl (which inits context with key manager)
             sslCon.setSSLSocketFactory(sslContextSupplier.get().getSocketFactory());
         } else if (utils.trustAllCerts()) {
             sslCon.setSSLSocketFactory(untrustedSSLContextProvider.get().getSocketFactory());
         }
      }
}
}
//469
public class func{
	public void openConnection(String path,String query){
      if (LOG.isTraceEnabled()) {
        LOG.trace("url=" + url);
      }
      return (HttpURLConnection)url.openConnection();
}
}
//470
public class func{
	public void testMethods(){
      HttpURLConnection conn = (HttpURLConnection)url.openConnection();
      conn.setDoOutput(doOutput[i]);
}
}
//471
public class func{
	public void createConnection(URL url){
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.addRequestProperty("User-Agent", "HockeySDK/Android");
      connection.setInstanceFollowRedirects(true);
}
}
//472
public class func{
	public void testRedirectUnsecuredRoot(){
        URL url = serverHttpUri.resolve("/").toURL();
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setInstanceFollowRedirects(false);
        connection.setAllowUserInteraction(false);
}
}
//473
public class func{
	public void testRedirectSecuredRoot(){
        URL url = serverHttpsUri.resolve("/").toURL();
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setInstanceFollowRedirects(false);
        connection.setAllowUserInteraction(false);
}
}
//474
public class func{
	public void testAccessSecured404(){
        URL url = serverHttpsUri.resolve("/nothing/here").toURL();
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setInstanceFollowRedirects(false);
        connection.setAllowUserInteraction(false);
}
}
//475
public class func{
	public void getConnection(URL url){
        HttpURLConnection c = (HttpURLConnection) url.openConnection();
        c.setInstanceFollowRedirects(followRedirects);
}
}
//476
public class func{
	public void fetchResource(URL actualUrl,RDFFormat rdfFormat){
      org.openrdf.model.URI foafdocUri = vf.createURI(base.toString());
      HttpURLConnection conn = (HttpURLConnection) base.openConnection();
}
}
//477
public class func{
	public void checkHttpURL(URL url){
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        String contentType = connection.getContentType();
}
}
//478
public class func{
	public void getRequest(String redirectUrl){
                URL targetUrl = URI.create((redirectUrl != null) ? redirectUrl : url).toURL();
                urlConnection = (HttpURLConnection)targetUrl.openConnection();
                setParameters(context, urlConnection, fParameters);
                urlConnection.setDoOutput(true);
                urlConnection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
}
}
//479
public class func{
	public void getRequest(String redirectUrl){
                URL targetUrl = URI.create((redirectUrl != null) ? redirectUrl : url).toURL();
                urlConnection = (HttpURLConnection)targetUrl.openConnection();
                setParameters(context, urlConnection, fParameters);
}
}
//480
public class func{
	public void sendRequestViaProxy(URL url){
        Proxy proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.parseInt(System.getProperty("http.proxyPort"))));
        return (HttpURLConnection) url.openConnection(proxy);
}
}
//481
public class func{
	public void doGet(URL url){
      HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
}
}
//482
public class func{
	public void createConnection(URL url){
        connection = (HttpURLConnection) url.openConnection();
}
}
//483
public class func{
	public void create(URL url){
        return (HttpURLConnection) url.openConnection();
}
}
//484
public class func{
	public void getHttpURLConnection(URL url){
            (HttpURLConnection) (new URL(url.toString() + tokenString)).openConnection();
        this.connectionConf.configure(httpURLConnection);
}
}
//485
public class func{
	public void JDKHttpConnection(URL url){
    this.wrappedUrlConnection = (HttpURLConnection) url.openConnection();
}
}
//486
public class func{
	public void openConnection(URL url){
    return (HttpURLConnection) url.openConnection();
}
}
//487
public class func{
	public void create(URL url,Proxy proxy){
                return (HttpURLConnection) url.openConnection(proxy);
}
}
//488
public class func{
	public void create(URL url){
                return (HttpURLConnection) url.openConnection();
}
}
//489
public class func{
	public void openConnection(URL url){
      return (HttpURLConnection) url.openConnection();
}
}
//490
public class func{
	public void connect(URL url){
                return (HttpURLConnection) url.openConnection(p);
}
}
//491
public class func{
	public void openHttpConnection(URL httpURL){
            Main.debug("Opening HTTP connection to "+httpURL.toExternalForm());
        HttpURLConnection connection = (HttpURLConnection) httpURL.openConnection();
}
}
//492
public class func{
	public void getHttpURLConnection(URL url){
      return (HttpURLConnection) url.openConnection();
}
}
//493
public class func{
	public void getHttpURLConnection(URL url){
            return (HttpURLConnection)url.openConnection(proxy);
}
}
//494
public class func{
	public void getJsonRpcConnection(URL url,String request,String auth){
    return getJsonRpcConnection((HttpURLConnection) url.openConnection(), request, auth);
}
}
//495
public class func{
	public void Work(URL url,URL mainUrl,String auth){
    this((HttpURLConnection) url.openConnection(), url, auth);
}
}
//496
public class func{
	public void getXML(String url,XMLHandler handler){
                connection = (HttpURLConnection) endpoint.openConnection();
}
}
//497
public class func{
	public void testRouteToMethod(){
      HttpURLConnection conn = (HttpURLConnection)url.openConnection();
}
}
//498
public class func{
	public void getHttpUrlConnection(URL urlForServlet){
    return (HttpURLConnection) urlForServlet.openConnection();
}
}
//499
public class func{
	public void ConnBuilder(URL url){
                con = (HttpURLConnection) url.openConnection();
}
}
//500
public class func{
	public void createConnection(String uri){
      return (HttpURLConnection) url.openConnection();
}
}
//501
public class func{
	public void createConnection(URL url){
        connection = (HttpURLConnection) url.openConnection();
}
}
//502
public class func{
	public void connect(MockWebServer server,URL url){
                return (HttpURLConnection) url.openConnection();
}
}
//503
public class func{
	public void connect(MockWebServer server,URL url){
                return (HttpURLConnection) url.openConnection();
}
}
//504
public class func{
	public void connect(MockWebServer server,URL url){
                return (HttpURLConnection) url.openConnection(server.toProxyAddress());
}
}
//505
public class func{
	public void testMethodNotMapped(){
    URL url = applicationURL();
    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
}
}
//506
public class func{
	public void testBasicAuthentication(final String user,final String key){
    URL retrievalURL = JConfig.getURL("http://localhost:9909/services/sqsurl");
    HttpURLConnection huc = (HttpURLConnection) retrievalURL.openConnection();
}
}
//507
public class func{
	public void JDKHttpConnection(URL url,Proxy proxy){
    this.wrappedUrlConnection = (HttpURLConnection) url
        .openConnection(proxy);
}
}
//508
public class func{
	public void makeRequest(URL url){
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
}
}
//509
public class func{
	public void getIPPConnection(URL url){
            connection = (HttpURLConnection)url.openConnection();
}
}
//510
public class func{
	public void isAddressReachable(String url,int timeout){
      HttpURLConnection urlConnect = (HttpURLConnection) test.openConnection();
}
}
//511
public class func{
	public void create(URL url,Proxy proxy){
        return (HttpURLConnection) url.openConnection(proxy);
}
}
//512
public class func{
	public void createConnection(URL url){
          return (HttpURLConnection) url.openConnection();
}
}
//513
public class func{
	public void httpOpen(String method,URL u){
    final Proxy proxy = HttpSupport.proxyFor(proxySelector, u);
    HttpURLConnection conn = (HttpURLConnection) u.openConnection(proxy);
}
}
//514
public class func{
	public void openConnection(URL url){
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
}
}
//515
public class func{
	public void createConnection(URL endpoint){
        return (HttpURLConnection) endpoint.openConnection();
}
}
//516
public class func{
	public void getServedImage(URL imageUrl){
        HttpURLConnection connection = (HttpURLConnection) imageUrl.openConnection();
}
}
//517
public class func{
	public void getConnection(URL url){
                    return (HttpURLConnection) url.openConnection(proxy);
}
}
//518
public class func{
	public void openConnection(URL requestTokenURL){
      HttpURLConnection connection = (HttpURLConnection) requestTokenURL.openConnection(selectProxy(requestTokenURL));
}
}
//519
public class func{
	public void connectForMultipart(){
    con = (HttpURLConnection) ( new URL(url)).openConnection();
    con.setRequestMethod("POST");
    con.setDoInput(true);
    con.setDoOutput(true);
    con.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
    con.connect();
    os = con.getOutputStream();
}
}
//520
public class func{
	public void openConnection(URL targetUrl){
        HttpURLConnection conn = (HttpURLConnection) targetUrl.openConnection();
}
}
//521
public class func{
	public void getHttpURLConnection(URL url){
      return (HttpURLConnection) (new URL(url.toString() + tokenString)).openConnection();
}
}
//522
public class func{
	public void open(URL url){
            return (HttpURLConnection) url.openConnection();
}
}
//523
public class func{
	public void openConnection(URL url){
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
}
}
//524
public class func{
	public void getAsyncUrlRangeInputStream(URL url,ByteRange byteRange){
    connection = (HttpURLConnection) url.openConnection();
}
}
//525
public class func{
	public void getAsyncUrlRangeInputStream(URL url,ByteRange byteRange,int index,SpeedListener networkSpeedListener){
    connection = (HttpURLConnection) url.openConnection();
}
}
//526
public class func{
	public void openConnection(URL url){
    return sClient != null ? sClient.open(url) : (HttpURLConnection) url.openConnection();
}
}
//527
public class func{
	public void create(URL url){
        return (HttpURLConnection) url.openConnection();
}
}
//528
public class func{
	public void openServerConnection(URL loc){
        return (HttpURLConnection) loc.openConnection();
}
}
//529
public class func{
	public void create(URL url,Proxy proxy){
        return (HttpURLConnection) url.openConnection(proxy);
}
}
//530
public class func{
	public void sendString(final URL url,final String dataString,final String userAgent){
      connection = (HttpURLConnection) url.openConnection();
      setUserAgent(connection, userAgent);
      return sendString(connection, dataString);
}
}
//531
public class func{
	public void getConnection(URL endpointUrl){
                HttpURLConnection result = (HttpURLConnection) endpointUrl.openConnection();
                return wrapRedirectedHttp(result);
}
}
//532
public class func{
	public void getConnection(final URL url){
            return (HttpURLConnection) url.openConnection();
}
}
//533
public class func{
	public void getResponse(URL url,int numberOfRetries){
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    return getResponse(connection, numberOfRetries);
}
}
//534
public class func{
	public void getSyncUrlRangeInputStream(URL url,ByteRange byteRange,int index,SpeedListener networkSpeedListener){
    connection = (HttpURLConnection) url.openConnection();
}
}
//535
public class func{
	public void createConnection(URL url){
        return (HttpURLConnection) url.openConnection();
}
}
//536
public class func{
	public void openURLConnection(URL url){
    return (HttpURLConnection) url.openConnection();
}
}
//537
public class func{
	public void openConnection(URL url){
        return (HttpURLConnection) url.openConnection();
}
}
//538
public class func{
	public void grab(URL url){
        wmsInterface.urlConn = (HttpURLConnection)url.openConnection();
        wmsInterface.urlConn.setRequestProperty("Connection", "close");
        wmsInterface.urlConn.setRequestMethod("GET");
}
}
//539
public class func{
	public void getLocation(final URL url){
    URLConnection connection = url.openConnection();
    if(connection instanceof HttpURLConnection){
      int responseCode = ((HttpURLConnection)connection).getResponseCode();
      if (responseCode == HttpURLConnection.HTTP_MOVED_TEMP
        || responseCode == HttpURLConnection.HTTP_MOVED_PERM
          || responseCode == HttpURLConnection.HTTP_SEE_OTHER){
        String redirectUrl = connection.getHeaderField("Location");
        return getLocation(new URL(redirectUrl));
      }
    }
}
}
//540
public class func{
	public void copy(InputStream in,URL out,String method){
    URLConnection c = out.openConnection();
    if (c instanceof HttpURLConnection && method != null) {
      HttpURLConnection http = (HttpURLConnection) c;
      http.setRequestMethod(method);
    }
    c.setDoOutput(true);
    OutputStream os = c.getOutputStream();
      copy(in, os);
      os.close();
}
}
//541
public class func{
	public void createConnection(URI uri){
    URL url = uri.toURL();
    URLConnection connection = url.openConnection();
    if (!(connection instanceof HttpURLConnection)) {
      throw new HttpTransportException("URI [" + uri + "] is not an HTTP URL");
    }
    else {
      HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
      prepareConnection(httpURLConnection);
      return new HttpUrlConnection(httpURLConnection);
    }
}
}
//542
public class func{
	public void getArchiveReader(final URL f,final long offset){
        URLConnection connection = f.openConnection();
        if (connection instanceof HttpURLConnection) {
          addUserAgent((HttpURLConnection)connection);
        }
}
}
//543
public class func{
	public void slurp(final URL url){
        final HttpURLConnection urlConnection = HttpURLConnection.class.cast(url.openConnection());
            urlConnection.setRequestProperty("Accept", "text/plain");
            return IO.slurp(urlConnection.getInputStream());
            urlConnection.disconnect();
}
}
