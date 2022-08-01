//0
public class func{
	public void getInputStream(String publicid,String systemid){
    URL basis = new URL("file", "", System.getProperty("user.dir") + "/.");
    URL url = new URL(basis, systemid);
    URLConnection c = url.openConnection();
    return c.getInputStream();
}
}
//1
public class func{
	public void runStageFromHTTP(String url){
        if (url.startsWith("https")) {
            URLConnection uc = new URL(url).openConnection();
            Class.forName("com.metasploit.stage.PayloadTrustManager").getMethod("useFor", new Class[]{URLConnection.class}).invoke(null, uc);
            inStream = uc.getInputStream();
        } else {
            inStream = new URL(url).openStream();
        }
}
}
//2
public class func{
	public void getUnAuthServletAnswer(URL url,String method){
        if (url.getPath().endsWith("/")) {
            pingUrl = new URL(url.toString() + servletMethod);
        } else {
            pingUrl = new URL(url.toString() + "/" + servletMethod);
        }
        URLConnection conn = pingUrl.openConnection();
        String answer = Utils.readFullyAndClose(conn.getInputStream());
        return new ServletAnswer(answer);
}
}
//3
public class func{
	public void testPostMissingBackurl(){
        URL url = new URL(container.getServletURL("/"));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
        assertEquals("missing or invalid 'backurl' parameter", conn.getResponseMessage());
        url = new URL(container.getServletURL("/") + "?username=foo&password=bar");
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        assertEquals(HttpServletResponse.SC_BAD_REQUEST, conn.getResponseCode());
        assertEquals("missing or invalid 'backurl' parameter", conn.getResponseMessage());
}
}
//4
public class func{
	public void test_openConnection_FileProtocal(){
        String basedir = new File("temp.java").getAbsolutePath();
        URLConnection conn = new URL(fileUrlString).openConnection();
        assertEquals("file", conn.getURL().getProtocol());
        assertEquals(new File(basedir), new File(conn.getURL().getFile()));
        conn = new URL(nonLocalUrlString).openConnection();
        assertEquals("ftp", conn.getURL().getProtocol());
        assertEquals(new File(basedir), new File(conn.getURL().getFile()));
}
}
//5
public class func{
	public void testHttpsCookie(){
    URL base = new URL("https://" + NetUtils.getHostPortString(server
            .getConnectorAddress(1)));
    HttpsURLConnection conn = (HttpsURLConnection) new URL(base,
            "/echo").openConnection();
}
}
//6
public class func{
	public void main(String[] args){
      URL url = new URL("http://www.hccp.org/test/cookieTest.jsp");
      URLConnection conn = url.openConnection();
      conn.connect();
      cm.storeCookies(conn);
      cm.setCookies(url.openConnection());
}
}
//7
public class func{
	public void getLink(){
    URL url = new URL( link );
    HttpURLConnection ucon = (HttpURLConnection) url.openConnection();
    ucon.setInstanceFollowRedirects( false );
    URL secondURL = new URL( ucon.getHeaderField( "Location" ) );
    return secondURL.toString();
}
}
//8
public class func{
	public void testHttpCookie(){
    URL base = new URL("http://" + NetUtils.getHostPortString(server
            .getConnectorAddress(0)));
    HttpURLConnection conn = (HttpURLConnection) new URL(base,
            "/echo").openConnection();
    String header = conn.getHeaderField("Set-Cookie");
    List<HttpCookie> cookies = HttpCookie.parse(header);
    Assert.assertTrue(!cookies.isEmpty());
    Assert.assertTrue(header.contains("; HttpOnly"));
}
}
//9
public class func{
	public void checkWmsGetMapUrl(String urlString){
            URL url = new URL(urlString);
            URLConnection myURLConnection = url.openConnection();
            myURLConnection.connect();
            logger.debug("#################RESPONSE : {}\n\n",
                    IOUtils.toString(myURLConnection.getInputStream()));
            String contentType = myURLConnection.getContentType();
            logger.info("#####################CONTENT_TYPE : {}\n", contentType);
            if (!contentType.contains("xml")) {
                return true;
            }
}
}
//10
public class func{
	public void getImageBitmap(String url){
            URLConnection conn = new URL(url).openConnection(); conn.connect();
            is = conn.getInputStream();
            bis = new BufferedInputStream(is, 8092);
            bm = BitmapFactory.decodeStream(bis);
            if(bm==null) throw new Exception("couldn't decode bitmap stream");
            imageCache.put(url,bm);
}
}
//11
public class func{
	public void getData(String query){
      if (URIMETHOD.matcher(query).find()) url = new URL(query);
      else url = new URL(baseUrl + query);
      LOG.debug("Accessing URL: " + url.toString());
      URLConnection conn = url.openConnection();
      conn.setConnectTimeout(connectionTimeout);
      conn.setReadTimeout(readTimeout);
      return conn.getInputStream();
}
}
//12
public class func{
	public void checkSoapAddressLocation(String address){
        URL url = new URL(address + "?wsdl");
        URLConnection urlConn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
        while (br.ready()) {
            String str = br.readLine();
            if (str.contains("soap:address") 
                && str.contains("location=" + "\"" + address + "\"")) {
                return  true;
            }
        }
}
}
//13
public class func{
	public void checkUpdate(String s){
      URL url = new URL(s);
      URLConnection conn = url.openConnection();
      BufferedReader in = new BufferedReader( 
            new InputStreamReader( conn.getInputStream()));
      if ((line = in.readLine()) != null){
         version = line.trim();
         details = "";
         while( (line = in.readLine()) != null )
            details += line;
         return true;
      }
}
}
//14
public class func{
	public void run(){
          URL u = new URL(QUESTIONNAIRE_URL);
          URLConnection c = u.openConnection();
          InputStream is = c.getInputStream();
          if (is != null) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            s = rd.readLine();
            rd.close();
            if (s != null && s.length() > 7 && s.startsWith("http"))
              CaratApplication.storage.writeQuestionnaireUrl(s);
            else
              CaratApplication.storage.writeQuestionnaireUrl(" ");
          }
}
}
//15
public class func{
	public void checkServer(){
        final URL checkURL = new URL(fURL + "/dummy.php"); //$NON-NLS-1$
        URLConnection connection = checkURL.openConnection();
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(DEFAULT_TIMEOUT);
        inputStream = connection.getInputStream();
        if (inputStream != null) {
          inputStream.close();
        }
}
}
//16
public class func{
	public void getInputStream(String fileName){
    if (fileName.startsWith("http:")) {
      URL url = new URL(fileName);
      URLConnection connection = url.openConnection();
      input = connection.getInputStream();
    } else {
      input = new FileInputStream(fileName);
    }
}
}
//17
public class func{
	public void process(final String urlStr){
      final URL url = new URL(urlStr);
      final URLConnection con = url.openConnection();
      con.addRequestProperty("Accept-Charset", encoding);
      String enc = con.getContentEncoding();
      if (enc == null) {
        enc = encoding;
      }
      getReceiver().process(new InputStreamReader(con.getInputStream(), enc));
}
}
//18
public class func{
	public void perform(){
        URL checkDebugURL = new URL(query);
        final URLConnection debugConnection = checkDebugURL
            .openConnection();
        debugConnection.setReadTimeout(DEFAULT_TIMEOUT);
        inputStream = debugConnection.getInputStream();
        if (inputStream != null) {
          inputStream.close();
        }
}
}
//19
public class func{
	public void getRemoteContent(String urlString,Writer writer){
        URL url = new URL(getWithSessionIdUrl(urlString));
    URLConnection conn = url.openConnection();
        setConnectionHeaders(urlString, conn);
        InputStream input = conn.getInputStream();
          Reader reader = new InputStreamReader(input,Utils.getContentEncoding(conn,response));
          Utils.copy(reader,writer);
          if(input != null) input.close();
}
}
//20
public class func{
	public void dereference(String uri,String contentType){
        if(uri!=null){
            final URL url = new URL(uri);
            final URLConnection con = url.openConnection();
            con.addRequestProperty("Accept", contentType);
            return con.getInputStream();
        } else {
            return null;
        }
}
}
//21
public class func{
	public void deliverVoxVerification(String destination,String message){
    URL url = new URL(String.format(NEXMO_VOX_URL, apiKey, apiSecret, destination,
                                    URLEncoder.encode(SmsSender.VOX_VERIFICATION_TEXT + message, "UTF-8")));
    URLConnection connection = url.openConnection();
    connection.setDoInput(true);
    connection.connect();
    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    while ((line = reader.readLine()) != null) {
      logger.debug(line);
    }
    reader.close();
}
}
//22
public class func{
	public void deliverSmsVerification(String destination,String verificationCode){
    URL url = new URL(String.format(NEXMO_SMS_URL, apiKey, apiSecret, number, destination,
                                    URLEncoder.encode(SmsSender.SMS_VERIFICATION_TEXT + verificationCode, "UTF-8")));
    URLConnection connection = url.openConnection();
    connection.setDoInput(true);
    connection.connect();
    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    while (reader.readLine() != null) {}
    reader.close();
}
}
//23
public class func{
	public void getURLImage(String source){
            URL url = new URL(source);
            URLConnection conn = url.openConnection();
            if(conn.getContentLength() > MAX_LENGTH) return null;
            return BitmapFactory.decodeStream(conn.getInputStream());
}
}
//24
public class func{
	public void query(String json){
    String urlStr = URL + "?query=" + URLEncoder.encode(json, "UTF-8");
    URL url = new URL(urlStr);
    URLConnection con = url.openConnection();
    con.connect();
    InputStream in = con.getInputStream();
    JSON results = JSON.parse(new InputStreamReader(in));
    in.close();
}
}
//25
public class func{
	public void doSparqlRead(String query){
                connString += "?query=" + ParsingUtilities.encode(query) + "&format=json";
                URL url = new URL(connString);
                URLConnection connection = url.openConnection();
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                connection.setConnectTimeout(5000);
                connection.setDoOutput(true);
                connection.connect();
                return connection.getInputStream();
}
}
//26
public class func{
	public void readJson(String url){
    URLConnection conn = new URL(url).openConnection();
    conn.setConnectTimeout(5000);
    conn.setReadTimeout(8000);
    conn.addRequestProperty("User-Agent", "Updater (by filoghost)");
    conn.setDoOutput(true);
    return JSONValue.parse(new BufferedReader(new InputStreamReader(conn.getInputStream())));
}
}
//27
public class func{
	public void call(){
                URL url = new URL("http://localhost:" + port + "/app/test");
                URLConnection connection = url.openConnection();
                connection.connect();
                return CharStreams.toString(new InputStreamReader(connection.getInputStream()));
}
}
//28
public class func{
	public void downloadBitmap(String url){
      URLConnection connection = new URL(url).openConnection();
      connection.connect();
      InputStream is = connection.getInputStream();
      bitmap = BitmapFactory.decodeStream(is);
      is.close();
}
}
//29
public class func{
	public void html2txt(String urlstring){
      URL url = new URL(urlstring);
      URLConnection yc = url.openConnection();
      yc.setConnectTimeout(5000);
      BufferedReader in = new BufferedReader(
            new InputStreamReader(
                  yc.getInputStream()));
      while ((inputLine = in.readLine()) != null) {
         txt = txt + inputLine;
      }
      in.close();   
}
}
//30
public class func{
	public void getBitmap(String url){
            URL aURL = new URL(url);
            URLConnection conn = aURL.openConnection();
            conn.connect();
            InputStream is = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            bm = BitmapFactory.decodeStream(new FlushedInputStream(is));
}
}
//31
public class func{
	public void download(String lib){
        File libFile = new File(libDir, fileName(lib));
            URL libDownload = new URL("http://repo1.maven.org/maven2/"+lib);
            URLConnection connection = libDownload.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestProperty("User-Agent", "CodeChickenLib Downloader");
            int sizeGuess = connection.getContentLength();
            download(connection.getInputStream(), sizeGuess, libFile);
            libFile.delete();
}
}
//32
public class func{
	public void loadImageFromUrl(String url){
      aURL = new URL(url);
      URLConnection conn = aURL.openConnection(); 
            conn.connect(); 
            InputStream is = conn.getInputStream(); 
            BufferedInputStream bis = new BufferedInputStream(is); 
            Bitmap bm = BitmapFactory.decodeStream(bis); 
            bis.close(); 
}
}
//33
public class func{
	public void process(Void... params){
      URL url = new URL(small.toString());
      URLConnection connection = url.openConnection();
      connection.connect();
      InputStream inputStream = connection.getInputStream();
      BufferedInputStream bufferedInputStream = new BufferedInputStream(
          inputStream);
      preview = BitmapFactory.decodeStream(bufferedInputStream);
      bufferedInputStream.close();
}
}
//34
public class func{
	public void addSamlServiceProvider(){
            URL url = new URL(spMetaDataUrl);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(3000);
            urlConnection.setReadTimeout(3000);
            Reader reader = new InputStreamReader(urlConnection.getInputStream());
            SamlExternalEntity samlEntity = idpConfigApi.addExternalSamlEntity(reader);
            FacesMessage facesMessage = new FacesMessage("SAML entity " + samlEntity.getEntityId() + " has been added.");
}
}
//35
public class func{
	public void get(String JsonUrl){
    URL url = new URL(JsonUrl);
    URLConnection urlConnection = url.openConnection();
    urlConnection.setConnectTimeout(10000);
    BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(urlConnection.getInputStream()));
}
}
//36
public class func{
	public void getURL(String sUrl){
    URL url = new URL( sUrl );
    URLConnection urlConnection = url.openConnection();
    urlConnection.setConnectTimeout(1000);
    urlConnection.setReadTimeout(30000);
    return new InputStreamReader( urlConnection.getInputStream() );
}
}
//37
public class func{
	public void getUrl(String path){
    URL xqtl = new URL("http://localhost:" + webserverport + path);
    URLConnection xc = xqtl.openConnection();
    BufferedReader in = new BufferedReader(new InputStreamReader(xc.getInputStream()));
    while ((inputLine = in.readLine()) != null)
    {
      res.add(inputLine);
    }
    in.close();
}
}
//38
public class func{
	public void openUrl(String url){
            URLConnection urlConnection = new URL(url).openConnection();
            urlConnection.setConnectTimeout(TIMEOUT);
            urlConnection.setReadTimeout(TIMEOUT);
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(false);
            return urlConnection.getInputStream();
}
}
//39
public class func{
	public void httpGet(String url){
      URL confirmationEndpoint = new URL(url);
      URLConnection conn = confirmationEndpoint.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        while ((inputLine = in.readLine()) != null) {
          response += inputLine;
        }
        logger.info(response);
        in.close();
}
}
//40
public class func{
	public void getResponse(String target){
        URL url = new URL(target);
        URLConnection connection = url.openConnection();
        assertTrue(connection instanceof HttpURLConnection);
        connection.connect();
        InputStream in = connection.getInputStream();
}
}
//41
public class func{
	public void fetchWebService(String urlStr){
            URL url = new URL(urlStr);
            URLConnection conn = url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            conn.setConnectTimeout(TIMEOUT * 2);
            conn.setReadTimeout(TIMEOUT * 2);
            in = new BufferedInputStream(conn.getInputStream());
}
}
//42
public class func{
	public void sendRequest(AccountDetails ad){
    out.print("Processing user '"+ad.getUsername()+"': ");
      URL u = new URL(baseUrl+"&"+ad.getUrlParameters());
          URLConnection yc = u.openConnection();
          BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
          while ((inputLine = in.readLine()) != null) 
              out.println(inputLine);
          in.close();
}
}
//43
public class func{
	public void get(String baseurl,String verb,String params){
        URL oracle = new URL(baseurl + "/" + verb + "?" + params);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        while ((inputLine = in.readLine()) != null) {
            response += inputLine;
        }
        in.close();
}
}
//44
public class func{
	public void assertWarDeployed(){
        final String servletPath = GreeterServlet.class.getAnnotation(WebServlet.class).urlPatterns()[0];
        final URLConnection response = new URL("http://localhost:8080/test" + servletPath).openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(response.getInputStream()));
        final String result = in.readLine();
}
}
//45
public class func{
	public void invokeServerAction(String action){
        URL url = new URL("http://" + TestData.SERVER_ADDRESS + "/home/" + action);
        URLConnection connection = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
}
}
//46
public class func{
	public void run(){
        URLConnection conn = new URL(readyURL).openConnection();
        InputStream in = conn.getInputStream();
        while (in.read() != -1)
          ;
        in.close();
}
}
//47
public class func{
	public void doInBackground(Void... params){
            URL url = new URL("http:" + uri.toString().substring(5));
            URLConnection connection = url.openConnection();
            connection.connect();
            addSceneDirectory(connection.getInputStream());
            toast("Unable to open URI " + uri);
}
}
//48
public class func{
	public void getCSSResource(String uri){
        uri = resolveURI(uri);
            URLConnection uc = new URL(uri).openConnection();
            uc.connect();
            is = uc.getInputStream();
}
}
//49
public class func{
	public void testGetProtoFile(){
     URL proto = new URL("http://localhost:8080/_soa_/services/blogs/BlogsInterOpModifiedV1/v1?proto");
          URLConnection yc = proto.openConnection();
            in = new BufferedReader(
                                    new InputStreamReader(
                                    yc.getInputStream()));
}
}
//50
public class func{
	public void fetch(String address){
      URL url = new URL(address);
          URLConnection conn = url.openConnection();
          BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
}
}
//51
public class func{
	public void readWebsiteContentsSoWeCanUseTheText(String link){
            URL url = new URL(link);
            URLConnection con = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
}
}
//52
public class func{
	public void getText(String url){
      URL website = new URL(url);
      URLConnection connection = website.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
}
}
//53
public class func{
	public void getOrbitalElements(String urlString){
        URLConnection connection = new URL(urlString).openConnection();
        in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        return parseOrbitalElements(in);
}
}
//54
public class func{
	public void readFrom(String spec){
    URLConnection connection = new URL(spec).openConnection();
    connection.setConnectTimeout(5000);
    connection.setDoOutput(true);
    return connection.getInputStream();
}
}
//55
public class func{
	public void request(final String aPostcode){
    final URL requestURL = new URL(BASEURL.concat(aPostcode.trim().replace(" ", "%20")));
    final URLConnection conn = requestURL.openConnection();
    conn.connect();
    final InputStream is = conn.getInputStream();
}
}
//56
public class func{
	public void testGET_URL(){
        URL url = new URL("http://localhost:" + serverPort + "/tests/alpha.txt");
        URLConnection conn = url.openConnection();
        conn.connect();
        InputStream in = conn.getInputStream();
        String response = IO.toString(in);
        Assert.assertEquals("Response",expected,response);
}
}
//57
public class func{
	public void getCountryFromGeoIP(){
    URL u = new URL("http://www.geogebra.org/geoip/");
    URLConnection uc = u.openConnection();
    uc.setReadTimeout(3000);
    in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
    return in.readLine(); // the last line will never get a "\n" on its end
}
}
//58
public class func{
	public void httpGet(int port,String path){
    URL url = new URL("http://localhost:" + port + path);
    URLConnection conn = url.openConnection();
    Reader reader = new InputStreamReader(conn.getInputStream());
    String response = CharStreams.toString(reader);
    reader.close();
}
}
//59
public class func{
	public void GetUrlDrawable(String url){
      URL aryURI=new URL(url);
      URLConnection conn=aryURI.openConnection();
      InputStream is=conn.getInputStream();
      Bitmap bmp=BitmapFactory.decodeStream(is);
      return new BitmapDrawable(bmp);
      Log.e("ERROR", "urlImage2Drawable���������ì�£��imageUrl��" + url, e);
}
}
//60
public class func{
	public void getFile(String host){
      final URL url = new URL(host);
      final URLConnection connection = url.openConnection();
      input = connection.getInputStream();
      while ((read = input.read(buffer)) > 0) {
        image.write(buffer, 0, read);
      }
      image.close();
      return image.toByteArray();
}
}
//61
public class func{
	public void GetBitmap(String imageUrl){
        URL url = new URL(imageUrl);   
        URLConnection conn=url.openConnection();
        InputStream is = conn.getInputStream();   
        mBitmap = BitmapFactory.decodeStream(is);   
}
}
//62
public class func{
	public void loadMetaDataOfOtherSamlEntity(String hostName,String idpOrSp){
            URL url = new URL("http://localhost:8080/" + idpOrSp + "/saml/" + idpOrSp.toUpperCase() + "/MetaDataService");
            uc = url.openConnection();
            uc.setRequestProperty("host", hostName);
            Reader reader = new InputStreamReader(uc.getInputStream());
}
}
//63
public class func{
	public void openConnection(String query){
    final URL url = new URL(query.replace(" ", "%20"));
    URLConnection urlconnec = url.openConnection();
    urlconnec.setConnectTimeout(15000);
    urlconnec.setReadTimeout(15000);
    return urlconnec.getInputStream();
}
}
//64
public class func{
	public void main(String args[]){
            URL url = new URL ("http://localhost:"+port);
            URLConnection urlc = url.openConnection ();
            InputStream is = urlc.getInputStream ();
            read (is);
            is.close();
}
}
//65
public class func{
	public void main(String[] args){
                URL url = new URL(urlStr);
                URLConnection urlConnection = url.openConnection();
                InputStream in = urlConnection.getInputStream();
                in.close();
}
}
//66
public class func{
	public void main(String[] args){
            URL u = new URL("https://www.nonexistent-site.com/");
            URLConnection uc = u.openConnection();
            InputStream is = uc.getInputStream();
            is.close();
}
}
//67
public class func{
	public void client(String u){
        URL url = new URL (u);
        URLConnection urlc = url.openConnection ();
        InputStream is = urlc.getInputStream ();
        read (is);
        is.close();
}
}
//68
public class func{
	public void getHttpDocument(String url){
    URL u = new URL(url);
    URLConnection conn = u.openConnection();
    conn.setConnectTimeout(connectTimeout);
    conn.setReadTimeout(readTimeout);
    return (getDocumentBuilder()).parse(conn.getInputStream(),url);
}
}
//69
public class func{
	public void getStream(String urlString){
          URL url = new URL(urlString);
          URLConnection urlConnection = url.openConnection();
          urlConnection.setConnectTimeout(250);
          urlConnection.setReadTimeout(5*1000);
          return urlConnection.getInputStream();
}
}
//70
public class func{
	public void setupURI(String url){
        UURI uuri = UURIFactory.getInstance(url);
        CrawlURI curi = new CrawlURI(uuri, null, uuri, LinkContext.NAVLINK_MISC);
        URLConnection conn = new URL(url).openConnection();
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(30000);
        InputStream in = conn.getInputStream();
}
}
//71
public class func{
	public void fetchGalaxyData(String galaxyDataUrl){
            URL url = new URL(galaxyDataUrl);
            URLConnection conn = url.openConnection();
            galaxyInput = new String(IOUtils.toCharArray(conn.getInputStream())).trim();
}
}
//72
public class func{
	public void get(String urlString){
        URL url = new URL(urlString);
        URLConnection urlConnection = url.openConnection(java.net.Proxy.NO_PROXY);
        return new String(Streams.readFully(urlConnection.getInputStream()));
}
}
//73
public class func{
	public void testReqResp(){
        URL url = new URL("http://localhost:" + port + path);
        URLConnection conn = url.openConnection();
        conn.setDefaultUseCaches(false);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                conn.getInputStream()));
        String s = in.readLine();
        assertTrue(s.contains(path));
        in.close();
}
}
//74
public class func{
	public void openUrl(String urlSpec){
        URL url = new URL(urlSpec);
        URLConnection urlConnection = url.openConnection();
        return new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
}
}
//75
public class func{
	public void run(){
        String rawAlarmId = AgencyAndIdLibrary.convertToString(alarmId);
        rawUrl = rawUrl.replace("#ALARM_ID#", rawAlarmId);
        URL url = new URL(rawUrl);
        URLConnection connection = url.openConnection();
        InputStream in = connection.getInputStream();
        in.close();
}
}
//76
public class func{
	public void main(String args[]){
            URL url = new URL ("http://localhost:"+port+"/d1/d2/d3/foo.html");
            URLConnection urlc = url.openConnection ();
            InputStream is = urlc.getInputStream ();
            read (is);
            is.close ();
}
}
//77
public class func{
	public void testServerHello(){
        URL url = new URL("http://localhost:5000/hello");
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();
        String contents = StreamUtility.readToEnd(is);
        is.close();
        assertEquals(contents, "hello");
}
}
//78
public class func{
	public void updateWeatherData(){
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            weatherData = IOUtils.toString(connection.getInputStream());
}
}
//79
public class func{
	public void fetchKey(){
        URLConnection con = new URL(this.keyUrl).openConnection();
        InputStream in = new BufferedInputStream(con.getInputStream());
}
}
//80
public class func{
	public void getUrlContent(String urlAddress){
      URL url = new URL(urlAddress);
      URLConnection connection = url.openConnection();
      connection.setUseCaches(false);
      inStream = connection.getInputStream();
      InputStreamReader inStreamReader = new InputStreamReader(inStream);
      BufferedReader buffer = new BufferedReader(inStreamReader);            
}
}
//81
public class func{
	public void isOffline(){
        URL url = new URL("http://schemas.opengis.net");
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(2000);
            conn.getInputStream().read();
}
}
//82
public class func{
	public void getData(String urlString){
    URL url = new URL(urlString);
    URLConnection connection = url.openConnection();
    return IOUtils.toByteArray(connection.getInputStream());
}
}
//83
public class func{
	public void run(){
        URL url = new URL(urlstring);
        URLConnection urlConnection = url.openConnection();
        urlConnection.setConnectTimeout(1000);
        loadPrefsFromStream(urlConnection.getInputStream());
}
}
//84
public class func{
	public void test(){
        ServerSocket ss = new ServerSocket(0);
        Server s = new Server (ss);
            URL url = new URL ("http://127.0.0.1:"+ss.getLocalPort());
            URLConnection urlc = url.openConnection ();
            InputStream is = urlc.getInputStream ();
}
}
//85
public class func{
	public void main(String[] args){
        int port = server.getLocalPort ();
        URL url = new URL ("http://127.0.0.1:"+port);
        URLConnection urlc = url.openConnection ();
        urlc.getInputStream ();
}
}
//86
public class func{
	public void resolve(String href,String base){
                url = new URL(baseURI + "/"  + href);
                final URLConnection connection = url.openConnection();
                return new StreamSource(connection.getInputStream());
}
}
//87
public class func{
	public void testUrlWithSpaceInHost(){
        URLConnection urlConnection = new URL("http://and roid.com/").openConnection();
            urlConnection.getInputStream();
}
}
//88
public class func{
	public void doGetInfo(String action){
            URLConnection connection = new URL(infoContext + "info" + "?action=add&id=" + action).openConnection();
            connection.getInputStream().close();
}
}
//89
public class func{
	public void testCopyRemoteInputStream(){
      URL url = new URL(checkNotNull(sysHttpStreamUrl, "sysHttpStreamUrl"));
      URLConnection connection = url.openConnection();
      Callable<Void> callable = new ConnectionTester(connection.getInputStream());
}
}
//90
public class func{
	public void getXMLStream(String XMLurl){
    URL url= new URL(XMLurl);
    URLConnection jiraSite = url.openConnection();
    return jiraSite.getInputStream();
}
}
//91
public class func{
	public void fetchMedline(String id){
            URL url = new URL(baseUrl);
            URLConnection data = url.openConnection();
            return new MedlineImporter().importEntries(data.getInputStream());
}
}
//92
public class func{
	public void testUrlWithSpaceInHostViaHttpProxy(){
        URLConnection urlConnection = new URL("http://and roid.com/")
                .openConnection(server.toProxyAddress());
        urlConnection.getInputStream();
}
}
//93
public class func{
	public void getUrlAsStream(String urlString){
    URL url = new URL(urlString);
    URLConnection conn = url.openConnection();
    return conn.getInputStream();
}
}
//94
public class func{
	public void downloadAndStoreImage(String urlString){
        URL url = new URL(urlString);
        URLConnection conn = url.openConnection();
        InputStream in = conn.getInputStream();
}
}
//95
public class func{
	public void getEutilsInputStream(String accessionID,String db){
        logger.trace("Loading: {}", genbankURL);
        URL genbank = new URL(genbankURL);
        URLConnection genbankConnection = genbank.openConnection();
        return genbankConnection.getInputStream();
}
}
//96
public class func{
	public void getUrlAsStream(String urlString){
    URL url = new URL(urlString);
    URLConnection conn = url.openConnection();
    return conn.getInputStream();
}
}
//97
public class func{
	public void test(){
        ServerSocket ss = new ServerSocket(0);
        Server s = new Server (ss);
            URL url = new URL ("http://127.0.0.1:"+ss.getLocalPort());
            URLConnection urlc = url.openConnection ();
            InputStream is = urlc.getInputStream ();
}
}
//98
public class func{
	public void resolve(String href,String base){
        url = new URL(baseURI + "/"  + href);
        final URLConnection connection = url.openConnection();
        return new StreamSource(connection.getInputStream());
}
}
//99
public class func{
	public void findAddress(String address){
        URL url = new URL(geocoder.encode(address));
        URLConnection connection = url.openConnection();
        String content = Streams.readString(connection.getInputStream());
        return geocoder.decode(content);
}
}
//100
public class func{
	public void retrieve(String zipcode){
    URLConnection conn = new URL(url).openConnection();
    return conn.getInputStream();
}
}
//101
public class func{
	public void getCacheContent(String cache_uri){
    URL url = new URL(cache_uri);
    URLConnection uc = url.openConnection();
    return new Scanner(uc.getInputStream()). useDelimiter("\\Z").next();
}
}
//102
public class func{
	public void testUrlWithSpaceInHostViaHttpProxy(){
        URLConnection urlConnection = new URL("http://and roid.com/")
                .openConnection(server.toProxyAddress());
            urlConnection.getInputStream();
}
}
//103
public class func{
	public void retrieveWsdlDocument(String hostname,String port){
        URL wsdlUrlLocalhost = new URL("http://" + hostname + ":" + port + "/SpringEndpoint?wsdl");
        URLConnection urlConnection = wsdlUrlLocalhost.openConnection();
        return StaxUtils.read(urlConnection.getInputStream());
}
}
//104
public class func{
	public void getConnection(String url){
      URLConnection conn = new URL(url).openConnection();
      is = conn.getInputStream();
}
}
//105
public class func{
	public void downloadProfile(TaskCompletionEvent e){
    URLConnection connection = new URL(
      getTaskLogURL(e.getTaskAttemptId(), e.getTaskTrackerHttp()) + 
      "&filter=profile").openConnection();
    InputStream in = connection.getInputStream();
}
}
//106
public class func{
	public void main(String[] args){
        URL url = new URL ("jar:file:./foo2.jar!/bar.txt");
        URLConnection urlc = url.openConnection ();
        urlc.setUseCaches (false);
        InputStream is = urlc.getInputStream();
        is.read();
        is.close();
}
}
//107
public class func{
	public void getXLSFromURL(String urlstring){
    URL url = new URL(urlstring);
    URLConnection uc = url.openConnection();
    String field = uc.getHeaderField(0);
    for (int i=0;field != null; i++) {
      System.out.println(field);
      field = uc.getHeaderField(i);
  }
    BufferedInputStream is = new BufferedInputStream(uc.getInputStream());
}
}
//108
public class func{
	public void downloadInputStream(String url2get,Object lock,String UserAgent){
    java.net.URLConnection urlConnect = new URL(url2get).openConnection();
    urlConnect.setRequestProperty("User-Agent", UserAgent);
    InputStream iStream = new BufferedInputStream(urlConnect.getInputStream());
}
}
//109
public class func{
	public void testGetBookAsArray(){
        URL url = new URL("http://localhost:" + PORT + "/the/bookstore/books/list/123");
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "application/json");
        InputStream in = connect.getInputStream();           
        assertEquals("{\"Books\":{\"books\":[{\"id\":123,\"name\":\"CXF in Action\"}]}}", 
                     getStringFromInputStream(in)); 
}
}
//110
public class func{
	public void main(String[] args){
            URL url = new URL("http://127.0.0.1:"+port);
            java.net.URLConnection uc = url.openConnection();
            uc.setReadTimeout(1000);
            uc.getInputStream();
}
}
//111
public class func{
	public void testGetAll(){
        URL url = new URL("http://localhost:" + PORT + "/test/services/rest2/myRestService");
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "text/plain");
        InputStream in = connect.getInputStream();
        assertEquals("0", getStringFromInputStream(in));
}
}
//112
public class func{
	public void testPetStore(){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "text/xml");
        InputStream in = connect.getInputStream();
        assertNotNull(in);
        assertEquals(PetStore.CLOSED, getStringFromInputStream(in)); 
}
}
//113
public class func{
	public void getBook(String endpointAddress){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("SpringProxy", "true");
        InputStream in = connect.getInputStream();           
}
}
//114
public class func{
	public void getInputStreamForUrl(String urlString){
    URL url = new URL(urlString);
    URLConnection urlConnection = url.openConnection();
    urlConnection.setRequestProperty("User-Agent", userAgent);
    return urlConnection.getInputStream();
}
}
//115
public class func{
	public void doCall(){
        URL url = new URL(formatCallURL());
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        InputStream is = connection.getInputStream();
}
}
//116
public class func{
	public void getBitmapFromUrl(String url){
            URLConnection conn = new URL(url).openConnection();
            conn.setConnectTimeout(CONNECT_TIMEOUT);
            conn.setReadTimeout(READ_TIMEOUT);
            bitmap = BitmapFactory.decodeStream((InputStream) conn.getContent());
            if (autoRotate && bitmap.getWidth() > bitmap.getHeight()) {
                Matrix matrix = new Matrix();
                matrix.postRotate(90);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
}
}
//117
public class func{
	public void main(String[] args){
            File f = File.createTempFile("test", null);
            f.deleteOnExit();
            String s = f.getAbsolutePath();
            s = s.startsWith("/") ? s : "/" + s;
            URL url = new URL("file://localhost"+s);
            conn = url.openConnection();
            conn.connect();
            if (f.lastModified() != conn.getLastModified())
                throw new RuntimeException("file.lastModified() & FileURLConnection.getLastModified() should be equal");
            f.delete();
}
}
//118
public class func{
	public void readerFor(String fileName){
        if (fileName==null) return null;
        if (fileName.startsWith("http") || fileName.startsWith("file:")) {
            URL url = new URL(fileName);
            URLConnection conn = url.openConnection();
            long size = conn.getContentLengthLong();
            Reader reader = new InputStreamReader(url.openStream(),"UTF-8");
            return new CountingReader(reader,size);
        }
        File file = new File(fileName);
        if (!file.exists() || !file.isFile() || !file.canRead()) throw new IOException("Cannot open file "+fileName+" for reading.");
        return new CountingReader(file);
}
}
//119
public class func{
	public void utilsTest(){
        URL endpointURL = new URL(dlbEndpoint.getEndpointInfo().getAddress()  + "?js&nojsutils");
        URLConnection connection = endpointURL.openConnection();
        assertEquals("application/javascript;charset=UTF-8", connection.getContentType());
        InputStream jsStream = connection.getInputStream();
        String jsString = readStringFromStream(jsStream);
        assertFalse(jsString.contains("function CxfApacheOrgUtil"));
}
}
//120
public class func{
	public void testGetBook123(){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "application/json");
        InputStream in = connect.getInputStream();
        assertNotNull(in);           
        assertEquals("Jackson output not correct", 
                     "{\"class\":\"org.apache.cxf.systest.jaxrs.Book\",\"name\":\"CXF in Action\",\"id\":123}",
                     getStringFromInputStream(in).trim());
}
}
//121
public class func{
	public void testGetBook123(){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "application/xml");
        InputStream in = connect.getInputStream();
        assertNotNull(in);           
        InputStream expected = getClass()
            .getResourceAsStream("resources/expected_get_book123.txt");
}
}
//122
public class func{
	public void getHttpInputStream(String endpointAddress){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept", "application/xml,text/plain");
        return connect.getInputStream();
}
}
//123
public class func{
	public void getreal(String nm){
      URL url = new URL(Config.mapurl, nm + ".png");
      URLConnection c = url.openConnection();
      c.addRequestProperty("User-Agent", "Haven/1.0");
      InputStream s = c.getInputStream();
}
}
//124
public class func{
	public void getConnection(String realUrl){
    URL url = new URL(realUrl);
    URLConnection con = url.openConnection();
    con.addRequestProperty(USER_AGENT_KEY, USER_AGENT);
    return con.getInputStream();
}
}
//125
public class func{
	public void testGetThatBookInterfacePrototype(){
        URL url = new URL("http://localhost:" + PORT + "/test/5/bookstorestorage/thosebooks/123");
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("SpringProxy", "true");
        InputStream in = connect.getInputStream();           
}
}
//126
public class func{
	public void loadContextFromWeb(){
        final URL url = new URL(selectedUri);
        final URLConnection con = url.openConnection();
        con.addRequestProperty("Accept", "application/rdf+xml");
        final InputStream inputStream = con.getInputStream();
}
}
//127
public class func{
	public void get(String url,String query,int connectTimeout,int readTimeout){
    if (query != null && !query.equals("")) {
      fullUrl += "?" + query;
    }
    URLConnection connection = new URL(fullUrl).openConnection();
    connection.setReadTimeout(readTimeout);
    connection.setConnectTimeout(connectTimeout);
    connection.setRequestProperty("Accept-Charset", CHARSET_UTF8);
    return getResponse((HttpURLConnection) connection);
}
}
//128
public class func{
	public void dlbQueryTest(){
        URL endpointURL = new URL(dlbEndpoint.getEndpointInfo().getAddress()  + "?js");
        URLConnection connection = endpointURL.openConnection();
        assertEquals("application/javascript;charset=UTF-8", connection.getContentType());
        InputStream jsStream = connection.getInputStream();
        String js = readStringFromStream(jsStream);
        assertNotSame("", js);
}
}
//129
public class func{
	public void download(LicenseInfo licenseInfo,File outputDir){
        URL url = new URL(licenseInfo.getUrl());
            in = new BufferedInputStream(url.openConnection().getInputStream());
            out = new BufferedOutputStream(new FileOutputStream(path));
            IOUtil.copy(in, out);
            if (in != null) in.close();
            if (out != null) out.close();
}
}
//130
public class func{
	public void getFolders(String authToken){
        URL url = new URL("https://www.googleapis.com/drive/v2/files?q=" + URLEncoder.encode("mimeType = 'application/vnd.google-apps.folder'", "UTF-8"));
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestProperty("Authorization", "Bearer " + authToken);
        if (conn.getResponseCode() / 100 >= 3) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new IOException(s);
        }
        List<Folder> folderList = EntryFactory.getEntriesFromDriveApi(Folder.class, conn.getInputStream());
}
}
//131
public class func{
	public void findDocuments(String title,String authToken){
        URL url = new URL("https://www.googleapis.com/drive/v2/files?q=" + URLEncoder.encode("title = '" + title + "'", "UTF-8"));
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestProperty("Authorization", "Bearer " + authToken);
        if (conn.getResponseCode() >= 300) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new RuntimeException(s);
        }
        List<Document> documentList = EntryFactory.getEntriesFromDriveApi(Document.class, conn.getInputStream());
}
}
//132
public class func{
	public void main(String[] args){
        URL u = new URL("file:"+System.getProperty("test.src", ".")+
                        "/GetContentLength.java");
        URLConnection urlc = u.openConnection();
        urlc.connect();
        len = urlc.getContentLength();
        if (len<0)
            throw new RuntimeException("GetContentLength returned invalid length.");
}
}
//133
public class func{
	public void main(String[] args){
            URL url = new URL ("http://localhost:"+port+"/index.html");
            URLConnection urlc = url.openConnection ();
            urlc.setIfModifiedSince (10000000);
            InputStream is = urlc.getInputStream ();
}
}
//134
public class func{
	public void followRedirects(URLConnection connection){
        if ( ( (HttpURLConnection) connection).getResponseCode() == 301 || ( (HttpURLConnection) connection).getResponseCode() == 302 )
        {
            String newLocation = connection.getHeaderField( "Location" );
            URL download = new URL( newLocation );
            connection = download.openConnection();
            connection.connect();
        }
}
}
//135
public class func{
	public void getConnection(String action,String newEncounterNumber,int groupSize,String nodeIdentifier,int numProcessors){
    if (!newEncounterNumber.equals("")) {
      encNumParam = "&newEncounterNumber=" + newEncounterNumber;
    }
    URL u = new URL(thisURLRoot + "/ScanAppletSupport?version=" + version + "&nodeIdentifier=" + nodeIdentifier + "&action=" + action + encNumParam + "&groupSize=" + groupSize + "&numProcessors=" + numProcessors);
    URLConnection con = u.openConnection();
    con.setDoInput(true);
    con.setDoOutput(true);
    con.setUseCaches(false);
    con.setDefaultUseCaches(false);
    con.setRequestProperty("Content-type", "application/octet-stream");
    con.setAllowUserInteraction(false);
}
}
//136
public class func{
	public void getWorksheets(Spreadsheet spreadsheet,String authToken){
        String worksheetAddress = "https://spreadsheets.google.com/feeds/worksheets/" + spreadsheet.getId() + "/private/full?access_token=" + authToken;
        URL url = new URL(worksheetAddress);
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        if (conn.getResponseCode() / 100 >= 3) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new RuntimeException(s);
        }
        List<Worksheet> worksheetList = EntryFactory.getEntries(Worksheet.class, conn.getInputStream());
}
}
//137
public class func{
	public void deleteDocument(Document document,String authToken){
        URL url = new URL("https://www.googleapis.com/drive/v2/files/" + document.getId());
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestProperty("Authorization", "Bearer " + authToken);
        conn.setRequestMethod("DELETE");
        if (conn.getResponseCode() / 100 >= 3) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new RuntimeException(s);
        }
}
}
//138
public class func{
	public void deleteWorksheet(Spreadsheet spreadsheet,Worksheet worksheet,String authToken){
        String requestUrl= "https://spreadsheets.google.com/feeds/worksheets/" + spreadsheet.getId() + "/private/full/" + worksheet.getId() + "/0" + "?access_token=" + authToken;
        URL url = new URL(requestUrl);
        HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.addRequestProperty("If-Match", "*");
        if (conn.getResponseCode() / 100 >= 3) {
            String s = new String(IOUtils.toByteArray(conn.getErrorStream()));
            throw new Exception(s);
        }
}
}
//139
public class func{
	public void main(String[] args){
        URL url = new URL("file:///");
        URLConnection urlc = url.openConnection();
        urlc.connect();
        String type = urlc.getContentType();
        if (! "text/plain".equalsIgnoreCase(type))
            throw new RuntimeException("getContentType() returned the wrong type");
}
}
//140
public class func{
	public void openConnection(String url,String username,char[] password){
    URL urlObject = new URL(url);
    URLConnection conn = urlObject.openConnection();
    setAuthorization(conn, username, password);
    conn.setUseCaches(false);
    conn.setDoOutput(true);
    if (conn instanceof HttpsURLConnection) {
      HttpsURLConnection secureConn = (HttpsURLConnection) conn;
      secureConn.setSSLSocketFactory(SSL_CONTEXT.getSocketFactory());
      secureConn.setHostnameVerifier(HOSTNAME_VERIFIER);
    }
}
}
//141
public class func{
	public void isImageDirectURL(String url){
    URL u = new URL(url);
    URLConnection urlConnection = u.openConnection();
    urlConnection.setConnectTimeout(TIMEOUT);
    String contentType = urlConnection.getContentType();
    if (isContentTypeImage(contentType)) {
      return true;
    }
}
}
//142
public class func{
	public void doClientSide(){
        URL url = new URL("https://localhost:"+serverPort+"/index.html");
        HttpsURLConnection urlc = (HttpsURLConnection)url.openConnection();
        urlc.setHostnameVerifier(this);
        urlc.getInputStream();
        if (urlc.getResponseCode() == -1) {
            throw new RuntimeException("getResponseCode() returns -1");
        }
}
}
//143
public class func{
	public void doInBackground(Uri... params){
                Bitmap bitmap = WordPress.getBitmapCache().getBitmap(uri);
                if (bitmap == null) {
                    URL url = new URL(uri);
                    bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
                    WordPress.getBitmapCache().put(uri, bitmap);
                }
}
}
//144
public class func{
	public void exists(){
  if (pathUrlConnection == null)
  try {
    URL u = new URL(path);
    pathUrlConnection = u.openConnection();
  } catch (MalformedURLException e) {
  } catch (IOException e) {
  }
  if ( pathUrlConnection != null )
  try {
    int responseCode = ((HttpURLConnection)pathUrlConnection).getResponseCode();
    if (responseCode >= 200 && responseCode < 300) // Successful
      return true;
  } catch (IOException e) {
  }
}
}
//145
public class func{
	public void testResourceAccessHeaderValidToken(){
        URL url = new URL(Common.RESOURCE_SERVER + Common.PROTECTED_RESOURCE_HEADER);
        URLConnection c = url.openConnection();
        c.addRequestProperty(Common.HEADER_AUTHORIZATION, Common.AUTHORIZATION_HEADER_OAUTH2);
        if (c instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection)c;
            httpURLConnection.setRequestMethod("GET");

            testValidTokenResponse(httpURLConnection);
        }
}
}
//146
public class func{
	public void Modified(){
        URL testURL = new URL("http://localhost:" + ss.getLocalPort() +
                              "/index.html");
        URLConnection URLConn = testURL.openConnection();
        if (URLConn instanceof HttpURLConnection) {
            httpConn = (HttpURLConnection)URLConn;
            httpConn.setAllowUserInteraction(false);
            httpConn.setIfModifiedSince(9990000000000L);
            int response = httpConn.getResponseCode();
            if (response != 304)
                throw new RuntimeException("setModifiedSince failure.");
        }
}
}
//147
public class func{
	public void writeResources(String srcPath,File cacheDir,String date){
        URL url = new URL(srcPath);
        URLConnection urlConnection = url.openConnection();
        long last = urlConnection.getLastModified();
        if (last != 0) {
            fileDate = Long.toString(last);
        }
        if (!cacheDir.canRead() || date == null || !date.equals(fileDate)) {
            recursiveDelete(cacheDir, false);
            unzip(urlConnection.getInputStream(), cacheDir);
        }
}
}
//148
public class func{
	public void closeLauncherJarFile(final File launcherJar){
            final URI launcherJarUri = launcherJar.toURI();
            final URL launcherJarRoot = new URL("jar:" + launcherJarUri + "!/");
            final URLConnection conn = launcherJarRoot.openConnection();
            if (conn instanceof JarURLConnection) {
                final JarFile jarFile = ((JarURLConnection) conn).getJarFile();
                jarFile.close();
            }
}
}
//149
public class func{
	public void test_ConstructorLjava_io_InputStream(){
        InputStream is = new URL(jarName).openConnection().getInputStream();
        JarInputStream jis = new JarInputStream(is);
        assertNotNull("The jar input stream should have a manifest", jis.getManifest());
        JarEntry je = jis.getNextJarEntry();
        while (je != null) {
            if (je.getName().equals(A_CLASS)) {
                hasCorrectEntry = true;
            }
            je = jis.getNextJarEntry();
        }
}
}
//150
public class func{
	public void checkStatusCode(String sURL){
            URL url = new URL(sURL);
            URLConnection conn = url.openConnection();
            if (conn instanceof HttpURLConnection) {
                HttpURLConnection httpUrl = (HttpURLConnection) conn;
                return httpUrl.getResponseCode();
            }
}
}
//151
public class func{
	public void openConnection(HttpInvokerClientConfiguration config){
    URLConnection con = new URL(config.getServiceUrl()).openConnection();
    if (!(con instanceof HttpURLConnection)) {
      throw new IOException("Service URL [" + config.getServiceUrl() + "] is not an HTTP URL");
    }
    return (HttpURLConnection) con;
}
}
//152
public class func{
	public void loadTileFromOsm(Tile tile){
        url = new URL(tile.getUrl());
        URLConnection urlConn = url.openConnection();
        if (urlConn instanceof HttpURLConnection) {
            prepareHttpUrlConnection((HttpURLConnection)urlConn);
        }
}
}
//153
public class func{
	public void testResourceAccessQueryNoToken(){
        URL url = new URL(Common.RESOURCE_SERVER + Common.PROTECTED_RESOURCE_QUERY);
        URLConnection c = url.openConnection();
        if (c instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection)c;
            httpURLConnection.setRequestMethod("GET");

            testNoTokenResponse(httpURLConnection);
        }
}
}
//154
public class func{
	public void testResourceAccessQueryInvalidToken(){
        URL url = new URL(Common.RESOURCE_SERVER + Common.PROTECTED_RESOURCE_QUERY + "?"
            + "oauth_token=randominvalidtoken");
        URLConnection c = url.openConnection();
        if (c instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection)c;
            httpURLConnection.setRequestMethod("GET");

            testInvalidTokenResponse(httpURLConnection);
        }
}
}
//155
public class func{
	public void doInBackground(final Void... params){
                URL url = new URL("https://www.digipost.no/post/api/session");
                URLConnection connection = url.openConnection();
                connection.setConnectTimeout(3000);
                connection.connect();
}
}
//156
public class func{
	public void fetchUrl(String url,int expectedResponseCode){
        URLConnection conn = new URL(url).openConnection();
        Assert.assertTrue("URLConenction is not HttpURLConnection: " + conn, conn instanceof HttpURLConnection);
        HttpURLConnection connection = (HttpURLConnection) conn;
        connection.connect();
            int responseCode = connection.getResponseCode();
            assertEquals(url, expectedResponseCode, responseCode);
            return (responseCode == OK) ? getContent(conn) : null;
}
}
//157
public class func{
	public void testResourceAccessBodyNoToken(){
        URL url = new URL(Common.RESOURCE_SERVER + Common.PROTECTED_RESOURCE_BODY);
        URLConnection c = url.openConnection();
        if (c instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection)c;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            testNoTokenResponse(httpURLConnection);
        }
}
}
//158
public class func{
	public void announce(String trackerURL,byte[] hash,byte[] peerId,int port){
        + "?info_hash=" + URLEncoder.encode(new String(hash, Constants.BYTE_ENCODING), Constants.BYTE_ENCODING).replaceAll("\\+", "%20")
        + "&peer_id="   + URLEncoder.encode(new String(peerId, Constants.BYTE_ENCODING), Constants.BYTE_ENCODING).replaceAll("\\+", "%20")
      URL url = new URL(strUrl);
      URLConnection con = url.openConnection();
      con.connect();
      con.getContent();
}
}
//159
public class func{
	public void update(){
        String str = this.headers.get(Constants.BUNDLE_UPDATELOCATION);
            if (str == null) {
        str = this.location;
      }
      update(new URL(str).openConnection().getInputStream());
            throw new BundleException("Could not update " + toString()
                    + " from " + str, e);
}
}
//160
public class func{
	public void onSubmit(AjaxRequestTarget target,Form form){
                if (logo.getDefaultModelObjectAsString() != null) {
                    try { 
                        URL url = new URL(logo.getDefaultModelObjectAsString());
                        URLConnection conn = url.openConnection();
                        type.getModel().setObject(conn.getContentType());
                        BufferedImage image = ImageIO.read(conn.getInputStream());
                        height.setModelValue("" + image.getHeight());
                        width.setModelValue("" + image.getWidth());
                    } catch (Exception e) {
                    }
                }
}
}
//161
public class func{
	public void get(String fragment){
        if (fragment == null) {
            url = base;
        } else {
            url = new URL(base, fragment);
        }
        return url.openConnection();
}
}
//162
public class func{
	public void getBitmapFromUrl(String url){
            URLConnection conn = new URL(url).openConnection();
            conn.setConnectTimeout(CONNECT_TIMEOUT);
            conn.setReadTimeout(READ_TIMEOUT);
            bitmap = BitmapFactory.decodeStream((InputStream) conn.getContent());
}
}
//163
public class func{
	public void openConnection(URL url){
      String name = url.getPath().substring(
          ExplodedArchive.this.root.toURI().getPath().length());
      if (ExplodedArchive.this.entries.containsKey(new AsciiBytes(name))) {
        return new URL(url.toString()).openConnection();
      }
      return new FileNotFoundURLConnection(url, name);
}
}
//164
public class func{
	public void test(String s){
        URL url = new URL(s);
        URLConnection conn = url.openConnection();
        if (conn.getLastModified() == 0) {
            System.out.println("Failed: getLastModified returned 0 for URL: " + s);
            testFailed = true;
        }
}
}
//165
public class func{
	public void getURLConnection(String filenameOrURI){
  if (conn == null)
  {
      URL url = new URL(filenameOrURI);
      return url.openConnection();
  }
  else
      return conn;
}
}
//166
public class func{
	public void url(String urls){
        URL url = new URL(urls);
        InputStream ins = url.openConnection().getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
        while((str = reader.readLine()) != null)
            System.out.println(str);
}
}
//167
public class func{
	public void revokeToken(String accessToken){
            String urlString = new StringBuilder(FacebookConstants.PROFILE_ENDPOINT_URL).append("/permissions?access_token=")
                    .append(URLEncoder.encode(accessToken, "UTF-8")).append("&method=delete").toString();
            URL revokeUrl = new URL(urlString);
            HttpResponseContext revokeContent = OAuthUtils.readUrlContent(revokeUrl.openConnection());
            if (revokeContent.getResponseCode() != 200) {
                throw new OAuthException(OAuthExceptionCode.TOKEN_REVOCATION_FAILED,
                        "Error when revoking token. Http response code: " + revokeContent.getResponseCode() + ", Error details: " + revokeContent.getResponse());
            }
}
}
//168
public class func{
	public void getResource(String path){
      URL url = new URL("jar:file:" + this.jarPath + "!" + path);
      URLResource resource = new URLResource(url, url.openConnection(), path);
      if (resource.getContentLength() < 0) {
        return null;
      }
}
}
//169
public class func{
	public void shouldServetWebJar(){
    String host = address.getHost();
    if (Strings.isNullOrEmpty(host)) {
      host = "127.0.0.1";
    }
    URL url = new URL("http", host, address.getPort(),
        "/webjars/bootstrap/3.1.0/css/bootstrap.min.css");
    Object content = url.openConnection().getContent();
}
}
//170
public class func{
	public void getFileSizeFromHttpHead(final String fileUrl){
            URLConnection connection = new URL(fileUrl).openConnection();
            connection.setUseCaches(true);
            connection.setReadTimeout(httpTimeout);
            connection.setConnectTimeout(httpTimeout);
            String contentLenght = connection.getHeaderField(CONTENT_LENGTH);
            return Long.parseLong(contentLenght);
            throw new DownloadException(String.format("Can not obtain file [%s] size", fileUrl), e);
}
}
//171
public class func{
	public void main(String[] args){
        for (int i = 0; i < REFERENCE.length; i++)
        {
            URL url = new URL(REFERENCE[i]);
            URLConnection urlconn = url.openConnection();
            urlconn.connect();
            InputStream is = (InputStream) urlconn.getContent();
            parse(read(is));
        }
        printByteCodes();
}
}
//172
public class func{
	public void getBugTrackerUrl(){
      final URL url = new URL(BUG_TRACKER_REFERENCE_URL);
      final BufferedReader in = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
      BUG_TRACKER_URL = in.readLine();
}
}
//173
public class func{
	public void testContentLength(){
        File f = new File("test/webresources/war-url-connection.war");
        String fileUrl = f.toURI().toURL().toString();
        URL indexHtmlUrl = new URL("jar:war:" + fileUrl +
                "*/WEB-INF/lib/test.jar!/META-INF/resources/index.html");
        URLConnection urlConn = indexHtmlUrl.openConnection();
        urlConn.connect();
        int size = urlConn.getContentLength();
        Assert.assertEquals(137, size);
}
}
//174
public class func{
	public void isInternetAccessible(int timeout){
      URLConnection c = new URL("http://www.google.com").openConnection();
      c.setConnectTimeout(timeout);
      ((HttpURLConnection)c).getResponseCode();
}
}
//175
public class func{
	public void test_getRequestProperty_LString_Exception(){
        URL url = new URL("http", "test", 80, "index.html", new NewHandler());
        URLConnection urlCon = url.openConnection();
        urlCon.setRequestProperty("test", "testProperty");
        assertNull(urlCon.getRequestProperty("test"));
        urlCon.connect();
            urlCon.getRequestProperty("test");
}
}
//176
public class func{
	public void main(String argv[]){
            URL url = new URL("http://sunweb.ebay/");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();
            OutputStream os = urlConnection.getOutputStream();
}
}
//177
public class func{
	public void main(String[] args){
    URL u = new URL(url);
    HttpsURLConnection  conn =  (HttpsURLConnection) u.openConnection(); 
    conn.setRequestMethod("POST"); 
    OutputStream os = conn.getOutputStream();
    OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
    PrintWriter pw = new PrintWriter(osw);
    pw.write(json);
    pw.flush();
    pw.close();
}
}
//178
public class func{
	public void validateKnownStarCertificate(String url,String info){
        URL destinationURL = new URL(url);
        HttpsURLConnection sslConnection = (HttpsURLConnection) destinationURL.openConnection();
        sslConnection.connect();
        Certificate[] sslCertificates = sslConnection.getServerCertificates();
        for (Certificate c : sslCertificates) {
            assertTrue(c instanceof X509Certificate);
            X509Certificate cert = (X509Certificate) c;
            System.out.println(cert.getSubjectDN().getName());
            cert.checkValidity();
        }
}
}
//179
public class func{
	public void retrieve(ModuleSpec module,ModuleVersion version){
        System.out.println( "Attempting to Jenkins download module " + module.getName() + " v" + version.getBuild() );
            URL website = new URL( "http://ci.md-5.net/job/BungeeCord/" + version.getBuild() + "/artifact/module/" + module.getName().replace( '_', '-' ) + "/target/" + module.getName() + ".jar" );
            URLConnection con = website.openConnection();
            con.setConnectTimeout( 15000 );
            con.setReadTimeout( 15000 );
}
}
//180
public class func{
	public void httpsGet(WebServer webServer,String path){
        URL wsUrl = webServer.getUri().toURL();
        URL url = new URL("https", "localhost", wsUrl.getPort(), path);
        return (HttpsURLConnection) url.openConnection();
}
}
//181
public class func{
	public void fetchJson(String address){
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(5 * 1000);
            conn.setReadTimeout(5 * 1000);
}
}
//182
public class func{
	public void downloadList(String libURL){
            URL url = new URL(libURL);
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            InputSupplier<InputStream> urlSupplier = new URLISSupplier(connection);
            return CharStreams.readLines(CharStreams.newReaderSupplier(urlSupplier, Charsets.UTF_8));
}
}
//183
public class func{
	public void isRunning(){
            LOG.debug( "Retrieving " + checkStatusURL + " to see if Tomcat is up and running." );
            URL url = new URL( checkStatusURL );
            URLConnection urlConn = url.openConnection();
            urlConn.connect();
}
}
//184
public class func{
	public void run(){
          URL u = new URL(urlString);
          HttpsURLConnection c = (HttpsURLConnection)u.openConnection();
          c.connect();
          setText("" + c.getResponseCode() + " "
              + c.getResponseMessage(), false);
          c.disconnect();
}
}
//185
public class func{
	public void httpGet(WebServer webServer,SSLSocketFactory socketFactory){
    URL url = new URL("https://localhost:" + webServer.port());
    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
    conn.setSSLSocketFactory(socketFactory);
    conn.setRequestMethod("GET");
    conn.getResponseCode();
}
}
//186
public class func{
	public void test_keystore_in_classpath_google_dot_com(){
        URL url = new URL("https://www.google.com");
        HttpsURLConnection cnn = (HttpsURLConnection) url.openConnection();
        cnn.setSSLSocketFactory(sslSocketFactory);
        int responseCode = cnn.getResponseCode();
}
}
//187
public class func{
	public void getCertificates(String url){
            URL destinationURL = new URL(url);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) destinationURL.openConnection();
            httpsURLConnection.connect();
            return httpsURLConnection.getServerCertificates();
}
}
//188
public class func{
	public void test1ServerRunning(){
        URLConnection connection = new URL("http://" + TestSuiteEnvironment.formatPossibleIpv6Address(DomainTestSupport.slaveAddress) + ":8080").openConnection();
        connection.connect();
}
}
//189
public class func{
	public void testStandardHost(){
            URLConnection connection = new URL("http://" + TestSuiteEnvironment.formatPossibleIpv6Address(masterAddress) + ":8080").openConnection();
            connection.connect();
}
}
//190
public class func{
	public void checkKmlUrl(String urlString){
            URL url = new URL(urlString);
            URLConnection myURLConnection = url.openConnection();
            myURLConnection.connect();
}
}
//191
public class func{
	public void isInternetReachable(String address){
            URL url = new URL(address);
            URLConnection connection = url.openConnection();
            connection.connect();
}
}
//192
public class func{
	public void request(X509TrustManager tm){
        HttpsURLConnection con = (HttpsURLConnection)new URL("https://localhost:59009/CountRequestsServlet").openConnection();
}
}
//193
public class func{
	public void main(String[] args){
        HttpsURLConnection con = (HttpsURLConnection) new URL("https://github.com").openConnection();
        print_https_cert(con);
        print_content(con);
}
}
//194
public class func{
	public void test_trust_invalid_ssl_certificate_with_google_ip(){
        HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
}
}
//195
public class func{
	public void test_selfsigned_certificate(){
        HttpsServer server = getHttpsServer(keyStore, password);
        URL testUrl = new URL("https://127.0.0.1:" + server.getAddress().getPort() + "/");
        HttpsURLConnection cnn = (HttpsURLConnection) testUrl.openConnection();
}
}
//196
public class func{
	public void openConnection(String path,String query){
    final URL url = new URL("https", nnAddr.getHostName(), 
        nnAddr.getPort(), path + '?' + query);
    HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
}
}
//197
public class func{
	public void test_getLocalPrincipal(){
        URL url = new URL("https://localhost:55555");
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.getLocalPrincipal();
}
}
//198
public class func{
	public void test_getCipherSuite(){
        URL url = new URL("https://localhost:55555");
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.getCipherSuite();
}
}
//199
public class func{
	public void testLongHeader(){
    URL url = new URL(baseUrl, "/longheader");
    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
}
}
//200
public class func{
	public void testHURL(TrustManager[] managers,String url){
          (HttpsURLConnection)new URL(url).openConnection();
}
}
//201
public class func{
	public void testOpenSslConnection_https(){
        final URL httpsUrl = new URL("https://example.com");
        final HttpsURLConnection connection = (HttpsURLConnection) httpsUrl.openConnection();
        client.openSslConnection(connection);
        assertEquals(sslSocketFactory, connection.getSSLSocketFactory());
}
}
//202
public class func{
	public void getHttpsURLConnection(String strUrl){
    URL url = new URL(strUrl);
    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url
        .openConnection();
}
}
//203
public class func{
	public void testSslConnection(){
    URL url = new URL(sslServerAddress.getUrl() + "/first/");
    URLConnection connection = url.openConnection();
    HttpsURLConnection sslConnection = (HttpsURLConnection) connection;
}
}
//204
public class func{
	public void postTokenEndpoint(String payload){
        HttpsURLConnection connection = (HttpsURLConnection) new URL(TOKEN_URL).openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        final OutputStream os = connection.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
        writer.write(payload);
        writer.flush();
        writer.close();
}
}
//205
public class func{
	public void test_getRequestProperties_Exception(){
        URL url = new URL("http", "test", 80, "index.html", new NewHandler());
        URLConnection urlCon = url.openConnection();
        urlCon.connect();
            urlCon.getRequestProperties();
}
}
//206
public class func{
	public void validateAndUpdateURL(String strURL){
        URL url = new URL(strURL);
        URLConnection conn = url.openConnection();
        conn.connect();
}
}
//207
public class func{
	public void isInternetReachable(){
            URL url = new URL(DL_URL);
            URLConnection openConnection = url.openConnection();
            openConnection.connect();
}
}
//208
public class func{
	public void IsNetworkAvailable(){
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
}
}
//209
public class func{
	public void getCliTcpPort(String url){
        URLConnection head = new URL(url).openConnection();
            head.connect();
}
}
//210
public class func{
	public void main(String s[]){
                URL url = new URL("file:azwe.txt");
                URLConnection urlConnection = url.openConnection();
                urlConnection.connect();
}
}
//211
public class func{
	public void doInBackground(String... strings){
                URL url = new URL(targetUrl);
                HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
                conn.connect();
                int code = conn.getResponseCode();
}
}
//212
public class func{
	public void test_keystore_on_file_system_google_dot_com(){
        URL url = new URL("https://www.google.com");
        HttpsURLConnection cnn = (HttpsURLConnection) url.openConnection();
        cnn.setSSLSocketFactory(sslSocketFactory);
        int responseCode = cnn.getResponseCode();
}
}
//213
public class func{
	public void call(Context cx,Scriptable scope,Scriptable thisObj,Object[] params){
      InputStream in = new URL((String)params[0]).openConnection().getInputStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
}
}
//214
public class func{
	public void doClient(){
        InetSocketAddress address = httpsServer.getAddress();
        URL url = new URL("https://localhost:" + address.getPort() + "/");
        HttpsURLConnection uc = (HttpsURLConnection) url.openConnection();
}
}
//215
public class func{
	public void testOpenSslConnection_nullSslSocketFactory(){
        final URL httpsUrl = new URL("https://example.com");
        final HttpsURLConnection connection = (HttpsURLConnection) httpsUrl.openConnection();
        client.openSslConnection(connection);
}
}
//216
public class func{
	public void newHttpsConnection(){
    return (HttpsURLConnection) new URL("https://localhost").openConnection();
}
}
//217
public class func{
	public void test_getLocalCertificates(){
        URL url = new URL("https://localhost:55555");
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.getLocalCertificates();
}
}
//218
public class func{
	public void doInBackground(Void... params){
                    URL url = new URL(urlStr);
                    urlConnection = (HttpsURLConnection)url.openConnection();
}
}
//219
public class func{
	public void connection(){
    final URL url = new URL(pth);
    final URLConnection conn = url.openConnection();
    conn.setConnectTimeout(TIMEOUT * 1000);
}
}
//220
public class func{
	public void queryAtDServer(String text){
      URL url = new URL(urlPrefix + URLEncoder.encode(text, "UTF-8"));
      URLConnection conn = url.openConnection();
      conn.setRequestProperty("User-Agent", "AtDEvalChecker, contact daniel.naber " + atSign + " languagetool.org");
      InputStream contentStream = (InputStream) conn.getContent();
      return StringTools.streamToString(contentStream, "UTF-8");
}
}
//221
public class func{
	public void doGet(String url,Map<String,?> headers,String contentType,String charset,boolean binary){
        connection = new URL( url ).openConnection();
        connection.setConnectTimeout( DEFAULT_TIMEOUT_SECONDS * 1000 );
        manageContentTypeHeaders( contentType, charset, connection, binary );
        manageHeaders( headers, connection );
}
}
//222
public class func{
	public void getJarEntries(String jarName,String entryName){
        JarURLConnection urlConnection = (JarURLConnection) new URL("jar:file:" + jarName + "!/" + entryName).openConnection();
            JarURLConnection jarConnection = ((JarURLConnection)urlConnection);
            JarFile jarFile = jarConnection.getJarFile();
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                if (entry.getName().startsWith(jarConnection.getEntryName())) {
                    if (!entry.isDirectory()) {
                        files.add(entry.getName());
                    }
                }
            }
}
}
//223
public class func{
	public void callBart(){
    URL url = new URL(urlString);
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("Content-Type","text/plain");
        conn.setDoOutput(true);
        PrintWriter writer = new PrintWriter(conn.getOutputStream());
        writer.println(text);
        writer.close();
}
}
//224
public class func{
	public void verify(String url,RequestParameters requestParameters){
            URLConnection uc = new URL(url).openConnection();
            uc.setDoOutput(true);
            uc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(uc.getOutputStream(), Charsets.UTF_8));
}
}
//225
public class func{
	public void getContent(String url){
      InputStream in = new URL(url).openConnection().getInputStream();
      int len = in.read(buffer);
      while (len > 0) {
        out.append(new String(buffer, 0, len));
        len = in.read(buffer);
      }
}
}
//226
public class func{
	public void doInBackground(String... uris){
              URL url = new URL(uris[0]);
              Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
}
}
//227
public class func{
	public void doInBackground(Void... params){
                URL url = new URL(image_url);
                bmp = BitmapFactory.decodeStream(url.openConnection()
                        .getInputStream());
}
}
//228
public class func{
	public void doInBackground(Void... params){
        URL url = new URL(image_url);
        bmp = BitmapFactory.decodeStream(url.openConnection()
            .getInputStream());
}
}
//229
public class func{
	public void doInBackground(Void... params){
            url = new URL(mImageURL);
            mBitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
}
}
//230
public class func{
	public void openJarURLConnection(){
        String cts = System.getProperty("java.io.tmpdir");
        File tmpDir = new File(cts);
        Support_Resources.copyFile(tmpDir, null, "hyts_att.jar");
        URL fUrl1 = new URL("jar:file:" + tmpDir.getPath()
                + "/hyts_att.jar!/");
        JarURLConnection con1 = (JarURLConnection) fUrl1.openConnection();
}
}
//231
public class func{
	public void download(String address,String localFileName){
                URL url = new URL(address);
                connection = url.openConnection();
                connection.setRequestProperty("User-Agent", Constants.USER_AGENT);
                connection.setDoInput(true);
}
}
//232
public class func{
	public void scan(TldScanner.TldScannerCallback callback,File webapp,String path){
        String fullPath = new File(webapp, path).toURI().toString();
        URL jarUrl = new URL("jar:" + fullPath + "!/");
        JarURLConnection connection = (JarURLConnection) jarUrl.openConnection();
        callback.scan(connection, path, true);
}
}
//233
public class func{
	public void sendRequest(){
        URLConnection connection = new URL("http://localhost:8181/cxf/HelloWorld")
                .openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
}
}
//234
public class func{
	public void sendRequest(){
        URLConnection connection = new URL("http://localhost:8181/cxf/HelloWorld")
                .openConnection();
        connection.setDoInput(true);
        connection.setDoOutput(true);
        OutputStream os = connection.getOutputStream();
}
}
//235
public class func{
	public void getHttpConnection(String target){
        URL url = new URL(target);        
        URLConnection connection = url.openConnection();            
        assertTrue(connection instanceof HttpURLConnection);
        return (HttpURLConnection)connection;        
}
}
//236
public class func{
	public void test_getNextJarEntry(){
        InputStream is = new URL(jarName).openConnection().getInputStream();
        JarInputStream jis = new JarInputStream(is);
        JarEntry je = jis.getNextJarEntry();
        while (je != null) {
            actual.add(je.toString());
            je = jis.getNextJarEntry();
        }
}
}
//237
public class func{
	public void test_getJarFileURL(){
        URL url = new URL("jar:file:///bar.jar!/foo.jar!/Bugs/HelloWorld.class");
        String jarFileUrl = ((JarURLConnection) url.openConnection()).getJarFileURL().toString();
        assertTrue(jarFileUrl.equals("file:///ba
}
}
//238
public class func{
	public void getBook(String endpointAddress,String resource,String type,String mHeader){
        URL url = new URL(endpointAddress);
        URLConnection connect = url.openConnection();
        connect.addRequestProperty("Accept-Encoding", "gzip;q=1.0, identity; q=0.5, *;q=0");
}
}
//239
public class func{
	public void getConnection(String url,String auth){
        URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.addRequestProperty("Authorization", auth);
}
}
//240
public class func{
	public void connectionTo(final String location){
        final URL url = new URL(location);
        final URLConnection urlConnection = url.openConnection();
        urlConnection.setDoInput(true);
        urlConnection.setDoOutput(false);
        urlConnection.setAllowUserInteraction(false);
        addBasicAuth(url, urlConnection);
}
}
//241
public class func{
	public void test_getJarFileURL(){
        URL u = createContent("lf.jar", "plus.bmp");
        URL fileURL = new URL(u.getPath().substring(0, u.getPath().indexOf("!")));
        juc = (JarURLConnection) u.openConnection();
        assertTrue("Returned incorrect file URL", juc.getJarFileURL().equals(
                fileURL));
}
}
//242
public class func{
	public void testService(){
        URL url = new URL("http://localhost:" + RegressionTestSupport.HTTP_PORT + "/test/services");
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write("This is a test");
        wr.flush();
}
}
//243
public class func{
	public void test_getJarFile29(){
        JarURLConnection conn = (JarURLConnection) new URL("jar:file:"
                + jarFile.getAbsolutePath().replaceAll(" ", "%20") + "!/")
                .openConnection();
        conn.getJarFile().entries();
}
}
//244
public class func{
	public void test_getJarFile29(){
        JarURLConnection conn = (JarURLConnection) new URL("jar:file:"
                + jarFile.getAbsolutePath().replaceAll(" ", "%20") + "!/")
                .openConnection();
        conn.getJarFile().entries();
}
}
//245
public class func{
	public void getUrlContentType(String name){
        File            file = new File(System.getProperty("test.src", "."), "xml");
        URL             u = new URL ("file:"
                            + file.getCanonicalPath()
                            + file.separator
                            + name);
        URLConnection   conn = u.openConnection ();
        return conn.getContentType ();
}
}
//246
public class func{
	public void main(String args[]){
        URL url = new URL( args[0] );
        URLConnection conn = url.openConnection();
        conn.setRequestProperty( "User-Agent", "Java" );
}
}
//247
public class func{
	public void getUrlContentType(String name){
        File file = new File(System.getProperty("test.src", "."), "xml");
        URL u = new URL("file:"
                         + file.getCanonicalPath()
                         + file.separator
                         + name);
        URLConnection conn = u.openConnection();
        return conn.getContentType();
}
}
//248
public class func{
	public void getJarURLConnection(){
        File file = getLocalFile("hyts_att.jar");
        URL fUrl1 = new URL("jar:file:" + file.getPath() + "!/");
        con1 = (JarURLConnection) fUrl1.openConnection();
}
}
//249
public class func{
	public void getJar(String jarUrl){
        URL url = new URL("jar:" + jarUrl + "!/");
        JarURLConnection jarConnection = (JarURLConnection) url.openConnection();
        JarFile jar = jarConnection.getJarFile();
}
}
//250
public class func{
	public void testLoadingOfApplicationImage(){
    String uri = getAbsoluteUrl("/public/images/favicon.png");
    Logger.debug("Testing loading of image at '%s'", uri);
    URL url = new URL(uri);
    URLConnection connection = url.openConnection();
    assertTrue(connection.getContentLength() > 0);
    assertEquals("image/png", connection.getContentType());
}
}
//251
public class func{
	public void getJarFile(){
        URL jarFileUrl = new URL("jar:" + jarUrl + "!/");
        JarURLConnection conn = (JarURLConnection) jarFileUrl.openConnection();
        conn.setUseCaches(false);
        conn.connect();
        return conn.getJarFile();
}
}
//252
public class func{
	public void construct(){
                    URL url = new URL(getDocumentBase(), getParameter("datafile"));
                    InputStream in = url.openConnection().getInputStream();
}
}
//253
public class func{
	public void testUrlContainsQueryButNoPath(){
        server.enqueue(new MockResponse().setBody("A"));
        server.play();
        URL url = new URL("http", server.getHostName(), server.getPort(), "?query");
        assertEquals("A", readAscii(url.openConnection().getInputStream(), Integer.MAX_VALUE));
        RecordedRequest request = server.takeRequest();
        assertEquals("GET /?query HTTP/1.1", request.getRequestLine());
}
}
//254
public class func{
	public void loadText(String filename){
            final URL url = new URL(filename);
            final InputStream is = url.openConnection().getInputStream();
}
}
//255
public class func{
	public void testWebProxyResources(){
        URL url = new URL(baseURL);
        URLConnection conn = url.openConnection(proxy);
        Object content = conn.getContent();
        String actualProxy = IOUtils.toString((InputStream) content);
        assertThat(actualProxy, is(expect));
        assertThat(wpr.getCount(), is(1));
}
}
//256
public class func{
	public void testUndertow(){
     URL url = new URL("http://localhost:8080/RESTEASY-903/test");
     HttpURLConnection conn = HttpURLConnection.class.cast(url.openConnection());
     conn.connect();
     System.out.println("status: " + conn.getResponseCode());
     conn.getInputStream().read(b);
     System.out.println("result: " + new String(b));
}
}
//257
public class func{
	public void get(String pdbId){
      URL url = new URL(URL_STUB + pdbId);
      is = url.openConnection().getInputStream();
}
}
//258
public class func{
	public void getFromPdbId(String pdbId){
      URL url = new URL(PDB_URL_STUB + pdbId);
      is = url.openConnection().getInputStream();
}
}
//259
public class func{
	public void main(String[] args){
        final URL url = new URL((args.length > 0) ? args[0] : "http://192.168.200.1");
        final InputStream is = url.openConnection().getInputStream();
}
}
//260
public class func{
	public void test_getJarFileURL(){
        URL url = new URL("jar:file:///bar.jar!/foo.jar!/Bugs/HelloWorld.class");
        assertEquals("file:///bar.jar", ((JarURLConnection) url.openConnection()).getJarFileURL().toString());
}
}
//261
public class func{
	public void JarRepresentation(final String uri){
            super(FileURIDereferencer.findMediaType(uri));
                jc = (JarURLConnection) (new URL(uri).openConnection());
                inputStream = jc.getInputStream();
}
}
//262
public class func{
	public void test_getEntryName(){
        URL url = new URL("jar:file:///bar.jar!/foo.jar!/Bugs/HelloWorld.class");
        assertEquals("foo.jar!/Bugs/HelloWorld.class",((JarURLConnection)url.openConnection()).getEntryName());
}
}
//263
public class func{
	public void actionPerformed(java.awt.event.ActionEvent actionEvent){
                        org.osid.repository.PartIterator partIterator = mRecord.getParts();
                        while (partIterator.hasNextPart()) {
                            org.osid.repository.Part part = partIterator.nextPart();
                            String fedoraUrl = part.getValue().toString();
                            URL url = new URL(fedoraUrl);
                            URLConnection connection = url.openConnection();
                            tufts.Util.openURL(fedoraUrl);
                            break;
                            
                        }
}
}
//264
public class func{
	public void run(Blob blob){
        URL target = new URL(url);
        URLConnection conn = target.openConnection();
        conn.setDoOutput(true);
}
}
//265
public class func{
	public void loadURL(final String urlString){
    URL url = new URL(urlString);
    URLConnection conn = url.openConnection();
    node_ = getBuilder().parse((InputStream) conn.getContent());
}
}
//266
public class func{
	public void main(String[] args){
        URL url = new URL("http://localhost:" + port);
        URLConnection conURL =  url.openConnection();
        conURL.setDoInput(true);
        conURL.setAllowUserInteraction(false);
        conURL.setUseCaches(false);
}
}
//267
public class func{
	public void get(final Object key){
    final Matcher matcher = VAR_PATTERN.matcher(url);
      final URL url = new URL(matcher.replaceAll(key.toString()));
      final URLConnection con = url.openConnection();
      return (String) con.getContent();
}
}
//268
public class func{
	public void run(){
                    URL url = new URL(link);
                    URLConnection conn = url.openConnection();
                    conn.getContent();
}
}
//269
public class func{
	public void run(){
                    url = new URL(link);
                    conn = url.openConnection();
                    conn.getContent();
}
}
//270
public class func{
	public void fillStreamFromHttpFile(Uri uri){
            URL url = new URL(uri.getPath());
            url.openConnection();
            inStream = new BufferedInputStream(url.openStream());
}
}
//271
public class func{
	public void login(){
          + URLEncoder.encode(username, "UTF-8") + "&password="
          + URLEncoder.encode(password, "UTF-8");
      URL loginurl = new URL(url);
      URLConnection connection = loginurl.openConnection();
      cookies = connection.getHeaderFields().get("Set-Cookie");
}
}
//272
public class func{
	public void openHTMLFile(){
        String cts = System.getProperty("java.io.tmpdir");
        File tmpDir = new File(cts);
        Support_Resources.copyFile(tmpDir, null, "hyts_htmltest.html");
        URL fUrl1 = new URL("file:/" + tmpDir.getPath()
                + "/hyts_htmltest.html");
        URLConnection con1 = fUrl1.openConnection();
}
}
//273
public class func{
	public void actionPerformed(java.awt.event.ActionEvent actionEvent){
                        String fedoraUrl = mInfoRecord.getInfoField(new PID(FedoraUtils.getFedoraProperty(mDR, "DisseminationURLInfoPartId"))).getValue().toString();
                        URL url = new URL(fedoraUrl);
                        URLConnection connection = url.openConnection();
                        System.out.println("FEDORA ACTION: Content-type:"+connection.getContentType()+" for url :"+fedoraUrl);
}
}
//274
public class func{
	public void search(String query){
        String urlEncodedQuery = URLEncoder.encode(query, "UTF-8");
        URL url = new URL(FLIGHT_AWARE_JSON_URL + "?howMany=100&query=" + urlEncodedQuery);
        URLConnection uc = url.openConnection();
}
}
//275
public class func{
	public void init(){
            URLConnection urlConnection = new URL(nextPageUrl).openConnection();
            nextPageUrl = extractRelativeLink(urlConnection.getHeaderField("Link"), "next");
}
}
//276
public class func{
	public void getRedirectUrl(String urlStr){
        URL url = new URL(urlStr);
        URLConnection conn = url.openConnection();
        String location = conn.getHeaderField("Location");
}
}
//277
public class func{
	public void openConnection(String location){
        do
        {
            URL skinURL = new URL(location);
            connection = skinURL.openConnection();
            location = connection.getHeaderField("Location");
        }
        while(location != null);
}
}
//278
public class func{
	public void getContentLength(String fileUrl){
    URL url = new URL(fileUrl);
    URLConnection connection = url.openConnection();
    return connection.getContentLength();
}
}
//279
public class func{
	public void getFileSize(String location){
        URLConnection connection = new URL(location).openConnection();
        return Common.readableSize(connection.getContentLength());
}
}
//280
public class func{
	public void resolveStreamFromUrl(){
        String u = endpoint.getUrl();
        ObjectHelper.notEmpty(u, "url");
        LOG.debug("About to write to url: {}", u);
        URL url = new URL(u);
        URLConnection c = url.openConnection();
        return c.getOutputStream();
}
}
//281
public class func{
	public void test_JarInputStream_Integrate_Jar_getNextEntry(){
        String intJarName = Support_Resources.getURL("Integrate.jar");
        InputStream is = new URL(intJarName).openConnection()
                .getInputStream();
        JarInputStream jin = new JarInputStream(is, true);
}
}
//282
public class func{
	public void test_getManifest(){
        is = new URL(jarName).openConnection().getInputStream();
        jis = new JarInputStream(is);
        m = jis.getManifest();
        assertNotNull("The jar input stream should have a manifest", m);
}
}
//283
public class func{
	public void test_Integrate_Jar_read(){
        String intJarName = Support_Resources.getURL("Integrate.jar");
        InputStream is = new URL(intJarName).openConnection()
                .getInputStream();
        JarInputStream jin = new JarInputStream(is, true);
}
}
//284
public class func{
	public void test_JarInputStream_Modified_Manifest_MainAttributes_getNextEntry(){
        String modJarName = Support_Resources.getURL("Modified_Manifest_MainAttributes.jar");
        InputStream is = new URL(modJarName).openConnection()
                .getInputStream();
        JarInputStream jin = new JarInputStream(is, true);
        assertEquals("META-INF/TESTROOT.SF", jin.getNextEntry().getName());
        assertEquals("META-INF/TESTROOT.DSA", jin.getNextEntry().getName());
            jin.getNextEntry();
        assertEquals("META-INF/", jin.getNextEntry().getName());
        assertEquals("Test.class", jin.getNextEntry().getName());
        assertNull(jin.getNextEntry());
        jin.close();
}
}
//285
public class func{
	public void test_getManifest(){
        InputStream is = new URL(jarName2).openConnection().getInputStream();
        JarInputStream jis = new JarInputStream(is);
        m = jis.getManifest();
        assertNull("The jar input stream should not have a manifest", m);
}
}
//286
public class func{
	public void contextInitialized(ServletContextEvent event){
                URL url = new URL("http://localhost/");
                URLConnection urlConn = url.openConnection();
                urlConn.setDefaultUseCaches(false);
}
}
//287
public class func{
	public void test_Access_ReadAll_URL(){
      URL url = new URL(anUndirectedTriangleHttpURL());
      URLConnection c = url.openConnection();
      c.setDefaultUseCaches(false);
}
}
//288
public class func{
	public void disableUrlConnectionCaching(){
            URL url = new URL("jar:file://valid_jar_url_syntax.jar!/");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDefaultUseCaches(false);
}
}
//289
public class func{
	public void MojangResourceProvider(String version,TextureFactory factory){
            InputStream inputStream = new URL(String.format(JAR_LOCATION, version))
                    .openConnection().getInputStream();
            fromStream(inputStream, factory);
}
}
//290
public class func{
	public void getImageConnection(final Integer id){
      rv = new URL(String.format(imageUrlFormat, "s", id)).openConnection();      
}
}
//291
public class func{
	public void dataSchemeShouldAllowImageData(){
    URLConnection connection = new URL("data:image/gif;base64,R0lGODdhMAAwAPAAAAAAAP///ywAAAAAMAAw"
        + "AAAC8IyPqcvt3wCcDkiLc7C0qwyGHhSWpjQu5yqmCYsapyuvUUlvONmOZtfzgFz"
        + "ByTB10QgxOR0TqBQejhRNzOfkVJ+5YiUqrXF5Y5lKh/DeuNcP5yLWGsEbtLiOSp"
        + "a/TPg7JpJHxyendzWTBfX0cxOnKPjgBzi4diinWGdkF8kjdfnycQZXZeYGejmJl"
        + "ZeGl9i2icVqaNVailT6F5iJ90m6mvuTS4OK05M0vDk0Q4XUtwvKOzrcd3iq9uis"
        + "F81M1OIcR7lEewwcLp7tuNNkM3uNna3F2JQFo97Vriy/Xl4/f1cf5VWzXyym7PH"
        + "hhx4dbgYKAAA7").openConnection();
    assertThat(connection).isNotNull();
}
}
//292
public class func{
	public void testDefaultUseCachesSetsInitialValueOnly(){
        URL url = new URL("http://localhost/");
        URLConnection c2 = url.openConnection();
        assertTrue(c1.getDefaultUseCaches());
        c1.setDefaultUseCaches(false);
            assertTrue(c1.getUseCaches());
}
}
//293
public class func{
	public void HTTPAsyncGet(String urlString){
                logger.info("HTTPAsyncGet new with url: " + urlString);
                URL url = new URL(urlString);
                connection = url.openConnection();
                connection.setConnectTimeout(timeout);
}
}
//294
public class func{
	public void dataSchemeShouldAllowContentTypeParameters(){
    URLConnection connection = new URL("data:text/xml;encoding=utf-8;base64,aGVsbG8gd29ybGQ=")
        .openConnection();
    assertThat(connection).isNotNull();
}
}
//295
public class func{
	public void dataSchemeShouldAllowOptionalEncoding(){
    URLConnection connection = new URL("data:text/xml,<hello/>").openConnection();
    assertThat(connection).isNotNull();
}
}
//296
public class func{
	public void dataSchemeShouldAllowGenericText(){
    URLConnection connection = new URL("data:A%20brief%20note").openConnection();
    asser
}
}
//297
public class func{
	public void dataSchemeShouldBeTreated(){
    URLConnection connection = new URL("data:text/html;enc,hello").openConnection();
    assertThat(connection).isNotNull();
}
}
//298
public class func{
	public void download(String url){
      URL u = new URL(url);
      u.openConnection();
      InputStream istream = u.openStream();
}
}
//299
public class func{
	public void getEntryUrlStream(){
    URL url = new URL(this.jarFile.getUrl(), "1.dat");
    url.openConnection();
    InputStream stream = url.openStream();
}
}
//300
public class func{
	public void testLink(){
    final XdocFile file = this._parseHelperExtensions.getDocFromFile((ParserTestConstants.TEST_FILE_DIR + "linkTest.xdoc"));
    AbstractSection _mainSection = file.getMainSection();
    EList<TextOrMarkup> _contents = _mainSection.getContents();
    TextOrMarkup _head = IterableExtensions.<TextOrMarkup>head(_contents);
    EList<EObject> _contents_1 = _head.getContents();
    EObject _head_1 = IterableExtensions.<EObject>head(_contents_1);
    final Link link = ((Link) _head_1);
    String _url = link.getUrl();
    final URL url = new URL(_url);
    final URLConnection connection = url.openConnection();
    Assert.assertNotNull(connection);
}
}
//301
public class func{
	public void checkLatest(String urlPath,String localPath){
    URL url = new URL(urlPath);
    URLConnection conn = url.openConnection();
    long latest = conn.getLastModified();
}
}
//302
public class func{
	public void run(){
        sb.append("error="+encodeHex(logRecord.getMessage()));
        URL dataurl = new URL(sb.toString());
        dataurl.openConnection();
}
}
//303
public class func{
	public void readBlockInefficiently(){
    sb.append((offset + count)-1);
    LOGGER.fine("Reading block:" + urlOrPaths[0] + "("+sb.toString()+")");
    URL u = new URL(urlOrPaths[0]);
    URLConnection uc = u.openConnection();
}
}
//304
public class func{
	public void useWireMock(){
        URL uri = new URL("http://localhost:8080/blah");
        InputStream content = uri.openConnection().getInputStream();
        final String retrievedBody = IOUtils.toString(content);
        assertEquals("body", retrievedBody);
        assertThat(stdOutCapture.toString(), containsString("c.g.t.wiremock.common.Log4jNotifier - Received request to /mappings/new"));
}
}
//305
public class func{
	public void testFirstUseIsCached(){
            URLConnection connection2 = new URL("http://android.com/").openConnection();
            assertFalse(connection2 instanceof Handler.HandlerURLConnection);
}
}
//306
public class func{
	public void testFirstUseIsCached(){
        URLConnection connection1 = new URL("http://android.com/").openConnection();
        assertFalse(connection1 instanceof Handler.HandlerURLConnection);
            System.setProperty("java.protocol.handler.pkgs", getHandlerPackageName());
}
}
//307
public class func{
	public void testInstallCustomProtocolHandler(){
            URLConnection connection = new URL("http://android.com/").openConnection();
            assertTrue(connection instanceof Handler.HandlerURLConnection);
}
}
//308
public class func{
	public void openConnection(URL u){
        String x = u.getPath();
        x = x.replaceAll("__", "!");
        return new URL(x).openConnection();
}
}
//309
public class func{
	public void dataSchemeShouldDecodeBase64(){
    URLConnection connection = new URL("data:text/plain;base64,aGVsbG8gd29ybGQ=").openConnection();
    assertThat(connection.getContentEncoding()).isNull();
}
}
//310
public class func{
	public void check(){
        final HttpURLConnection conn = HttpURLConnection.class.cast(new URL("http://127.0.0.1:" + port + "/app/api").openConnection());
        assertEquals("ok", IO.slurp(conn.getInputStream()));
        conn.getInputStream().close();
}
}
//311
public class func{
	public void httpGet(WebServer webServer,String path){
        URL url = new URL(webServer.getUri().toURL(), path);
        return url.openConnection();
}
}
//312
public class func{
	public void B6181108(){
                        Integer.toString(ss.getLocalPort()) +
        URL url = new URL (urlWithSpace);
        URLConnection urlc = url.openConnection();
}
}
//313
public class func{
	public void installNewBundle(String bundleName){
      return installNewBundle(str2, new URL(str2).openConnection().getInputStream());
      throw new BundleException("Cannot retrieve bundle from " + bundleName, e);
}
}
//314
public class func{
	public void checkUrl(String url){
      URLConnection connection = new URL(url).openConnection();
        return connection.getURL().toString();
}
}
//315
public class func{
	public void extractUserInfoWithProperties(List<Pair<String,String>> properties,String extractUserInfoUrl){
        URL url = new URL(extractUserInfoUrl);
        URLConnection conn = url.openConnection();
}
}
//316
public class func{
	public void getContent(String url){
            return Streams.readFullyString(SslTrustUtils.trustAll(new URL(url).openConnection()).getInputStream());
}
}
//317
public class func{
	public void getStream(String imageUri,Object extra){
    URL url = new URL(imageUri);
    URLConnection http = url.openConnection();
}
}
//318
public class func{
	public void timeConnect(String site){
      new URL( site ).openConnection().connect(); 
}
}
//319
public class func{
	public void getConnection(){
      return new URL(type.getUrl(yearMonth)).openConnection();
}
}
//320
public class func{
	public void main(String args[]){
        URL url = new URL("file://bogus/index.html");
        url.openConnection();
}
}
//321
public class func{
	public void test(String mimeType){
    URL test = new URL("http://localhost:9999/sparql?query=" + StringUtils.urlEncode(qs));
        URLConnection connection = test.openConnection();
}
}
//322
public class func{
	public void getXMLFromUlr(String urlString){
    URL url = new URL(urlString);
    URLConnection connection = url.openConnection();
}
}
//323
public class func{
	public void main(String[] args){
        URL u = new URL("http://foo.bar.baz/");
            URLConnection con = u.openConnection(Proxy.NO_PROXY);
}
}
//324
public class func{
	public void WarURLConnection(URL url){
        URL innerJarUrl = new URL(url.getFile());
        innerJarUrlConnection = innerJarUrl.openConnection();
}
}
//325
public class func{
	public void shouldBeAbleToSetupContentUrlStreamHandler(){
    assertThat(new URL("content://authority/data").openConnection()).isNotNull();
}
}
//326
public class func{
	public void length(){
          URL u = new URL(path);
          pathUrlConnection = u.openConnection();
}
}
//327
public class func{
	public void getConnection(String url){
        URLConnection conn = new URL(url).openConnection();
}
}
//328
public class func{
	public void getConnection(){
                    c = proxy == null ? new URL(url).openConnection() : new URL(url).openConnection(proxy);
}
}
//329
public class func{
	public void getConnection(){
                    c = proxy == null ? new URL(url).openConnection() : new URL(url).openConnection(proxy);
}
}
//330
public class func{
	public void fetchURL(String url,OutputStream output){
            URL url1 = new URL(url);
            URLConnection urlConnection = url1.openConnection();
}
}
//331
public class func{
	public void isOffline(){
      new URL("http://www.apple.com").openConnection().connect();
}
}
//332
public class func{
	public void downloadFile(String artifact,String src,File dest){
        final URL url = new URL(src);
        final URLConnection connection = url.openConnection();
}
}
//333
public class func{
	public void TwitterSampleStreamer(Map<String,String> config,Comparator<String> versionComparator){
    URL url = new URL("https://stream.twitter.com/1/statuses/sample.json");
    URLConnection uc = url.openConnection();
}
}
//334
public class func{
	public void checkURL(String url){
      URL u = new URL(url);
      u.openConnection();
}
}
//335
public class func{
	public void openConnection(String urlAsString){
    URL url = new URL(urlAsString);
    return url.openConnection();
}
}
//336
public class func{
	public void saveText(String filename){
            final URL url = new URL(filename);
            final OutputStream os = url.openConnection().getOutputStream();
}
}
//337
public class func{
	public void checkWhetherConfiguredCorrectly(){
        new URL(REPOSITORY_IN_BAMBOO + dataPluginId).openConnection();
}
}
//338
public class func{
	public void testRemoteInputStream(){
         URL url = new URL(checkNotNull(sysHttpStreamUrl, "sysHttpStreamUrl"));
         URLConnection connection = url.openConnection();
}
}
//339
public class func{
	public void HttpTestClient(PostParameters params,HttpActivity activity,String commandName){
        connection = new URL("http://" + NettyHttpServerIT.TEST_HOST + ":" + NettyHttpServerIT.TEST_PORT + "/domain/" + commandName)
                .openConnection();
}
}
//340
public class func{
	public void openTicket(){
        URL url = new URL(URL_TICKET);
        URLConnection conn = url.openConnection();
        return getCookie(COOKIE_TICKET, conn);
}
}
//341
public class func{
	public void xdoExample(){
    URI schemaLoc = new java.net.URI(
            "http://giswebservices.massgis.state.ma.us/geoserver/wfs?request=describefeaturetype&service=wfs&version=1.0.0&typename=massgis:GISDATA.COUNTIES_POLY");
    XSISAXHandler schemaHandler = new XSISAXHandler(schemaLoc);
    reader.setContentHandler(schemaHandler);
    reader.parse(new InputSource(new URL(schemaLoc.toString()).openConnection().getInputStream()));
}
}
//342
public class func{
	public void run(){
            new URL(url).openConnection();
}
}
//343
public class func{
	public void initJarUrlConnection(){
      new URL("jar:file://dummy.jar!/").openConnection().setDefaultUseCaches(false);
}
}
//344
public class func{
	public void main(String[] args){
    URLConnection conn = new URL(
      "http://freegeoip.net/json/www.oreilly.com")
      .openConnection();
}
}
//345
public class func{
	public void testInvalidAttachmentJarURL(){
        URL url = new URL(null, "http://invalid/url", (URLStreamHandler) this.handler);
            url.openConnection();
}
}
//346
public class func{
	public void openTicket(){
        URL url = new URL(JSTORFetcher.URL_TICKET);
        URLConnection conn = url.openConnection();
        return JSTORFetcher.getCookie(JSTORFetcher.COOKIE_TICKET, conn);
}
}
//347
public class func{
	public void openConnection(final URL url){
        final URL proxyURL = new URL(url.toExternalForm());
        return proxyURL.openConnection();
}
}
//348
public class func{
	public void getRSSConnection(final String url){
      rv = new URL(Optional.ofNullable(url).orElse("https://dailyfratze.de/michael/tags/Theme/Radtour?format=rss&dir=d")).openConnection();      
}
}
//349
public class func{
	public void testBigCookie(){
    URL url = new URL(baseUrl, "/echocookie");
    URLConnection connection = url.openConnection();
}
}
//350
public class func{
	public void getURLResource(String config){
    URL url = new URL(config);
    if (exists(url)) {
      URLConnection con = url.openConnection();
      try {
        return con.getInputStream();
      }
      catch (IOException ex) {
        // Close the HTTP connection (if applicable).
        if (con instanceof HttpURLConnection) {
          ((HttpURLConnection) con).disconnect();
        }
        throw ex;
      }
    }
}
}
//351
public class func{
	public void download(Dependency dep){
                URL libDownload = new URL(dep.repo + dep.file.filename);
                downloadMonitor.updateProgressString("Downloading file %s", libDownload.toString());
                logger.info("Downloading file " + libDownload.toString());
                URLConnection connection = libDownload.openConnection();
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.setRequestProperty("User-Agent", "" + owner + " Downloader");
                download(connection.getInputStream(), connection.getContentLength(), dep);
}
}
//352
public class func{
	public void testUI(){
        String host = (String) storm_conf.get("ui.host");
        if (host==null) host = "localhost";
        URL url = new URL("http://"+host+":"+storm_conf.get("ui.port")+"/");
        LOG.info("UI URL:"+url);
        URLConnection con = url.openConnection();
        Assert.assertNotNull(con);
        Assert.assertNotNull(con.getContent());
}
}
//353
public class func{
	public void nextPage(){
            if(RELATIVE_LINK_NOT_FOUND.equals(nextPageUrl)) {
                throw new IllegalStateException("GitHub API no more issues to fetch");
            }
            URL url = new URL(nextPageUrl);
            LOG.info("GitHub API querying issue page {}", queryParamValue(url, "page"));
            URLConnection urlConnection = url.openConnection();
            LOG.info("GitHub API rate info => Remaining : {}, Limit : {}",
                    urlConnection.getHeaderField("X-RateLimit-Remaining"),
                    urlConnection.getHeaderField("X-RateLimit-Limit")
            );
            nextPageUrl = extractRelativeLink(urlConnection.getHeaderField("Link"), "next");
            return parseJsonFrom(urlConnection);
}
}
//354
public class func{
	public void checkMovieHash(String hash){
    if (token == null) {
      return "";
    }
    URL url = new URL(OPENSUBS_URL);
    LOGGER.debug("req " + req);
    return postPage(url.openConnection(), req);
}
}
//355
public class func{
	public void checkValidMavenJarUrl(String url,String resource){
        URL realUrl = followRedirects(new URL(url));
        URLClassLoader classLoader = new URLClassLoader(new URL[] { realUrl });
        URL innerU = classLoader.findResource(resource);
        InputStream innerUin = innerU.openConnection().getInputStream();
        innerUin.close();
}
}
//356
public class func{
	public void testProxiesSeleniumStaticResourcesWithUpstreamProxy(){
        target.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", port)));
    assertTrue(getResponseAsString(client).contains("<body>"));
    target = new URL("https://www.google.com/selenium-server/core/Blank.html");
}
}
