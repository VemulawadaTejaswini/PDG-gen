import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//ドーナツ種類
		int b = sc.nextInt();//所持グラム数
		int n[] = new int[a];//
		int x = 0;
		int d = 0;
		int batu = 0;
		for(int i = 0;i < a;i++){
			n[i] = sc.nextInt();
			b = b - n[i];
		
			
		}
		finish:for(int i = 0;i < a;i++){
		batu = 0;

		for(int e = 0; e < a; e++){
				if((n[e] >= n[i]) ){//その数字以下の数字の時
				batu++;
				if (batu == a){
					x = n[i];
					break finish;
				}

				
				}	
		}

		}

		d = b / x;//残りの数/最小で最大生成数取得
		System.out.println(a+d);
		
		
	
	}
}
