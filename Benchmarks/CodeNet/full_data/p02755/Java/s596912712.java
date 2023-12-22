import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int i=0;
    int ans = 0;
    int ans2 =0;
    for (i = 0; i < 1100; i++) {
    	ans = (int)(i*0.08);
    	ans2=(int)(i*0.10);
    	if (ans ==a && ans2 == b) {
    		break;
    	}
    }
    if (i >=1100){
    	ans=-1;
    } else{
    	ans=i;
    }
    System.out.println(ans);
  }
}




