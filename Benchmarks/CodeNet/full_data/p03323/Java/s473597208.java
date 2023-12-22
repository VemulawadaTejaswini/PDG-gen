import java.util.Scanner;
public class Main{
  
  public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
    String str1 = scan.next();
    String str2 = scan.next();

 	int a = Integer.parseInt(str1);
    int b = Integer.parseInt(str2);
    
    if(a < b){
      int tmp = b;
      b = a;
      a = tmp;
    }
    
      if(a<0 || a>8)
        System.out.println(":(");
 	  if(b<0 || b>8)
        System.out.println(":(");
      if(a+b > 16)
        System.out.println(":(");
    //16等分
    //if(16-a > )
    /*
    for(int i = 8 ; i > 0 ; i--){
      a--;
      b--;
      if(a > i || b > i){
          System.out.println(":(");
        return;
      }
    }  */  
        System.out.println("Yay!");
    }
}