public class func{
public void checkConnect(URL url){
                    url.openConnection().getPermission();
                if (perm != null)
                    security.checkPermission(perm);
                else
                    security.checkConnect(url.getHost(), url.getPort());
                    security.checkConnect(url.getHost(), url.getPort());
}
}
