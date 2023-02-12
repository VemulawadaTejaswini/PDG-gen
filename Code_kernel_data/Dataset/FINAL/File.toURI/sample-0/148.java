public class func{
public void validTrustStoreURLFailoverTest(){
        executeTest(FAILOVER_SSL_TRANSPORT, new File(TRUST_STORE_DIRECTORY_NAME + TRUST_STORE_FILE_NAME).toURI().toString());
}
}
