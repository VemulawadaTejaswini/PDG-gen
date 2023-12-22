import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
      	// 商
        int syou = n / (a + b);
        // 余り
      	int amari = n % (a + b);
      	if (a < amari) {
          amari = a;
        }
		// 出力
        if(a == 0) {
          System.out.println(0);
        } else { 
			System.out.println(syou * a + amari);
        }
	}
}