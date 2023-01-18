//79
public class func{
	public void multipleSCMs(){
        File sampleRepo = tmp.newFolder();
        URI u = sampleRepo.toURI();
        String sampleRepoU = new URI(u.getScheme(), "", u.getPath(), u.getFragment()).toString(); // TODO SVN rejects File.toUri syntax (requires blank authority field)
}
}
