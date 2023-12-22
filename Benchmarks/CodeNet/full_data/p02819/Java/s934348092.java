
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        while(true){

            if(judge(num)){
                num +=1;
                continue;
            }

            else{
                System.out.println(num);
                break;
            }

        }
    }
  
    

    private static boolean judge(int num){
       if(num == 2) return false;
       
       for(int i = 2;i < (int)Math.pow(num,0.5); i++)
       {
            if(num % i == 0) return true;
            else continue;
       }
       return false;
    }
}