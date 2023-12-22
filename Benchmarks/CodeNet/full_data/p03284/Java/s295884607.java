
import java.util.*;

public class Cracker{  
    public static void main(String[] args){

        Scanner sc1 =new Scanner(System.in);
        int N=nextInt();
        int K=nextInt();

        if(N%K==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
        
    }
}