//25
public class func{
public void transformDirect(Object value){
            while (chr != -1 && contents.length() < DataTypeManager.MAX_STRING_LENGTH) {
                contents.append((char)chr);
                chr = reader.read();
            }
            return contents.toString();         
}
}
