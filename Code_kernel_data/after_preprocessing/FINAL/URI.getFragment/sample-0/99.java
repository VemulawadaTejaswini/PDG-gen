public class func{
public void getIndexLocation(URI base,BaseToIndexConverter converter){
    return new URI(base.getScheme(), base.getUserInfo(), base.getHost(), base.getPort(), p.toString(), base.getQuery(), base.getFragment());
}
}
