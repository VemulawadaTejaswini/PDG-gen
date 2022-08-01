//52
public class func{
	public void performImplicitGrant(boolean needConsent){
    assertThat(responseURI.getFragment(), containsString("access_token="));
    assertThat(responseURI.getPath(), equalTo("/fourOhFour"));
}
}
