import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    int b[] = new int[n];
    Data []d = new Data[n];
    
    for (int i=0; i<n; i++){
      a[i] = Integer.parseInt(sc.next());
      b[i] = Integer.parseInt(sc.next());
    }
    
    for(int i= 0; i < n; i++) {
      d[i] = new Data(b[i], a[i]);
    }
    
    Arrays.sort(d, new Comparator<Data>() {
      public int compare(Data d1, Data d2) {
        return d1.getA() - d2.getA();
      }
    });
 
    int t=0;
    for(int i=0; i<n; i++){
      t += d[i].getB();
      if(t > d[i].getA()){
        System.out.println("No");
        return;
      }
    }
    
    System.out.println("Yes");
    
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
    private int a;
    private int b;
    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}