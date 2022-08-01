//13
public class func{
	public void createInputSplit(String content){
    return new FileInputSplit(0, new Path(tempFile.toURI().toString()), 0, tempFile.length(), new String[] {"localhost"});
}
}
