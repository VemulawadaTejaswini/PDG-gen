public class func{
public void readDocumentsRaw(String fn){
        ch = br.read();
        if (ch > -1) text.append((char)ch);
        if (ch > -1 && ch != '\n') continue;
}
}
