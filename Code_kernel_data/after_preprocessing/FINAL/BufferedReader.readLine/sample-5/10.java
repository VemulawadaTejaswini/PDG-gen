public class func{
public void testVersionAgreesWithVERSIONFile(){
        File versionFile = new File("VERSION").getAbsoluteFile();
        Assert.assertTrue(String.format("Expected VERSION file to exist, but it doesn't. (path is %s).", versionFile.getAbsolutePath()), versionFile.exists());
        Assert.assertTrue(String.format("Expected VERSION to be a file, but it doesn't. (path is %s).", versionFile.getAbsolutePath()), versionFile.isFile());
        BufferedReader reader = new BufferedReader(new FileReader(versionFile));
        String firstLine = reader.readLine();
        Assert.assertEquals(firstLine, Stripe.VERSION);
}
}
