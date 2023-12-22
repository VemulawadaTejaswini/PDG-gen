import java.util.Scanner;

public class Hello{
 	public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      int a=n%2;
      int b=n/2;
      if(a==0)
        System.out.println(b);
      else
        System.out.println(b+a);
    }  
}