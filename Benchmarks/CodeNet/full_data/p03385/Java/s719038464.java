import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String a = sc.next();
        // スペース区切りの整数の入力
        String b = sc.next();
        String c = sc.next();
      
      	String aa="a";
      	String bb="b";
      	String cc="c";
  
      if((a==aa)||(b==aa)||(c==aa)){
       	if((a==bb)||(b==bb)||(c=bb)){
      			 if((a=cc)||(b==cc)||(c=cc)){
      				System.out.printIn("Yes");
      			}else{
    			  System.out.printIn("No");
    			  }
     	 }else{
     	 System.out.printIn("No");
     	 }
      }else{
      System.out.printIn("No");
      }
        // 出力
        System.out.println((a+b+c) + " " + s);
    }
}