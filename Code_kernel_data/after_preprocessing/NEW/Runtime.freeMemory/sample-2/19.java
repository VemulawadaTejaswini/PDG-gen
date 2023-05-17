//19
public class func{
public void showMemoryUsage(String msg){
      if(rt.freeMemory() == last) {
        break;
      }
      last = rt.freeMemory();
}
}
