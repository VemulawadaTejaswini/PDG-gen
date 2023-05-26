//102
public class func{
public void apply(final VirtualFile it){
            String _path = it.getPath();
            File _file = new File(_path);
            URI _uRI = _file.toURI();
            return _uRI.toURL();
}
}
