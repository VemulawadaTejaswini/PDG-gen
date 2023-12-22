import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();	
		int a[] = new int[N];
        for(int i=0; i<N; i++){
          a[i] = sc.nextInt();}
        int cnt=0;
        int puyo=1;
        for(int i=0; i<N-1; i++){
          if(a[i] == a[i+1]){
            puyo++;
            continue;
           }
           cnt += puyo/2;
           puyo = 1;          
        }
           cnt += puyo/2;
		// 出力
		System.out.println(cnt);
	}
}