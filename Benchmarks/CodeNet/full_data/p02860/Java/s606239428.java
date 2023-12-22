import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String S = sc.next();
   
    if(n%2 != 0) {
    	System.out.println("No");
    }else if(S.substring(0,n/2).equals(S.substring(n/2,n))){
		System.out.println("Yes");
    }else {
    	System.out.println("No");
    }
      }
}
