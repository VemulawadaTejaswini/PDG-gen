import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
	String s1 = sc.next();
    String s2 = sc.next();

    String[] c1 = new String[n];
    String[] c2 = new String[n];
    
    for(int i=0; i<n; i++){
      c1[i] = s1.substring(i,i+1);
      c2[i] = s2.substring(i,i+1);
    }
    
    for(int i=0; i<n; i++){
      System.out.print(c1[i]+c2[i]);
    }
    
    System.out.print("\n");
    
  }
}
