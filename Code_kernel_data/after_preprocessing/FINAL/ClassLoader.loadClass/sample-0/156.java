public class func{
public void startCodeGen(String[] args,ClassLoader classLoader){
      Class<?> codeGenRunner = classLoader.loadClass(serviceCodeGenClassName);
      startCodeGen(args, codeGenRunner);
}
}
