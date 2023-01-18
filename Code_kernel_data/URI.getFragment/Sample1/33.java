//32
public class func{
	public void expand(List<URI> inputs){
    for (URI input : inputs) {
      if (isFileOrDir(input)) {
        Path inputPath = Paths.get(input);
        if (Files.isDirectory(inputPath)) {
          try (DirectoryStream<Path> childPaths = Files.newDirectoryStream(inputPath)) {
            for (Path childPath : childPaths) {
              expanded.add(childPath.toUri());
            }
          }
        } else {
          expanded.add(input);
        }
      } else {
        expanded.add(input);
      }
    }
    for (int i = 0; i < expanded.size(); i++) {
      URI input = expanded.get(i);
      if (input.getScheme() == null) {
        expanded.set(i, new URI("file", input.getSchemeSpecificPart(), input.getFragment()));
      }
    }
}
}
