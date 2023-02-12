public class func{
public void testWithNotGlowrootJarButWithDelegateJavaagent(){
            File glowrootJar = new File("x/classes");
            CodeSource codeSource = new CodeSource(glowrootJar.toURI().toURL(), new Certificate[0]);
            assertThat(Agent.getGlowrootJarFile(codeSource)).isNull();
}
}
