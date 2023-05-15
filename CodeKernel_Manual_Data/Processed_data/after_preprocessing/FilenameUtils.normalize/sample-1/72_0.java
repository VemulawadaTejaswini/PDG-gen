public class dummy {
public List<FileInfo> readFiles(final String path)
            throws IOException, InstantiationException, IllegalAccessException {
        log.debug("Scanning directory: " + path);
        final File directory = new File(path);
        final Collection<File> allFiles = getAllFiles(directory);
        if (allFiles.isEmpty()) {
            log.warn("No files found in directory: " + path);
        }
        final List<FileInfo> allFilesInfo = new ArrayList<FileInfo>(allFiles.size());
        final String canonicalBaseDirectory = directory.getCanonicalPath();
        for (final File file : allFiles) {
            final FileInfo fileInfo = new FileInfo(file);
            final String canonicalFilePath = FilenameUtils.getFullPathNoEndSeparator(file.getCanonicalPath());
            final String subDirectory = FilenameUtils.normalize(
                    StringUtils.replaceOnce(canonicalFilePath, canonicalBaseDirectory, "") + pathSeparator);
            fileInfo.setRelativeSubDirectory(subDirectory);
            allFilesInfo.add(fileInfo);
        }
        return allFilesInfo;
    }
}