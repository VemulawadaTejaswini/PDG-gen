//45
public class func{
public void readTextFile(File file){
      do {
        c = in.read();
        if (c != -1) {
          text.append((char) c);
        }
      } while (c != -1);
      in.close();
}
}
