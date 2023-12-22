import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] e=new int[n+1];
		for(int i = 0; i<4; i++){
			int k = i;
			int a = ((k&1)==0)?1:-1;
			k>>=1;
			int b = ((k&1)==0)?1:-1;
			e[0]=a;
			e[1]=b;
			boolean judge=false;
			for(int j = 2; j<=n; j++){
				if(e[j-1]==1){
					e[j]=(s.charAt(j-1)=='o')?e[j-2]:-e[j-2];
				}else{
					e[j]=(s.charAt(j-1)=='o')?-e[j-2]:e[j-2];
				}
			}
			if(e[0]==1){
				if(s.charAt(0)=='o'){
					judge=e[n-1]==e[1];
				}else{
					judge=e[n-1]==-e[1];
				}
			}else{
				if(s.charAt(0)=='o'){
					judge=e[n-1]==-e[1];
				}else{
					judge=e[n-1]==e[1];
				}
			}
			if(judge && e[0]==e[n]){
				String ans="";
				for(int q = 0; q<n; q++){
					ans+=(e[q]==1)?"S":"W";
				}
				System.out.println(ans);
				return;
			}
		}
		System.out.println(-1);
	}
}
