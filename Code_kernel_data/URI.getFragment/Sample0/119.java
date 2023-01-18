//118
public class func{
	public void rewrite(JsonNode plan,Set<String> namesUsed,boolean debugMode,boolean revisit){
                for (JsonNode file : job.path("cachedFiles"))
                {
                    String filename = file.getTextValue();

                    filename = cleanLatestTag(filename);
                    URI uri = null;
                    String path, fragment;
                    try
                    {
                        uri = new URI(filename);
                        path = uri.getPath();
                        path = restoreLatestTag(path);

                        fragment = uri.getFragment();
                        if (path.contains("#LATEST"))
                        {
                          path =
                            FileSystemUtils.getLatestPath(fs, new Path(path))
                            .toString();
                          path = new URI(path).getPath();
                        }
                    }
                    catch (URISyntaxException e)
                    {
                        throw new PlanRewriteException(e);
                    }

                    // check if the fragment was already created earlier
                    if (fragment == null)
                        fragment = symlinkMap.get(path);

                    // create a new one
                    if (fragment == null)
                        fragment = "cached_" + (symlinkCounter++);

                    symlinkMap.put(path, fragment);
                    

                    // if (fs.isDirectory(new Path(path)))
                    // {
                    // Path childPath = null;
                    //
                    // FileStatus[] children = fs.globStatus(new Path(path + "/*"));
                    // for (FileStatus child : children)
                    // {
                    // childPath = child.getPath();
                    //
                    // if (fs.isDirectory(childPath))
                    // continue;
                    //
                    // String name = childPath.getName();
                    // if (name.startsWith("_") || name.startsWith("."))
                    // continue;
                    //
                    // break;
                    // }
                    //
                    // if (childPath == null)
                    // throw new IOException("No files found in directory: " + path);
                    //
                    // path = childPath.toString();
                    // }

                    cachedFiles.add(path + "#" + fragment);
                }
                ((ObjectNode) job).put("cachedFiles", cachedFiles);
}
}
