//42
public class func{
public void readFrom(IInteger socketId){
      while (in.ready()) {
        line.append((char)in.read());
      }
      return vf.string(line.toString());
}
}
