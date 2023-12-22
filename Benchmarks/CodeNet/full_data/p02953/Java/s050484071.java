import java.util.*;
public class Main {

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n=sc.nextInt()-2;
   int last,now=sc.nextInt(),next=n>=0?sc.nextInt():10^9;
   
   if(next<now)now--;
   if(next<now){
			System.out.println("No");
   }else if(n>=0){
			System.out.println("Yes");
   }else{
    do{ last=now;
        now=next;
        next=sc.nextInt(); n--;
  
       if(next<now)now--;
       if(next<now || now<last){
 			System.out.println("No");
 			System.exit(0);
        }
    }while(n>0);
	System.out.println("Yes");
   }
 }
}