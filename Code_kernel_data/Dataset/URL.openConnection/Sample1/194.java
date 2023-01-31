//193
public class func{
	public void main(String[] args){
        HttpsURLConnection con = (HttpsURLConnection) new URL("https://github.com").openConnection();
        print_https_cert(con);
        print_content(con);
}
}
