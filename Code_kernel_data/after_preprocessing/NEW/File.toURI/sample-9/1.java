//1
public class func{
public void testConsumerModifiedFileInComplexDirectorySetup(){
    File dir = createTempDirectory();
    File subdir = new File( dir.getAbsolutePath() + "/subDirectory/" );
    subdir.mkdir();
    FileUtils.write( new File( subdir, "project.xml" ), "data" );
    List<ScmFile> changedFiles = getChangedFiles( "M  subDirectory/project.xml", subdir, dir.toURI() );
    assertNotNull( changedFiles );
    assertEquals( 1, changedFiles.size() );
}
}
