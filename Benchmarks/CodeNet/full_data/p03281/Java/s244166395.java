import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int nn = 0;
    int ans = 0;
    for(int i=1;i<=n;i++) {
    	for(int j=1;j<=n;j++) {
    		if((i%j==0)&&(i%2==1)) {
    			nn++;
    		}
    	}
    	if(nn == 8) {
    		ans++;
    	}
    	nn = 0;
    }
    System.out.println(ans);
  }
}