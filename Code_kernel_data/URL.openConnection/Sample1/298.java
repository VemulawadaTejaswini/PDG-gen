//297
public class func{
	public void dataSchemeShouldBeTreated(){
    URLConnection connection = new URL("data:text/html;enc,hello").openConnection();
    assertThat(connection).isNotNull();
}
}
