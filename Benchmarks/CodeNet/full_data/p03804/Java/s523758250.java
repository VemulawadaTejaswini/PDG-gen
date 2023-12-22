import java.util.*;
public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int M=sc.nextInt();
		
		String[] a=new String[N];
		String[] b=new String[M];
		for(int i=0;i<N;i++){
			a[i]=sc.next();
		}
		for(int i=0;i<M;i++){
			b[i]=sc.next();
		}
		for(int i=0;i<=N-M;i++){
			for(int j=0;j<=N-M;j++){
				if(a[i].substring(j,j+M).equals(b[0])){
					System.out.println(a[i].substring(j,j+M)+","+i+","+j);
					if(sub(a,b,i,j)==1){
						return;
					}
				}
			}
		}
		System.out.println("No");				

	}
	static int sub(String[]a ,String[]b,int i,int j){
		for(int k=0;k<b.length;k++){
			if(!a[i+k].substring(j,j+b.length).equals(b[k])){
				return 0;
			}
		}
		return 1;
	}
}