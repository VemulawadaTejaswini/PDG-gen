//21
public class func{
public void addShareLib(Configuration conf,String[] actionShareLibNames){
                    for (String actionShareLibName : actionShareLibNames) {
                        List<Path> listOfPaths = shareLibService.getShareLibJars(actionShareLibName);
                        if (listOfPaths != null && !listOfPaths.isEmpty()) {
                            for (Path actionLibPath : listOfPaths) {
                                String fragmentName = new URI(actionLibPath.toString()).getFragment();
                                Path pathWithFragment = fragmentName == null ? actionLibPath : new Path(new URI(
                                        actionLibPath.toString()).getPath());
                                String fileName = fragmentName == null ? actionLibPath.getName() : fragmentName;
                                if (confSet.contains(fileName)) {
                                    Configuration jobXmlConf = shareLibService.getShareLibConf(actionShareLibName,
                                            pathWithFragment);
                                    checkForDisallowedProps(jobXmlConf, actionLibPath.getName());
                                    XConfiguration.injectDefaults(jobXmlConf, conf);
                                    LOG.trace("Adding properties of " + actionLibPath + " to job conf");
                                }
                                else {
                                    // Filtering out duplicate jars or files
                                    sharelibList.add(new Path(actionLibPath.toUri()) {
                                        @Override
                                        public int hashCode() {
                                            return getName().hashCode();
                                        }
                                        @Override
                                        public String getName() {
                                            try {
                                                return (new URI(toString())).getFragment() == null ? new Path(toUri()).getName()
                                                        : (new URI(toString())).getFragment();
                                            }
                                            catch (URISyntaxException e) {
                                                throw new RuntimeException(e);
                                            }
                                        }
                                        @Override
                                        public boolean equals(Object input) {
                                            if (input == null) {
                                                return false;
                                            }
                                            if (input == this) {
                                                return true;
                                            }
                                            if (!(input instanceof Path)) {
                                                return false;
                                            }
                                            return getName().equals(((Path) input).getName());
                                        }
                                    });
                                }
                            }
                        }
                    }
                for (Path libPath : sharelibList) {
                    addToCache(conf, libPath, libPath.toUri().getPath(), false);
                }
}
}
