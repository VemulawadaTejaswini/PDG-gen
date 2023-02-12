public class func{
public void usedMemory(){
      final long current = runtime.totalMemory() - runtime.freeMemory();
      if (current < last) {
        last = current;
      }
      else {
        return last;
      }
}
}
