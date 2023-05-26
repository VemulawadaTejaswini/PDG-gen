public class func{
public void getContent(String url){
            return Streams.readFullyString(SslTrustUtils.trustAll(new URL(url).openConnection()).getInputStream());
}
}
