import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int r = sc.nextInt();
     int ans=1; 
      if (n >=r) {
      for (int i=2;i<=100;i++) {
                  ans++;
        if (Math.pow(r,i)>n) {
          
          break;
        }
      }
      }
      System.out.println(ans);
    }
}