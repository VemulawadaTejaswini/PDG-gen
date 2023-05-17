//294
public class func{
public void dataSchemeShouldAllowContentTypeParameters(){
    URLConnection connection = new URL("data:text/xml;encoding=utf-8;base64,aGVsbG8gd29ybGQ=")
        .openConnection();
    assertThat(connection).isNotNull();
}
}
