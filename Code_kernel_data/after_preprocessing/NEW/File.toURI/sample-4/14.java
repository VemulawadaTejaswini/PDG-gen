//14
public class func{
public void parentPath(){
      final File parent = file().getAbsoluteFile().getParentFile();
      if(parent != null)
        return parent.toURI().toString();
      else
        return getAbsolutePath();
}
}
