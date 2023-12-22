import java.util.*;
public class Main {
 public static void main (String[] args){

	 	Scanner sc = new Scanner(System.in);
	 	
	 	// 整数の入力
	 	int a = sc.nextInt();
	 	int b = sc.nextInt();
	 	int c = sc.nextInt();
	 	int d = sc.nextInt();

	 	Integer [] numbs = {a,b,c,d};
 	
	 	String strBl;
	 	if(Arrays.asList(numbs).contains(1)&&
	 			Arrays.asList(numbs).contains(9) &&
	 			Arrays.asList(numbs).contains(7)&&
	 			Arrays.asList(numbs).contains(4)) {
	 		strBl = "YES";
	 	} else{
	 		strBl = "NO";
	 	}
	 	// 出力
	 	
	 	System.out.println(strBl);

	 
	 
 }
	
}
