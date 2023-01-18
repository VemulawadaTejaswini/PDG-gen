//157
public class func{
	public void getRelativePath(File base,File path){
        String cleanedPath = FilenameUtils.normalize(path.toString());
        return new File(cleanedBase).toURI().relativize(new File(cleanedPath).toURI()).getPath();
}
}
