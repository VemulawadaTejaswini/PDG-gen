public class dummy {

public void start() {
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

        // 启动定时工作任务
        executorService.scheduleAtFixedRate(() -> {
            List<String> tasks = new ArrayList<>(persistTasks);
            for (String destination : tasks) {
                try {
                    // 定时将内存中的最新值刷到file中，多次变更只刷一次
                    flushDataToFile(destination);
                    persistTasks.remove(destination);
                } catch (Throwable e) {
                    // ignore
                    logger.error("period update" + destination + " curosr failed!", e);
                }
            }
        }, period, period, TimeUnit.MILLISECONDS);

    }

}