//35
public class func{
public void readEmbedding(BufferedReader reader,int size){
        ch = reader.read();
        if (ch == -1) return null;
        if (CharUtils.isWhiteSpace((char)ch)) break;
        else buffer[b++] = ch;
}
}
