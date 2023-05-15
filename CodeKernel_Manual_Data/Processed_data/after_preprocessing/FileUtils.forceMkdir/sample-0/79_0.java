public class dummy {
private File getDataFile(String destination) {
        File destinationMetaDir = new File(dataDir, destination);
        if (!destinationMetaDir.exists()) {
            try {
                FileUtils.forceMkdir(destinationMetaDir);
            } catch (IOException e) {
                throw new CanalMetaManagerException(e);
            }
        }
        return new File(destinationMetaDir, dataFileName);
    }
}