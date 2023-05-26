//9
public class func{
public void usedMemory(){
      final long current = runtime.totalMemory() - runtime.freeMemory();
      if (current < last) {
        // if the value are reduced then wait for more reducing
        last = current;
      }
      else {
        return last;
      }
}
}
