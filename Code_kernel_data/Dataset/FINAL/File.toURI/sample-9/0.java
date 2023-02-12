public class func{
public void createFileWriter(File outBase,File inBase,URI file){
    URI base = inBase.toURI();
    URI relative = base.relativize(base.resolve(file));
    if (relative.isAbsolute()) {
      outFile = new File(outBase, new File(relative).getName());
    } else {
      outFile = new File(outBase, relative.getPath());
    }
    outFile.getParentFile().mkdirs();
}
}
