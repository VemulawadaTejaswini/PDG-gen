import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
      	int B = sc.nextInt();
      	
		if(A%2==1 && B%2==1){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
      
    }
}