import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String t[] = new String[n];
    int s[] = new int[n];
    Data []d = new Data[n];
    
    for (int i=0; i<n; i++){
      t[i] = sc.next();
      s[i] = Integer.parseInt(sc.next());
    }
    
    String pt = sc.next();
    int ip = 0;
    
    for(int i= 0; i < n; i++) {
      d[i] = new Data(t[i], s[i]);
      if(t[i].equals(pt)){
        ip = i;
      }
    }
    
    int ans = 0;
    for(int i = ip+1; i < n; i++){
      ans += s[i];
    }
    
    System.out.println(ans);
    
  }
  
  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b,a%b);
    }
  }
}

class Data{
    private String a;
    private int b;
    public Data(String a, int b) {
        this.a = a;
        this.b = b;
    }
    public String getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}
