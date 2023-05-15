public class dummy {
private void provisionBackupDirectory() {
        LoggerHolder.getLog().info(msg.format("setup.local.dir", directory));
        if (directory.isFile()) {
            throw new ReConfInitializationError(msg.format("error.local.dir.file", directory));
        }
        if (!directory.exists()) {
            LoggerHolder.getLog().info(msg.format("local.dir.not.found", directory));
            try {
                FileUtils.forceMkdir(directory);
            } catch (Exception e) {
                throw new ReConfInitializationError(e);
            }
            LoggerHolder.getLog().info(msg.format("local.dir.new", directory));
        }
        if (!directory.canRead()) {
            throw new ReConfInitializationError(msg.format("error.local.dir.read", directory));
        }
        if (!directory.canWrite()) {
            throw new ReConfInitializationError(msg.format("error.local.dir.write", directory));
        }
        File parent = directory.getParentFile();
        if (!parent.canRead()) {
            throw new ReConfInitializationError(msg.format("error.local.dir.read", parent));
        }
        if (!parent.canWrite()) {
            throw new ReConfInitializationError(msg.format("error.local.dir.write", parent));
        }
    }
}