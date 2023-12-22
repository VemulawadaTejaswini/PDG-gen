import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	String s = "";
      	if( a > b && a > c && c > b ){
          s = "Yes";
        }else if( b > a && b > c && c > a ){
          s = "Yes";
        }else{
          s = "No";
        }
      System.out.println(s);
	}
}