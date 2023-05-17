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
