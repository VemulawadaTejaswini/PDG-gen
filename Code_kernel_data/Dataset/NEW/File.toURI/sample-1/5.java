//5
public class func{
public void generateJar(final File directory,final IOFileFilter fileFilter){
        for (final File file : files) {
            final String relativeName = directory.toURI().relativize(file.toURI()).getPath();
            final byte[] content = FileUtils.readFileToByteArray(file);
            resources.put(relativeName, content);
        }
}
}
