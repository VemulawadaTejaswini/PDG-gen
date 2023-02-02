//55
public class func{
public void addCP(){
        List runtimeClasspathElements = project.getRuntimeClasspathElements();
        for (Object runtimeClasspathElement : runtimeClasspathElements) {
            String element = (String) runtimeClasspathElement;
            addUrl(new File(element).toURI().toURL());
        }
}
}
