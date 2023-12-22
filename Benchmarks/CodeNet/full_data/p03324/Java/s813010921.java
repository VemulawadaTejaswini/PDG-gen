import java.util.*;
public class Main{
 public static void main(String[] args){
 	int a,b;
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   int base=(int)Math.pow(100,a);
   if(a==100){
       System.out.println(base*101);   
    }else{
 	System.out.println(base*b);}
 }  
}