//94
public class func{
	public void openStream(){
        this.asset.write(buffer);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(this.asset.openStream()));
        final String contents = reader.readLine();
        Assert.assertEquals("Contents read were not as expected", CONTENTS_BUFFER, contents);
}
}
