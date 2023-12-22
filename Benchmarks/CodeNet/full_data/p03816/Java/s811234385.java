import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] X = new int[N];
		int kind=0;			
		for(int i=0;i<N;i++){
			int p = Integer.parseInt(sc.next());
			boolean NewN=true;
			for(int j=0;X[j]!=0;j++) NewN=(NewN&&(p!=X[j]));
			if(NewN){
				X[kind]=p;
				kind++;
			}
		}
		int MaxN=kind-1+kind%2;
		System.out.println(MaxN);
		sc.close();
	}
}