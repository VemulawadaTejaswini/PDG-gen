import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
        int sp1[] = new int[M];
        int sp2[] = new int[M];
        int cnt1 = 0;
        int cnt2 = 0;
		for(int i=0; i<M; i++){
          int start = sc.nextInt();
          int end   = sc.nextInt();
          if(start == 1){
            sp1[cnt1] = end;
            cnt1++;
          }
          else if(end == N){
            sp2[cnt2] = start;
            cnt2++;
          }
        }
        //sp[cnt1][0] = -1;
        //sp[cnt2][1] = -1;
      
        for(int i=0; i<cnt1; i++){
          //if(sp[i][0] != -1) break;
          // if(sp[i][0] != 1) continue;
          int s = 0;
          int l = cnt2 - 1;
          int m = (s + l) / 2;
          while(s <= l){
            if(sp2[m] == sp1[i]) {
              System.out.print("POSSIBLE");
              return;
            }else if(sp2[m] < sp1[i]){
              s = m + 1;
            }else{
              l = m - 1;
            }
          }
        }
        System.out.print("IMPOSSIBLE");
	}
}
