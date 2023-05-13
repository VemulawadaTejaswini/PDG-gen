public class dummy {

private void flushDataToFile(String destination, File dataFile) {
        LogPosition position = memoryLogPositionManager.getLatestIndexBy(destination);
        if (position != null && position != nullPosition) {
            String json = JsonUtils.marshalToString(position);
            try {
                FileUtils.writeStringToFile(dataFile, json);
            } catch (IOException e) {
                throw new CanalMetaManagerException(e);
            }
        }
    }

}