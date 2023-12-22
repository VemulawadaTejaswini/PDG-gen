import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(double i=1;i<10000;i+=1){
            if((int)(i*0.08)==a&&(int)(i*0.1)==b){
                System.out.println((int)i);
                return;
            }
        }
        System.out.println(-1);
        
        
 
    }



}