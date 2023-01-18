//92
public class func{
	public void getContents(){
        this.channel.write(smallerBuffer);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(this.channel.getContents()));
        final String contents = reader.readLine();
        Assert.assertEquals("Contents read were not as expected", CONTENTS_SMALLER_BUFFER, contents);
}
}
