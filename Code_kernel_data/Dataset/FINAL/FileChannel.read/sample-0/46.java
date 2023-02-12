public class func{
public void loadClassBytes(String classFile){
    int i = fileC.read(buffer);
    if (i == 0 || i == -1) {
     break;
    }
    buffer.flip();
    outC.write(buffer);
    buffer.clear();
}
}
