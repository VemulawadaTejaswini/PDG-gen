import java.util.Scanner;
public class Main{
  public static void main(String ages[]){
    Scanner scanner = new Scanner(System.in);
    int a=scanner.nextInt();
    int b=scanner.nextInt();
    if(((a+b)/2)%2 == 0){
  		System.out.println((a+b)/2);
    }else{
    	System.out.println("IMPOSSIBLE");
    }
  }
}