public class func{
public void forName0(String arg1,boolean arg2,ClassLoader arg3){
        return (arg3 == null) ? VmSystem.forName(arg1) : arg3.loadClass(arg1, arg2);
}
}
