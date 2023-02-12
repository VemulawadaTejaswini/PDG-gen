public class func{
public void readFile(){
      for (int c = input.read(); c != -1; c = input.read()) {
        result.append((char)c);
      }
      return result.toString();
}
}
