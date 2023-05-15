public class dummy {
private String getOutputPath(final FileInfo template, final FileInfo filter, final String outputBasePath) {
        final String outputPath = outputBasePath + PATH_SEPARATOR + filter.getRelativeSubDirectory()
                + PATH_SEPARATOR + filter.getNameWithoutExtension() + PATH_SEPARATOR
                + template.getRelativeSubDirectory() + PATH_SEPARATOR;
        return FilenameUtils.separatorsToUnix(FilenameUtils.normalize(outputPath));
    }
}