import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int l = Integer.parseInt(sc.next());
    int r = Integer.parseInt(sc.next());
    int d = r-l;
    
    if (d >= 2019) {
      System.out.println("0");
      return;
    }
    
    int pro = 0;
    int ans = 2019;
    
	for (int i=l; i<=r; i++){
      for (int j=i+1; j<=r; j++){
        pro = ((i%2019) * (j%2019) ) % 2019;
        //System.out.println(i+", "+j+" : " + pro);
        if (pro < ans) {
          ans = pro;
        }
      }
    }

    System.out.println(ans);

  }
}
