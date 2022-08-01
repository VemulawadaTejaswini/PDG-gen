//325
public class func{
	public void shouldBeAbleToSetupContentUrlStreamHandler(){
    assertThat(new URL("content://authority/data").openConnection()).isNotNull();
}
}
