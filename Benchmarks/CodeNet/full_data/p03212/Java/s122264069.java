import java.util.*;
public class Main {
    public static void main(String [] args){
     Scanner sc  = new Scanner(System.in);
     int N = sc.nextInt();
     int num=0;
     for(int a=300;a<=N;a++){
         String num2 = String.valueOf(a);
         int num7=0,num5=0,num3=0,nume=0;
         for(int b=0;b<num2.length();b++){
             if(num2.charAt(b)=='7') num7++;
             else if(num2.charAt(b)=='5') num5++;
             else if(num2.charAt(b)=='3') num3++;
             else {
                 nume++;
                 break;
             }
         }
         if(num7>=1&&num5>=1&&num3>=1&&nume==0) num++;
     }
        System.out.println(num);
    }
}
