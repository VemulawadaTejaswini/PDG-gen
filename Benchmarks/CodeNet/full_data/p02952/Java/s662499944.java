import java.util.*;
public class Main{

 public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = String.valueOf( n ).length(); 
        int sum = 0;
        for(int i =1;i<len;i++){
          if(i%2==1){
            sum = sum + ( (int)Math.pow(10, i)  - 1 - ((int)Math.pow(10, i-1)  - 1));
          }
        }
        if(len%2 == 1){
            int tmp = len - 1;
            sum = sum + n - ((int)Math.pow(10, tmp) - 1);
        }
        System.out.println(sum);
      
    }

}