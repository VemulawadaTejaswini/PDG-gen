import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] c=sc.next().toCharArray();
		
		boolean sh[]=new boolean[n+1];
		
		Arrays.fill(sh, false);
		sh[0]=true; sh[1]=true;
		for(int i=2;i<=n;i++){
			sh[i]=sh[i-1]^sh[i-2]^c[i-1]=='o';
		}
		if(sh[n]==sh[0]){
			put(sh);
			return;
		}

		Arrays.fill(sh, false);
		sh[0]=true; sh[1]=false;
		for(int i=2;i<=n;i++){
			sh[i]=sh[i-1]^sh[i-2]^c[i-1]=='o';
		}
		if(sh[n]==sh[0]){
			put(sh);
			return;
		}
		
		Arrays.fill(sh, false);
		sh[0]=false; sh[1]=true;
		for(int i=2;i<=n;i++){
			sh[i]=sh[i-1]^sh[i-2]^c[i-1]=='o';
		}
		if(sh[n]==sh[0]){
			put(sh);
			return;
		}

		Arrays.fill(sh, false);
		sh[0]=false; sh[1]=false;
		for(int i=2;i<=n;i++){
			sh[i]=sh[i-1]^sh[i-2]^c[i-1]=='o';
		}
		if(sh[n]==sh[0]){
			put(sh);
			return;
		}
		
		System.out.println(-1);
	}
	
	static void put(boolean[] sh){
		for(int i=0;i<sh.length-1;i++){
			System.out.print(sh[i]?"S":"W");
		}
		System.out.println();
	}
}
