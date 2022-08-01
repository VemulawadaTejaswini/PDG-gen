//337
public class func{
	public void test_ConstructorLjava_lang_String(){
        Thread t = new Thread("Testing");
        assertEquals("Created tread with incorrect name",
                "Testing", t.getName());
        t.start();
}
}
