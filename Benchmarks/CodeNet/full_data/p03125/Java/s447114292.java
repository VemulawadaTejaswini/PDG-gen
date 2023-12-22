import java.util.*;
class A_B{
	public static void main(String args[]){
     Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      if(a%b==0){
      System.out.println(a+b);
      }else{
        System.out.println(a-b);
      }
    }
}