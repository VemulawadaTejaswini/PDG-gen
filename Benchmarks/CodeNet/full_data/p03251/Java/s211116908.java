import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
      	int Y = sc.nextInt();
      	int xset[] = new int[N];
      	int yset[] = new int[M];
      	for(int i=0;i<N;i++){
        	xset[i] = sc.nextInt();
        }
      	for(int i=0;i<M;i++){
        	yset[i] = sc.nextInt();
        }
		Arrays.sort(xset);
      	Arrays.sort(yset);
      	if(xset[N-1]<yset[0] &&xset[N-1]>= X && yset[0] <= Y){
        	System.out.println("No War");
        }else{
        	System.out.println("War");
        }      
    }
}