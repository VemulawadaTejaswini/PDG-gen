import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
          String s = sc.next();
          char a;
          String b=""; 

		for (int i=0;i < s.length();i++){
		   if(i%2 == 1){
		   a = s.charAt(i);
		   b = b + a; 
		   }
		}
	        System.out.println(b);
	}
}