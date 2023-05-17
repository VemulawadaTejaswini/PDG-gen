//34
public class func{
public void loadTemplate(){
            while((c = reader.read()) != -1) {
                buffer.append((char)c);
            }
            template = buffer.toString();
}
}
