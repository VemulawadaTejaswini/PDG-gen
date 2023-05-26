//89
public class func{
public void successTest(String className,String expectedOutput){
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("java -Xmx128m -cp testbin "+rewriterPackage+"."+className);
            InputStreamReader esr = new InputStreamReader(p.getErrorStream());
            BufferedReader ebr = new BufferedReader(esr);
            String line = ebr.readLine();
            if (line != null) {
                fail(line);
            }
            InputStreamReader isr = new InputStreamReader(p.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            assertEquals(expectedOutput, br.readLine());
            assertEquals(-1, br.read());
            assertEquals(0, p.waitFor());
}
}
