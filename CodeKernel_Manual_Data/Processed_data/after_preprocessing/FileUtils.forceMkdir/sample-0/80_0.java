public class dummy {
public void start() {
        super.start();
        Assert.notNull(dataDir);
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
        dataFileCaches = new MapMaker().makeComputingMap(new Function<String, File>() {
            public File apply(String destination) {
                return getDataFile(destination);
            }
        });
        executor = Executors.newScheduledThreadPool(1);
        destinations = new MapMaker().makeComputingMap(new Function<String, List<ClientIdentity>>() {
            public List<ClientIdentity> apply(String destination) {
                return loadClientIdentity(destination);
            }
        });
        cursors = new MapMaker().makeComputingMap(new Function<ClientIdentity, Position>() {
            public Position apply(ClientIdentity clientIdentity) {
                Position position = loadCursor(clientIdentity.getDestination(), clientIdentity);
                if (position == null) {
                    return nullCursor;
                } else {
                    return position;
                }
            }
        });
        updateCursorTasks = Collections.synchronizedSet(new HashSet<ClientIdentity>());
        executor.scheduleAtFixedRate(new Runnable() {
            public void run() {
                List<ClientIdentity> tasks = new ArrayList<ClientIdentity>(updateCursorTasks);
                for (ClientIdentity clientIdentity : tasks) {
                    MDC.put("destination", String.valueOf(clientIdentity.getDestination()));
                    try {
                        if (logger.isInfoEnabled()) {
                            LogPosition cursor = (LogPosition) getCursor(clientIdentity);
                            logger.info("clientId:{} cursor:[{},{},{}] address[{}]", new Object[] {
                                    clientIdentity.getClientId(), cursor.getPostion().getJournalName(),
                                    cursor.getPostion().getPosition(), cursor.getPostion().getTimestamp(),
                                    cursor.getIdentity().getSourceAddress().toString() });
                        }
                        flushDataToFile(clientIdentity.getDestination());
                        updateCursorTasks.remove(clientIdentity);
                    } catch (Throwable e) {
                        logger.error("period update" + clientIdentity.toString() + " curosr failed!", e);
                    }
                }
            }
        }, period, period, TimeUnit.MILLISECONDS);
    }
}