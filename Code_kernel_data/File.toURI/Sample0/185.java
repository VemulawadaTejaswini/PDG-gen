//184
public class func{
	public void validPkcs12TrustStoreURLTest(){
        executeTest(SSL_TRANSPORT, new File(TRUST_STORE_DIRECTORY_NAME + TRUST_STORE_PKCS12_FILE_NAME).toURI().toString(), "pkcs12");
}
}
