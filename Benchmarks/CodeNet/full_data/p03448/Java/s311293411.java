import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();

		int out =0;

		//最小のコイン数で払う
		int num500 = X/500;
		int num100 = (X%500)/100;
		int num50  = (X-num500*500-num100*100)/50;
		if(num500<=A && num100<= B && num50<=C){
			out++;
		}else{
			System.out.println(0);
			System.exit();
		}

		for(int i=num500; i>=0; i--){
			for(int j= (X-500*i)/100 -1; j>=0; j--){
				if(j>B){
					continue;
				}
				int nc50 = (X- 500*i - 100*j)/50;
				if(nc50<=C){
					out++;
				}
				else{
					break;
				}
			}
		}
		// 出力
		System.out.println(out);
	}
}