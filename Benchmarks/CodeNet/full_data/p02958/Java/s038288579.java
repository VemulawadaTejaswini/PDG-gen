import java.util.*;
public class Main {

  public static void main (String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    Integer[] p = new Integer[N];
    
    for (int i = 0; i < N; i++) {
      p[i] = sc.nextInt();
    }

    sc.close();

    Integer[] p_ = p.clone();

    Arrays.sort(p);

    int count = 0;

    for (int i = 0; i < N; i++){
      if (p[i] != p_[i]){
        count++;
      }
    }

    if (count == 0 || count == 2){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    
  }

}