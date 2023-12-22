import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    
    int s = 0;
    int t = 0;
    double p = 0;
    
    for (int i=1; i<k; i++){
      s = i;
      for (int j=1; j<16; j++){
        s = s*2;
        if (s>=k) {
          p += (1d/n) * Math.pow(0.5d,j);
          break;
        }
      }
      if (i==n) { break;}
    }
    
    System.out.println(p);
  }
}
