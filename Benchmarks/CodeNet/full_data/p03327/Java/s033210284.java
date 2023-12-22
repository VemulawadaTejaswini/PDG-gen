import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
      	if(N>=1000){
        	System.out.println("ABD");
        }else{
        	System.out.println("ABC");
        }
    }
}