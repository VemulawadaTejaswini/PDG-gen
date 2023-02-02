//0
public class func{
	public void moveLocalFiles(Configuration conf){
          if (null != uri.getFragment() && DistributedCache.getSymlink(conf)) {

            FileUtil.symLink(uri.getPath(), uri.getFragment());
            files.append(uri.getFragment()).append(",");
          }
          FileSystem hdfs = FileSystem.get(conf);
}
}
//1
public class func{
	public void create(GelfSenderConfiguration configuration){
        if (hostUri.getFragment() == null || hostUri.getFragment().trim().equals("")) {
            throw new IllegalArgumentException("Redis URI must specify fragment");
        }
        if (hostUri.getHost() == null) {
            throw new IllegalArgumentException("Redis URI must specify host");
        }
        Pool<Jedis> pool = RedisSenderPoolProvider.getJedisPool(hostUri, port);
        return new GelfREDISSender(pool, hostUri.getFragment(), configuration.getErrorReporter());
}
}
//2
public class func{
	public void rewrite(JSONObject json,String scheme,String hostname,int port,String contextPath){
    String[] names = JSONObject.getNames(json);
    if (names == null)
      return;
    for (String name : names) {
      Object o = json.opt(name);
      if (o instanceof URI) {
        try {
          URI uri = (URI) o;
          if ("orion".equals(uri.getScheme())) {
            uri = new URI(null, null, contextPath + uri.getPath(), uri.getQuery(), uri.getFragment());
          }
          json.put(name, unqualifyObjectProperty(name, uri, scheme, hostname, port));
        } catch (JSONException e) {
        } catch (URISyntaxException e) {
        }
      } else if (o instanceof String) {
        String string = (String) o;
        if (string.startsWith(scheme) || string.startsWith("orion:/")) {
          try {
            URI uri = new URI(string);
            if ("orion".equals(uri.getScheme())) {
              uri = new URI(null, null, contextPath + uri.getPath(), uri.getQuery(), uri.getFragment());
            } else {
              uri = new URI(uri.getScheme(), null, contextPath + uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            json.put(name, unqualifyObjectProperty(name, uri, scheme, hostname, port));
          } catch (JSONException e) {
          } catch (URISyntaxException e) {
          }
        }
      } else {
        rewrite(o, scheme, hostname, port, contextPath);
      }
    }
}
}
//3
public class func{
	public void openDB(){
        SQLiteDatabase mDb = context.openOrCreateDatabase(DB_NAME, Context.MODE_PRIVATE, null);
        if (mDb.getVersion() == 1) {
            Log.i(K9.LOG_TAG, "Updating preferences to urlencoded username/password");

            String accountUuids = readValue(mDb, "accountUuids");
            if (accountUuids != null && accountUuids.length() != 0) {
                String[] uuids = accountUuids.split(",");
                for (String uuid : uuids) {
                    try {
                        String storeUriStr = Base64.decode(readValue(mDb, uuid + ".storeUri"));
                        String transportUriStr = Base64.decode(readValue(mDb, uuid + ".transportUri"));

                        URI uri = new URI(transportUriStr);
                        String newUserInfo = null;
                        if (transportUriStr != null) {
                            String[] userInfoParts = uri.getUserInfo().split(":");

                            String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[0]);
                            String passwordEnc = "";
                            String authType = "";
                            if (userInfoParts.length > 1) {
                                passwordEnc = ":" + UrlEncodingHelper.encodeUtf8(userInfoParts[1]);
                            }
                            if (userInfoParts.length > 2) {
                                authType = ":" + userInfoParts[2];
                            }

                            newUserInfo = usernameEnc + passwordEnc + authType;
                        }

                        if (newUserInfo != null) {
                            URI newUri = new URI(uri.getScheme(), newUserInfo, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                            String newTransportUriStr = Base64.encode(newUri.toString());
                            writeValue(mDb, uuid + ".transportUri", newTransportUriStr);
                        }

                        uri = new URI(storeUriStr);
                        newUserInfo = null;
                        if (storeUriStr.startsWith("imap")) {
                            String[] userInfoParts = uri.getUserInfo().split(":");
                            if (userInfoParts.length == 2) {
                                String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[0]);
                                String passwordEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[1]);

                                newUserInfo = usernameEnc + ":" + passwordEnc;
                            } else {
                                String authType = userInfoParts[0];
                                String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[1]);
                                String passwordEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[2]);

                                newUserInfo = authType + ":" + usernameEnc + ":" + passwordEnc;
                            }
                        } else if (storeUriStr.startsWith("pop3")) {
                            String[] userInfoParts = uri.getUserInfo().split(":", 2);
                            String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[0]);

                            String passwordEnc = "";
                            if (userInfoParts.length > 1) {
                                passwordEnc = ":" + UrlEncodingHelper.encodeUtf8(userInfoParts[1]);
                            }

                            newUserInfo = usernameEnc + passwordEnc;
                        } else if (storeUriStr.startsWith("webdav")) {
                            String[] userInfoParts = uri.getUserInfo().split(":", 2);
                            String usernameEnc = UrlEncodingHelper.encodeUtf8(userInfoParts[0]);

                            String passwordEnc = "";
                            if (userInfoParts.length > 1) {
                                passwordEnc = ":" + UrlEncodingHelper.encodeUtf8(userInfoParts[1]);
                            }

                            newUserInfo = usernameEnc + passwordEnc;
                        }

                        if (newUserInfo != null) {
                            URI newUri = new URI(uri.getScheme(), newUserInfo, uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
                            String newStoreUriStr = Base64.encode(newUri.toString());
                            writeValue(mDb, uuid + ".storeUri", newStoreUriStr);
                        }
                    } catch (Exception e) {
                        Log.e(K9.LOG_TAG, "ooops", e);
                    }
                }
            }

