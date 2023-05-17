//3
public class func{
public void collectAllFiles(ArrayList<String> files,URI root,File directory,String suffix){
    for (final File file : directory.listFiles()) {
      if (file.isDirectory())
        collectAllFiles(files, root, file, suffix);
      else {
        if ((suffix != null) && !file.getName().endsWith(suffix))
          continue;
        files.add(root.relativize(file.toURI()).getPath());
      }
    }
}
}
