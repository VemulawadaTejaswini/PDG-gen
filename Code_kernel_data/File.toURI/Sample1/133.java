//132
public class func{
	public void givenPlatformNullThenPlatformisSomethingValidLooking(){
        String matcher = platformPath.substring( sdkPath.toURI().toString().length() -1 );
        Assert.assertTrue(String.format("Platform [%s] does not match regex: [%s]", matcher,regex), matcher.matches(regex));
}
}