            mDb.setVersion(DB_VERSION);
        }
        if (mDb.getVersion() != DB_VERSION) {
            Log.i(K9.LOG_TAG, "Creating Storage database");
            mDb.execSQL("DROP TABLE IF EXISTS preferences_storage");
            mDb.execSQL("CREATE TABLE preferences_storage " +
                        "(primkey TEXT PRIMARY KEY ON CONFLICT REPLACE, value TEXT)");
            mDb.setVersion(DB_VERSION);
        }
}
}
//4
public class func{
	public void configureSentinel(URI uri){
        checkArgument(isNotEmpty(uri.getFragment()), "URI Fragment must contain the sentinelMasterId");
        String masterId = uri.getFragment();
        if (isNotEmpty(uri.getHost())) {
            if (uri.getPort() != -1) {
                builder = RedisURI.Builder.sentinel(uri.getHost(), uri.getPort(), masterId);
            } else {
                builder = RedisURI.Builder.sentinel(uri.getHost(), masterId);
            }
        }
        if (builder == null && isNotEmpty(uri.getAuthority())) {
            String authority = uri.getAuthority();
            if (authority.indexOf('@') > -1) {
                authority = authority.substring(authority.indexOf('@') + 1);
            }

            String[] hosts = authority.split("\\,");
            for (String host : hosts) {
                HostAndPort hostAndPort = HostAndPort.fromString(host);
                if (builder == null) {
                    if (hostAndPort.hasPort()) {
                        builder = RedisURI.Builder.sentinel(hostAndPort.getHostText(), hostAndPort.getPort(), masterId);
                    } else {
                        builder = RedisURI.Builder.sentinel(hostAndPort.getHostText(), masterId);
                    }
                } else {
                    if (hostAndPort.hasPort()) {
                        builder.withSentinel(hostAndPort.getHostText(), hostAndPort.getPort());
                    } else {
                        builder.withSentinel(hostAndPort.getHostText());
                    }
                }
            }

        }
        checkArgument(builder != null, "Invalid URI, cannot get host part");
}
}
//5
public class func{
	public void addToClasspathIfNotJar(Path[] paths,URI[] withLinks,Configuration conf,Map<String,String> environment,String classpathEnvVar){
      if (withLinks != null) {
        for (URI u: withLinks) {
          Path p = new Path(u);
          FileSystem remoteFS = p.getFileSystem(conf);
          p = remoteFS.resolvePath(p.makeQualified(remoteFS.getUri(),
              remoteFS.getWorkingDirectory()));
          String name = (null == u.getFragment())
              ? p.getName() : u.getFragment();
          if (!StringUtils.toLowerCase(name).endsWith(".jar")) {
            linkLookup.put(p, name);
          }
        }
      }
      for (Path p : paths) {
        FileSystem remoteFS = p.getFileSystem(conf);
        p = remoteFS.resolvePath(p.makeQualified(remoteFS.getUri(),
            remoteFS.getWorkingDirectory()));
        String name = linkLookup.get(p);
        if (name == null) {
          name = p.getName();
        }
        if(!StringUtils.toLowerCase(name).endsWith(".jar")) {
          MRApps.addToEnvironment(
              environment,
              classpathEnvVar,
              crossPlatformifyMREnv(conf, Environment.PWD) + Path.SEPARATOR + name, conf);
        }
      }
}
}
//6
public class func{
	public void setupDistributedCacheConfig(final JobConf job){
    String localWorkDir = (job.get(MRFrameworkConfigs.TASK_LOCAL_RESOURCE_DIR));
    URI[] cacheArchives = DistributedCache.getCacheArchives(job);
    if (cacheArchives != null) {
      List<String> localArchives = new ArrayList<String>();
      for (int i = 0; i < cacheArchives.length; ++i) {
        URI u = cacheArchives[i];
        Path p = new Path(u);
        Path name = new Path((null == u.getFragment()) ? p.getName()
            : u.getFragment());
        String linkName = name.toUri().getPath();
        localArchives.add(new Path(localWorkDir, linkName).toUri().getPath());
      }
      if (!localArchives.isEmpty()) {
        job.set(MRJobConfig.CACHE_LOCALARCHIVES, StringUtils
            .join(localArchives, ','));
      }
    }
    URI[] cacheFiles = DistributedCache.getCacheFiles(job);
    if (cacheFiles != null) {
      List<String> localFiles = new ArrayList<String>();
      for (int i = 0; i < cacheFiles.length; ++i) {
        URI u = cacheFiles[i];
        Path p = new Path(u);
        Path name = new Path((null == u.getFragment()) ? p.getName()
            : u.getFragment());
        String linkName = name.toUri().getPath();
        localFiles.add(new Path(localWorkDir, linkName).toUri().getPath());
      }
      if (!localFiles.isEmpty()) {
        job.set(MRJobConfig.CACHE_LOCALFILES, StringUtils
            .join(localFiles, ','));
      }
    }
}
}
//7
public class func{
	public void main(String[] args){
    OptArgLoop: for (i = 0; i < args.length - REQUIRED_ARGS; i++) {
      switch (args[i]) {
      case "-serializer:format":
        i++;

        switch (args[i]) {
        case "java":
          break;
        case "kryo":
          serializer = new KryoSliceSerializer();
          break;
        default:
          PrintUsageAndQuit(null);
        }

        break;
      case "-instances":
        readInstances = true;

        break;
      default:
        break OptArgLoop;
      }
    }
      URI location = new URI(args[i]);
        if (location.getFragment() == null) {
          PrintUsageAndQuit("uri must have fragment for partition slice");
        }
        partitionUUID = UUID.fromString(location.getFragment());
}
}
//8
public class func{
	public void createWidgetBean(String sitemapName,Widget widget,boolean drillDown,URI uri,String widgetId){
      if(uri.getFragment() != null) {
        sb.append("#" + uri.getFragment());
      }
      sbBaseUrl.append(sb.toString());
      bean.url = sbBaseUrl.toString();
}
}
//9
public class func{
	public void main(String[] args){
    for (i = 0; i < args.length - REQUIRED_ARGS; i++) {
      switch (args[i]) {
      case "-serializer":
        i++;
        
        switch (args[i]) {
        case "java":
          break;
        case "kryo":
          serializer = new KryoSliceSerializer();
          break;
        default:
          PrintUsageAndQuit(null);
        }
        
        break;
      default:
        break OptArgLoop;
      }
    }
    while (i < args.length) {
      
      // required arguments
      Path partitionDirPath = null;
      UUID partitionUUID = null;
  
      // parse required arguments
      
      try {
        URI location = new URI(args[i]);
  
        try {
          if (location.getFragment() == null) {
            PrintUsageAndQuit("uri must have fragment for partition slice");
          }
          partitionUUID = UUID.fromString(location.getFragment());
        } catch (IllegalArgumentException e) {
          PrintUsageAndQuit("uri fragment must be a valid uuid - " + e.getMessage());
        }
  
        try {
          partitionDirPath = Paths.get(new URI(location.getScheme(), location.getSchemeSpecificPart(), null));
        } catch (URISyntaxException e) {
          PrintUsageAndQuit("problem removing fragment from partition uri - " + e.getMessage());
        } catch (IllegalArgumentException e) {
          PrintUsageAndQuit("partition uri must resolve to a valid path - " + e.getMessage());
        }
      } catch (URISyntaxException e) {
        PrintUsageAndQuit("partition location must be a valid uri - " + e.getMessage());
      }
  
      SliceManager sliceManager = new SliceManager(partitionUUID, serializer, new FileStorageManager(partitionDirPath));
  
      System.out.println("-----------------");
      System.out.print("Reading template... ");
  
      long time = System.currentTimeMillis();
      IPartition partition = sliceManager.readPartition();
  
      System.out.println("[" + (System.currentTimeMillis() - time) + "ms]");
  
      int numInstances = 0;
  
      System.out.println("Reading instances... ");
  
      time = System.currentTimeMillis();
      for (ISubgraph subgraph : partition) {
        System.out.println("Reading instances for subgraph " + subgraph.getId());
        Iterable<? extends ISubgraphInstance> instances = subgraph.getInstances(Long.MIN_VALUE, Long.MAX_VALUE, subgraph.getVertexProperties(), subgraph.getEdgeProperties(), false);
        numInstances += IterableHelper.iterableCount(instances);
      }
  
      System.out.println("Finished reading instances [" + (System.currentTimeMillis() - time) + "ms]");
  
      System.out.println("-----------------");
  
      System.out.println("Partition ID: " + partition.getId());
      System.out.println("Partition IsDirected: " + partition.isDirected());
      System.out.println("Partition Subgraphs: " + partition.size());
      System.out.println("Partition Instances: " + numInstances);
  
      int v = 0;
      long e = 0;
      int r = 0;
      for (ISubgraph subgraph : partition) {
        v += subgraph.getTemplate().numVertices();
        e += subgraph.getTemplate().numEdges();
        r += subgraph.getRemoteVertexMappings().size();
      }
  
      System.out.println("Partition Vertices: " + v);
      System.out.println("Partition Edges: " + e);
      System.out.println("Partition Remote Vertices: " + r);
      
      i++;
    }
}
}
//10
public class func{
	public void parseDistributedCacheArtifacts(Configuration conf,Map<String,LocalResource> localResources,LocalResourceType type,URI[] uris,long[] timestamps,long[] sizes,boolean visibilities[]){
      if ((uris.length != timestamps.length) || (uris.length != sizes.length) ||
          (uris.length != visibilities.length)) {
        throw new IllegalArgumentException("Invalid specification for " +
            "distributed-cache artifacts of type " + type + " :" +
            " #uris=" + uris.length +
            " #timestamps=" + timestamps.length +
            " #visibilities=" + visibilities.length
            );
      }
      for (int i = 0; i < uris.length; ++i) {
        URI u = uris[i];
        Path p = new Path(u);
        FileSystem remoteFS = p.getFileSystem(conf);
        p = remoteFS.resolvePath(p.makeQualified(remoteFS.getUri(),
            remoteFS.getWorkingDirectory()));
        // Add URI fragment or just the filename
        Path name = new Path((null == u.getFragment())
          ? p.getName()
          : u.getFragment());
        if (name.isAbsolute()) {
          throw new IllegalArgumentException("Resource name must be relative");
        }
        String linkName = name.toUri().getPath();
        LocalResource orig = localResources.get(linkName);
        if(orig != null && !orig.getResource().equals(
            ConverterUtils.getYarnUrlFromURI(p.toUri()))) {
          throw new InvalidJobConfException(
              getResourceDescription(orig.getType()) + orig.getResource() + 
              " conflicts with " + getResourceDescription(type) + u);
        }
        localResources.put(linkName, LocalResource.newInstance(ConverterUtils
          .getYarnUrlFromURI(p.toUri()), type, visibilities[i]
            ? LocalResourceVisibility.PUBLIC : LocalResourceVisibility.PRIVATE,
          sizes[i], timestamps[i]));
      }
}
}
//11
public class func{
	public void getExistingDistCacheFilePath(Configuration conf,URL url){
            for (URI cacheFileUri : cacheFileUris) {
                Path path = new Path(cacheFileUri);
                String cacheFileName = cacheFileUri.getFragment() == null ? path.getName() : cacheFileUri.getFragment();
                // Match
                //     - if both filenames are same and no symlinks (or)
                //     - if both symlinks are same (or)
                //     - symlink of existing cache file is same as the name of the new file to be added.
                //         That would be the case when hbase-0.98.4.jar#hbase.jar is configured via Oozie
                // and register hbase.jar is done in the pig script.
                // If two different files are symlinked to the same name, then there is a conflict
                // and hadoop itself does not guarantee which file will be symlinked to that name.
                // So we are good.
                if (fileName.equals(cacheFileName)) {
                    return path;
                }
            }
}
}
//12
public class func{
	public void append(String base,Map<String,?> query,Map<String,String> keys,boolean fragment){
      if (redirectUri.getFragment() != null) {
        String append = redirectUri.getFragment();
        values.append(append);
      }
}
}
//13
public class func{
	public void parseDistributedCacheArtifacts(Configuration conf,ApplicationSubmissionContext container,LocalResourceType type,URI[] uris,long[] timestamps,long[] sizes,boolean visibilities[],Path[] pathsToPutOnClasspath){
      for (int i = 0; i < uris.length; ++i) {
        URI u = uris[i];
        Path p = new Path(u);
        FileSystem fs = p.getFileSystem(conf);
        p = fs.resolvePath(
            p.makeQualified(fs.getUri(), fs.getWorkingDirectory()));
        // Add URI fragment or just the filename
        Path name = new Path((null == u.getFragment())
          ? p.getName()
          : u.getFragment());
        if (name.isAbsolute()) {
          throw new IllegalArgumentException("Resource name must be relative");
        }
        String linkName = name.toUri().getPath();
        container.setResourceTodo(
            linkName,
            createLocalResource(
                p.toUri(), type, 
                visibilities[i]
                  ? LocalResourceVisibility.PUBLIC
                  : LocalResourceVisibility.PRIVATE,
                sizes[i], timestamps[i])
        );
        if (classPaths.containsKey(u.getPath())) {
          Map<String, String> environment = container.getAllEnvironment();
          MRApps.addToClassPath(environment, linkName);
        }
      }
}
}
//14
public class func{
	public void getUri(){
        if (parsed.getQuery() != null) {
          sb.append("?").append(parsed.getQuery());
        }
        if (parsed.getFragment() != null) {
          sb.append("#").append(parsed.getFragment());
        }
}
}
//15
public class func{
	public void parse(String tag){
      URI uri = URI.create(s.toString());
      Map<String, List<String>> parameters = ImmutableMap.copyOf(JirmUrlEncodedUtils.parseParameters(uri, "UTF-8"));
      String p = (uri.getPath() != null ? uri.getPath() : "")
          +  (nullToEmpty(uri.getFragment()).isEmpty() ? "" : "#" + uri.getFragment());
      return new ReferenceHeader(Path.create(p), parameters);
}
}
//16
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("responseTypesCodeIdTokenStep3a", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                if (response.getHeader("Location") != null) {
                    try {
                        URI uri = new URI(response.getHeader("Location").toString());
                        assertNotNull(uri.getFragment(), "The fragment is null");

                        Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());

                        assertTrue(params.containsKey(AuthorizeResponseParam.CODE));
                        assertTrue(params.containsKey(AuthorizeResponseParam.SCOPE));
                        assertTrue(params.containsKey(AuthorizeResponseParam.STATE));
                        assertTrue(params.containsKey(AuthorizeResponseParam.ID_TOKEN));
                        assertFalse(params.containsKey(AuthorizeResponseParam.ACCESS_TOKEN));

                        authorizationCode2 = params.get(AuthorizeResponseParam.CODE);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        fail("Response URI is not well formed");
                    } catch (Exception e) {
                        e.printStackTrace();
                        fail(e.getMessage());
                    }
                }
}
}
//17
public class func{
	public void resolve(String baseUri,String pathToResolve){
            if (pathToResolve.startsWith("?")) {
                // drop fragment from uri if it has one
                if (uri.getFragment() != null) {
                    uri = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null);
                }
                // add query to the end manually (as URI.resolve does it wrong)
                return uri.toString() + pathToResolve;
            }
            uri = uri.resolve(pathToResolve);
            String path = uri.getPath();
            if (path != null) {
                path = JsonLdUrl.removeDotSegments(uri.getPath(), true);
            }
            return new URI(uri.getScheme(), uri.getAuthority(), path, uri.getQuery(),
                    uri.getFragment()).toString();
}
}
//18
public class func{
	public void resolve(String uri,URIResolver resolver){
        if (parsed.getPath() != null)
            path += parsed.getPath();
        if (parsed.getQuery() != null)
            path += parsed.getQuery();
        if (parsed.getFragment() != null)
            path += "#" + parsed.getFragment();
        int port = parsed.getPort() < 0 ? Address.NULL_PORT : parsed.getPort();
        Address address = new Address(parsed.getScheme(), parsed.getHost(), port);
        return resolver.resolve(address, path);
}
}
//19
public class func{
	public void WebConnection(URI uri,boolean useHTTPS){
      newURI = new URI("http" + (useHTTPS?"s":"") + "://" + uri.getHost() + uri.getPath()
        + (uri.getQuery()==null?"":"?" + uri.getQuery())
        + (uri.getFragment()==null?"":"#" + uri.getFragment()));
}
}
//20
public class func{
	public void canonicalize(String uriString){
                if (u.getFragment() == null) {
                    u = new URI("//" + u.getSchemeSpecificPart());
                } else {
                    u = new URI("//" + u.getSchemeSpecificPart() + "#"
                                + u.getFragment());
                }
}
}
//21
public class func{
	public void decodeCRS(String srsName){
        if (srs != null) {
            // TODO: JD, this is a hack until GEOT-1136 has been resolved
            if ("http".equals(srs.getScheme()) && "www.opengis.net".equals(srs.getAuthority())
                    && "/gml/srs/epsg.xml".equals(srs.getPath()) && (srs.getFragment() != null)) {
                try {
                    return CRS.decode("EPSG:" + srs.getFragment(), true);
                } catch (Exception e) {
                    // failed, try as straight up uri
                    try {
                        return CRS.decode(srs.toString(), true);
                    } catch (Exception e1) {
                        // failed again, do nothing ,should fail below as well
                    }
                }
            }
        }
            return CRS.decode(srsName, true);
            if (srsName.toUpperCase().startsWith("URN")) {
                String code = srsName.substring(srsName.lastIndexOf(":") + 1);
                try {
                    return CRS.decode("EPSG:" + code, true);
                } catch (Exception e1) {
                    throw new GeoXACMLException("Could not create crs: " + srs, e);
                }
            }
            throw new GeoXACMLException("Could not create crs: " + srs, e);
}
}
//22
public class func{
	public void createURIWithQuery(URI uri,String query){
        if ((!s.contains("#")) && (uri.getFragment() != null)) {
            s = s + "#" + uri.getFragment();
        }
        return new URI(s);
}
}
//23
public class func{
	public void addTrailingSlashes(URI uri){
        if(uri.getPath() == null){
            uri = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), "/", uri.getQuery(), uri.getFragment());
        }else if (!uri.getPath().endsWith("/") && !uri.getPath().endsWith(".html")) {
            uri = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath() + "/", uri.getQuery(), uri.getFragment());

        }
}
}
//24
public class func{
	public void unqualifyURI(URI uri,String scheme,String hostname,int port){
    int uriPort = uri.getPort();
    if (uriPort == -1) {
      uriPort = getDefaultPort(uri.getScheme());
    }
    if (scheme.equals(uri.getScheme()) && hostname.equals(uri.getHost()) && port == uriPort) {
      try {
        simpleURI = new URI(null, null, null, -1, uri.getPath(), uri.getQuery(), uri.getFragment());
      } catch (URISyntaxException e) {
        simpleURI = uri;
      }
    }
      simpleURI = new URI(scheme, null, hostname, port, uri.getPath(), uri.getQuery(), uri.getFragment());
}
}
//25
public class func{
	public void apply(@Nullable final URI input){
                if (input == null)
                    return null;
                final URI uri = input.normalize();
                final String scheme = uri.getScheme();
                final String host = uri.getHost();
                if (scheme == null && host == null)
                    return uri;
                if (uri.isOpaque())
                    try {
                        return new URI(LOWERCASE.apply(scheme),
                            uri.getSchemeSpecificPart(), uri.getFragment());
                    } catch (URISyntaxException e) {
                        throw new IllegalStateException("How did I get there??",
                            e);
                    }
                final String userinfo = uri.getUserInfo();
                final int port = uri.getPort();
                final String path = uri.getPath();
                final String query = uri.getQuery();
                final String fragment = uri.getFragment();
                        LOWERCASE.apply(host), port, path, query, fragment);
                    throw new IllegalStateException("How did I get there??", e);
}
}
//26
public class func{
	public void makeHtmlPath(URI uri){
        String fragment = uri.getFragment() != null ? "#" + uri.getFragment() : "";
        File mdPath = new File(uri.getPath());
        File htPath = new File(mdPath.getParent(), htFilename(mdPath.getName()));
        return htPath.getPath() + fragment;
}
}
//27
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("requestAuthorizationTokenCodeIdToken", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                if (response.getHeader("Location") != null) {
                    try {
                        URI uri = new URI(response.getHeader("Location").toString());
                        assertNotNull(uri.getFragment(), "Fragment is null");

                        Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());

                        assertNotNull(params.get(AuthorizeResponseParam.CODE), "The code is null");
                        assertNotNull(params.get(AuthorizeResponseParam.ACCESS_TOKEN), "The access token is null");
                        assertNotNull(params.get(AuthorizeResponseParam.TOKEN_TYPE), "The token type is null");
                        assertNotNull(params.get(AuthorizeResponseParam.ID_TOKEN), "The id token is null");
                        assertNotNull(params.get(AuthorizeResponseParam.STATE), "The state is null");
                        assertEquals(params.get(AuthorizeResponseParam.STATE), state);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        fail("Response URI is not well formed");
                    }
                }
}
}
//28
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("requestAccessTokenCustomClientAuth2", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                if (response.getHeader("Location") != null) {
                    try {
                        URI uri = new URI(response.getHeader("Location").toString());
                        assertNotNull(uri.getFragment(), "Fragment is null");

                        Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());

                        assertNotNull(params.get(AuthorizeResponseParam.ACCESS_TOKEN), "The access_token is null");
                        assertNotNull(params.get(AuthorizeResponseParam.ID_TOKEN), "The id_token is null");
                        assertNotNull(params.get(AuthorizeResponseParam.STATE), "The state is null");
                        assertNotNull(params.get(AuthorizeResponseParam.TOKEN_TYPE), "The token type is null");
                        assertNotNull(params.get(AuthorizeResponseParam.EXPIRES_IN), "The expires_in value is null");
                        assertNotNull(params.get(AuthorizeResponseParam.SCOPE), "The scope must be null");
                        assertNull(params.get("refresh_token"), "The refresh_token must be null");
                        assertEquals(params.get(AuthorizeResponseParam.STATE), state);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        fail("Response URI is not well formed");
                    }
                }
}
}
//29
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("responseTypesTokenIdTokenStep3", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                if (response.getHeader("Location") != null) {
                    try {
                        URI uri = new URI(response.getHeader("Location").toString());
                        assertNotNull(uri.getFragment(), "Fragment is null");

                        Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());

                        assertNotNull(params.get("access_token"), "The access token is null");
                        assertNotNull(params.get("token_type"), "The token type is null");
                        assertNotNull(params.get("id_token"), "The id token is null");
                        assertNotNull(params.get("state"), "The state is null");
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        fail("Response URI is not well formed");
                    }
                }
}
}
//30
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("requestParameterMethodFail1 (Invalid OpenID Request Object)", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                if (response.getHeader("Location") != null) {
                    try {
                        URI uri = new URI(response.getHeader("Location").toString());
                        assertNotNull(uri.getFragment(), "Fragment is null");

                        Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());

                        assertNotNull(params.get("error"), "The error value is null");
                        assertNotNull(params.get("error_description"), "The errorDescription value is null");
                        assertNotNull(params.get(AuthorizeResponseParam.STATE), "The state is null");
                        assertEquals(params.get(AuthorizeResponseParam.STATE), state);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        fail("Response URI is not well formed");
                    }
                }
}
}
//31
public class func{
	public void Path(Path parent,Path child){
    String parentPath = parentUri.getPath();
    if (!(parentPath.equals("/") || parentPath.equals("")))
      try {
        parentUri = new URI(parentUri.getScheme(), parentUri.getAuthority(),
                      parentUri.getPath()+"/", null, parentUri.getFragment());
      } catch (URISyntaxException e) {
        throw new IllegalArgumentException(e);
      }
    URI resolved = parentUri.resolve(child.uri);
    initialize(resolved.getScheme(), resolved.getAuthority(),
               normalizePath(resolved.getPath()), resolved.getFragment());
}
}
//32
public class func{
	public void createSymlink(Configuration conf,URI cache,CacheStatus cacheStatus,boolean isArchive,Path currentWorkDir,boolean honorSymLinkConf){
    if(cache.getFragment() == null) {
      doSymlink = false;
    }
      currentWorkDir.toString() + Path.SEPARATOR + cache.getFragment();
    File flink = new File(link);
}
}
//33
public class func{
	public void normalizeSchemaName(URI schemaURI){
        if (schemaURI.getFragment() != null) {
            return schemaURI.getFragment();
        }
        return schemaURI.getPath();
}
}
//34
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("requestUserInfo step 1 Implicit Flow", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                if (response.getHeader("Location") != null) {
                    try {
                        URI uri = new URI(response.getHeader("Location").toString());
                        assertNotNull(uri.getFragment(), "Fragment is null");

                        Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());

                        assertNotNull(params.get(AuthorizeResponseParam.ACCESS_TOKEN), "The access token is null");
                        assertNotNull(params.get(AuthorizeResponseParam.TOKEN_TYPE), "The token type is null");
                        assertNotNull(params.get(AuthorizeResponseParam.EXPIRES_IN), "The expires in value is null");
                        assertNotNull(params.get(AuthorizeResponseParam.SCOPE), "The scope must be null");
                        assertNull(params.get("refresh_token"), "The refresh_token must be null");
                        assertNotNull(params.get(AuthorizeResponseParam.STATE), "The state is null");
                        assertEquals(params.get(AuthorizeResponseParam.STATE), state);

                        accessToken1 = params.get(AuthorizeResponseParam.ACCESS_TOKEN);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        fail("Response URI is not well formed");
                    } catch (Exception e) {
                        e.printStackTrace();
                        fail("Unexpected error");
                    }
                }
}
}
//35
public class func{
	public void onResponse(EnhancedMockHttpServletResponse response){
                showResponse("requestAuthorizationToken", response);
                assertEquals(response.getStatus(), 302, "Unexpected response code.");
                assertNotNull(response.getHeader("Location"), "Unexpected result: " + response.getHeader("Location"));
                if (response.getHeader("Location") != null) {
                    try {
                        URI uri = new URI(response.getHeader("Location").toString());
                        assertNotNull(uri.getFragment(), "Fragment is null");

                        Map<String, String> params = QueryStringDecoder.decode(uri.getFragment());

                        assertNotNull(params.get("access_token"), "The access token is null");
                        assertNotNull(params.get("state"), "The state is null");
                        assertNotNull(params.get("token_type"), "The token type is null");
                        assertNotNull(params.get("expires_in"), "The expires in value is null");
                        assertNotNull(params.get("scope"), "The scope must be null");
                        assertNull(params.get("refresh_token"), "The refresh_token must be null");
                        assertEquals(params.get(AuthorizeResponseParam.STATE), state);
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                        fail("Response URI is not well formed");
                    }
                }
}
}
//36
public class func{
	public void finishProcess(HTTPRequest req,String overrideType,String path,URI u,boolean noRelative){
      if(u.getFragment() != null){
        try{
        // FIXME encode it properly
          p += URLEncoder.encode(u.getFragment(),"UTF-8");
        }catch (UnsupportedEncodingException e1){
          throw new Error("Impossible: JVM doesn't support UTF-8: " + e, e);
        }
      }
}
}
//37
public class func{
	public void getMappedTableNameToRecordIndividual(URI individual){
    String fragment = individual.getFragment();
    String[] tokens = fragment.split("&");
    for (String token: tokens) {
      String[] pair = token.split("=");
      if (pair[0].equals(OntMapper.TABLE_NAME)) {
        return pair[1];
      }
    }
}
}
//38
public class func{
	public void rewriteUrl(String urlString){
        newUri.append(uri.getFragment());
      return newUri.toString();
}
}
//39
public class func{
	public void testUri(final String input){
        assertEquals(originalUri.getFragment(), uri.getFragment());
        assertEquals(originalUri.getRawSchemeSpecificPart(), uri.getRawSchemeSpecificPart());
}
}
//40
public class func{
	public void ShouldHaveFragment(URI actual){
    super("%nExpecting URI:%n  <%s>%nnot to have a fragment but had:%n  <%s>", actual, actual.getFragment());
}
}
//41
public class func{
	public void doProcess(Record record){
            addValue(record, uri.getFragment());
}
}
//42
public class func{
	public void toException(URI uri,IOException e){
    return new CoreException(new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID, NLS.bind(
        "Download of {0} failed: {1}", uri.getFragment(), message), e));
}
}
//43
public class func{
	public void getMappedColumnNameToProperty(URI propertyURI){
    String propertyName = propertyURI.getFragment();
}
}
//44
public class func{
	public void testPrincipalDisplayName(){
    assertTrue(uri.getFragment().endsWith("principal=" + authRequest.getPrincipal().getDisplayName()));
}
}
//45
public class func{
	public void splitWordAsURI(String word){
        String section = uri.getFragment();
        return new LookupWord(nameSpace, lookupWord, section);
}
}
//46
public class func{
	public void getMappedTableNameToClass(URI classURI){
    String className = classURI.getFragment();
}
}
//47
public class func{
	public void testCompareToJavaNetURI(){
        assertThat("[" + input + "] .query",httpUri.getQuery(),is(javaUri.getRawQuery()));
        assertThat("[" + input + "] .fragment",httpUri.getFragment(),is(javaUri.getFragment()));
}
}
//48
public class func{
	public void get(URI uri){
                return uri.getFragment();
}
}
//49
public class func{
	public void compareURIs(URI uri1,URI uri2){
        assertEquals("Unexpected fragment", uri1.getFragment(), uri2.getFragment());
            JAXRSUtils.getStructuredParams(uri1.getRawQuery(), "&", false, false);
}
}
//50
public class func{
	public void addShareLib(Configuration conf,String[] actionShareLibNames){
                                                        : (new URI(toString())).getFragment();
}
}
//51
public class func{
	public void ShouldHaveFragment(URI actual,String expectedFragment){
          actual.getFragment());
}
}
//52
public class func{
	public void performImplicitGrant(boolean needConsent){
    assertThat(responseURI.getFragment(), containsString("access_token="));
    assertThat(responseURI.getPath(), equalTo("/fourOhFour"));
}
}
//53
public class func{
	public void isValidFileSystemUri(URI uri){
        && isNullOrEmpty(uri.getFragment());
}
}
//54
public class func{
	public void getDomainClassOfProperty(URI prop){
    String propertyFragment = prop.getFragment();
}
}
//55
public class func{
	public void main(String[] args){
      String fragment = currentPartURI.getFragment();
}
}
//56
public class func{
	public void generateNodeID(URI uri){
    return uri.getFragment();
}
}
//57
public class func{
	public void getName(){
                                                        : (new URI(toString())).getFragment();
}
}
//58
public class func{
	public void matchNormalized(URI uri){
                    match(uriPattern.getFragment(), uri.getFragment());
}
}
//59
public class func{
	public void matchNormalized(URI uri){
                    match(uriPattern.getFragment(), uri.getFragment());
}
}
//60
public class func{
	public void filterHttpRequest(SubmitContext context,HttpRequestInterface<?> request){
                java.net.URI oldUri = httpMethod.getURI();
                        oldUri.getRawPath(), query.toString(), oldUri.getFragment()));
}
}
//61
public class func{
	public void addMRFrameworkToDistributedCache(Configuration conf){
      String linkedName = uri.getFragment();
}
}
