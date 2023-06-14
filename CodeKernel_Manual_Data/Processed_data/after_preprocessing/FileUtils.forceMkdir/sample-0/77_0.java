public class dummy {
public void start(File dataDir) {
        super.start();
        if (!dataDir.exists()) {
            try {
                FileUtils.forceMkdir(dataDir);
            } catch (IOException e) {
                throw new CanalMetaManagerException(e);
            }
        }
        if (!dataDir.canRead() || !dataDir.canWrite()) {
            throw new CanalMetaManagerException("dir[" + dataDir.getPath() + "] can not read/write");
        }
        if (!memoryLogPositionManager.isStart()) {
            memoryLogPositionManager.start();
        }
        executorService.scheduleAtFixedRate(() -> {
            List<String> tasks = new ArrayList<>(persistTasks);
            for (String destination : tasks) {
                try {
                    flushDataToFile(destination);
                    persistTasks.remove(destination);
                } catch (Throwable e) {
                    logger.error("period update" + destination + " curosr failed!", e);
                }
            }
        }, period, period, TimeUnit.MILLISECONDS);
    }
}