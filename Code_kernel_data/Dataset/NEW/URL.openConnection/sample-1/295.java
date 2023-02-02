//295
public class func{
public void dataSchemeShouldAllowOptionalEncoding(){
    URLConnection connection = new URL("data:text/xml,<hello/>").openConnection();
    assertThat(connection).isNotNull();
}
}
