
import java.util.*;

public class Main{  
    public static void main(String[] args){

        Scanner sc1 =new Scanner(System.in);
        int N=sc1.nextInt();
        int K=sc1.nextInt();

        if(N%K==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
        
    }
}