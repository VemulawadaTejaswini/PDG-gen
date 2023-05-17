//224
public class func{
public void appSample(){
    URI scriptUri = new File("samples/app.groovy").toURI();
    assertTrue("Wrong output: " + output,
        output.contains("Hello World! From " + scriptUri));
}
}
