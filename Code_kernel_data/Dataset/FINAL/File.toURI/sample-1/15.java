public class func{
public void loadAndRegister(File driverJarFile,String driverClassName){
        loadAndRegister(new URL("jar:" + driverJarFile.toURI() + "!/"),
                        driverClassName);
}
}
