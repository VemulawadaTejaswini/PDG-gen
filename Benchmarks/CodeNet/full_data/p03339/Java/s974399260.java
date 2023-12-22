import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String h=sc.next();
		
		int a=N;
		
		for(int i=0;i<N;i++){
			int tmp=0;
			for(int t=0;t<i;t++){
				char y=h.charAt(t);
				if(y=='W'){tmp++;}
			}
			for(int t=i+1;t<N;t++){
				char y=h.charAt(t);
				if(y=='E'){tmp++;}
			}
			
			if(tmp<a){
				a=tmp;
			}
		}
		System.out.println(a);
	}
}