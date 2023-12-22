import java.util.*;

class Main{
	public static void main(){
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      scan.close();
      
      if(a%2==1&&b%2==1){
        System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
    }
}