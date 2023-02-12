public class func{
public void extractMessageContents(Message m){
        while ((c = reader.read(ch)) != -1) {
          sb.append(ch, 0, c);
        }
        this.messageContents = sb.toString();
}
}
