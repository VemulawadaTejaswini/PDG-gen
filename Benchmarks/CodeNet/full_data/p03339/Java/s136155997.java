import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String h=sc.next();
		
		int a=N;
		int[] d=new int[N];
		
		int tmp=0;
		for(int i=0;i<N;i++){
			char y=h.charAt(i);
			if(y=='E'){
				d[i]=1;
				tmp++;
			}else{
				d[i]=0;
			}
		}
		
		tmp-=d[0];
		if(tmp<a){a=tmp;}
		
		for(int i=1;i<N;i++){
			tmp-=d[i];
			tmp+=d[i-1]^1;
			if(tmp<a){a=tmp;}
		}
		
		
		System.out.println(a);
	}
}