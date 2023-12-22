import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// 出力
      	double b = Math.floor((double)a/100);
		double c = a - b*100;
      	if(c>5*b){
        	System.out.println(0);
        }else{
        	System.out.println(1);
        }
      	
	}
}