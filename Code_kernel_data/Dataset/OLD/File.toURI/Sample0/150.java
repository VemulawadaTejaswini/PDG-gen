//149
public class func{
	public void invalidTrustStoreURLTest(){
        executeTest(SSL_TRANSPORT, new File(TRUST_STORE_DIRECTORY_NAME + TRUST_STORE_FILE_NAME + ".dummy").toURI().toString());
}
}
