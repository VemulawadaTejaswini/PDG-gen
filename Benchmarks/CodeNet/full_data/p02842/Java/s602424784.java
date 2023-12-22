import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// 出力
      	double b = Math.ceil((double)a/1.08)
      	if(Math.floor(b*1.08)==(double)a){
			System.out.println(b);    
        }else{
			System.out.println(":(");
        }
	}
}