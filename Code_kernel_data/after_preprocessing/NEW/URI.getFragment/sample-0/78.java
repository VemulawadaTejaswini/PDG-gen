//78
public class func{
public void multipleSCMs(){
        run(sampleRepo, "svnadmin", "create", "--compatible-version=1.5", sampleRepo.getAbsolutePath());
        File sampleWc = tmp.newFolder();
        run(sampleWc, "svn", "co", sampleRepoU, ".");
        FileUtils.touch(new File(sampleWc, "file"));
        run(sampleWc, "svn", "commit", "--message=init");
        File otherRepo = tmp.newFolder();
        u = otherRepo.toURI();
        String otherRepoU = new URI(u.getScheme(), "", u.getPath(), u.getFragment()).toString();
}
}
