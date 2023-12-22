import java.util.Scanner;
public final class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    if(n%2 == 1)
      	System.out.println("No");
    else{
      	int half = n/2; 
    	if(str.substring(0,half).compareTo(str.substring(half)) == 0){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
    sc.close();
  }
}