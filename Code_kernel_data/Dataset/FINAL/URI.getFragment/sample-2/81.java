public class func{
public void initialize(URI p_other){
    m_scheme = p_other.getScheme();
    m_userinfo = p_other.getUserinfo();
    m_host = p_other.getHost();
    m_port = p_other.getPort();
    m_path = p_other.getPath();
    m_queryString = p_other.getQueryString();
    m_fragment = p_other.getFragment();
}
}
