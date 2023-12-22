import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w =sc.nextInt();
		int h=sc.nextInt();
		long[] p=new long[w];
		for(int i=0; i<w; i++){
			p[i]=sc.nextLong();
		}
		long[] q=new long[h];
		for(int i=0; i<h; i++){
			q[i]=sc.nextLong();
		}
		Arrays.sort(p);
		Arrays.sort(q);
		int i=0;
		int j=0;
		long ans=0;
		while(i<h || j<w){
			if(j==w || p[j]>q[i]){
				ans+=q[i]*(w+1-j);
				i++;
			}else{
				ans+=p[j]*(h+1-i);
				j++;
			}
		}
		System.out.println(ans);
	}
}
