import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
      	int comp = 10001;
      	int double_times = 1;
      	int need_to_change = 0;
      	int color;
      	for(int i=0;i<N;i++){
          color = sc.nextInt();
          if(color == comp ){
            double_times++;
          }else{
            need_to_change += double_times/2;
            double_times = 1;
          }
          comp = color;
          
        }
		need_to_change += double_times/2;
		// 出力
		System.out.println(need_to_change);
	}
}