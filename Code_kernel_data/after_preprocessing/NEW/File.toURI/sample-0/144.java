//144
public class func{
public void toURI(){
        Assert.assertEquals(repo.configToHttpUri("@apple:1.0"), new File(repo.getTargetRepo(), "prod/apple/1.0/apple-1.0.config").toURI());
}
}
