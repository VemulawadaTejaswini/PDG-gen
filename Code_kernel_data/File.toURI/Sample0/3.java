//2
public class func{
	public void setUp(){
    file = new File("./tmp");
    rm(file);
    URI uri = new File(file,"hdfs").toURI();
    Path hdfsDirPath = new Path(uri.toString());
    directory = new HdfsDirectory(hdfsDirPath);
}
}
