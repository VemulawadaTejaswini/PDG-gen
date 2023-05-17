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
