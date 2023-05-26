public class func{
public void classpathToUrls(String[] classPath,List<URL> urls){
            for (String cp : classPath)
                urls.add(new File(cp).toURI().toURL());
}
}
