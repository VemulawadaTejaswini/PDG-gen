public class func{
public void pageContains(String page,String contains){
    String content = StreamUtils.readToString(appUrl.openConnection().getInputStream());
    assertThat(content).contains(contains);
}
}
