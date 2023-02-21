public class dummy {

public Git(@NotNull final File key,
        @NotNull final File temp) throws IOException {
        if (!new File(Git.SSH).exists()) {
            throw new IllegalStateException(
                String.format("SSH is not installed at '%s'", Git.SSH)
            );
        }
        final File kfile = new File(temp, "heroku.pem");
        FileUtils.copyFile(key, kfile);
        this.chmod(kfile, Git.PERMS);
        final File file = new File(temp, "git-ssh.sh");
        this.script = file.getAbsolutePath();
        FileUtils.writeStringToFile(
            new File(this.script),
            String.format(
                // @checkstyle LineLength (1 line)
                "set -x && %s -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no -i '%s' $@",
                Git.SSH,
                kfile.getAbsolutePath()
            )
        );
        file.setExecutable(true);
    }

}