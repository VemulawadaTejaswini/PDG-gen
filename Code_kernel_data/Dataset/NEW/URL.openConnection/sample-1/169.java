//169
public class func{
public void shouldServetWebJar(){
    String host = address.getHost();
    if (Strings.isNullOrEmpty(host)) {
      host = "127.0.0.1";
    }
    URL url = new URL("http", host, address.getPort(),
        "/webjars/bootstrap/3.1.0/css/bootstrap.min.css");
    Object content = url.openConnection().getContent();
}
}
