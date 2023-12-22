import java.util.*;
public class Main{
 public static void main(String[] args){
 	int a,b;
   Scanner sc=new Scanner(System.in);
   a=sc.nextInt();
   b=sc.nextInt();
   int base=(int)Math.pow(100,a);
   int res;
   for(int i=1;;i++){
   	res=base*i;
     if(res%b==0){
     break;
     }
   }
 	System.out.println(res);
 }  
}