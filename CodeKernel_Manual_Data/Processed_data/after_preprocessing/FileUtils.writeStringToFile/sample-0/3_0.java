public class dummy {
public void add(@NotNull final String name, @NotNull final String content)
        throws IOException {
        final File dir = new File(this.path);
        final File file = new File(dir, name);
        FileUtils.writeStringToFile(file, content);
        this.git.exec(dir, "add", name);
        Logger.info(
            this,
            "File %s updated, %[size]s",
            file,
            file.length()
        );
    }
}