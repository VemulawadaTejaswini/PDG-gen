import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
      	int k = sc.nextInt();
      	int result =1;
      	for (int i = 0; i < n-1; i++) {
            result *= k-1;
        }
        System.out.println(result*k);
     }
}