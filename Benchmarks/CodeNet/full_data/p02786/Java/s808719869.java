import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans;
      	int count;
      	ans=count=0;
      	while(n != 0){
          n/=2;
          ans += Math.pow(2, count);
          count++;
        }
      	Systemout.println(ans);
	}
}