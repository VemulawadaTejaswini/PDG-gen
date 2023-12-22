import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        int sum = 0;
        for(int i=0;i<a;i++){
                             int b = sc.nextInt();
                             sum+=b;
                             in[i]=sum;
                            }
		int ans = sum;
        for(int i=0;i<a-1;i++){ans=Math.min(ans,Math.max(sum-2*in[i],2*in[i]-sum));
                              }
		System.out.println(ans);
	}
}
