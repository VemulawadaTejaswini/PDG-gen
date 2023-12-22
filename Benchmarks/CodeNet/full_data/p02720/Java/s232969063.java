import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int k = scan.nextInt();

    int start = 1;
    HashSet<Long> a = new HashSet<Long>();
    int[] b = new int[]{0,1,2,3,4,5,6,7,8,9};
    while (a.size() < k){
      a = find(a,b,start,0);
      start += 1;
    }

    ArrayList<Long> c = new ArrayList<Long>(a);
    Collections.sort(c);
    System.out.println(c.get(k-1));

  }

  static HashSet<Long> find(HashSet<Long> a, int[] b, int n, long now){
    String check = now+"";
    if ((now != 0) && (check.length() >= n)){
      a.add(now);
      return a;
    }

    int which = (int) now%10;

    now = now*10;

    for (int i=0;i<10;i++){
      long g = 0;
      if (now != 0){
        if (Math.abs(which - b[i]) > 1){
          continue;
        }
        g = now + b[i];
      }
      else{
        g = b[i];
      }

      if (g == 0){
        g = 1;
      }
      a = find(a,b,n,g);
    }

    return a;

  }

}
