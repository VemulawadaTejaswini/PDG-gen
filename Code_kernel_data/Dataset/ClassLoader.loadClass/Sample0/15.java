//14
public class func{
	public void loadTestClass(ClassLoader testClassLoader,TestFile testFile){
            return testClassLoader.loadClass(testFile.getClassName());
            throw new RuntimeException("Cannot load class: " + testFile, e);
}
}
