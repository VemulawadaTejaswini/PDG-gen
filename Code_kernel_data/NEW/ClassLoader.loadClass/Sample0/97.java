//96
public class func{
	public void testTutorialGettingStartedTypePool(){
        assertThat(classLoader.loadClass(UnloadedBar.class.getName()).getDeclaredField("qux"), notNullValue(java.lang.reflect.Field.class));
}
}
