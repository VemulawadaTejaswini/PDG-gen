public class func{
public void OnDemandUrlStream(URL source){
        this.source = source.openConnection();
        this.sourceStream = this.source.getInputStream();
        contentLength = this.source.getContentLength();
}
}
