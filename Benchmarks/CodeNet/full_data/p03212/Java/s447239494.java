import java.util.*;
public class Main {
    public static void main(String [] args){
     Scanner sc  = new Scanner(System.in);
     int N = sc.nextInt();
     int num=0;
     for(int a=357;a<N;a=a+2){
         String num_list = String.valueOf(a);
         if(num_list.charAt(0)!='3'&&num_list.charAt(0)!='5'&&num_list.charAt(0)!='7'){
             double e = num_list.length()-2;
             a=a+(int)Math.pow(10,e);
         }
         else {
             int num7 = 0, num5 = 0, num3 = 0, num2 = 0;
             for (int b = 0; b < num_list.length(); b++) {
                 if (num_list.charAt(b) == '7') num7++;
                 else if (num_list.charAt(b) == '5') num5++;
                 else if (num_list.charAt(b) == '3') num3++;
                 else {
                     num2++;
                     break;
                 }
             }
             if (num7 > 0 && num5 > 0 && num3 > 0 && num2 == 0) num++;
         }
     }
     System.out.println(num);
    }
}
