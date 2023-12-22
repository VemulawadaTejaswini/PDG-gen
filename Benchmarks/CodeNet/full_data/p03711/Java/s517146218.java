import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int x = sc.nextInt();
		int y = sc.nextInt();
        
      	if((x == 4 || x ==6 || x== 9 || x ==11) && (y == 4 || y ==6 || y== 9 || y ==11)) {
        	System.out.println("Yes");
        }else if(x == 2 || y ==2){
            System.out.println("No");
	    }else{
  		System.out.println("Yes");
	}
}
}