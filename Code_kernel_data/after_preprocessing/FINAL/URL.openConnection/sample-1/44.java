public class func{
public void assertWarDeployed(){
        final String servletPath = GreeterServlet.class.getAnnotation(WebServlet.class).urlPatterns()[0];
        final URLConnection response = new URL("http:
        BufferedReader in = new BufferedReader(new InputStreamReader(response.getInputStream()));
        final String result = in.readLine();
}
}
