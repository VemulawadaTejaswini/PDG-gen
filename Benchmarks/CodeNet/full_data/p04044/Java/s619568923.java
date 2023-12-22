import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    
    String[] s = new String[l];
    for(int i = 0;i<l;i++){
      s[i] = sc.next();
    }
    Arrays.sort(s);
    for(int i=0;i<n;i++){
      System.out.print(s[i]);
    }  
  }
}