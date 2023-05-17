//8
public class func{
public void getMemUsed(){
        long used = rt.totalMemory() - rt.freeMemory();
        if (used < minused) {
          cnt = 0;
          minused = used;
        } else {
          cnt++;
        }
}
}
