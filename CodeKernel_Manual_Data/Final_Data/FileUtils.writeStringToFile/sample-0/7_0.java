public class dummy {

private File data(File dist, File target) throws IOException {
    File dir = new File(target, "data");
    if (!dir.exists()) {
      File cnf = new File(target, "my-default.cnf");
      FileUtils.writeStringToFile(cnf, "[mysql]\n# no defaults...");
      (new VerboseProcess(builder(dist, "scripts/mysql_install_db", new String[] { String.format("--defaults-file=%s", new Object[] { cnf }), "--force", "--innodb_use_native_aio=0", String.format("--datadir=%s", new Object[] { dir }), String.format("--basedir=%s", new Object[] { dist }) }))).stdoutQuietly();
    } 
    return dir;
  }

}