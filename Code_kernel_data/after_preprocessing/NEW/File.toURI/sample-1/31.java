//31
public class func{
public void appendFilesTo(File directory,Writer writer,URI base){
        writer.write(base.relativize(file.toURI()).getPath());
        writer.write("\n");
}
}
