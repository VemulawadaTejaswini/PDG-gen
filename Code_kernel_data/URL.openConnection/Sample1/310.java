//309
public class func{
	public void dataSchemeShouldDecodeBase64(){
    URLConnection connection = new URL("data:text/plain;base64,aGVsbG8gd29ybGQ=").openConnection();
    assertThat(connection.getContentEncoding()).isNull();
}
}
