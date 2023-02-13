public class func{
public void postProperty(){
    URL url = new URL("http:
    HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
    httpCon.setDoOutput(true);
    httpCon.setRequestMethod("PUT");
    PrintStream printStream = new PrintStream(httpCon.getOutputStream());
    printStream.println("narf = blah");
    printStream.close();
}
}
