import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = scn.nextInt();
      	int b = scn.nextInt();
      	int aa = a*n;
      	int ans = 0;
      	if(aa>=b){
          ans = b;
        }else{
          ans = aa;
        }
      	System.out.println(ans);
	}
}