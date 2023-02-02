//109
public class func{
public void testGetJobIdFromIncorrectPath(){
    File jobHistoryfile = new File(JOB_HISTORY_FILE_NAME);
    Path srcPath = new Path(jobHistoryfile.toURI());
    FileLister.getJobIdFromPath(srcPath);
}
}
