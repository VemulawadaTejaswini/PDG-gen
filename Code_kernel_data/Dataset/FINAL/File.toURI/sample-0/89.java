public class func{
public void toURI(){
        Assert.assertEquals(repo.configToHttpUri("@apple:1.0"), new File(repo.getTargetRepo(), "prod/apple/1.0/apple-1.0.config").toURI());
        Assert.assertEquals(repo.binaryToHttpUri("apple:1.0"), new File(repo.getTargetRepo(), "food/fruit/apple/1.0/apple-1.0.tar.gz").toURI());
}
}
