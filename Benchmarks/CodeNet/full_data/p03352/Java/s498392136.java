import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int num = 0;
      	int ans = 0;
		while(ans <= n){
          ans = num*num;
          num++;
        }
      	System.out.println(ans);
	}
}