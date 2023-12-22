import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int L = sc.nextInt();
		int max_Path = 4;
      
      	System.out.println("1 2 0");
      	System.out.println("1 2 1");
      	System.out.println("1 2 2");
      	System.out.println("1 2 3");
      for(int i = 2; i < L ; i++){
      	System.out.println(i + " " + (i+1) + " 0");
        System.out.println(i + " " + (i+1) + " " + max_Path);
        max_Path = max_Path * 2;
      }
	}
}