//339
public class func{
	public void test_ConstructorLjava_lang_RunnableLjava_lang_String(){
        Thread st1 = new Thread(new SimpleThread(1), "SimpleThread1");
        assertEquals("Constructed thread with incorrect thread name", "SimpleThread1", st1
                .getName());
        st1.start();
}
}
