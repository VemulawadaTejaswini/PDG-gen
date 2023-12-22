import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int h = scan.nextInt();
    int w = scan.nextInt();
    int n = scan.nextInt();

    HashMap<Long,Integer> set = new HashMap<>(n);
    for(int i = 0; i < n; i++) {
      int dumH = scan.nextInt()-1;
      int dumW = scan.nextInt()-1;
      int minH = Math.max(1,dumH-1);
      int maxH = Math.min(h-2,dumH+1);
      int minW = Math.max(1,dumW-1);
      int maxW = Math.min(w-2,dumW+1);
      //System.out.printf("(%d,%d);h(%d - %d) w(%d - %d)\n",dumH,dumW,minH,maxH,minW,maxW);
      for(int j = minH; j <= maxH; j++) {
        for(int k = minW; k <= maxW; k++) {
          long key = makeKey(j,k);
          if(set.containsKey(key)) {
            set.put(key,set.get(key)+1);
          }else {
            set.put(key,1);
          }
        }
      }
    }

    long[] result = new long[10];
    long zero = (h-2L)*(w-2L);
    for(Map.Entry entry : set.entrySet()) {
      result[(int)entry.getValue()]++;
      zero--;
    }
    result[0] = zero;

    for(int i = 0; i < 10; i++) {
      System.out.println(result[i]);
    }
  }

  static long makeKey(int a, int b) {
    return (((long)a)<<32)+(long)b;
  }
}
