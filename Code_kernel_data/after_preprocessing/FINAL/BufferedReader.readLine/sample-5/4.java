public class func{
public void getSharelibJars(String sharelib){
        String classpathFile = findClasspathFile(sharelib);
        BufferedReader br = new BufferedReader(new FileReader(classpathFile));
        String line = br.readLine();
        br.close();
}
}
