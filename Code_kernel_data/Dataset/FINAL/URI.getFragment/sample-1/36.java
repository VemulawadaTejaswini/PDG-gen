public class func{
public void HttpURI(URI uri){
        _scheme=uri.getScheme();
        _host=uri.getHost();
        if (_host==null && uri.getRawSchemeSpecificPart().startsWith("//"))
            _host="";
        _port=uri.getPort();
        _user = uri.getUserInfo();
        _path=uri.getRawPath();
        _decodedPath = uri.getPath();
        if (_decodedPath != null)
        {
            int p = _decodedPath.lastIndexOf(';');
            if (p >= 0)
                _param = _decodedPath.substring(p + 1);
        }
        _query=uri.getRawQuery();
        _fragment=uri.getFragment();
}
}
