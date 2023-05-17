public class func{
public void UpgradeImageGallery(){
      _sourceHookClassName = FileSystemHook.class.getName();
    Class<?> clazz = classLoader.loadClass(_sourceHookClassName);
    _sourceHook = (Hook)clazz.newInstance();
}
}
