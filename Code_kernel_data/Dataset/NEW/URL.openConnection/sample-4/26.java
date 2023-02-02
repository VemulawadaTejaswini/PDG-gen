//26
public class func{
public void login(){
    Matcher m = re.matcher(postPage(url.openConnection(), req));
    if (m.find()) {
      token = m.group(1);
      tokenAge = System.currentTimeMillis();
    }
}
}
