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

                    if (fragment == null)
                        fragment = symlinkMap.get(path);

                    if (fragment == null)
                        fragment = "cached_" + (symlinkCounter++);

                    symlinkMap.put(path, fragment);
                    


                    cachedFiles.add(path + "#" + fragment);
                }
                ((ObjectNode) job).put("cachedFiles", cachedFiles);
}
}
