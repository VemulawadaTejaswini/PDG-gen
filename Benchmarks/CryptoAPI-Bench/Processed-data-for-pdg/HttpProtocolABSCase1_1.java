public class Dummy {
    CryptoHTTP1 crypto;
    public Dummy() throws MalformedURLException {
        String url = "http:
        crypto = new CryptoHTTP1(url);
        crypto.method1("");
    }
}
class CryptoHTTP1 {
    String defURL;
    public CryptoHTTP1(String url){
        defURL = url;
    }
    public void method1(String passedURL) throws MalformedURLException {
        if(passedURL.isEmpty()){
            passedURL = defURL;
        }
        System.out.println(new URL(passedURL));
    }
}
