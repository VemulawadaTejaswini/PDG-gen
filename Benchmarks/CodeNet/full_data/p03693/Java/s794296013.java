import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
   
  int r = scan.nextInt();
  int g = scan.nextInt();
  int b = scan.nextInt();
  scan.close();

  	if((10 * g + b)%4 == 0){
  	System.out.println("YES");
  	
  	}else{
  	System.out.println("NO");
  	}
  }
}
