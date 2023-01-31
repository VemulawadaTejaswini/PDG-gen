//130
public class func{
	public void testWithNotGlowrootJar(){
        File glowrootJar = new File("x/classes");
        CodeSource codeSource = new CodeSource(glowrootJar.toURI().toURL(), new Certificate[0]);
        Agent.getGlowrootJarFile(codeSource);
}
}
