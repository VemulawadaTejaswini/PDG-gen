import java.util.*;
public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
    int X = sc.nextInt();
    int ALL = 0;
    int ans = 1;

    for(int i = 0; i < N; i++){
      ALL += sc.nextInt();

      if(ALL > X){
        break;
      }
			ans++;
    }



		System.out.println(ans);
	}
}
