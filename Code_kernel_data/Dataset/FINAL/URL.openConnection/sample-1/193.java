public class func{
public void main(String[] args){
        HttpsURLConnection con = (HttpsURLConnection) new URL("https:
        print_https_cert(con);
        print_content(con);
}
}
