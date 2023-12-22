import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int W = sc.nextInt();
      	
		if(W%2==0){
        System.out.println(W/2);}
      	else if(W%2==1){
        System.out.println(W/2+1);}
	}
}
