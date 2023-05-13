public class dummy {

private String createOutputDirectory(final FileInfo template, final FileInfo filter,
            final String outputBasePath) throws IOException {
        final String outputDirectory = getOutputPath(template, filter, outputBasePath);
        final File outputDir = new File(outputDirectory);
        if (!outputDir.exists()) {
            log.debug("Creating : " + outputDir);
            FileUtils.forceMkdir(outputDir);
        }
        return FilenameUtils.normalize(outputDirectory);
    }

}