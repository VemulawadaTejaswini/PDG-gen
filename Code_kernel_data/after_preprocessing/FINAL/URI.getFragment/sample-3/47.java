public class func{
public void testCompareToJavaNetURI(){
        assertThat("[" + input + "] .query",httpUri.getQuery(),is(javaUri.getRawQuery()));
        assertThat("[" + input + "] .fragment",httpUri.getFragment(),is(javaUri.getFragment()));
}
}
