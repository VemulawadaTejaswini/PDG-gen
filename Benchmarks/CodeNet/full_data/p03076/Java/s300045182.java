import java.util.*;
 
public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       int[] time = new int[4];
       for(i = 0; i < 5; ++i){
           time[i] = sc.nextInt();
       }
       
       int dish[] = new int[4];
       
       for(i = 0; i < 5; ++i){
           if(time%10==0){
               dish[i] = (time[i]/10)*10;
           }else{
               dish[i] = (time[i]/10)*10 + (time[i]%10);
           }
       }
    }
}