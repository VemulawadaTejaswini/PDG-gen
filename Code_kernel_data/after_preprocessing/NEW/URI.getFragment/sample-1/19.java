//19
public class func{
public void absolutize(URI p_base){
      if (m_path.length() == 0 && m_scheme == null &&
          m_host == null && m_regAuthority == null) {
          m_scheme = p_base.getScheme();
          m_userinfo = p_base.getUserinfo();
          m_host = p_base.getHost();
          m_port = p_base.getPort();
          m_regAuthority = p_base.getRegBasedAuthority();
          m_path = p_base.getPath();

          if (m_queryString == null) {
              m_queryString = p_base.getQueryString();

              if (m_fragment == null) {
                  m_fragment = p_base.getFragment();
              }
          }
          return;
      }
      if (m_scheme == null) {
          m_scheme = p_base.getScheme();
      }
      else {
          return;
      }
      if (m_host == null && m_regAuthority == null) {
          m_userinfo = p_base.getUserinfo();
          m_host = p_base.getHost();
          m_port = p_base.getPort();
          m_regAuthority = p_base.getRegBasedAuthority();
      }
      else {
          return;
      }
}
}
