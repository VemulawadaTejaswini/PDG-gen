public class dummy {
private List<File> processFilesToIgnore(final List<String> filesToIgnore) {
        if (filesToIgnore == null || filesToIgnore.isEmpty()) {
            return EMPTY_FILE_LIST;
        }
        final List<File> filesIgnored = new ArrayList<File>(filesToIgnore.size());
        for (String fileToIgnore : new LinkedHashSet<String>(filesToIgnore)) {
            if (StringUtils.isNotBlank(fileToIgnore)) {
                fileToIgnore = FilenameUtils.separatorsToSystem(FilenameUtils.normalize(fileToIgnore.trim()));
                final File file = new File(fileToIgnore);
                if (file.exists()) {
                    log.debug("Adding ignore for file: " + file.getAbsolutePath());
                    filesIgnored.add(file);
                }
            }
        }
        return filesIgnored;
    }
}