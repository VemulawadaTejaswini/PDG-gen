public class func{
public void newOutputStream(){
        final String roundtrip = new BufferedReader(new InputStreamReader(this.getArchive().get(path).getAsset()
            .openStream())).readLine();
        Assert.assertEquals("Contents not read as expected from the outstream", contents, roundtrip);
}
}
