import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
      	//配列
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
        }
      	//カウント
        int count = 0;
      
        for(int i = 0; i < n; i++){
        	if(i + 1 == num[num[i]-1]){
            	count++;
            }
        }
        System.out.println(count / 2);
     }
}