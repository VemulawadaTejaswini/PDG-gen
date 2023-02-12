public class func{
public void before(){
        File edgesFile = tempFolder.newFile();
        Files.write(SingleSourceShortestPathsData.EDGES, edgesFile, Charsets.UTF_8);
        edgesPath = edgesFile.toURI().toString();
}
}
