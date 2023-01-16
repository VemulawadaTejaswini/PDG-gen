//44
public class func{
	public void assertWarDeployed(){
        final String servletPath = GreeterServlet.class.getAnnotation(WebServlet.class).urlPatterns()[0];
        final URLConnection response = new URL("http://localhost:8080/test" + servletPath).openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(response.getInputStream()));
        final String result = in.readLine();
}
}
