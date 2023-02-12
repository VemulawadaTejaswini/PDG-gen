public class func{
public void GroovyCodeSource(URL url){
        this.codeSource = new CodeSource(url, (java.security.cert.Certificate[]) null);
            String contentEncoding = url.openConnection().getContentEncoding();
            if (contentEncoding != null) {
                this.scriptText = ResourceGroovyMethods.getText(url, contentEncoding);
            } else {
                this.scriptText = ResourceGroovyMethods.getText(url); // falls-back on default encoding
            }
}
}
