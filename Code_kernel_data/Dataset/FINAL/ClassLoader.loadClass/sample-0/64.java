public class func{
public void isolated_class_loader_cannot_load_classes_when_no_given_prefix(){
        ClassLoader cl = isolatedClassLoader().build();
        cl.loadClass("org.mockito.Mockito");
}
}
