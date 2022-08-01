//5
public class func{
	public void testClassLoaderDoesNotNeedToSeeInvocationHandlerLoader(){
        ClassLoader loaderB = new ClassLoaderBuilder().withPrivateCopy(prefix).build();
        InvocationHandler invocationHandlerB = (InvocationHandler) loaderB.loadClass(
                prefix + "$TestInvocationHandler").newInstance();
}
}
