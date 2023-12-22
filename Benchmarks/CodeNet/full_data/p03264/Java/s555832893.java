import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ki = 0;
        int gu = 0;

       while(a>0){
         if(a%2==0){
           gu++;
         }else{
          ki++;
         }
         a--;
       }
         System.out.println(ki*gu);
      }
}