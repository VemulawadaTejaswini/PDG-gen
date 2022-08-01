//72
public class func{
	public void testVisitBundle(){
    final BufferedReader reader = getResultReader();
    assertEquals(
        "bundle,org.jacoco.example,FooClass,10,15,1,2,0,3,1,2,0,1",
        reader.readLine());
}
}
