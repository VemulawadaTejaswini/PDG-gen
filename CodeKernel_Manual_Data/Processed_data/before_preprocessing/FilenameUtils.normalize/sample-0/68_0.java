public class dummy {

private String getAbsolutePath(final String subDirectoryName) throws IOException {
        final URL resource = getClass().getResource("/");
        final String normalizedAbsolutePath = FilenameUtils.normalize(resource.getFile() + subDirectoryName);
        final File directoryFile = new File(normalizedAbsolutePath);
        if (!directoryFile.exists()) {
            FileUtils.forceMkdir(directoryFile);
        }
        return normalizedAbsolutePath;
    }

}