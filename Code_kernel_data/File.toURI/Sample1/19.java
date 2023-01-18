//18
public class func{
	public void before(){
    File edgesFile = tempFolder.newFile();
    Files.write(GatherSumApplyITCase.EDGES, edgesFile, Charsets.UTF_8);
    edgesPath = edgesFile.toURI().toString();
}
}
