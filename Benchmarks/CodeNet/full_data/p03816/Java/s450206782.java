import java.util.*;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] Items = new int[N];
		int[] Sets = new int[N];
		int kind=0;
		boolean NewN;			
		for(int i=0;i<N;i++){
			Items[i] = Integer.parseInt(sc.next());
		}
		for(int i=0;i<N;i++){
			NewN=true;
			for(int j=0;(Sets[j]!=0)&&NewN;j++) NewN=(Items[i]==Sets[j])?false:true;
			if(NewN){
				Sets[kind]=Items[i];
				kind++;
			}
		}
		int MaxN=kind-1+kind%2;
		System.out.println(MaxN);
		sc.close();
	}
}