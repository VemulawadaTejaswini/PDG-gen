import java.util.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   for (double price=0;price<200000;price++){
     int tax8 = (int)(price*0.08);
     int tax10 = (int)(price*0.1);
     if ((tax8 == a)&&(tax10 == b)){
        System.out.println((int)price);
        System.exit(0);
     }
   }
   System.out.println(-1);
}
}