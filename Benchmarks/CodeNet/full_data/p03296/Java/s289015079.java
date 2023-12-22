import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int i = 0;
                int j = 0;
		int flg = 0;
		while(0<a){
			int b = sc.nextInt();
                        if(b == i && flg == 0){
				j++;
				flg = 1;
			}else{
				flg = 0;
			}
                        i = b;
			a = a-1;	
		}
		// 出力

		System.out.println(j);
	}
}