//222
public class func{
	public void getFileItemAsString(){
        assertThat(new File(fi).toURI().getPath(), containsString("config/test.txt"));
}
}
