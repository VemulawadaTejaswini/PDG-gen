import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int K=sc.nextInt();
			int T=sc.nextInt();
			int temp=0;
			for(int i=0;i<T;i++){				
				temp=Math.abs(sc.nextInt()-temp);
			}
			System.out.println(temp-1);
		}
	}	
}
